package org.pbatch.exceptionhandling.userdefinedexceptions.runtime;

public class MarriageRegistrar {

    public static boolean register(Male male, Female female){

        if(male.getAge() < 21){
          //  throw new UnderAgeException("Male age cannot be less than 21");
              throw new UnderAgeException();
        }

        if(female.getAge() < 18){
           // throw new UnderAgeException("Female age cannot be less than 18");
        }
        System.out.println(male.getName() + " " +  female.getName() + "marriage successfully registered.");
        return true;
    }
}
