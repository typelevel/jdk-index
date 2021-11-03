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
    Release(Linux, Amd64, Adoptium, Version("17"), TarGZ, url("https://github.com/adoptium/temurin17-binaries/releases/download/jdk-17.0.1%2B12/OpenJDK17U-jdk_x64_linux_hotspot_17.0.1_12.tar.gz")),
    Release(Linux, Amd64, Adoptium, Version("11"), TarGZ, url("https://github.com/adoptium/temurin11-binaries/releases/download/jdk-11.0.13%2B8/OpenJDK11U-jdk_x64_linux_hotspot_11.0.13_8.tar.gz")),
    Release(Linux, Amd64, Adoptium, Version("8"), TarGZ, url("https://github.com/adoptium/temurin8-binaries/releases/download/jdk8u312-b07/OpenJDK8U-jdk_x64_linux_hotspot_8u312b07.tar.gz")),
    Release(Linux, Amd64, GraalVMJDK17, Version("21.3"), TarGZ, url("https://github.com/graalvm/graalvm-ce-builds/releases/download/vm-21.3.0/graalvm-ce-java17-linux-amd64-21.3.0.tar.gz")),
    Release(Linux, Amd64, GraalVMJDK11, Version("21.3"), TarGZ, url("https://github.com/graalvm/graalvm-ce-builds/releases/download/vm-21.3.0/graalvm-ce-java11-linux-amd64-21.3.0.tar.gz")),
    Release(Linux, Amd64, GraalVMJDK8, Version("21.2"), TarGZ, url("https://github.com/graalvm/graalvm-ce-builds/releases/download/vm-21.2.0/graalvm-ce-java8-linux-amd64-21.2.0.tar.gz")),
    Release(Linux, Amd64, OpenJ9JDK11, Version("0.29"), TarGZ, url("https://github.com/ibmruntimes/semeru11-binaries/releases/download/jdk-11.0.13%2B8_openj9-0.29.0/ibm-semeru-open-jdk_x64_linux_11.0.13_8_openj9-0.29.0.tar.gz")),
    Release(Linux, Amd64, OpenJ9JDK8, Version("0.29"), TarGZ, url("https://github.com/ibmruntimes/semeru8-binaries/releases/download/jdk8u312-b07_openj9-0.29.0/ibm-semeru-open-jdk_x64_linux_8u312b07_openj9-0.29.0.tar.gz")),
    Release(Linux, Aarch64, Adoptium, Version("17"), TarGZ, url("https://github.com/adoptium/temurin17-binaries/releases/download/jdk-17.0.1%2B12/OpenJDK17U-jdk_aarch64_linux_hotspot_17.0.1_12.tar.gz")),
    Release(Linux, Aarch64, Adoptium, Version("11"), TarGZ, url("https://github.com/adoptium/temurin11-binaries/releases/download/jdk-11.0.13%2B8/OpenJDK11U-jdk_aarch64_linux_hotspot_11.0.13_8.tar.gz")),
    Release(Linux, Aarch64, Adoptium, Version("8"), TarGZ, url("https://github.com/adoptium/temurin8-binaries/releases/download/jdk8u312-b07/OpenJDK8U-jdk_aarch64_linux_hotspot_8u312b07.tar.gz")),
    Release(Linux, Aarch64, GraalVMJDK17, Version("21.3"), TarGZ, url("https://github.com/graalvm/graalvm-ce-builds/releases/download/vm-21.3.0/graalvm-ce-java17-linux-aarch64-21.3.0.tar.gz")),
    Release(Linux, Aarch64, GraalVMJDK11, Version("21.3"), TarGZ, url("https://github.com/graalvm/graalvm-ce-builds/releases/download/vm-21.3.0/graalvm-ce-java11-linux-aarch64-21.3.0.tar.gz")),
    Release(MacOS, Amd64, Adoptium, Version("17"), TarGZ, url("https://github.com/adoptium/temurin17-binaries/releases/download/jdk-17.0.1%2B12/OpenJDK17U-jdk_x64_mac_hotspot_17.0.1_12.tar.gz")),
    Release(MacOS, Amd64, Adoptium, Version("11"), TarGZ, url("https://github.com/adoptium/temurin11-binaries/releases/download/jdk-11.0.13%2B8/OpenJDK11U-jdk_x64_mac_hotspot_11.0.13_8.tar.gz")),
    Release(MacOS, Amd64, Adoptium, Version("8"), TarGZ, url("https://github.com/adoptium/temurin8-binaries/releases/download/jdk8u312-b07/OpenJDK8U-jdk_x64_mac_hotspot_8u312b07.tar.gz")),
    Release(MacOS, Amd64, GraalVMJDK17, Version("21.3"), TarGZ, url("https://github.com/graalvm/graalvm-ce-builds/releases/download/vm-21.3.0/graalvm-ce-java17-darwin-amd64-21.3.0.tar.gz")),
    Release(MacOS, Amd64, GraalVMJDK11, Version("21.3"), TarGZ, url("https://github.com/graalvm/graalvm-ce-builds/releases/download/vm-21.3.0/graalvm-ce-java11-darwin-amd64-21.3.0.tar.gz")),
    Release(MacOS, Amd64, OpenJ9JDK11, Version("0.29"), TarGZ, url("https://github.com/ibmruntimes/semeru11-binaries/releases/download/jdk-11.0.13%2B8_openj9-0.29.0/ibm-semeru-open-jdk_x64_mac_11.0.13_8_openj9-0.29.0.tar.gz")),
    Release(MacOS, Amd64, OpenJ9JDK8, Version("0.29"), TarGZ, url("https://github.com/ibmruntimes/semeru8-binaries/releases/download/jdk8u312-b07_openj9-0.29.0/ibm-semeru-open-jdk_x64_mac_8u312b07_openj9-0.29.0.tar.gz")),
    Release(MacOS, Arm64, Adoptium, Version("17"), TarGZ, url("https://github.com/adoptium/temurin17-binaries/releases/download/jdk-17.0.1%2B12/OpenJDK17U-jdk_aarch64_mac_hotspot_17.0.1_12.tar.gz")),
    Release(Windows, Amd64, Adoptium, Version("17"), Zip, url("https://github.com/adoptium/temurin17-binaries/releases/download/jdk-17.0.1%2B12/OpenJDK17U-jdk_x64_windows_hotspot_17.0.1_12.zip")),
    Release(Windows, Amd64, Adoptium, Version("11"), Zip, url("https://github.com/adoptium/temurin11-binaries/releases/download/jdk-11.0.13%2B8/OpenJDK11U-jdk_x64_windows_hotspot_11.0.13_8.zip")),
    Release(Windows, Amd64, Adoptium, Version("8"), Zip, url("https://github.com/adoptium/temurin8-binaries/releases/download/jdk8u312-b07/OpenJDK8U-jdk_x64_windows_hotspot_8u312b07.zip")),
    Release(Windows, Amd64, GraalVMJDK17, Version("21.3"), Zip, url("https://github.com/graalvm/graalvm-ce-builds/releases/download/vm-21.3.0/graalvm-ce-java17-windows-amd64-21.3.0.zip")),
    Release(Windows, Amd64, GraalVMJDK11, Version("21.3"), Zip, url("https://github.com/graalvm/graalvm-ce-builds/releases/download/vm-21.3.0/graalvm-ce-java11-windows-amd64-21.3.0.zip")),
    Release(Windows, Amd64, GraalVMJDK8, Version("21.2"), Zip, url("https://github.com/graalvm/graalvm-ce-builds/releases/download/vm-21.2.0/graalvm-ce-java8-windows-amd64-21.2.0.zip")),
    Release(Windows, Amd64, OpenJ9JDK11, Version("0.29"), Zip, url("https://github.com/ibmruntimes/semeru11-binaries/releases/download/jdk-11.0.13%2B8_openj9-0.29.0/ibm-semeru-open-jdk_x64_windows_11.0.13_8_openj9-0.29.0.zip")),
    Release(Windows, Amd64, OpenJ9JDK8, Version("0.29"), Zip, url("https://github.com/ibmruntimes/semeru8-binaries/releases/download/jdk8u312-b07_openj9-0.29.0/ibm-semeru-open-jdk_x64_windows_8u312b07_openj9-0.29.0.zip")),
  )
)
// format: on
