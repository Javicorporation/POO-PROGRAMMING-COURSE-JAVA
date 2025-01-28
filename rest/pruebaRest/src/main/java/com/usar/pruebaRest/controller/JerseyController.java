package com.usar.pruebaRest.controller;

import com.usar.pruebaRest.models.Bootcamper;
import com.usar.pruebaRest.services.BootcamperService;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
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

    @GET
    @Path("/bootcampers")
    @Produces("application/json")
    public List<Bootcamper> listarTodos(){
        return bootcamperService.getAll();
    }

    @POST
    @Path("/bootcamper")
    public Response meterBootcamper(Bootcamper bootcamper){
        bootcamperService.add(bootcamper);
        return Response.created(
                URI.create("/BOOTCAMPERS/"+ bootcamper.getNombre())
        ).build();
    }

    //    @GET
//    public String hola(){
//        return "Hola";
//    }
}
