package Ejemplo2;

public interface Empleado {

    public default void realizarTarea(){
        System.out.println("Realizando Tarea de empleado");
    }
}
