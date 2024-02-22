package org.pbatch.exceptionhandling.userdefinedexceptions.runtime;

public class Runner {

    public static void main(String[] args) {
        Female katrina = Female.builder().name("Katrina").age(38).build();
        Male vicky = Male.builder().name("Vicky").age(12).build();
        Boolean isSuccessfullyRegistered = MarriageRegistrar.register(vicky, katrina);
        System.out.println("Marriage registered successfully : " + isSuccessfullyRegistered);
    }
}
