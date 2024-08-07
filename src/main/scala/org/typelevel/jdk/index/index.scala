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

package org.typelevel.jdk.index

import model.*
import OS.*, Arch.*, Vendor.*, Version.*, PackageType.*

// format: off
val MainIndex: Index = Index(
  List(
    // Temurin, Linux, x64
    Release(Linux, Amd64, Temurin, JDK_21, TarGZ, url("https://github.com/adoptium/temurin21-binaries/releases/download/jdk-21.0.4%2B7/OpenJDK21U-jdk_x64_linux_hotspot_21.0.4_7.tar.gz")),
    Release(Linux, Amd64, Temurin, JDK_20, TarGZ, url("https://github.com/adoptium/temurin20-binaries/releases/download/jdk-20.0.2%2B9/OpenJDK20U-jdk_x64_linux_hotspot_20.0.2_9.tar.gz")),
    Release(Linux, Amd64, Temurin, JDK_17, TarGZ, url("https://github.com/adoptium/temurin17-binaries/releases/download/jdk-17.0.8.1%2B1/OpenJDK17U-jdk_x64_linux_hotspot_17.0.8.1_1.tar.gz")),
    Release(Linux, Amd64, Temurin, JDK_11, TarGZ, url("https://github.com/adoptium/temurin11-binaries/releases/download/jdk-11.0.20.1%2B1/OpenJDK11U-jdk_x64_linux_hotspot_11.0.20.1_1.tar.gz")),
    Release(Linux, Amd64, Temurin, JDK_8, TarGZ, url("https://github.com/adoptium/temurin8-binaries/releases/download/jdk8u382-b05/OpenJDK8U-jdk_x64_linux_hotspot_8u382b05.tar.gz")),

    // Graal, Linux, x64
    Release(Linux, Amd64, GraalVM, JDK_21, TarGZ, url("https://download.oracle.com/graalvm/21/latest/graalvm-jdk-21_linux-x64_bin.tar.gz")),
    Release(Linux, Amd64, GraalVM, JDK_17, TarGZ, url("https://download.oracle.com/graalvm/17/latest/graalvm-jdk-17_linux-x64_bin.tar.gz")),

    // Semeru, Linux, x64
    Release(Linux, Amd64, OpenJ9, JDK_20, TarGZ, url("https://github.com/ibmruntimes/semeru20-binaries/releases/download/jdk-20.0.2%2B9_openj9-0.40.0/ibm-semeru-open-jdk_x64_linux_20.0.2_9_openj9-0.40.0.tar.gz")),
    Release(Linux, Amd64, OpenJ9, JDK_17, TarGZ, url("https://github.com/ibmruntimes/semeru17-binaries/releases/download/jdk-17.0.8.1%2B1_openj9-0.40.0/ibm-semeru-open-jdk_x64_linux_17.0.8.1_1_openj9-0.40.0.tar.gz")),
    Release(Linux, Amd64, OpenJ9, JDK_11, TarGZ, url("https://github.com/ibmruntimes/semeru11-binaries/releases/download/jdk-11.0.20.1%2B1_openj9-0.40.0/ibm-semeru-open-jdk_x64_linux_11.0.20.1_1_openj9-0.40.0.tar.gz")),
    Release(Linux, Amd64, OpenJ9, JDK_8, TarGZ, url("https://github.com/ibmruntimes/semeru8-binaries/releases/download/jdk8u382-b05_openj9-0.40.0/ibm-semeru-open-jdk_x64_linux_8u382b05_openj9-0.40.0.tar.gz")),

    // Corretto, Linux, x64
    Release(Linux, Amd64, Corretto, JDK_21, TarGZ, url("https://corretto.aws/downloads/resources/21.0.0.35.1/amazon-corretto-21.0.0.35.1-linux-x64.tar.gz")),
    Release(Linux, Amd64, Corretto, JDK_20, TarGZ, url("https://corretto.aws/downloads/resources/20.0.2.9.1/amazon-corretto-20.0.2.9.1-linux-x64.tar.gz")),
    Release(Linux, Amd64, Corretto, JDK_17, TarGZ, url("https://corretto.aws/downloads/resources/17.0.8.8.1/amazon-corretto-17.0.8.8.1-linux-x64.tar.gz")),
    Release(Linux, Amd64, Corretto, JDK_11, TarGZ, url("https://corretto.aws/downloads/resources/11.0.20.9.1/amazon-corretto-11.0.20.9.1-linux-x64.tar.gz")),
    Release(Linux, Amd64, Corretto, JDK_8, TarGZ, url("https://corretto.aws/downloads/resources/8.382.05.1/amazon-corretto-8.382.05.1-linux-x64.tar.gz")),

    // Oracle, Linux, x64
    Release(Linux, Amd64, Oracle, JDK_21, TarGZ, url("https://download.oracle.com/java/21/archive/jdk-21_linux-x64_bin.tar.gz")),
    Release(Linux, Amd64, Oracle, JDK_20, TarGZ, url("https://download.oracle.com/java/20/archive/jdk-20.0.2_linux-x64_bin.tar.gz")),
    Release(Linux, Amd64, Oracle, JDK_17, TarGZ, url("https://download.oracle.com/java/17/archive/jdk-17.0.8_linux-x64_bin.tar.gz")),

    // Temurin, Linux, aarch64
    Release(Linux, Aarch64, Temurin, JDK_21, TarGZ, url("https://github.com/adoptium/temurin21-binaries/releases/download/jdk-21.0.4%2B7/OpenJDK21U-jdk_aarch64_linux_hotspot_21.0.4_7.tar.gz")),
    Release(Linux, Aarch64, Temurin, JDK_20, TarGZ, url("https://github.com/adoptium/temurin20-binaries/releases/download/jdk-20.0.2%2B9/OpenJDK20U-jdk_aarch64_linux_hotspot_20.0.2_9.tar.gz")),
    Release(Linux, Aarch64, Temurin, JDK_17, TarGZ, url("https://github.com/adoptium/temurin17-binaries/releases/download/jdk-17.0.8.1%2B1/OpenJDK17U-jdk_aarch64_linux_hotspot_17.0.8.1_1.tar.gz")),
    Release(Linux, Aarch64, Temurin, JDK_11, TarGZ, url("https://github.com/adoptium/temurin11-binaries/releases/download/jdk-11.0.20.1%2B1/OpenJDK11U-jdk_aarch64_linux_hotspot_11.0.20.1_1.tar.gz")),
    Release(Linux, Aarch64, Temurin, JDK_8, TarGZ, url("https://github.com/adoptium/temurin8-binaries/releases/download/jdk8u382-b05/OpenJDK8U-jdk_aarch64_linux_hotspot_8u382b05.tar.gz")),

    // Graal, Linux, aarch64
    Release(Linux, Aarch64, GraalVM, JDK_21, TarGZ, url("https://download.oracle.com/graalvm/21/latest/graalvm-jdk-21_linux-aarch64_bin.tar.gz")),
    Release(Linux, Aarch64, GraalVM, JDK_17, TarGZ, url("https://download.oracle.com/graalvm/17/latest/graalvm-jdk-17_linux-aarch64_bin.tar.gz")),

    // Semeru, Linux, aarch64
    Release(Linux, Aarch64, OpenJ9, JDK_20, TarGZ, url("https://github.com/ibmruntimes/semeru20-binaries/releases/download/jdk-20.0.2%2B9_openj9-0.40.0/ibm-semeru-open-jdk_aarch64_linux_20.0.2_9_openj9-0.40.0.tar.gz")),
    Release(Linux, Aarch64, OpenJ9, JDK_17, TarGZ, url("https://github.com/ibmruntimes/semeru17-binaries/releases/download/jdk-17.0.8.1%2B1_openj9-0.40.0/ibm-semeru-open-jdk_aarch64_linux_17.0.8.1_1_openj9-0.40.0.tar.gz")),
    Release(Linux, Aarch64, OpenJ9, JDK_11, TarGZ, url("https://github.com/ibmruntimes/semeru11-binaries/releases/download/jdk-11.0.20.1%2B1_openj9-0.40.0/ibm-semeru-open-jdk_aarch64_linux_11.0.20.1_1_openj9-0.40.0.tar.gz")),
    Release(Linux, Aarch64, OpenJ9, JDK_8, TarGZ, url("https://github.com/ibmruntimes/semeru8-binaries/releases/download/jdk8u382-b05_openj9-0.40.0/ibm-semeru-open-jdk_aarch64_linux_8u382b05_openj9-0.40.0.tar.gz")),

    // Corretto, Linux, aarch64
    Release(Linux, Aarch64, Corretto, JDK_21, TarGZ, url("https://corretto.aws/downloads/resources/21.0.0.35.1/amazon-corretto-21.0.0.35.1-linux-aarch64.tar.gz")),
    Release(Linux, Aarch64, Corretto, JDK_20, TarGZ, url("https://corretto.aws/downloads/resources/20.0.2.9.1/amazon-corretto-20.0.2.9.1-linux-aarch64.tar.gz")),
    Release(Linux, Aarch64, Corretto, JDK_17, TarGZ, url("https://corretto.aws/downloads/resources/17.0.8.8.1/amazon-corretto-17.0.8.8.1-linux-aarch64.tar.gz")),
    Release(Linux, Aarch64, Corretto, JDK_11, TarGZ, url("https://corretto.aws/downloads/resources/11.0.20.9.1/amazon-corretto-11.0.20.9.1-linux-aarch64.tar.gz")),
    Release(Linux, Aarch64, Corretto, JDK_8, TarGZ, url("https://corretto.aws/downloads/resources/8.382.05.1/amazon-corretto-8.382.05.1-linux-aarch64.tar.gz")),

    // Oracle, Linux, aarch64
    Release(Linux, Aarch64, Oracle, JDK_21, TarGZ, url("https://download.oracle.com/java/21/archive/jdk-21_linux-aarch64_bin.tar.gz")),
    Release(Linux, Aarch64, Oracle, JDK_20, TarGZ, url("https://download.oracle.com/java/20/archive/jdk-20.0.2_linux-aarch64_bin.tar.gz")),
    Release(Linux, Aarch64, Oracle, JDK_17, TarGZ, url("https://download.oracle.com/java/17/archive/jdk-17.0.8_linux-aarch64_bin.tar.gz")),

    // Temurin, MacOS, x64
    Release(MacOS, Amd64, Temurin, JDK_21, TarGZ, url("https://github.com/adoptium/temurin21-binaries/releases/download/jdk-21.0.4%2B7/OpenJDK21U-jdk_x64_mac_hotspot_21.0.4_7.tar.gz")),
    Release(MacOS, Amd64, Temurin, JDK_20, TarGZ, url("https://github.com/adoptium/temurin20-binaries/releases/download/jdk-20.0.2%2B9/OpenJDK20U-jdk_x64_mac_hotspot_20.0.2_9.tar.gz")),
    Release(MacOS, Amd64, Temurin, JDK_17, TarGZ, url("https://github.com/adoptium/temurin17-binaries/releases/download/jdk-17.0.8.1%2B1/OpenJDK17U-jdk_x64_mac_hotspot_17.0.8.1_1.tar.gz")),
    Release(MacOS, Amd64, Temurin, JDK_11, TarGZ, url("https://github.com/adoptium/temurin11-binaries/releases/download/jdk-11.0.20.1%2B1/OpenJDK11U-jdk_x64_mac_hotspot_11.0.20.1_1.tar.gz")),
    Release(MacOS, Amd64, Temurin, JDK_8, TarGZ, url("https://github.com/adoptium/temurin8-binaries/releases/download/jdk8u382-b05/OpenJDK8U-jdk_x64_mac_hotspot_8u382b05.tar.gz")),

    // Graal, MacOS, x64
    Release(MacOS, Amd64, GraalVM, JDK_21, TarGZ, url("https://download.oracle.com/graalvm/21/latest/graalvm-jdk-21_macos-x64_bin.tar.gz")),
    Release(MacOS, Amd64, GraalVM, JDK_17, TarGZ, url("https://download.oracle.com/graalvm/17/latest/graalvm-jdk-17_macos-x64_bin.tar.gz")),

    // Semeru, MacOS, x64
    Release(MacOS, Amd64, OpenJ9, JDK_20, TarGZ, url("https://github.com/ibmruntimes/semeru20-binaries/releases/download/jdk-20.0.2%2B9_openj9-0.40.0/ibm-semeru-open-jdk_x64_mac_20.0.2_9_openj9-0.40.0.tar.gz")),
    Release(MacOS, Amd64, OpenJ9, JDK_17, TarGZ, url("https://github.com/ibmruntimes/semeru17-binaries/releases/download/jdk-17.0.8.1%2B1_openj9-0.40.0/ibm-semeru-open-jdk_x64_mac_17.0.8.1_1_openj9-0.40.0.tar.gz")),
    Release(MacOS, Amd64, OpenJ9, JDK_11, TarGZ, url("https://github.com/ibmruntimes/semeru11-binaries/releases/download/jdk-11.0.20.1%2B1_openj9-0.40.0/ibm-semeru-open-jdk_x64_mac_11.0.20.1_1_openj9-0.40.0.tar.gz")),
    Release(MacOS, Amd64, OpenJ9, JDK_8, TarGZ, url("https://github.com/ibmruntimes/semeru8-binaries/releases/download/jdk8u382-b05_openj9-0.40.0/ibm-semeru-open-jdk_x64_mac_8u382b05_openj9-0.40.0.tar.gz")),

    // Corretto, MacOS, x64
    Release(MacOS, Amd64, Corretto, JDK_21, TarGZ, url("https://corretto.aws/downloads/resources/21.0.0.35.1/amazon-corretto-21.0.0.35.1-macosx-x64.tar.gz")),
    Release(MacOS, Amd64, Corretto, JDK_20, TarGZ, url("https://corretto.aws/downloads/resources/20.0.2.9.1/amazon-corretto-20.0.2.9.1-macosx-x64.tar.gz")),
    Release(MacOS, Amd64, Corretto, JDK_17, TarGZ, url("https://corretto.aws/downloads/resources/17.0.8.8.1/amazon-corretto-17.0.8.8.1-macosx-x64.tar.gz")),
    Release(MacOS, Amd64, Corretto, JDK_11, TarGZ, url("https://corretto.aws/downloads/resources/11.0.20.9.1/amazon-corretto-11.0.20.9.1-macosx-x64.tar.gz")),
    Release(MacOS, Amd64, Corretto, JDK_8, TarGZ, url("https://corretto.aws/downloads/resources/8.382.05.1/amazon-corretto-8.382.05.1-macosx-x64.tar.gz")),

    // Oracle, MacOS, x64
    Release(MacOS, Amd64, Oracle, JDK_21, TarGZ, url("https://download.oracle.com/java/21/archive/jdk-21_macos-x64_bin.tar.gz")),
    Release(MacOS, Amd64, Oracle, JDK_20, TarGZ, url("https://download.oracle.com/java/20/archive/jdk-20.0.2_macos-x64_bin.tar.gz")),
    Release(MacOS, Amd64, Oracle, JDK_17, TarGZ, url("https://download.oracle.com/java/17/archive/jdk-17.0.8_macos-x64_bin.tar.gz")),

    // Temurin, MacOS, aarch64
    Release(MacOS, Arm64, Temurin, JDK_21, TarGZ, url("https://github.com/adoptium/temurin21-binaries/releases/download/jdk-21.0.4%2B7/OpenJDK21U-jdk_aarch64_mac_hotspot_21.0.4_7.tar.gz")),
    Release(MacOS, Arm64, Temurin, JDK_20, TarGZ, url("https://github.com/adoptium/temurin20-binaries/releases/download/jdk-20.0.2%2B9/OpenJDK20U-jdk_aarch64_mac_hotspot_20.0.2_9.tar.gz")),
    Release(MacOS, Arm64, Temurin, JDK_17, TarGZ, url("https://github.com/adoptium/temurin17-binaries/releases/download/jdk-17.0.8.1%2B1/OpenJDK17U-jdk_aarch64_mac_hotspot_17.0.8.1_1.tar.gz")),
    Release(MacOS, Arm64, Temurin, JDK_11, TarGZ, url("https://github.com/adoptium/temurin11-binaries/releases/download/jdk-11.0.20.1%2B1/OpenJDK11U-jdk_aarch64_mac_hotspot_11.0.20.1_1.tar.gz")),

    // Graal, MacOS, aarch64
    Release(MacOS, Arm64, GraalVM, JDK_21, TarGZ, url("https://download.oracle.com/graalvm/21/latest/graalvm-jdk-21_macos-aarch64_bin.tar.gz")),
    Release(MacOS, Arm64, GraalVM, JDK_17, TarGZ, url("https://download.oracle.com/graalvm/17/latest/graalvm-jdk-17_macos-aarch64_bin.tar.gz")),

    // Semeru, MacOS, aarch64
    Release(MacOS, Arm64, OpenJ9, JDK_20, TarGZ, url("https://github.com/ibmruntimes/semeru20-binaries/releases/download/jdk-20.0.2%2B9_openj9-0.40.0/ibm-semeru-open-jdk_aarch64_mac_20.0.2_9_openj9-0.40.0.tar.gz")),
    Release(MacOS, Arm64, OpenJ9, JDK_17, TarGZ, url("https://github.com/ibmruntimes/semeru17-binaries/releases/download/jdk-17.0.8.1%2B1_openj9-0.40.0/ibm-semeru-open-jdk_aarch64_mac_17.0.8.1_1_openj9-0.40.0.tar.gz")),
    Release(MacOS, Arm64, OpenJ9, JDK_11, TarGZ, url("https://github.com/ibmruntimes/semeru11-binaries/releases/download/jdk-11.0.20.1%2B1_openj9-0.40.0/ibm-semeru-open-jdk_aarch64_mac_11.0.20.1_1_openj9-0.40.0.tar.gz")),

    // Corretto, MacOS, aarch64
    Release(MacOS, Arm64, Corretto, JDK_21, TarGZ, url("https://corretto.aws/downloads/resources/21.0.0.35.1/amazon-corretto-21.0.0.35.1-macosx-aarch64.tar.gz")),
    Release(MacOS, Arm64, Corretto, JDK_20, TarGZ, url("https://corretto.aws/downloads/resources/20.0.2.9.1/amazon-corretto-20.0.2.9.1-macosx-aarch64.tar.gz")),
    Release(MacOS, Arm64, Corretto, JDK_17, TarGZ, url("https://corretto.aws/downloads/resources/17.0.8.8.1/amazon-corretto-17.0.8.8.1-macosx-aarch64.tar.gz")),
    Release(MacOS, Arm64, Corretto, JDK_11, TarGZ, url("https://corretto.aws/downloads/resources/11.0.20.9.1/amazon-corretto-11.0.20.9.1-macosx-aarch64.tar.gz")),
    Release(MacOS, Arm64, Corretto, JDK_8, TarGZ, url("https://corretto.aws/downloads/resources/8.382.05.1/amazon-corretto-8.382.05.1-macosx-aarch64.tar.gz")),

    // Oracle, MacOS, aarch64
    Release(MacOS, Arm64, Oracle, JDK_21, TarGZ, url("https://download.oracle.com/java/21/archive/jdk-21_macos-aarch64_bin.tar.gz")),
    Release(MacOS, Arm64, Oracle, JDK_20, TarGZ, url("https://download.oracle.com/java/20/archive/jdk-20.0.2_macos-aarch64_bin.tar.gz")),
    Release(MacOS, Arm64, Oracle, JDK_17, TarGZ, url("https://download.oracle.com/java/17/archive/jdk-17.0.8_macos-aarch64_bin.tar.gz")),

    // Temurin, Windows, x64
    Release(Windows, Amd64, Temurin, JDK_21, Zip, url("https://github.com/adoptium/temurin21-binaries/releases/download/jdk-21.0.4%2B7/OpenJDK21U-jdk_x64_windows_hotspot_21.0.4_7.zip")),
    Release(Windows, Amd64, Temurin, JDK_20, Zip, url("https://github.com/adoptium/temurin20-binaries/releases/download/jdk-20.0.2%2B9/OpenJDK20U-jdk_x64_windows_hotspot_20.0.2_9.zip")),
    Release(Windows, Amd64, Temurin, JDK_17, Zip, url("https://github.com/adoptium/temurin17-binaries/releases/download/jdk-17.0.8.1%2B1/OpenJDK17U-jdk_x64_windows_hotspot_17.0.8.1_1.zip")),
    Release(Windows, Amd64, Temurin, JDK_11, Zip, url("https://github.com/adoptium/temurin11-binaries/releases/download/jdk-11.0.20.1%2B1/OpenJDK11U-jdk_x64_windows_hotspot_11.0.20.1_1.zip")),
    Release(Windows, Amd64, Temurin, JDK_8, Zip, url("https://github.com/adoptium/temurin8-binaries/releases/download/jdk8u382-b05/OpenJDK8U-jdk_x64_windows_hotspot_8u382b05.zip")),

    // Graal, Windows, x64
    Release(Windows, Amd64, GraalVM, JDK_21, Zip, url("https://download.oracle.com/graalvm/21/latest/graalvm-jdk-21_windows-x64_bin.zip")),
    Release(Windows, Amd64, GraalVM, JDK_17, Zip, url("https://download.oracle.com/graalvm/17/latest/graalvm-jdk-17_windows-x64_bin.zip")),

    // Semeru, Windows, x64
    Release(Windows, Amd64, OpenJ9, JDK_20, Zip, url("https://github.com/ibmruntimes/semeru20-binaries/releases/download/jdk-20.0.2%2B9_openj9-0.40.0/ibm-semeru-open-jdk_x64_windows_20.0.2_9_openj9-0.40.0.zip")),
    Release(Windows, Amd64, OpenJ9, JDK_17, Zip, url("https://github.com/ibmruntimes/semeru17-binaries/releases/download/jdk-17.0.8.1%2B1_openj9-0.40.0/ibm-semeru-open-jdk_x64_windows_17.0.8.1_1_openj9-0.40.0.zip")),
    Release(Windows, Amd64, OpenJ9, JDK_11, Zip, url("https://github.com/ibmruntimes/semeru11-binaries/releases/download/jdk-11.0.20.1%2B1_openj9-0.40.0/ibm-semeru-open-jdk_x64_windows_11.0.20.1_1_openj9-0.40.0.zip")),
    Release(Windows, Amd64, OpenJ9, JDK_8, Zip, url("https://github.com/ibmruntimes/semeru8-binaries/releases/download/jdk8u382-b05_openj9-0.40.0/ibm-semeru-open-jdk_x86-32_windows_8u382b05_openj9-0.40.0.zip")),

    // Corretto, Windows, x64
    Release(Windows, Amd64, Corretto, JDK_21, Zip, url("https://corretto.aws/downloads/resources/21.0.0.35.1/amazon-corretto-21.0.0.35.1-windows-x64-jdk.zip")),
    Release(Windows, Amd64, Corretto, JDK_20, Zip, url("https://corretto.aws/downloads/resources/20.0.2.9.1/amazon-corretto-20.0.2.9.1-windows-x64-jdk.zip")),
    Release(Windows, Amd64, Corretto, JDK_17, Zip, url("https://corretto.aws/downloads/resources/17.0.8.8.1/amazon-corretto-17.0.8.8.1-windows-x64-jdk.zip")),
    Release(Windows, Amd64, Corretto, JDK_11, Zip, url("https://corretto.aws/downloads/resources/11.0.20.9.1/amazon-corretto-11.0.20.9.1-windows-x64-jdk.zip")),
    Release(Windows, Amd64, Corretto, JDK_8, Zip, url("https://corretto.aws/downloads/resources/8.382.05.1/amazon-corretto-8.382.05.1-windows-x64-jdk.zip")),

    // Oracle, Windows, x64
    Release(Windows, Amd64, Oracle, JDK_21, Zip, url("https://download.oracle.com/java/21/archive/jdk-21_windows-x64_bin.zip")),
    Release(Windows, Amd64, Oracle, JDK_20, Zip, url("https://download.oracle.com/java/20/archive/jdk-20.0.2_windows-x64_bin.zip")),
    Release(Windows, Amd64, Oracle, JDK_17, Zip, url("https://download.oracle.com/java/17/archive/jdk-17.0.8_windows-x64_bin.zip"))
  )
)
// format: on
