package com.usar.pruebaRest.controller;

import com.usar.pruebaRest.models.Bootcamper;
import com.usar.pruebaRest.services.BootcamperService;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;
import org.springframework.stereotype.Component;

import java.net.URI;
import java.util.List;

@Component
@Path("/")
public class JerseyController {

    private final BootcamperService bootcamperService;

    public JerseyController(BootcamperService bootcamperService) {
        this.bootcamperService = bootcamperService;
        this.bootcamperService.add(new Bootcamper("juanin", Math.random()));
        this.bootcamperService.add(new Bootcamper("karla", Math.random()));
        this.bootcamperService.add(new Bootcamper("maria", Math.random()));
        this.bootcamperService.add(new Bootcamper("paz", Math.random()));
    }

    // obtenemos los usuarios
    @GET
    @Path("/bootcampers")
    @Produces("application/json")
    public List<Bootcamper> listarTodos(){
        return bootcamperService.getAll();
    }


    // creamos un usuario
    @POST
    @Path("/bootcampers")
    // formato en que se envia
    @Produces("application/json")
    // formato en que se recibe
    @Consumes("application/json")

    public Response meterBootcamper(Bootcamper bootcamper){
        bootcamperService.add(bootcamper);
        return Response.created(
                URI.create("/bootcampers/"+ bootcamper.getNombre())
        ).build();
    }

    //    @GET
//    public String hola(){
//        return "Hola";
//    }
}
