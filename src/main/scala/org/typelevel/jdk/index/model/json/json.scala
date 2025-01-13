/*
 * Copyright 2021-2023 Typelevel
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.typelevel.jdk.index.model
package json

import io.circe.{Encoder, Json}
import io.circe.syntax._

private type NestedIndex = Map[OS, Map[Arch, Map[Vendor, Map[Version, Release]]]]

private def nestedIndex(index: Index): NestedIndex =
  index
    .releases
    .groupBy(_.os)
    .map: (os, relByOs) =>
      os -> relByOs
        .groupBy(_.arch)
        .map: (arch, relByOsArch) =>
          arch -> relByOsArch
            .groupBy(_.vendor)
            .map: (vendor, relByOsArchVendor) =>
              vendor -> relByOsArchVendor
                .groupBy(_.version)
                .map: (version, relByOsArchVendorVersion) =>
                  version -> relByOsArchVendorVersion.head

private def nestedIndexToStringifiedMap(nested: NestedIndex) =
  nested.map: (os, relByOs) =>
    os.toString -> relByOs.map: (arch, relByOsArch) =>
      arch.toString -> relByOsArch.map: (vendor, relByOsArchVendor) =>
        s"jdk@$vendor" -> relByOsArchVendor.map: (version, release) =>
          version.toString -> s"${release.packageType}+${release.url}"

given Encoder[Index] with
  def apply(index: Index): Json =
    nestedIndex.andThen(nestedIndexToStringifiedMap)(index).asJson
