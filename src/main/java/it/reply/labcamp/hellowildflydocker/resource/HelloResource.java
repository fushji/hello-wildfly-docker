package it.reply.labcamp.hellowildflydocker.resource;

import it.reply.labcamp.hellowildflydocker.model.Greeting;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/hello-wildflydocker")
public class HelloResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response doGet() {

        final Greeting greeting = new Greeting();
        greeting.setMessage("Hello from WildFly Swarm!");

        return Response.ok(greeting).build();
    }

    @POST
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.APPLICATION_JSON)
    public Response doPost(final String name) {

        final Greeting greeting = new Greeting();
        greeting.setMessage(String.format("Hello %s from WildFly Swarm!", name));

        return Response.ok(greeting).build();
    }
}