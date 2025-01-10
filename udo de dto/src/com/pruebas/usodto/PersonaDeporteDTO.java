package com.pruebas.usodto;

public class PersonaDeporteDTO {

    private String nombre;
    private String deporte;

    public PersonaDeporteDTO(String nombre, String deporte) {
        this.nombre = nombre;
        this.deporte = deporte;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    @Override
    public String toString() {
        return "PersonaDeporteDTO{" +
                "nombre='" + nombre + '\'' +
                ", deporte='" + deporte + '\'' +
                '}';
    }
}
