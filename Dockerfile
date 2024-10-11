FROM openjdk:23-jdk
ARG JAR_FILE=target/ucobet-generales-ms-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app_ucobet.jar
EXPOSE 80
ENTRYPOINT ["java", "-jar", "ucobet-generales-ms.jar"] 