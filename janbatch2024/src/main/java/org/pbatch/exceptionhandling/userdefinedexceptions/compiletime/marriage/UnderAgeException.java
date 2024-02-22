package org.pbatch.exceptionhandling.userdefinedexceptions.compiletime.marriage;

public class UnderAgeException extends Exception{

    public UnderAgeException(String message) {
        super(message);
    }

    public UnderAgeException() {
        super("Underage exception ");
    }
}
