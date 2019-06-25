FROM openjdk:11-jre-slim

MAINTAINER Jannis "jannis.kirschner@gibmit.ch"

EXPOSE 7070

WORKDIR /usr/local/bin

COPY ./target/m154-crm-knw.jar webapp.jar

CMD ["java", "-jar", "webapp.jar"]
