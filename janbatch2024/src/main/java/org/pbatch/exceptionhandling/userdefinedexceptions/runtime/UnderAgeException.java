package org.pbatch.exceptionhandling.userdefinedexceptions.runtime;

public class UnderAgeException extends RuntimeException{

    public UnderAgeException(String message) {
        super(message);
    }

    public UnderAgeException() {
        super("Underage exception ");
    }
}
