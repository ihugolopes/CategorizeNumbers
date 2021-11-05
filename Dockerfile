FROM openjdk:8-jdk-alpine
MAINTAINER hugolopes.com
ADD sample.db sample.db
COPY target/categorizenumbers-0.0.1-SNAPSHOT.jar categorizenumbers-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/categorizenumbers-0.0.1-SNAPSHOT.jar"]
EXPOSE 8080
