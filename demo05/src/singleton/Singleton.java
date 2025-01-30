package singleton;

public class Singleton {
    public int monto;
    public static Singleton singleton01;

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public static Singleton getInstance() {
        if (singleton01 == null){
            singleton01 = new Singleton();
        }
        //return new Singleton();
        return singleton01;
    }
}
