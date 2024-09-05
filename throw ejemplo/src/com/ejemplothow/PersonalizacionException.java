package com.ejemplothow;
// heredamos de la clase RuntimeException
public class PersonalizacionException extends RuntimeException {

    // generamos los constructores indispensable
    public PersonalizacionException() {
    }

    public PersonalizacionException(String message) {
        super(message);
    }

    public PersonalizacionException(String message, Throwable cause) {
        super(message, cause);
    }

    public PersonalizacionException(Throwable cause) {
        super(cause);
    }

    public PersonalizacionException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
