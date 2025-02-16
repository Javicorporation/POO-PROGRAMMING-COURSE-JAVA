package Seccion13;

public class UserException extends Exception {

    public UserException(String message) {
        super("Usuario ya existe "+message);
    }
}
