# Hello world Wildfly Swarm docker
#
# BUILD IMAGE:
# docker build -t hello-wildfly-swarm .
#
# RUN IMAGE:
# docker run -d -p 8080:8080 hello-java hello-wildfly-swarm
#
# LOGS:
# docker logs -f <containerid>
#
# Check http://192.168.99.100:8080/hello-wildflydocker to see result
# ----------------------------

FROM openjdk
MAINTAINER antonio perrone, https://github.com/fushji

COPY target/hello-wildfly-docker-swarm.jar /opt/hello-wildfly-swarm.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/opt/hello-wildfly-swarm.jar"]