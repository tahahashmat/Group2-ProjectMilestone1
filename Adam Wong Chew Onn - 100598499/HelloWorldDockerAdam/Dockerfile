FROM openjdk:11

#Create new app directory for application

RUN mkdir /app

#COPY files from host to image filesytem

COPY out/production/HelloWorldDockerAdam/ /app

#set directory for executing commands
WORKDIR /app

#run main class
CMD java Main