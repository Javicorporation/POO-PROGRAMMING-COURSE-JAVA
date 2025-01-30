package singleton;

public class Index {
    public static void main(String[] args) {

        // devuelven distintas instancias
        //Singleton singleton = new Singleton();
//       Singleton singleton = Singleton.getInstance();
//        singleton.setMonto(15);
//        System.out.println(singleton.getMonto());
//        System.out.println(singleton);

        //---------------------------

        //Singleton singleton2 = new Singleton();
//        Singleton singleton2 = Singleton.getInstance();
//        singleton2.setMonto(15);
//        System.out.println(singleton2.getMonto());
//        System.out.println(singleton2);



        Aplicacion app = Aplicacion.getInstance();
        Aplicacion app2 = Aplicacion.getInstance();
        app.Run();
        app2.Run();

        System.out.println(app +" ------- "+app2);

    }
}
