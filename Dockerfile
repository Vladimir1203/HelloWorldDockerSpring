FROM openjdk:8-jdk-alpine
COPY target/HelloWorldDocker-2.5.0.jar HelloWorldDocker-2.5.0.jar
EXPOSE 8080
CMD ["java", "-jar", "HelloWorldDocker-2.5.0.jar"]