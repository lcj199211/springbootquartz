FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD quartz-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]