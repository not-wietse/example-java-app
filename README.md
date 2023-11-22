## Example java application

### Requirements

- Java 17
- Gradle 9

### Run the security check analisys

```bash
gradle dependencyCheckAnalyze
```

### Build the tar

```bash
gradle build
```

### Run the application

```bash
java -jar build/libs/demo-0.0.1-SNAPSHOT.jar 
```

The application will listen to the port 8080

### Run unit tests

```bash
gradle test
```

### Available endpoints

- `/` GET
- `/current-connections` GET
