package com.usodestream;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

//        // metodo no acepta nulos
//        Optional<String> stringOptional = Optional.of("que tal");
//        // metodo acepta nulos
//        Optional<String> stringOptional2 = Optional.ofNullable(null);
//
//
//        // sirve para obtener el valor del optional
//        String StringElse = stringOptional.get();
//        System.out.println(StringElse);

        DireccionDTO direccionDTO = new DireccionDTO();
        UsuarioDTO usuarioDTO = new UsuarioDTO();

        if (usuarioDTO.getDireccion() != null){
            if (usuarioDTO.getDireccion().getDireccion() != null){
                String direccionUsuario = direccionDTO.getDireccion();
            }
        }




    }
}
