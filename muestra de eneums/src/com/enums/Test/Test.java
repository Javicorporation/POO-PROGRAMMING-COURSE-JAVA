package com.enums.Test;

import com.enums.clases.Empresa;
import com.enums.clases.NivelEstudio;
import com.enums.clases.Persona;

public class Test {
    public static void main(String[] args) {

//        Empresa e = new Empresa();
////
////        e.agregarPersona(new Persona("Pepe", "Fulano", NivelEstudio.SECUNDARIO));
////        e.agregarPersona(new Persona("Maria", "Sultana", NivelEstudio.SECUNDARIO));
////        e.agregarPersona(new Persona("Luis", "Mengano", NivelEstudio.TERCIARIO));
////        e.agregarPersona(new Persona("Lito", "García", NivelEstudio.SECUNDARIO));
////        e.agregarPersona(new Persona("Arón", "Quilez", NivelEstudio.PRIMARIO));
////        e.agregarPersona(new Persona("Rita", "Perez", NivelEstudio.UNIVERSITARIO));
////        e.agregarPersona(new Persona("Alex", "Gomez", NivelEstudio.SECUNDARIO));
////        e.agregarPersona(new Persona("Sara", "Jerez", NivelEstudio.SECUNDARIO));
////
////        e.mostrarPorNivel(NivelEstudio.UNIVERSITARIO);

        // metodos que pueden habarcar los enum
        NivelEstudio[] niveles = NivelEstudio.values();
        for (int i = 0; i < niveles.length; i++) {
            System.out.print(niveles[i]+" | ");
        }
        //
        System.out.println();
        int ver = NivelEstudio.POSGRADO.compareTo(NivelEstudio.POSGRADO);
        System.out.println(ver);
        System.out.println();
        System.out.println(NivelEstudio.PRIMARIO.name());
    }
}
