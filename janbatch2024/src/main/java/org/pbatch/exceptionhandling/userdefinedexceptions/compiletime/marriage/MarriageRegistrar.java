package org.pbatch.exceptionhandling.userdefinedexceptions.compiletime.marriage;

public class MarriageRegistrar {

    public static boolean register(Male male, Female female) throws UnderAgeException{

        if(male.getAge() < 21){
          throw new UnderAgeException("Male age cannot be less than 21");

        }

        if(female.getAge() < 18){
          throw new UnderAgeException("Female age cannot be less than 18");
        }
        System.out.println(male.getName() + " " +  female.getName() + "marriage successfully registered.");
        return true;
    }
}
