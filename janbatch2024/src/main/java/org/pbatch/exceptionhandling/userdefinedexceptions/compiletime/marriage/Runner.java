package org.pbatch.exceptionhandling.userdefinedexceptions.compiletime.marriage;

public class Runner {

    public static void main(String[] args) {
        Female katrina = Female.builder().name("Katrina").age(17).build();
        Male vicky = Male.builder().name("Vicky").age(22).build();
        Boolean isSuccessfullyRegistered = null;
        try {
            isSuccessfullyRegistered = MarriageRegistrar.register(vicky, katrina);
        } catch (UnderAgeException e) {
            System.out.println("Marriage cannot be registered succesfully cause : " + e.getMessage());
        }
        System.out.println("Marriage registered successfully : " + isSuccessfullyRegistered);
    }
}
