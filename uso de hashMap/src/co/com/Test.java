package co.com;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Map<Integer,String> mapearEmpleados = new HashMap<>();

        //agregamos datos
        mapearEmpleados.put(1, "Miguel");
        mapearEmpleados.put(2, "Pablo");
        mapearEmpleados.put(3, "Maria");

        if (mapearEmpleados.containsValue("Migul")) {
            System.out.println("si esta");
        }else {
            System.out.println("no esta");
        }
        mapearEmpleados.remove(1);
        mapearEmpleados.clear();

        System.out.println(mapearEmpleados);
    }
}
