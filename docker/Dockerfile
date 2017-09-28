FROM frolvlad/alpine-oraclejdk8:slim

ENV SPRING_PROFILES_ACTIVE cloud
ENV PORT 80
ENV EUREKA_USER admin
ENV EUREKA_PASS 1337


EXPOSE 80/tcp

WORKDIR /

ADD app.jar app.jar
RUN sh -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
