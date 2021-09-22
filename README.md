# jdk-index

A [Jabba](https://github.com/shyiko/jabba)-compatible index of JDK versions

## GitHub Actions

This index is useful to test your code on versions not yet [available on GitHub Actions](https://github.com/actions/setup-java#supported-distributions).

Add a `JABBA_INDEX` environment to your `ci.yml`.  Point at a specific commit for reproducibility, or `main` to get the latest:

```yaml
env:
  SONATYPE_PASSWORD: ${{ secrets.SONATYPE_PASSWORD }}
  JABBA_INDEX: 'https://github.com/typelevel/jdk-index/raw/main/index.json'
  SONATYPE_USERNAME: ${{ secrets.SONATYPE_USERNAME }}
  PGP_SECRET: ${{ secrets.PGP_SECRET }}
  GITHUB_TOKEN: ${{ secrets.GITHUB_TOKEN }}
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
   githubWorkflowGenerate
   ```
   
3. Commit the results
