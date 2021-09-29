# ekam-logger
Logger for Ekam and related projects

# Loggers
1. SLF4J
2. LogBack

# Build
```$bash
./gradlew clean build
```

# Usage
```$java
ekamLogger().info("<Info message>");
ekamLogger().warn("<Warning>");
ekamLogger().debug("<Debug info>");
ekamLogger().error("<Error>");
```
