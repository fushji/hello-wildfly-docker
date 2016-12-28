# hello-wildfly-docker
Yet Another Stupid Docker &amp; Wildfly Swarm Hello World

# Build
`mvn package`

# Run local
`mvn wildfly-swarm:run`

# Dockerize
`docker build -t hello-wildfly-swarm .`
`docker run -d -p 8080:8080 hello-java hello-wildfly-swarm`

# Check it
Check http://`<docker-machine ip>`:8080/hello-wildflydocker to see result
