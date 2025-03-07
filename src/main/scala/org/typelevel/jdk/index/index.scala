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

package org.typelevel.jdk.index

import model.*
import OS.*, Arch.*, Vendor.*, Version.*, PackageType.*

// format: off
val MainIndex: Index = Index(
  List(
    // Temurin, Linux, x64
    Release(Linux, Amd64, Temurin, JDK_23, TarGZ, url("https://github.com/adoptium/temurin23-binaries/releases/download/jdk-23.0.2%2B7/OpenJDK23U-jdk_x64_linux_hotspot_23.0.2_7.tar.gz")),
    Release(Linux, Amd64, Temurin, JDK_21, TarGZ, url("https://github.com/adoptium/temurin21-binaries/releases/download/jdk-21.0.6%2B7/OpenJDK21U-jdk_x64_linux_hotspot_21.0.6_7.tar.gz")),
    Release(Linux, Amd64, Temurin, JDK_17, TarGZ, url("https://github.com/adoptium/temurin17-binaries/releases/download/jdk-17.0.14%2B7/OpenJDK17U-jdk_x64_linux_hotspot_17.0.14_7.tar.gz")),
    Release(Linux, Amd64, Temurin, JDK_11, TarGZ, url("https://github.com/adoptium/temurin11-binaries/releases/download/jdk-11.0.26%2B4/OpenJDK11U-jdk_x64_linux_hotspot_11.0.26_4.tar.gz")),
    Release(Linux, Amd64, Temurin, JDK_8, TarGZ, url("https://github.com/adoptium/temurin8-binaries/releases/download/jdk8u442-b06/OpenJDK8U-jdk_x64_linux_hotspot_8u442b06.tar.gz")),

    // Graal, Linux, x64
    Release(Linux, Amd64, GraalVM, JDK_23, TarGZ, url("https://download.oracle.com/graalvm/23/archive/graalvm-jdk-23.0.2_linux-x64_bin.tar.gz")),
    Release(Linux, Amd64, GraalVM, JDK_21, TarGZ, url("https://download.oracle.com/graalvm/21/archive/graalvm-jdk-21.0.6_linux-x64_bin.tar.gz")),

    // Semeru, Linux, x64
    Release(Linux, Amd64, OpenJ9, JDK_23, TarGZ, url("https://github.com/ibmruntimes/semeru23-binaries/releases/download/jdk-23.0.2%2B7_openj9-0.49.0/ibm-semeru-open-jdk_x64_linux_23.0.2_7_openj9-0.49.0.tar.gz")),
    Release(Linux, Amd64, OpenJ9, JDK_21, TarGZ, url("https://github.com/ibmruntimes/semeru21-binaries/releases/download/jdk-21.0.6%2B7_openj9-0.49.0/ibm-semeru-open-jdk_x64_linux_21.0.6_7_openj9-0.49.0.tar.gz")),
    Release(Linux, Amd64, OpenJ9, JDK_17, TarGZ, url("https://github.com/ibmruntimes/semeru17-binaries/releases/download/jdk-17.0.14%2B7_openj9-0.49.0/ibm-semeru-open-jdk_x64_linux_17.0.14_7_openj9-0.49.0.tar.gz")),
    Release(Linux, Amd64, OpenJ9, JDK_11, TarGZ, url("https://github.com/ibmruntimes/semeru11-binaries/releases/download/jdk-11.0.26%2B4_openj9-0.49.0/ibm-semeru-open-jdk_x64_linux_11.0.26_4_openj9-0.49.0.tar.gz")),
    Release(Linux, Amd64, OpenJ9, JDK_8, TarGZ, url("https://github.com/ibmruntimes/semeru8-binaries/releases/download/jdk8u442-b06_openj9-0.49.0/ibm-semeru-open-jdk_x64_linux_8u442b06_openj9-0.49.0.tar.gz")),

    // Corretto, Linux, x64
    Release(Linux, Amd64, Corretto, JDK_23, TarGZ, url("https://corretto.aws/downloads/resources/23.0.2.7.1/amazon-corretto-23.0.2.7.1-linux-x64.tar.gz")),
    Release(Linux, Amd64, Corretto, JDK_21, TarGZ, url("https://corretto.aws/downloads/resources/21.0.6.7.1/amazon-corretto-21.0.6.7.1-linux-x64.tar.gz")),
    Release(Linux, Amd64, Corretto, JDK_17, TarGZ, url("https://corretto.aws/downloads/resources/17.0.14.7.1/amazon-corretto-17.0.14.7.1-linux-x64.tar.gz")),
    Release(Linux, Amd64, Corretto, JDK_11, TarGZ, url("https://corretto.aws/downloads/resources/11.0.26.4.1/amazon-corretto-11.0.26.4.1-linux-x64.tar.gz")),
    Release(Linux, Amd64, Corretto, JDK_8, TarGZ, url("https://corretto.aws/downloads/resources/8.442.06.1/amazon-corretto-8.442.06.1-linux-x64.tar.gz")),

    // Oracle, Linux, x64
    Release(Linux, Amd64, Oracle, JDK_23, TarGZ, url("https://download.oracle.com/java/23/archive/jdk-23.0.2_linux-x64_bin.tar.gz")),
    Release(Linux, Amd64, Oracle, JDK_21, TarGZ, url("https://download.oracle.com/java/21/archive/jdk-21.0.6_linux-x64_bin.tar.gz")),

    // Temurin, Linux, aarch64
    Release(Linux, Aarch64, Temurin, JDK_23, TarGZ, url("https://github.com/adoptium/temurin23-binaries/releases/download/jdk-23.0.2%2B7/OpenJDK23U-jdk_aarch64_linux_hotspot_23.0.2_7.tar.gz")),
    Release(Linux, Aarch64, Temurin, JDK_21, TarGZ, url("https://github.com/adoptium/temurin21-binaries/releases/download/jdk-21.0.6%2B7/OpenJDK21U-jdk_aarch64_linux_hotspot_21.0.6_7.tar.gz")),
    Release(Linux, Aarch64, Temurin, JDK_17, TarGZ, url("https://github.com/adoptium/temurin17-binaries/releases/download/jdk-17.0.14%2B7/OpenJDK17U-jdk_aarch64_linux_hotspot_17.0.14_7.tar.gz")),
    Release(Linux, Aarch64, Temurin, JDK_11, TarGZ, url("https://github.com/adoptium/temurin11-binaries/releases/download/jdk-11.0.26%2B4/OpenJDK11U-jdk_aarch64_linux_hotspot_11.0.26_4.tar.gz")),
    Release(Linux, Aarch64, Temurin, JDK_8, TarGZ, url("https://github.com/adoptium/temurin8-binaries/releases/download/jdk8u442-b06/OpenJDK8U-jdk_aarch64_linux_hotspot_8u442b06.tar.gz")),

    // Graal, Linux, aarch64
    Release(Linux, Aarch64, GraalVM, JDK_23, TarGZ, url("https://download.oracle.com/graalvm/23/archive/graalvm-jdk-23.0.2_linux-aarch64_bin.tar.gz")),
    Release(Linux, Aarch64, GraalVM, JDK_21, TarGZ, url("https://download.oracle.com/graalvm/21/archive/graalvm-jdk-21.0.6_linux-aarch64_bin.tar.gz")),

    // Semeru, Linux, aarch64
    Release(Linux, Aarch64, OpenJ9, JDK_23, TarGZ, url("https://github.com/ibmruntimes/semeru23-binaries/releases/download/jdk-23.0.2%2B7_openj9-0.49.0/ibm-semeru-open-jdk_aarch64_linux_23.0.2_7_openj9-0.49.0.tar.gz")),
    Release(Linux, Aarch64, OpenJ9, JDK_21, TarGZ, url("https://github.com/ibmruntimes/semeru21-binaries/releases/download/jdk-21.0.6%2B7_openj9-0.49.0/ibm-semeru-open-jdk_aarch64_linux_21.0.6_7_openj9-0.49.0.tar.gz")),
    Release(Linux, Aarch64, OpenJ9, JDK_17, TarGZ, url("https://github.com/ibmruntimes/semeru17-binaries/releases/download/jdk-17.0.14%2B7_openj9-0.49.0/ibm-semeru-open-jdk_aarch64_linux_17.0.14_7_openj9-0.49.0.tar.gz")),
    Release(Linux, Aarch64, OpenJ9, JDK_11, TarGZ, url("https://github.com/ibmruntimes/semeru11-binaries/releases/download/jdk-11.0.26%2B4_openj9-0.49.0/ibm-semeru-open-jdk_aarch64_linux_11.0.26_4_openj9-0.49.0.tar.gz")),
    Release(Linux, Aarch64, OpenJ9, JDK_8, TarGZ, url("https://github.com/ibmruntimes/semeru8-binaries/releases/download/jdk8u442-b06_openj9-0.49.0/ibm-semeru-open-jdk_aarch64_linux_8u442b06_openj9-0.49.0.tar.gz")),

    // Corretto, Linux, aarch64
    Release(Linux, Aarch64, Corretto, JDK_23, TarGZ, url("https://corretto.aws/downloads/resources/23.0.2.7.1/amazon-corretto-23.0.2.7.1-linux-aarch64.tar.gz")),
    Release(Linux, Aarch64, Corretto, JDK_21, TarGZ, url("https://corretto.aws/downloads/resources/21.0.6.7.1/amazon-corretto-21.0.6.7.1-linux-aarch64.tar.gz")),
    Release(Linux, Aarch64, Corretto, JDK_17, TarGZ, url("https://corretto.aws/downloads/resources/17.0.14.7.1/amazon-corretto-17.0.14.7.1-linux-aarch64.tar.gz")),
    Release(Linux, Aarch64, Corretto, JDK_11, TarGZ, url("https://corretto.aws/downloads/resources/11.0.26.4.1/amazon-corretto-11.0.26.4.1-linux-aarch64.tar.gz")),
    Release(Linux, Aarch64, Corretto, JDK_8, TarGZ, url("https://corretto.aws/downloads/resources/8.442.06.1/amazon-corretto-8.442.06.1-linux-aarch64.tar.gz")),

    // Oracle, Linux, aarch64
    Release(Linux, Aarch64, Oracle, JDK_23, TarGZ, url("https://download.oracle.com/java/23/archive/jdk-23.0.2_linux-aarch64_bin.tar.gz")),
    Release(Linux, Aarch64, Oracle, JDK_21, TarGZ, url("https://download.oracle.com/java/21/archive/jdk-21.0.6_linux-aarch64_bin.tar.gz")),

    // Temurin, MacOS, x64
    Release(MacOS, Amd64, Temurin, JDK_23, TarGZ, url("https://github.com/adoptium/temurin23-binaries/releases/download/jdk-23.0.2%2B7/OpenJDK23U-jdk_x64_mac_hotspot_23.0.2_7.tar.gz")),
    Release(MacOS, Amd64, Temurin, JDK_21, TarGZ, url("https://github.com/adoptium/temurin21-binaries/releases/download/jdk-21.0.6%2B7/OpenJDK21U-jdk_x64_mac_hotspot_21.0.6_7.tar.gz")),
    Release(MacOS, Amd64, Temurin, JDK_17, TarGZ, url("https://github.com/adoptium/temurin17-binaries/releases/download/jdk-17.0.14%2B7/OpenJDK17U-jdk_x64_mac_hotspot_17.0.14_7.tar.gz")),
    Release(MacOS, Amd64, Temurin, JDK_11, TarGZ, url("https://github.com/adoptium/temurin11-binaries/releases/download/jdk-11.0.26%2B4/OpenJDK11U-jdk_x64_mac_hotspot_11.0.26_4.tar.gz")),
    Release(MacOS, Amd64, Temurin, JDK_8, TarGZ, url("https://github.com/adoptium/temurin8-binaries/releases/download/jdk8u442-b06/OpenJDK8U-jdk_x64_mac_hotspot_8u442b06.tar.gz")),

    // Graal, MacOS, x64
    Release(MacOS, Amd64, GraalVM, JDK_23, TarGZ, url("https://download.oracle.com/graalvm/23/archive/graalvm-jdk-23.0.2_macos-x64_bin.tar.gz")),
    Release(MacOS, Amd64, GraalVM, JDK_21, TarGZ, url("https://download.oracle.com/graalvm/21/archive/graalvm-jdk-21.0.6_macos-x64_bin.tar.gz")),

    // Semeru, MacOS, x64
    Release(MacOS, Amd64, OpenJ9, JDK_23, TarGZ, url("https://github.com/ibmruntimes/semeru23-binaries/releases/download/jdk-23.0.2%2B7_openj9-0.49.0/ibm-semeru-open-jdk_x64_mac_23.0.2_7_openj9-0.49.0.tar.gz")),
    Release(MacOS, Amd64, OpenJ9, JDK_21, TarGZ, url("https://github.com/ibmruntimes/semeru21-binaries/releases/download/jdk-21.0.6%2B7_openj9-0.49.0/ibm-semeru-open-jdk_x64_mac_21.0.6_7_openj9-0.49.0.tar.gz")),
    Release(MacOS, Amd64, OpenJ9, JDK_17, TarGZ, url("https://github.com/ibmruntimes/semeru17-binaries/releases/download/jdk-17.0.14%2B7_openj9-0.49.0/ibm-semeru-open-jdk_x64_mac_17.0.14_7_openj9-0.49.0.tar.gz")),
    Release(MacOS, Amd64, OpenJ9, JDK_11, TarGZ, url("https://github.com/ibmruntimes/semeru11-binaries/releases/download/jdk-11.0.26%2B4_openj9-0.49.0/ibm-semeru-open-jdk_x64_mac_11.0.26_4_openj9-0.49.0.tar.gz")),
    Release(MacOS, Amd64, OpenJ9, JDK_8, TarGZ, url("https://github.com/ibmruntimes/semeru8-binaries/releases/download/jdk8u442-b06_openj9-0.49.0/ibm-semeru-open-jdk_x64_mac_8u442b06_openj9-0.49.0.tar.gz")),

    // Corretto, MacOS, x64
    Release(MacOS, Amd64, Corretto, JDK_23, TarGZ, url("https://corretto.aws/downloads/resources/23.0.2.7.1/amazon-corretto-23.0.2.7.1-macosx-x64.tar.gz")),
    Release(MacOS, Amd64, Corretto, JDK_21, TarGZ, url("https://corretto.aws/downloads/resources/21.0.6.7.1/amazon-corretto-21.0.6.7.1-macosx-x64.tar.gz")),
    Release(MacOS, Amd64, Corretto, JDK_17, TarGZ, url("https://corretto.aws/downloads/resources/17.0.14.7.1/amazon-corretto-17.0.14.7.1-macosx-x64.tar.gz")),
    Release(MacOS, Amd64, Corretto, JDK_11, TarGZ, url("https://corretto.aws/downloads/resources/11.0.26.4.1/amazon-corretto-11.0.26.4.1-macosx-x64.tar.gz")),
    Release(MacOS, Amd64, Corretto, JDK_8, TarGZ, url("https://corretto.aws/downloads/resources/8.442.06.1/amazon-corretto-8.442.06.1-macosx-x64.tar.gz")),

    // Oracle, MacOS, x64
    Release(MacOS, Amd64, Oracle, JDK_23, TarGZ, url("https://download.oracle.com/java/23/archive/jdk-23.0.2_macos-x64_bin.tar.gz")),
    Release(MacOS, Amd64, Oracle, JDK_21, TarGZ, url("https://download.oracle.com/java/21/archive/jdk-21.0.6_macos-x64_bin.tar.gz")),

    // Temurin, MacOS, aarch64
    Release(MacOS, Arm64, Temurin, JDK_23, TarGZ, url("https://github.com/adoptium/temurin23-binaries/releases/download/jdk-23.0.2%2B7/OpenJDK23U-jdk_aarch64_mac_hotspot_23.0.2_7.tar.gz")),
    Release(MacOS, Arm64, Temurin, JDK_21, TarGZ, url("https://github.com/adoptium/temurin21-binaries/releases/download/jdk-21.0.6%2B7/OpenJDK21U-jdk_aarch64_mac_hotspot_21.0.6_7.tar.gz")),
    Release(MacOS, Arm64, Temurin, JDK_17, TarGZ, url("https://github.com/adoptium/temurin17-binaries/releases/download/jdk-17.0.14%2B7/OpenJDK17U-jdk_aarch64_mac_hotspot_17.0.14_7.tar.gz")),
    Release(MacOS, Arm64, Temurin, JDK_11, TarGZ, url("https://github.com/adoptium/temurin11-binaries/releases/download/jdk-11.0.26%2B4/OpenJDK11U-jdk_aarch64_mac_hotspot_11.0.26_4.tar.gz")),

    // Graal, MacOS, aarch64
    Release(MacOS, Arm64, GraalVM, JDK_23, TarGZ, url("https://download.oracle.com/graalvm/23/archive/graalvm-jdk-23.0.2_macos-aarch64_bin.tar.gz")),
    Release(MacOS, Arm64, GraalVM, JDK_21, TarGZ, url("https://download.oracle.com/graalvm/21/archive/graalvm-jdk-21.0.6_macos-aarch64_bin.tar.gz")),

    // Semeru, MacOS, aarch64
    Release(MacOS, Arm64, OpenJ9, JDK_23, TarGZ, url("https://github.com/ibmruntimes/semeru23-binaries/releases/download/jdk-23.0.2%2B7_openj9-0.49.0/ibm-semeru-open-jdk_aarch64_mac_23.0.2_7_openj9-0.49.0.tar.gz")),
    Release(MacOS, Arm64, OpenJ9, JDK_21, TarGZ, url("https://github.com/ibmruntimes/semeru21-binaries/releases/download/jdk-21.0.6%2B7_openj9-0.49.0/ibm-semeru-open-jdk_aarch64_mac_21.0.6_7_openj9-0.49.0.tar.gz")),
    Release(MacOS, Arm64, OpenJ9, JDK_17, TarGZ, url("https://github.com/ibmruntimes/semeru17-binaries/releases/download/jdk-17.0.14%2B7_openj9-0.49.0/ibm-semeru-open-jdk_aarch64_mac_17.0.14_7_openj9-0.49.0.tar.gz")),
    Release(MacOS, Arm64, OpenJ9, JDK_11, TarGZ, url("https://github.com/ibmruntimes/semeru11-binaries/releases/download/jdk-11.0.26%2B4_openj9-0.49.0/ibm-semeru-open-jdk_aarch64_mac_11.0.26_4_openj9-0.49.0.tar.gz")),

    // Corretto, MacOS, aarch64
    Release(MacOS, Arm64, Corretto, JDK_23, TarGZ, url("https://corretto.aws/downloads/resources/23.0.2.7.1/amazon-corretto-23.0.2.7.1-macosx-aarch64.tar.gz")),
    Release(MacOS, Arm64, Corretto, JDK_21, TarGZ, url("https://corretto.aws/downloads/resources/21.0.6.7.1/amazon-corretto-21.0.6.7.1-macosx-aarch64.tar.gz")),
    Release(MacOS, Arm64, Corretto, JDK_17, TarGZ, url("https://corretto.aws/downloads/resources/17.0.14.7.1/amazon-corretto-17.0.14.7.1-macosx-aarch64.tar.gz")),
    Release(MacOS, Arm64, Corretto, JDK_11, TarGZ, url("https://corretto.aws/downloads/resources/11.0.26.4.1/amazon-corretto-11.0.26.4.1-macosx-aarch64.tar.gz")),
    Release(MacOS, Arm64, Corretto, JDK_8, TarGZ, url("https://corretto.aws/downloads/resources/8.442.06.1/amazon-corretto-8.442.06.1-macosx-aarch64.tar.gz")),

    // Oracle, MacOS, aarch64
    Release(MacOS, Arm64, Oracle, JDK_23, TarGZ, url("https://download.oracle.com/java/23/archive/jdk-23.0.2_macos-aarch64_bin.tar.gz")),
    Release(MacOS, Arm64, Oracle, JDK_21, TarGZ, url("https://download.oracle.com/java/21/archive/jdk-21.0.6_macos-aarch64_bin.tar.gz")),

    // Temurin, Windows, x64
    Release(Windows, Amd64, Temurin, JDK_23, Zip, url("https://github.com/adoptium/temurin23-binaries/releases/download/jdk-23.0.2%2B7/OpenJDK23U-jdk_x64_windows_hotspot_23.0.2_7.zip")),
    Release(Windows, Amd64, Temurin, JDK_21, Zip, url("https://github.com/adoptium/temurin21-binaries/releases/download/jdk-21.0.6%2B7/OpenJDK21U-jdk_x64_windows_hotspot_21.0.6_7.zip")),
    Release(Windows, Amd64, Temurin, JDK_17, Zip, url("https://github.com/adoptium/temurin17-binaries/releases/download/jdk-17.0.14%2B7/OpenJDK17U-jdk_x64_windows_hotspot_17.0.14_7.zip")),
    Release(Windows, Amd64, Temurin, JDK_11, Zip, url("https://github.com/adoptium/temurin11-binaries/releases/download/jdk-11.0.26%2B4/OpenJDK11U-jdk_x64_windows_hotspot_11.0.26_4.zip")),
    Release(Windows, Amd64, Temurin, JDK_8, Zip, url("https://github.com/adoptium/temurin8-binaries/releases/download/jdk8u442-b06/OpenJDK8U-jdk_x64_windows_hotspot_8u442b06.zip")),

    // Graal, Windows, x64
    Release(Windows, Amd64, GraalVM, JDK_23, Zip, url("https://download.oracle.com/graalvm/23/archive/graalvm-jdk-23.0.2_windows-x64_bin.zip")),
    Release(Windows, Amd64, GraalVM, JDK_21, Zip, url("https://download.oracle.com/graalvm/21/archive/graalvm-jdk-21.0.6_windows-x64_bin.zip")),

    // Semeru, Windows, x64
    Release(Windows, Amd64, OpenJ9, JDK_23, Zip, url("https://github.com/ibmruntimes/semeru23-binaries/releases/download/jdk-23.0.2%2B7_openj9-0.49.0/ibm-semeru-open-jdk_x64_windows_23.0.2_7_openj9-0.49.0.zip")),
    Release(Windows, Amd64, OpenJ9, JDK_21, Zip, url("https://github.com/ibmruntimes/semeru21-binaries/releases/download/jdk-21.0.6%2B7_openj9-0.49.0/ibm-semeru-open-jdk_x64_windows_21.0.6_7_openj9-0.49.0.zip")),
    Release(Windows, Amd64, OpenJ9, JDK_17, Zip, url("https://github.com/ibmruntimes/semeru17-binaries/releases/download/jdk-17.0.14%2B7_openj9-0.49.0/ibm-semeru-open-jdk_x64_windows_17.0.14_7_openj9-0.49.0.zip")),
    Release(Windows, Amd64, OpenJ9, JDK_11, Zip, url("https://github.com/ibmruntimes/semeru11-binaries/releases/download/jdk-11.0.26%2B4_openj9-0.49.0/ibm-semeru-open-jdk_x64_windows_11.0.26_4_openj9-0.49.0.zip")),
    Release(Windows, Amd64, OpenJ9, JDK_8, Zip, url("https://github.com/ibmruntimes/semeru8-binaries/releases/download/jdk8u442-b06_openj9-0.49.0/ibm-semeru-open-jdk_x64_windows_8u442b06_openj9-0.49.0.zip")),

    // Corretto, Windows, x64
    Release(Windows, Amd64, Corretto, JDK_23, Zip, url("https://corretto.aws/downloads/resources/23.0.2.7.1/amazon-corretto-23.0.2.7.1-windows-x64-jdk.zip")),
    Release(Windows, Amd64, Corretto, JDK_21, Zip, url("https://corretto.aws/downloads/resources/21.0.6.7.1/amazon-corretto-21.0.6.7.1-windows-x64-jdk.zip")),
    Release(Windows, Amd64, Corretto, JDK_17, Zip, url("https://corretto.aws/downloads/resources/17.0.14.7.1/amazon-corretto-17.0.14.7.1-windows-x64-jdk.zip")),
    Release(Windows, Amd64, Corretto, JDK_11, Zip, url("https://corretto.aws/downloads/resources/11.0.26.4.1/amazon-corretto-11.0.26.4.1-windows-x64-jdk.zip")),
    Release(Windows, Amd64, Corretto, JDK_8, Zip, url("https://corretto.aws/downloads/resources/8.442.06.1/amazon-corretto-8.442.06.1-windows-x64-jdk.zip")),

    // Oracle, Windows, x64
    Release(Windows, Amd64, Oracle, JDK_23, Zip, url("https://download.oracle.com/java/23/archive/jdk-23.0.2_windows-x64_bin.zip")),
    Release(Windows, Amd64, Oracle, JDK_21, Zip, url("https://download.oracle.com/java/21/archive/jdk-21.0.6_windows-x64_bin.zip"))
  )
)
// format: on
