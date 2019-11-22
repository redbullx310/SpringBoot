FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY independent-micro-service-0.0.1-SNAPSHOT.jar /tmp/independent-micro-service-0.0.1-SNAPSHOT.jar
WORKDIR /tmp
EXPOSE 8080
CMD ["java","-jar","independent-micro-service-0.0.1-SNAPSHOT.jar"]
