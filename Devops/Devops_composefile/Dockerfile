FROM openjdk:8-jdk-alpine

EXPOSE 8888

ARG WAR_FILE=/target/*.war

COPY ${WAR_FILE} app.war

RUN echo "Creation of your docker image"

MAINTAINER "learner2730@gmail.com"

