package Ejemplo2;

public class Persona implements Empleado, Estudiante{

    @Override
    public void realizarTarea() {
        Estudiante.super.realizarTarea();
        //Empleado.super.realizarTarea();
    }
}
