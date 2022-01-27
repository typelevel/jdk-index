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
    Release(Linux, Amd64, Adoptium, Version("11"), TarGZ, url("https://github.com/adoptium/temurin11-binaries/releases/download/jdk-11.0.14%2B9/OpenJDK11U-jdk_x64_linux_hotspot_11.0.14_9.tar.gz")),
    Release(Linux, Amd64, Adoptium, Version("8"), TarGZ, url("https://github.com/adoptium/temurin8-binaries/releases/download/jdk8u322-b06/OpenJDK8U-jdk_x64_linux_hotspot_8u322b06.tar.gz")),
    Release(Linux, Amd64, GraalVMJDK17, Version("22.0"), TarGZ, url("https://github.com/graalvm/graalvm-ce-builds/releases/download/vm-22.0.0.2/graalvm-ce-java17-linux-amd64-22.0.0.2.tar.gz")),
    Release(Linux, Amd64, GraalVMJDK11, Version("22.0"), TarGZ, url("https://github.com/graalvm/graalvm-ce-builds/releases/download/vm-22.0.0.2/graalvm-ce-java11-linux-amd64-22.0.0.2.tar.gz")),
    Release(Linux, Amd64, OpenJ9JDK17, Version("0.29"), TarGZ, url("https://github.com/ibmruntimes/semeru17-binaries/releases/download/jdk-17.0.1%2B12_openj9-0.29.1/ibm-semeru-open-jdk_x64_linux_17.0.1_12_openj9-0.29.1.tar.gz")),
    Release(Linux, Amd64, OpenJ9JDK11, Version("0.29"), TarGZ, url("https://github.com/ibmruntimes/semeru11-binaries/releases/download/jdk-11.0.13%2B8_openj9-0.29.0/ibm-semeru-open-jdk_x64_linux_11.0.13_8_openj9-0.29.0.tar.gz")),
    Release(Linux, Amd64, OpenJ9JDK8, Version("0.29"), TarGZ, url("https://github.com/ibmruntimes/semeru8-binaries/releases/download/jdk8u312-b07_openj9-0.29.0/ibm-semeru-open-jdk_x64_linux_8u312b07_openj9-0.29.0.tar.gz")),
    Release(Linux, Amd64, Corretto, Version("17"), TarGZ, url("https://corretto.aws/downloads/latest/amazon-corretto-17-x64-linux-jdk.tar.gz")),
    Release(Linux, Amd64, Corretto, Version("11"), TarGZ, url("https://corretto.aws/downloads/latest/amazon-corretto-11-x64-linux-jdk.tar.gz")),
    Release(Linux, Amd64, Corretto, Version("8"), TarGZ, url("https://corretto.aws/downloads/latest/amazon-corretto-8-x64-linux-jdk.tar.gz")),
    Release(Linux, Aarch64, Adoptium, Version("17"), TarGZ, url("https://github.com/adoptium/temurin17-binaries/releases/download/jdk-17.0.1%2B12/OpenJDK17U-jdk_aarch64_linux_hotspot_17.0.1_12.tar.gz")),
    Release(Linux, Aarch64, Adoptium, Version("11"), TarGZ, url("https://github.com/adoptium/temurin11-binaries/releases/download/jdk-11.0.14%2B9/OpenJDK11U-jdk_aarch64_linux_hotspot_11.0.14_9.tar.gz")),
    Release(Linux, Aarch64, Adoptium, Version("8"), TarGZ, url("https://github.com/adoptium/temurin8-binaries/releases/download/jdk8u322-b06/OpenJDK8U-jdk_aarch64_linux_hotspot_8u322b06.tar.gz")),
    Release(Linux, Aarch64, GraalVMJDK17, Version("22.0"), TarGZ, url("https://github.com/graalvm/graalvm-ce-builds/releases/download/vm-22.0.0.2/graalvm-ce-java17-linux-aarch64-22.0.0.2.tar.gz")),
    Release(Linux, Aarch64, GraalVMJDK11, Version("22.0"), TarGZ, url("https://github.com/graalvm/graalvm-ce-builds/releases/download/vm-22.0.0.2/graalvm-ce-java11-linux-aarch64-22.0.0.2.tar.gz")),
    Release(Linux, Aarch64, Corretto, Version("17"), TarGZ, url("https://corretto.aws/downloads/latest/amazon-corretto-17-aarch64-linux-jdk.tar.gz")),
    Release(Linux, Aarch64, Corretto, Version("11"), TarGZ, url("https://corretto.aws/downloads/latest/amazon-corretto-11-aarch64-linux-jdk.tar.gz")),
    Release(Linux, Aarch64, Corretto, Version("8"), TarGZ, url("https://corretto.aws/downloads/latest/amazon-corretto-8-aarch64-linux-jdk.tar.gz")),
    Release(MacOS, Amd64, Adoptium, Version("17"), TarGZ, url("https://github.com/adoptium/temurin17-binaries/releases/download/jdk-17.0.1%2B12/OpenJDK17U-jdk_x64_mac_hotspot_17.0.1_12.tar.gz")),
    Release(MacOS, Amd64, Adoptium, Version("11"), TarGZ, url("https://github.com/adoptium/temurin11-binaries/releases/download/jdk-11.0.14%2B9/OpenJDK11U-jdk_x64_mac_hotspot_11.0.14_9.tar.gz")),
    Release(MacOS, Amd64, Adoptium, Version("8"), TarGZ, url("https://github.com/adoptium/temurin8-binaries/releases/download/jdk8u322-b06/OpenJDK8U-jdk_x64_mac_hotspot_8u322b06.tar.gz")),
    Release(MacOS, Amd64, GraalVMJDK17, Version("22.0"), TarGZ, url("https://github.com/graalvm/graalvm-ce-builds/releases/download/vm-22.0.0.2/graalvm-ce-java17-darwin-amd64-22.0.0.2.tar.gz")),
    Release(MacOS, Amd64, GraalVMJDK11, Version("22.0"), TarGZ, url("https://github.com/graalvm/graalvm-ce-builds/releases/download/vm-22.0.0.2/graalvm-ce-java11-darwin-amd64-22.0.0.2.tar.gz")),
    Release(MacOS, Amd64, OpenJ9JDK17, Version("0.29"), TarGZ, url("https://github.com/ibmruntimes/semeru17-binaries/releases/download/jdk-17.0.1%2B12_openj9-0.29.1/ibm-semeru-open-jdk_x64_mac_17.0.1_12_openj9-0.29.1.tar.gz")),
    Release(MacOS, Amd64, OpenJ9JDK11, Version("0.29"), TarGZ, url("https://github.com/ibmruntimes/semeru11-binaries/releases/download/jdk-11.0.13%2B8_openj9-0.29.0/ibm-semeru-open-jdk_x64_mac_11.0.13_8_openj9-0.29.0.tar.gz")),
    Release(MacOS, Amd64, OpenJ9JDK8, Version("0.29"), TarGZ, url("https://github.com/ibmruntimes/semeru8-binaries/releases/download/jdk8u312-b07_openj9-0.29.0/ibm-semeru-open-jdk_x64_mac_8u312b07_openj9-0.29.0.tar.gz")),
    Release(MacOS, Amd64, Corretto, Version("17"), TarGZ, url("https://corretto.aws/downloads/latest/amazon-corretto-17-x64-macos-jdk.tar.gz")),
    Release(MacOS, Amd64, Corretto, Version("11"), TarGZ, url("https://corretto.aws/downloads/latest/amazon-corretto-11-x64-macos-jdk.tar.gz")),
    Release(MacOS, Amd64, Corretto, Version("8"), TarGZ, url("https://corretto.aws/downloads/latest/amazon-corretto-8-x64-macos-jdk.tar.gz")),
    Release(MacOS, Arm64, Adoptium, Version("17"), TarGZ, url("https://github.com/adoptium/temurin17-binaries/releases/download/jdk-17.0.1%2B12/OpenJDK17U-jdk_aarch64_mac_hotspot_17.0.1_12.tar.gz")),
    Release(MacOS, Arm64, Corretto, Version("17"), TarGZ, url("https://corretto.aws/downloads/latest/amazon-corretto-17-aarch64-macos-jdk.tar.gz")),
    Release(Windows, Amd64, Adoptium, Version("17"), Zip, url("https://github.com/adoptium/temurin17-binaries/releases/download/jdk-17.0.1%2B12/OpenJDK17U-jdk_x64_windows_hotspot_17.0.1_12.zip")),
    Release(Windows, Amd64, Adoptium, Version("11"), Zip, url("https://github.com/adoptium/temurin11-binaries/releases/download/jdk-11.0.14%2B9/OpenJDK11U-jdk_x64_windows_hotspot_11.0.14_9.zip")),
    Release(Windows, Amd64, Adoptium, Version("8"), Zip, url("https://github.com/adoptium/temurin8-binaries/releases/download/jdk8u322-b06/OpenJDK8U-jdk_x64_windows_hotspot_8u322b06.zip")),
    Release(Windows, Amd64, GraalVMJDK17, Version("22.0"), Zip, url("https://github.com/graalvm/graalvm-ce-builds/releases/download/vm-22.0.0.2/graalvm-ce-java17-windows-amd64-22.0.0.2.zip")),
    Release(Windows, Amd64, GraalVMJDK11, Version("22.0"), Zip, url("https://github.com/graalvm/graalvm-ce-builds/releases/download/vm-22.0.0.2/graalvm-ce-java11-windows-amd64-22.0.0.2.zip")),
    Release(Windows, Amd64, OpenJ9JDK17, Version("0.29"), Zip, url("https://github.com/ibmruntimes/semeru17-binaries/releases/download/jdk-17.0.1%2B12_openj9-0.29.1/ibm-semeru-open-jdk_x64_windows_17.0.1_12_openj9-0.29.1.zip")),
    Release(Windows, Amd64, OpenJ9JDK11, Version("0.29"), Zip, url("https://github.com/ibmruntimes/semeru11-binaries/releases/download/jdk-11.0.13%2B8_openj9-0.29.0/ibm-semeru-open-jdk_x64_windows_11.0.13_8_openj9-0.29.0.zip")),
    Release(Windows, Amd64, OpenJ9JDK8, Version("0.29"), Zip, url("https://github.com/ibmruntimes/semeru8-binaries/releases/download/jdk8u312-b07_openj9-0.29.0/ibm-semeru-open-jdk_x64_windows_8u312b07_openj9-0.29.0.zip")),
    Release(Windows, Amd64, Corretto, Version("17"), Zip, url("https://corretto.aws/downloads/latest/amazon-corretto-17-x64-windows-jdk.zip")),
    Release(Windows, Amd64, Corretto, Version("11"), Zip, url("https://corretto.aws/downloads/latest/amazon-corretto-11-x64-windows-jdk.zip")),
    Release(Windows, Amd64, Corretto, Version("8"), Zip, url("https://corretto.aws/downloads/latest/amazon-corretto-8-x64-windows-jdk.zip"))
  )
)
// format: on
