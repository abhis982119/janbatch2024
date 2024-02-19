package org.pbatch.clone.shallowcloning;

import org.pbatch.clone.model.Student;

public class Runner {

    public static void main(String[] args)  throws  Exception{
        Student swati = Student.builder().name("swati").rollNumber(1).build();

        System.out.println(swati);

        Student clonedSwati =  swati.clone();
        System.out.println(clonedSwati);


        System.out.println("cloned student name : " + clonedSwati.getName());
        System.out.println("cloned student rollNumber : " + clonedSwati.getRollNumber());
    }
}
