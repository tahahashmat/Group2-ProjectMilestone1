FROM openjdk

#create a new app directory for my application files
RUN mkdir /app
#Copy the app files from host machine to image filesystem
COPY out/production/HelloWorldDucker/ /app

#set the directory for executing future commands
WORKDIR /app

#run the main class
CMD java Main