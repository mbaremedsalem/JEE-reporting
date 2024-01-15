#define base docker image
FROM openjdk:21
LABEL maintainer="javaguides.net"
ADD target/reporting-0.0.1-SNAPSHOT.jar reporting.jar
ENTRYPOINT ["java","-jar","reporting.jar"]