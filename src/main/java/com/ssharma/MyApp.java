package com.ssharma;

import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.ApplicationPath;

@ApplicationPath("/rest")
public class MyApp extends ResourceConfig {
    public MyApp() {
        packages("resources");
    }
}
