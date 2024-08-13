package com.classtatic;

public class ClassStatic {

    public static void main(String[] args) {
        imprimirArea(new Rectangulo(4,2));
    }

    public static void imprimirArea(Rectangulo r){
        System.out.println(r.area());
    }
}
