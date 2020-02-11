# Alpine Linux with OpenJDK JRE
FROM openjdk:8-jre-alpine
VOLUME /tmp
ADD githubapi-0.0.1.jar app.jar
RUN sh -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]