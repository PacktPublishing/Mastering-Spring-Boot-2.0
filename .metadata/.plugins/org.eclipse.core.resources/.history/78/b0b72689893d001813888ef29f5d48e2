FROM openjdk
MAINTAINER Dinesh Rajput <admin@dineshonjava.com>
ADD target/customer-0.0.1-SNAPSHOT.jar customer-service.jar
ENTRYPOINT ["java", "-jar", "/customer-service.jar"]
EXPOSE 3333