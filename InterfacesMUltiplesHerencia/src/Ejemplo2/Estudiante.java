package Ejemplo2;

public interface Estudiante {

    public default void realizarTarea(){
        System.out.println("Realizando Tarea de estudiante");
    }
}
