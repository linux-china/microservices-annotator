Annotations for Microservices annotator to mark your code
========================

Java annotations for [Microservices Annotator Plugin](https://plugins.jetbrains.com/plugin/18361-microservices-annotator) to help you mark code.

# Microservices Annotator interaction types

* Broadcast Data transmission: `@Broadcast`
* Cloud Storage Access: `@CloudStorage`
* Database Access: `@DatabaseAccess`
* Data Access: `@DataAccess`
* AI Access: `@AiAccess`
* AI Ignore for a method body: `@AiIgnore`
* File System Operations: `@FileOps`
* IO Read: `@IORead`
* IO Write: `@IOWrite`
* Message Receive: `@MessageReceive`
* Message Send: `@MessageSend`
* Streaming: `@Streaming`
* Network Request: `@RemoteAccess`
* External Process: `@ExternalProcess`
* JNI/FFI(Foreign Function Interface) Call: `@ForeignAccess`
* WebSocket: please use `@RemoteAccess("websocket")`

# How to use?

* Add the following dependency in pom.xml

```xml

<dependency>
    <groupId>org.mvnsearch</groupId>
    <artifactId>microservices-annotator</artifactId>
    <version>0.2.2</version>
</dependency>
```

* Annotate code with annotations: Annotate class, field or method parameter.

```java

@RemoteAccess
public interface UserService {
    String findNickById(Integer id);
}
```

```java
public class UserController {
    @RemoteAccess
    private UserService userService;
}
```

# References
             
* Microservices Annotator ext-plugin: https://github.com/linux-china/microservices-annotator-ext-plugin
* Microservices Annotator Plugin: https://plugins.jetbrains.com/plugin/18361-microservices-annotator