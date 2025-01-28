package com.usar.pruebaRest.controller;

import com.usar.pruebaRest.models.Bootcamper;
import com.usar.pruebaRest.services.BootcamperService;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Path("/")
public class JerseyController {

    private BootcamperService bootcamperService;

    public JerseyController(BootcamperService bootcamperService) {
        this.bootcamperService = bootcamperService;
        this.bootcamperService.add(new Bootcamper("juanin"));
        this.bootcamperService.add(new Bootcamper("karla"));
        this.bootcamperService.add(new Bootcamper("maria"));
        this.bootcamperService.add(new Bootcamper("paz"));
    }

    @GET
    @Path("/bootcampers")
    @Produces("/application/json")
    public List<Bootcamper> listarTodos(){
        return bootcamperService.getAll();
    }

    //    @GET
//    public String hola(){
//        return "Hola";
//    }
}
