FROM registry.digitalocean.com/openshiftcourse/gradle:8-jdk17

WORKDIR /app
COPY . /app

RUN gradle build
CMD [ "java", "-jar", "build/libs/demo-0.0.1-SNAPSHOT.jar" ]