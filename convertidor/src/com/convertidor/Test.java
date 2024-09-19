package com.convertidor;

import java.util.Scanner;

public class Test {
    // Definición de constantes para las tasas de cambio
    private static final double TASA_SOLES_PERUANOS = 3.58;
    private static final double TASA_SOLES_MEXICANOS = 22.15;
    private static final double TASA_SOLES_COLOMBIANOS = 3851.90;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;

        while (loop) {
            System.out.println("Conversor de moneda a dólares");
            System.out.println("1. Soles peruanos a dólares");
            System.out.println("2. Soles mexicanos a dólares");
            System.out.println("3. Soles colombianos a dólares");
            System.out.println("4. Salir");
            System.out.print("Escribe una opción: ");

            // Validación de entrada
            if (scanner.hasNextInt()) {
                int opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        convertir(TASA_SOLES_PERUANOS, "soles peruanos", scanner);
                        break;
                    case 2:
                        convertir(TASA_SOLES_MEXICANOS, "soles mexicanos", scanner);
                        break;
                    case 3:
                        convertir(TASA_SOLES_COLOMBIANOS, "soles colombianos", scanner);
                        break;
                    case 4:
                        System.out.println("Adiós");
                        loop = false;
                        break;
                    default:
                        System.out.println("Opción inválida, por favor intenta nuevamente.");
                        break;
                }
            } else {
                System.out.println("Entrada no válida, por favor ingresa un número.");
                scanner.next(); // Limpiar el buffer
            }
        }
        scanner.close(); // Cerrar el scanner al final
    }

    public static void convertir(double valorDolar, String pais, Scanner scanner) {
        System.out.printf("Ingrese la cantidad de %s: ", pais);

        // Validación de entrada
        if (scanner.hasNextDouble()) {
            double cantidadMoneda = scanner.nextDouble();
            double dolares = cantidadMoneda / valorDolar;
            dolares = Math.round(dolares * 100.0) / 100.0; // Redondear a dos decimales

            System.out.printf("La cantidad en dólares es: $%.2f%n", dolares);
        } else {
            System.out.println("Entrada no válida, por favor ingresa un número.");
            scanner.next(); // Limpiar el buffer
        }
    }
}
