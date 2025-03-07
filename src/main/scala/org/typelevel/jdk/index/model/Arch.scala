/*
 * Copyright 2021-2025 Typelevel
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

enum Arch(string: String, val githubName: String):
  case Amd64 extends Arch("amd64", "X64")
  case Aarch64 extends Arch("aarch64", "ARM64")
  case Arm64 extends Arch("arm64", "ARM64")

  override def toString: String = string
