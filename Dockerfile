# Alpine Linux with OpenJDK JRE
FROM openjdk:8-jre-alpine
ARG JAR_FILE=target/*.jar
COPY target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]