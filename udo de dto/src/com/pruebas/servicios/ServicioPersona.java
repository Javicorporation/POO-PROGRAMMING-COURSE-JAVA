package com.pruebas.servicios;

import com.pruebas.entidades.Deporte;
import com.pruebas.entidades.Persona;
import com.pruebas.entidades.Persona1;
import com.pruebas.usodto.PersonaDeporteDTO;

import java.util.ArrayList;
import java.util.List;

public class ServicioPersona {

    //public List<Persona> buscarTodos(){
//    public List<Persona1> buscarTodos(){
//
//        Persona1 p1= new Persona1("pedro","gomez",20);
//        Persona1 p2= new Persona1("angel","sanchez",20);
//        Persona1 p3= new Persona1("ana","perez",30);
//
//        p1.addDeporte(new Deporte("futbol",1));
//        p1.addDeporte(new Deporte("tenis",2));
//
//        p2.addDeporte(new Deporte("basket",2));
//        p2.addDeporte(new Deporte("padel",1));
//
//        p3.addDeporte(new Deporte("basket",2));
//
//        List<Persona1> lista = new ArrayList<Persona1>();
//        lista.add(p1);
//        lista.add(p2);
//        lista.add(p3);
//        return lista;
//    }

    // implementamos la configuracion DTO
    public List<PersonaDeporteDTO> buscarTodo(){
        List<PersonaDeporteDTO> lista = new ArrayList<PersonaDeporteDTO>();
        lista.add(new PersonaDeporteDTO("pedro", "futbol"));
        lista.add(new PersonaDeporteDTO("pedro", "tenis"));
        lista.add(new PersonaDeporteDTO("angel", "basket"));
        lista.add(new PersonaDeporteDTO("angel", "padel"));
        lista.add(new PersonaDeporteDTO("ana", "basket"));
        return lista;
    }
}
