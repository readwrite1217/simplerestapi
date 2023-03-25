package com.ssharma;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/helloworld")
public class MyappResource {

    @GET
    @Produces("text/plain")
    public String hello() {
        return "helloworld";
    }
}
