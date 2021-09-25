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
- [Eclipse Adoptium](https://adoptium.net)
  - JDK 8 &ndash; `adoptium@8`
  - JDK 11 &ndash; `adoptium@11`
  - JDK 17 &ndash; `adoptium@17`
- [GraalVM Community Edition](https://graalvm.org)
  - 21.2 (JDK 8) &ndash; `graalvm-ce-java8@21.2`

Users are encouraged to open an issue or PR for adding a new vendor.

## GitHub Actions

This index is useful to test your code on versions not yet [available on GitHub Actions](https://github.com/actions/setup-java#supported-distributions).

Add a `JABBA_INDEX` environment to your `ci.yml`.  Point at a specific commit for reproducibility, or `main` to get the latest:

```yaml
env:
  JABBA_INDEX: 'https://github.com/typelevel/jdk-index/raw/main/index.json'
```

### With [sbt-github-actions](https://github.com/djspiewak/sbt-github-actions)

1. In build.sbt, add the environment variable and customize your JDKs:

   ```scala
   .settings(
     githubWorkflowJavaVersions := List("adoptium@8", "adoptium@11", "adoptium@17"),
     githubWorkflowEnv += ("JABBA_INDEX" -> "https://github.com/typelevel/jdk-index/raw/main/index.json")
   )
   ```
   
2. Regenerate your YAML:

   ```sh
   sbt githubWorkflowGenerate
   ```
   
3. Commit the results

## Contributing to this project
`src/main/scala/org/typelevel/jdk/index/index.scala` is the main source of truth for the JDK index. Edit that file by
adding, removing or editing the available releases (for adding new vendors and CPU architectures, edits to the enums in
the `model` package might need to be done). Afterwards, run
```sh
sbt generateIndex
```
to regenerate the `index.json` file.
