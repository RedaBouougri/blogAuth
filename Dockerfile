FROM openjdk:17
WORKDIR /App

COPY /target/devoire-0.0.1-SNAPSHOT.jar .


ENTRYPOINT ["java", "-jar" , "devoire-0.0.1-SNAPSHOT.jar"]