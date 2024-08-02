package com.sobrecargaDeMetodos;

public class Principal {
    public static void main(String[] args) {
        Robot elRobot = new Robot("Juanin");

        elRobot.saludar("Mateo");
        elRobot.saludar();
    }
}
