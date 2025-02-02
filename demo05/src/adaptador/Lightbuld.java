package adaptador;

public class Lightbuld {

    boolean poweredOn = false;
    int voltage = 0;

    public void turnOn(int voltage) {
        poweredOn = true;
        this.voltage = voltage;
        System.out.println("Lightbuld turned on "+voltage+" of current");
    }

    public void turnOff() {
        poweredOn = false;
        voltage = 0;
        System.out.println("Lightbuld turned off");
    }

    public boolean isPoweredOn() {
        return poweredOn;
    }
}
