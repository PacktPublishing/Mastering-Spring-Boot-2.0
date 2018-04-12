FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD target/accounts-microservice-0.0.1-SNAPSHOT.jar accounts-microservice.jar
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /accounts-microservice.jar" ]