<h1 align="center">
  <br>
  <a href="https://asyncapi.org"><img src="../assets/logo.png" alt="AsyncAPI logo" height="80"></a>
</h1>
<h4 align="center">Building the future of event-driven architectures</h4>
<h6 align="center">We're on a mission to standardize message-based communication and increase interoperability of the different systems out there.</h6>

> ⚠️ This project doesn't support AsyncAPI 1.x

This submodule stores projection of AsyncAPI specification to java classes. Each class is being properly annotated with `jsr-305` annotations,
which allows to use it in null-safety languages like `kotlin` without extra headache.

```
<dependency>
  <groupId>com.asyncapi</groupId>
  <artifactId>asyncapi-core</artifactId>
  <version>1.0.0-EAP</version>
</dependency>
```

## Usages:

### Working with AsyncAPI Specification from Java/Kotlin code:
For manual working with AsyncAPI specification from java/kotlin code:

```kotlin
var asyncApi = objectMapper.readValue(model, AsyncAPI::class.java)
```

### Generating of AsyncAPI Specification while building:
For generating of AsyncAPI specification from hand-crafted AsyncAPI class at choosed build cycle step use one of implemented plugins:
* [Gradle plugin](../asyncapi-plugin/asyncapi-plugin-gradle)
* [Maven plugin](../asyncapi-plugin/asyncapi-plugin-maven)