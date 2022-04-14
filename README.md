Annotations for Microservices annotator to mark your code
========================

Java annotations for [Microservices Annotator Plugin](https://plugins.jetbrains.com/plugin/18361-microservices-annotator) to help you mark code.

# Microservices Annotator interaction types

* Broadcast Data transmission: @Broadcast
* Cloud Storage Access: @CloudStorage
* Database Access: @DatabaseAccess
* Data Access: @DataAccess
* File System Operations: @FileOps
* IO Read: @IORead
* IO Write: @IOWrite
* Message Receive: @MessageReceive
* Message Send: @MessageSend
* Streaming: @Streaming
* Network Request: @RemoteAccess
* External Process: @ExternalProcess
* WebSocket

# How to use?

* Add following dependency in pom.xml

```xml

<dependency>
    <groupId>org.mvnsearch</groupId>
    <artifactId>microservices-annotator</artifactId>
    <version>0.1.0</version>
</dependency>
```

* Annotate code with annotations

```java

@RemoteAccess
public interface UserService {
    String findNickById(Integer id);
}
```

# References

* Microservices Annotator Plugin: https://plugins.jetbrains.com/plugin/18361-microservices-annotator