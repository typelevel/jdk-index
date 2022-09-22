/*
 * Copyright 2021-2022 Typelevel
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
import OS.*, Arch.*, Vendor.*, Version.*, PackageType.*

// format: off
val MainIndex: Index = Index(
  List(
    // Temurin, Linux, x64
    Release(Linux, Amd64, Temurin, JDK_18, TarGZ, url("https://github.com/adoptium/temurin18-binaries/releases/download/jdk-18.0.2.1%2B1/OpenJDK18U-jdk_x64_linux_hotspot_18.0.2.1_1.tar.gz")),
    Release(Linux, Amd64, Temurin, JDK_17, TarGZ, url("https://github.com/adoptium/temurin17-binaries/releases/download/jdk-17.0.4.1%2B1/OpenJDK17U-jdk_x64_linux_hotspot_17.0.4.1_1.tar.gz")),
    Release(Linux, Amd64, Temurin, JDK_11, TarGZ, url("https://github.com/adoptium/temurin11-binaries/releases/download/jdk-11.0.16.1%2B1/OpenJDK11U-jdk_x64_linux_hotspot_11.0.16.1_1.tar.gz")),
    Release(Linux, Amd64, Temurin, JDK_8, TarGZ, url("https://github.com/adoptium/temurin8-binaries/releases/download/jdk8u345-b01/OpenJDK8U-jdk_x64_linux_hotspot_8u345b01.tar.gz")),

    // Graal, Linux, x64
    Release(Linux, Amd64, GraalVM, JDK_17, TarGZ, url("https://github.com/graalvm/graalvm-ce-builds/releases/download/vm-22.2.0/graalvm-ce-java17-linux-amd64-22.2.0.tar.gz")),
    Release(Linux, Amd64, GraalVM, JDK_11, TarGZ, url("https://github.com/graalvm/graalvm-ce-builds/releases/download/vm-22.2.0/graalvm-ce-java11-linux-amd64-22.2.0.tar.gz")),

    // Semeru, Linux, x64
    Release(Linux, Amd64, OpenJ9, JDK_18, TarGZ, url("https://github.com/ibmruntimes/semeru18-binaries/releases/download/jdk-18.0.2%2B9_openj9-0.33.1/ibm-semeru-open-jdk_x64_linux_18.0.2_9_openj9-0.33.1.tar.gz")),
    Release(Linux, Amd64, OpenJ9, JDK_17, TarGZ, url("https://github.com/ibmruntimes/semeru17-binaries/releases/download/jdk-17.0.4.1%2B1_openj9-0.33.1/ibm-semeru-open-jdk_x64_linux_17.0.4.1_1_openj9-0.33.1.tar.gz")),
    Release(Linux, Amd64, OpenJ9, JDK_11, TarGZ, url("https://github.com/ibmruntimes/semeru11-binaries/releases/download/jdk-11.0.16.1%2B1_openj9-0.33.1/ibm-semeru-open-jdk_x64_linux_11.0.16.1_1_openj9-0.33.1.tar.gz")),
    Release(Linux, Amd64, OpenJ9, JDK_8, TarGZ, url("https://github.com/ibmruntimes/semeru8-binaries/releases/download/jdk8u345-b01_openj9-0.33.1/ibm-semeru-open-jdk_x64_linux_8u345b01_openj9-0.33.1.tar.gz")),

    // Corretto, Linux, x64
    Release(Linux, Amd64, Corretto, JDK_19, TarGZ, url("https://corretto.aws/downloads/resources/19.0.0.36.1/amazon-corretto-19.0.0.36.1-linux-x64.tar.gz")),
    Release(Linux, Amd64, Corretto, JDK_18, TarGZ, url("https://corretto.aws/downloads/resources/18.0.2.9.1/amazon-corretto-18.0.2.9.1-linux-x64.tar.gz")),
    Release(Linux, Amd64, Corretto, JDK_17, TarGZ, url("https://corretto.aws/downloads/resources/17.0.4.9.1/amazon-corretto-17.0.4.9.1-linux-x64.tar.gz")),
    Release(Linux, Amd64, Corretto, JDK_11, TarGZ, url("https://corretto.aws/downloads/resources/11.0.16.9.1/amazon-corretto-11.0.16.9.1-linux-x64.tar.gz")),
    Release(Linux, Amd64, Corretto, JDK_8, TarGZ, url("https://corretto.aws/downloads/resources/8.342.07.4/amazon-corretto-8.342.07.4-linux-x64.tar.gz")),

    // Oracle, Linux, x64
    Release(Linux, Amd64, Oracle, JDK_19, TarGZ, url("https://download.oracle.com/java/19/archive/jdk-19_linux-x64_bin.tar.gz")),
    Release(Linux, Amd64, Oracle, JDK_18, TarGZ, url("https://download.oracle.com/java/18/archive/jdk-18.0.2.1_linux-x64_bin.tar.gz")),
    Release(Linux, Amd64, Oracle, JDK_17, TarGZ, url("https://download.oracle.com/java/17/archive/jdk-17.0.4.1_linux-x64_bin.tar.gz")),

    // Temurin, Linux, aarch64
    Release(Linux, Aarch64, Temurin, JDK_18, TarGZ, url("https://github.com/adoptium/temurin18-binaries/releases/download/jdk-18.0.2.1%2B1/OpenJDK18U-jdk_aarch64_linux_hotspot_18.0.2.1_1.tar.gz")),
    Release(Linux, Aarch64, Temurin, JDK_17, TarGZ, url("https://github.com/adoptium/temurin17-binaries/releases/download/jdk-17.0.4.1%2B1/OpenJDK17U-jdk_aarch64_linux_hotspot_17.0.4.1_1.tar.gz")),
    Release(Linux, Aarch64, Temurin, JDK_11, TarGZ, url("https://github.com/adoptium/temurin11-binaries/releases/download/jdk-11.0.16.1%2B1/OpenJDK11U-jdk_aarch64_linux_hotspot_11.0.16.1_1.tar.gz")),
    Release(Linux, Aarch64, Temurin, JDK_8, TarGZ, url("https://github.com/adoptium/temurin8-binaries/releases/download/jdk8u345-b01/OpenJDK8U-jdk_aarch64_linux_hotspot_8u345b01.tar.gz")),

    // Graal, Linux, aarch64
    Release(Linux, Aarch64, GraalVM, JDK_17, TarGZ, url("https://github.com/graalvm/graalvm-ce-builds/releases/download/vm-22.2.0/graalvm-ce-java17-linux-aarch64-22.2.0.tar.gz")),
    Release(Linux, Aarch64, GraalVM, JDK_11, TarGZ, url("https://github.com/graalvm/graalvm-ce-builds/releases/download/vm-22.2.0/graalvm-ce-java11-linux-aarch64-22.2.0.tar.gz")),

    // Semeru, Linux, aarch64
    Release(Linux, Aarch64, OpenJ9, JDK_18, TarGZ, url("https://github.com/ibmruntimes/semeru18-binaries/releases/download/jdk-18.0.2%2B9_openj9-0.33.1/ibm-semeru-open-jdk_aarch64_linux_18.0.2_9_openj9-0.33.1.tar.gz")),
    Release(Linux, Aarch64, OpenJ9, JDK_17, TarGZ, url("https://github.com/ibmruntimes/semeru17-binaries/releases/download/jdk-17.0.4.1%2B1_openj9-0.33.1/ibm-semeru-open-jdk_aarch64_linux_17.0.4.1_1_openj9-0.33.1.tar.gz")),
    Release(Linux, Aarch64, OpenJ9, JDK_11, TarGZ, url("https://github.com/ibmruntimes/semeru11-binaries/releases/download/jdk-11.0.16.1%2B1_openj9-0.33.1/ibm-semeru-open-jdk_aarch64_linux_11.0.16.1_1_openj9-0.33.1.tar.gz")),
    Release(Linux, Aarch64, OpenJ9, JDK_8, TarGZ, url("https://github.com/ibmruntimes/semeru8-binaries/releases/download/jdk8u345-b01_openj9-0.33.1/ibm-semeru-open-jdk_aarch64_linux_8u345b01_openj9-0.33.1.tar.gz")),

    // Corretto, Linux, aarch64
    Release(Linux, Aarch64, Corretto, JDK_19, TarGZ, url("https://corretto.aws/downloads/resources/19.0.0.36.1/amazon-corretto-19.0.0.36.1-linux-aarch64.tar.gz")),
    Release(Linux, Aarch64, Corretto, JDK_18, TarGZ, url("https://corretto.aws/downloads/resources/18.0.2.9.1/amazon-corretto-18.0.2.9.1-linux-aarch64.tar.gz")),
    Release(Linux, Aarch64, Corretto, JDK_17, TarGZ, url("https://corretto.aws/downloads/resources/17.0.4.9.1/amazon-corretto-17.0.4.9.1-linux-aarch64.tar.gz")),
    Release(Linux, Aarch64, Corretto, JDK_11, TarGZ, url("https://corretto.aws/downloads/resources/11.0.16.9.1/amazon-corretto-11.0.16.9.1-linux-aarch64.tar.gz")),
    Release(Linux, Aarch64, Corretto, JDK_8, TarGZ, url("https://corretto.aws/downloads/resources/8.342.07.4/amazon-corretto-8.342.07.4-linux-aarch64.tar.gz")),

    // Oracle, Linux, aarch64
    Release(Linux, Aarch64, Oracle, JDK_19, TarGZ, url("https://download.oracle.com/java/19/archive/jdk-19_linux-aarch64_bin.tar.gz")),
    Release(Linux, Aarch64, Oracle, JDK_18, TarGZ, url("https://download.oracle.com/java/18/archive/jdk-18.0.2.1_linux-aarch64_bin.tar.gz")),
    Release(Linux, Aarch64, Oracle, JDK_17, TarGZ, url("https://download.oracle.com/java/17/archive/jdk-17.0.4.1_linux-aarch64_bin.tar.gz")),

    // Temurin, MacOS, x64
    Release(MacOS, Amd64, Temurin, JDK_18, TarGZ, url("https://github.com/adoptium/temurin18-binaries/releases/download/jdk-18.0.2.1%2B1/OpenJDK18U-jdk_x64_mac_hotspot_18.0.2.1_1.tar.gz")),
    Release(MacOS, Amd64, Temurin, JDK_17, TarGZ, url("https://github.com/adoptium/temurin17-binaries/releases/download/jdk-17.0.4.1%2B1/OpenJDK17U-jdk_x64_mac_hotspot_17.0.4.1_1.tar.gz")),
    Release(MacOS, Amd64, Temurin, JDK_11, TarGZ, url("https://github.com/adoptium/temurin11-binaries/releases/download/jdk-11.0.16.1%2B1/OpenJDK11U-jdk_x64_mac_hotspot_11.0.16.1_1.tar.gz")),
    Release(MacOS, Amd64, Temurin, JDK_8, TarGZ, url("https://github.com/adoptium/temurin8-binaries/releases/download/jdk8u345-b01/OpenJDK8U-jdk_x64_mac_hotspot_8u345b01.tar.gz")),

    // Graal, MacOS, x64
    Release(MacOS, Amd64, GraalVM, JDK_17, TarGZ, url("https://github.com/graalvm/graalvm-ce-builds/releases/download/vm-22.2.0/graalvm-ce-java17-darwin-amd64-22.2.0.tar.gz")),
    Release(MacOS, Amd64, GraalVM, JDK_11, TarGZ, url("https://github.com/graalvm/graalvm-ce-builds/releases/download/vm-22.2.0/graalvm-ce-java11-darwin-amd64-22.2.0.tar.gz")),

    // Semeru, MacOS, x64
    Release(MacOS, Amd64, OpenJ9, JDK_18, TarGZ, url("https://github.com/ibmruntimes/semeru18-binaries/releases/download/jdk-18.0.2%2B9_openj9-0.33.1/ibm-semeru-open-jdk_x64_mac_18.0.2_9_openj9-0.33.1.tar.gz")),
    Release(MacOS, Amd64, OpenJ9, JDK_17, TarGZ, url("https://github.com/ibmruntimes/semeru17-binaries/releases/download/jdk-17.0.4.1%2B1_openj9-0.33.1/ibm-semeru-open-jdk_x64_mac_17.0.4.1_1_openj9-0.33.1.tar.gz")),
    Release(MacOS, Amd64, OpenJ9, JDK_11, TarGZ, url("https://github.com/ibmruntimes/semeru11-binaries/releases/download/jdk-11.0.16.1%2B1_openj9-0.33.1/ibm-semeru-open-jdk_x64_mac_11.0.16.1_1_openj9-0.33.1.tar.gz")),
    Release(MacOS, Amd64, OpenJ9, JDK_8, TarGZ, url("https://github.com/ibmruntimes/semeru8-binaries/releases/download/jdk8u345-b01_openj9-0.33.1/ibm-semeru-open-jdk_x64_mac_8u345b01_openj9-0.33.1.tar.gz")),

    // Corretto, MacOS, x64
    Release(MacOS, Amd64, Corretto, JDK_19, TarGZ, url("https://corretto.aws/downloads/resources/19.0.0.36.1/amazon-corretto-19.0.0.36.1-macosx-x64.tar.gz")),
    Release(MacOS, Amd64, Corretto, JDK_18, TarGZ, url("https://corretto.aws/downloads/resources/18.0.2.9.1/amazon-corretto-18.0.2.9.1-macosx-x64.tar.gz")),
    Release(MacOS, Amd64, Corretto, JDK_17, TarGZ, url("https://corretto.aws/downloads/resources/17.0.4.9.1/amazon-corretto-17.0.4.9.1-macosx-x64.tar.gz")),
    Release(MacOS, Amd64, Corretto, JDK_11, TarGZ, url("https://corretto.aws/downloads/resources/11.0.16.9.1/amazon-corretto-11.0.16.9.1-macosx-x64.tar.gz")),
    Release(MacOS, Amd64, Corretto, JDK_8, TarGZ, url("https://corretto.aws/downloads/resources/8.342.07.3/amazon-corretto-8.342.07.3-macosx-x64.tar.gz")),

    // Oracle, MacOS, x64
    Release(MacOS, Amd64, Oracle, JDK_19, TarGZ, url("https://download.oracle.com/java/19/archive/jdk-19_macos-x64_bin.tar.gz")),
    Release(MacOS, Amd64, Oracle, JDK_18, TarGZ, url("https://download.oracle.com/java/18/archive/jdk-18.0.2.1_macos-x64_bin.tar.gz")),
    Release(MacOS, Amd64, Oracle, JDK_17, TarGZ, url("https://download.oracle.com/java/17/archive/jdk-17.0.4.1_macos-x64_bin.tar.gz")),

    // Temurin, MacOS, aarch64
    Release(MacOS, Arm64, Temurin, JDK_18, TarGZ, url("https://github.com/adoptium/temurin18-binaries/releases/download/jdk-18.0.2.1%2B1/OpenJDK18U-jdk_aarch64_mac_hotspot_18.0.2.1_1.tar.gz")),
    Release(MacOS, Arm64, Temurin, JDK_17, TarGZ, url("https://github.com/adoptium/temurin17-binaries/releases/download/jdk-17.0.4.1%2B1/OpenJDK17U-jdk_aarch64_mac_hotspot_17.0.4.1_1.tar.gz")),
    Release(MacOS, Arm64, Temurin, JDK_11, TarGZ, url("https://github.com/adoptium/temurin11-binaries/releases/download/jdk-11.0.16.1%2B1/OpenJDK11U-jdk_aarch64_mac_hotspot_11.0.16.1_1.tar.gz")),

    // Graal, MacOS, aarch64
    Release(MacOS, Arm64, GraalVM, JDK_17, TarGZ, url("https://github.com/graalvm/graalvm-ce-builds/releases/download/vm-22.2.0/graalvm-ce-java17-darwin-aarch64-22.2.0.tar.gz")),
    Release(MacOS, Arm64, GraalVM, JDK_11, TarGZ, url("https://github.com/graalvm/graalvm-ce-builds/releases/download/vm-22.2.0/graalvm-ce-java11-darwin-aarch64-22.2.0.tar.gz")),

    // Semeru, MacOS, aarch64
    Release(MacOS, Arm64, OpenJ9, JDK_18, TarGZ, url("https://github.com/ibmruntimes/semeru18-binaries/releases/download/jdk-18.0.2%2B9_openj9-0.33.1/ibm-semeru-open-jdk_aarch64_mac_18.0.2_9_openj9-0.33.1.tar.gz")),
    Release(MacOS, Arm64, OpenJ9, JDK_17, TarGZ, url("https://github.com/ibmruntimes/semeru17-binaries/releases/download/jdk-17.0.4.1%2B1_openj9-0.33.1/ibm-semeru-open-jdk_aarch64_mac_17.0.4.1_1_openj9-0.33.1.tar.gz")),
    Release(MacOS, Arm64, OpenJ9, JDK_11, TarGZ, url("https://github.com/ibmruntimes/semeru11-binaries/releases/download/jdk-11.0.16.1%2B1_openj9-0.33.1/ibm-semeru-open-jdk_aarch64_mac_11.0.16.1_1_openj9-0.33.1.tar.gz")),

    // Corretto, MacOS, aarch64
    Release(MacOS, Arm64, Corretto, JDK_19, TarGZ, url("https://corretto.aws/downloads/resources/19.0.0.36.1/amazon-corretto-19.0.0.36.1-macosx-aarch64.tar.gz")),
    Release(MacOS, Arm64, Corretto, JDK_18, TarGZ, url("https://corretto.aws/downloads/resources/18.0.2.9.1/amazon-corretto-18.0.2.9.1-macosx-aarch64.tar.gz")),
    Release(MacOS, Arm64, Corretto, JDK_17, TarGZ, url("https://corretto.aws/downloads/resources/17.0.4.9.1/amazon-corretto-17.0.4.9.1-macosx-aarch64.tar.gz")),
    Release(MacOS, Arm64, Corretto, JDK_11, TarGZ, url("https://corretto.aws/downloads/resources/11.0.16.9.1/amazon-corretto-11.0.16.9.1-macosx-aarch64.tar.gz")),
    Release(MacOS, Arm64, Corretto, JDK_8, TarGZ, url("https://corretto.aws/downloads/resources/8.342.07.3/amazon-corretto-8.342.07.3-macosx-aarch64.tar.gz")),

    // Oracle, MacOS, aarch64
    Release(MacOS, Arm64, Oracle, JDK_19, TarGZ, url("https://download.oracle.com/java/19/archive/jdk-19_macos-aarch64_bin.tar.gz")),
    Release(MacOS, Arm64, Oracle, JDK_18, TarGZ, url("https://download.oracle.com/java/18/archive/jdk-18.0.2.1_macos-aarch64_bin.tar.gz")),
    Release(MacOS, Arm64, Oracle, JDK_17, TarGZ, url("https://download.oracle.com/java/17/archive/jdk-17.0.4.1_macos-aarch64_bin.tar.gz")),

    // Temurin, Windows, x64
    Release(Windows, Amd64, Temurin, JDK_18, Zip, url("https://github.com/adoptium/temurin18-binaries/releases/download/jdk-18.0.2.1%2B1/OpenJDK18U-jdk_x64_windows_hotspot_18.0.2.1_1.zip")),
    Release(Windows, Amd64, Temurin, JDK_17, Zip, url("https://github.com/adoptium/temurin17-binaries/releases/download/jdk-17.0.4.1%2B1/OpenJDK17U-jdk_x64_windows_hotspot_17.0.4.1_1.zip")),
    Release(Windows, Amd64, Temurin, JDK_11, Zip, url("https://github.com/adoptium/temurin11-binaries/releases/download/jdk-11.0.16.1%2B1/OpenJDK11U-jdk_x64_windows_hotspot_11.0.16.1_1.zip")),
    Release(Windows, Amd64, Temurin, JDK_8, Zip, url("https://github.com/adoptium/temurin8-binaries/releases/download/jdk8u345-b01/OpenJDK8U-jdk_x64_windows_hotspot_8u345b01.zip")),

    // Graal, Windows, x64
    Release(Windows, Amd64, GraalVM, JDK_17, Zip, url("https://github.com/graalvm/graalvm-ce-builds/releases/download/vm-22.2.0/graalvm-ce-java17-windows-amd64-22.2.0.zip")),
    Release(Windows, Amd64, GraalVM, JDK_11, Zip, url("https://github.com/graalvm/graalvm-ce-builds/releases/download/vm-22.2.0/graalvm-ce-java11-windows-amd64-22.2.0.zip")),

    // Semeru, Windows, x64
    Release(Windows, Amd64, OpenJ9, JDK_18, Zip, url("https://github.com/ibmruntimes/semeru18-binaries/releases/download/jdk-18.0.2%2B9_openj9-0.33.1/ibm-semeru-open-jdk_x64_windows_18.0.2_9_openj9-0.33.1.zip")),
    Release(Windows, Amd64, OpenJ9, JDK_17, Zip, url("https://github.com/ibmruntimes/semeru17-binaries/releases/download/jdk-17.0.4.1%2B1_openj9-0.33.1/ibm-semeru-open-jdk_x64_windows_17.0.4.1_1_openj9-0.33.1.zip")),
    Release(Windows, Amd64, OpenJ9, JDK_11, Zip, url("https://github.com/ibmruntimes/semeru11-binaries/releases/download/jdk-11.0.16.1%2B1_openj9-0.33.1/ibm-semeru-open-jdk_x64_windows_11.0.16.1_1_openj9-0.33.1.zip")),
    Release(Windows, Amd64, OpenJ9, JDK_8, Zip, url("https://github.com/ibmruntimes/semeru8-binaries/releases/download/jdk8u345-b01_openj9-0.33.1/ibm-semeru-open-jdk_x64_windows_8u345b01_openj9-0.33.1.zip")),

    // Corretto, Windows, x64
    Release(Windows, Amd64, Corretto, JDK_19, Zip, url("https://corretto.aws/downloads/resources/19.0.0.36.1/amazon-corretto-19.0.0.36.1-windows-x64-jdk.zip")),
    Release(Windows, Amd64, Corretto, JDK_18, Zip, url("https://corretto.aws/downloads/resources/18.0.2.9.1/amazon-corretto-18.0.2.9.1-windows-x64-jdk.zip")),
    Release(Windows, Amd64, Corretto, JDK_17, Zip, url("https://corretto.aws/downloads/resources/17.0.4.9.1/amazon-corretto-17.0.4.9.1-windows-x64-jdk.zip")),
    Release(Windows, Amd64, Corretto, JDK_11, Zip, url("https://corretto.aws/downloads/resources/11.0.16.9.1/amazon-corretto-11.0.16.9.1-windows-x64-jdk.zip")),
    Release(Windows, Amd64, Corretto, JDK_8, Zip, url("https://corretto.aws/downloads/resources/8.342.07.3/amazon-corretto-8.342.07.3-windows-x64-jdk.zip")),

    // Oracle, Windows, x64
    Release(Windows, Amd64, Oracle, JDK_19, Zip, url("https://download.oracle.com/java/19/archive/jdk-19_windows-x64_bin.zip")),
    Release(Windows, Amd64, Oracle, JDK_18, Zip, url("https://download.oracle.com/java/18/archive/jdk-18.0.2.1_windows-x64_bin.zip")),
    Release(Windows, Amd64, Oracle, JDK_17, Zip, url("https://download.oracle.com/java/17/archive/jdk-17.0.4.1_windows-x64_bin.zip"))
  )
)
// format: on
