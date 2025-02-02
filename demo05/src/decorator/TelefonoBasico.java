package decorator;

public class TelefonoBasico implements Telefono {


    @Override
    public void crear() {
        System.out.println("soy un telefono basico");
        tengoGSM();
        tengoSMS();
    }

    private void tengoGSM(){
        System.out.println("  --> tengo gsm");
    }

    private void tengoSMS(){
        System.out.println("  --> tengo sms");
    }
}
