# syntax=docker/dockerfile:1
# reference: https://docs.docker.com/language/java/build-images/

FROM eclipse-temurin:11-focal

# Create the app working directory
WORKDIR /app

COPY ./layers/application.jar ./app.jar
COPY ./layers/libs ./libs
EXPOSE 8081 8080


CMD ["java", "-jar", "app.jar"]