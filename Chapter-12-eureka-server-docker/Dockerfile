FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD target/discovery-0.0.1-SNAPSHOT.jar eureka-server.jar
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /eureka-server.jar" ]