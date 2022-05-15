# jdk-index

A [Jabba](https://github.com/shyiko/jabba)-compatible index of JDK versions

## Availability of JDK versions
This index aims to provide only up-to-date versions of the JDK. Any non-LTS versions will be removed soon after reaching
EOL (usually with the release of the next version of the JDK). EOL releases **do not** receive security or bug fix
updates and there is **no reason** to stay on them, people are very much encouraged to upgrade. Soon after publishing
the latest builds for the current JDKs, they will replace the old, out-of-date build (this usually happens every 3
months). There is also no possibility to select a specific build of the JDK (unless going through the commit history and
depending on a specific version in time of this index). This is a common practice with the new release schedule of JDKs
and users should be aware by now.

## Available JDK vendors
- [Eclipse Temurin](https://adoptium.net)
  - JDK 18 &ndash; `temurin@18`
  - JDK 17 &ndash; `temurin@17`
  - JDK 11 &ndash; `temurin@11`
  - JDK  8 &ndash; `temurin@8`
- [GraalVM Community Edition](https://graalvm.org)
  - JDK 17 &ndash; `graalvm@17`
  - JDK 11 &ndash; `graalvm@11`
- [Eclipse OpenJ9](https://www.eclipse.org/openj9)
  - JDK 18 &ndash; `openj9@18`
  - JDK 17 &ndash; `openj9@17`
  - JDK 11 &ndash; `openj9@11`
  - JDK  8 &ndash; `openj9@8`
- [Amazon Corretto](https://docs.aws.amazon.com/corretto/index.html)
  - JDK 18 &ndash; `corretto@18`
  - JDK 17 &ndash; `corretto@17`
  - JDK 11 &ndash; `corretto@11`
  - JDK 8 &ndash; `corretto@8`
- [Oracle](https://www.oracle.com/java/)
  - JDK 18 &ndash; `oracle@18`
  - JDK 17 &ndash; `oracle@17`

Users are encouraged to open an issue or PR for adding a new vendor.

## GitHub Actions

This index is useful to test your code on versions not yet [available on GitHub Actions](https://github.com/actions/setup-java#supported-distributions).
The recommended way to do this is with the [typelevel/download-java](https://github.com/typelevel/download-java) action.

Alternatively, if you are using [jabba](https://github.com/shyiko/jabba) (for example [olafurpg/setup-scala](https://github.com/olafurpg/setup-scala) uses jabba), you can add a `JABBA_INDEX` environment to your `ci.yml`.  Point at a specific commit for reproducibility, or `main` to get the latest:

```yaml
env:
  JABBA_INDEX: 'https://github.com/typelevel/jdk-index/raw/main/index.json'
```

## Contributing to this project
`src/main/scala/org/typelevel/jdk/index/index.scala` is the main source of truth for the JDK index. Edit that file by
adding, removing or editing the available releases (for adding new vendors and CPU architectures, edits to the enums in
the `model` package might be needed). Afterwards, run
```sh
sbt generateIndex
```
to regenerate the `index.json` file.
