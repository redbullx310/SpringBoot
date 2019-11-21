FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY SpringBootTest-1.0.0.jar /tmp/SpringBootTest-1.0.0.jar
WORKDIR /tmp
EXPOSE 8080
CMD ["java","-jar","SpringBootTest-1.0.0.jar"]
