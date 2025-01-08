package com.usar.pruebaRest.controller;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.springframework.stereotype.Component;

@Component
@Path("/")
public class JerseyController {
    @GET
    public String hola(){
        return "Hola";
    }
}
