package com.usodegenericos;

public class Test {
    public static void main(String[] args) {
        Bolsa bolsa = new Bolsa(10);

        Chocolate c1 = new Chocolate("milka");
        Chocolate c2 = new Chocolate("ferrero");
        Chocolate c3 = new Chocolate("bom");

        Golosina g1 = new Golosina("gomita");
        Golosina g2 = new Golosina("chicles");

        bolsa.add(c1);
        bolsa.add(c2);
        bolsa.add(c3);
        bolsa.add(g1);
        bolsa.add(g2);

        for(Object o : bolsa){
            if(o instanceof Chocolate){
                Chocolate c = (Chocolate)o; // Downcasting
                System.out.println(c.getMarca());
            } else {
                Golosina g = (Golosina)o; // Downcasting
                System.out.println(g.getName());
            }
        }
    }
}
