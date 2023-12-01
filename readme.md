This project uses a `~/.gradle/gradle.local.properties` that I made up to pass in the user and password from a file.

Example `~/.gradle/gradle.local.properties` file
```
project.ext.gemfireMavenUser='user@example.com'
project.ext.gemfireMavenPassword='CoolPassword'
```


how to run from the project root dir

call the `scripts/startGemFire.sh` to launch GemFire.

call `./gradlew bootRun --args='10000'` to inject 10,000 Products

When done

call `scripts/shutdownGemFire.sh` to shutdown GemFire properly


