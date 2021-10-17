/*
 * Copyright 2021 Typelevel
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

package org.typelevel.jdk.index

import model.*
import OS.*, Arch.*, Vendor.*, PackageType.*

// format: off
val MainIndex: Index = Index(
  List(
    Release(Linux, Amd64, Adoptium, Version("17"), TarGZ, url("https://github.com/adoptium/temurin17-binaries/releases/download/jdk-17%2B35/OpenJDK17-jdk_x64_linux_hotspot_17_35.tar.gz")),
    Release(Linux, Amd64, Adoptium, Version("11"), TarGZ, url("https://github.com/adoptium/temurin11-binaries/releases/download/jdk-11.0.12%2B7/OpenJDK11U-jdk_x64_linux_hotspot_11.0.12_7.tar.gz")),
    Release(Linux, Amd64, Adoptium, Version("8"), TarGZ, url("https://github.com/adoptium/temurin8-binaries/releases/download/jdk8u302-b08/OpenJDK8U-jdk_x64_linux_hotspot_8u302b08.tar.gz")),
    Release(Linux, Amd64, GraalVMJDK8, Version("21.2"), TarGZ, url("https://github.com/graalvm/graalvm-ce-builds/releases/download/vm-21.2.0/graalvm-ce-java8-linux-amd64-21.2.0.tar.gz")),
    Release(Linux, Amd64, GraalVMJDK11, Version("21.2"), TarGZ, url("https://github.com/graalvm/graalvm-ce-builds/releases/download/vm-21.2.0/graalvm-ce-java11-linux-amd64-21.2.0.tar.gz")),
    Release(Linux, Aarch64, Adoptium, Version("17"), TarGZ, url("https://github.com/adoptium/temurin17-binaries/releases/download/jdk-17%2B35/OpenJDK17-jdk_aarch64_linux_hotspot_17_35.tar.gz")),
    Release(Linux, Aarch64, Adoptium, Version("11"), TarGZ, url("https://github.com/adoptium/temurin11-binaries/releases/download/jdk-11.0.12%2B7/OpenJDK11U-jdk_aarch64_linux_hotspot_11.0.12_7.tar.gz")),
    Release(Linux, Aarch64, Adoptium, Version("8"), TarGZ, url("https://github.com/adoptium/temurin8-binaries/releases/download/jdk8u302-b08/OpenJDK8U-jdk_aarch64_linux_hotspot_8u302b08.tar.gz")),
    Release(MacOS, Amd64, Adoptium, Version("17"), TarGZ, url("https://github.com/adoptium/temurin17-binaries/releases/download/jdk-17%2B35/OpenJDK17-jdk_x64_mac_hotspot_17_35.tar.gz")),
    Release(MacOS, Amd64, Adoptium, Version("11"), TarGZ, url("https://github.com/adoptium/temurin11-binaries/releases/download/jdk-11.0.12%2B7/OpenJDK11U-jdk_x64_mac_hotspot_11.0.12_7.tar.gz")),
    Release(MacOS, Amd64, Adoptium, Version("8"), TarGZ, url("https://github.com/adoptium/temurin8-binaries/releases/download/jdk8u302-b08/OpenJDK8U-jdk_x64_mac_hotspot_8u302b08.tar.gz")),
    Release(MacOS, Amd64, GraalVMJDK11, Version("21.2"), TarGZ, url("https://github.com/graalvm/graalvm-ce-builds/releases/download/vm-21.2.0/graalvm-ce-java11-darwin-amd64-21.2.0.tar.gz")),
    Release(MacOS, Aarch64, Adoptium, Version("17"), TarGZ, url("https://github.com/adoptium/temurin17-binaries/releases/download/jdk-17%2B35/OpenJDK17-jdk_aarch64_mac_hotspot_17_35.tar.gz")),
    Release(MacOS, Arm64, Adoptium, Version("17"), TarGZ, url("https://github.com/adoptium/temurin17-binaries/releases/download/jdk-17%2B35/OpenJDK17-jdk_aarch64_mac_hotspot_17_35.tar.gz")),
    Release(Windows, Amd64, Adoptium, Version("17"), Zip, url("https://github.com/adoptium/temurin17-binaries/releases/download/jdk-17%2B35/OpenJDK17-jdk_x64_windows_hotspot_17_35.zip")),
    Release(Windows, Amd64, Adoptium, Version("11"), Zip, url("https://github.com/adoptium/temurin11-binaries/releases/download/jdk-11.0.12%2B7/OpenJDK11U-jdk_x64_windows_hotspot_11.0.12_7.zip")),
    Release(Windows, Amd64, Adoptium, Version("8"), Zip, url("https://github.com/adoptium/temurin8-binaries/releases/download/jdk8u302-b08.1/OpenJDK8U-jdk_x64_windows_hotspot_8u302b08.zip")),
    Release(Windows, Amd64, GraalVMJDK8, Version("21.2"), Zip, url("https://github.com/graalvm/graalvm-ce-builds/releases/download/vm-21.2.0/graalvm-ce-java8-windows-amd64-21.2.0.zip")),
    Release(Windows, Amd64, GraalVMJDK11, Version("21.2"), Zip, url("https://github.com/graalvm/graalvm-ce-builds/releases/download/vm-21.2.0/graalvm-ce-java11-windows-amd64-21.2.0.zip")),
  )
)
// format: on
