# fitnesse-maven-example

An example maven based Fitnesse project generated using [fitnesse-quickstart](https://github.com/sitture/fitnesse-quickstart) archetype.

## Starting FitNesse

```bash
mvn clean test -P fitnesse-server
```

By default, fitnesse will start running on port 8082 on localhost. To run it on a different port, edit pom.xml or 

```bash
mvn clean test -P fitnesse-server -Dport=9090
```

## Running a FitNesse Suite (JUnit)

You can run the following to run a suite headlessly.

```bash
mvn clean test-compile failsafe:integration-test
```

By default, fitnesse will run `Calculator` suite.

To run a different suite:

```bash
mvn clean test-compile failsafe:integration-test -DsuitePath=SuitePath
```
## Base Urls

All of root urls can be stored in `FitNesse/plugins.properties` file.
**Note:** Any changes to the file requires a FitNesse restart.

Same file can be used to add any FitNesse related plugins.
