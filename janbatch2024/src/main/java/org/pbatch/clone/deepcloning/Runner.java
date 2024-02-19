package org.pbatch.clone.deepcloning;

import org.pbatch.clone.model.Address;
import org.pbatch.clone.model.Student;

public class Runner {

    public static void main(String[] args) throws CloneNotSupportedException {
        Address address = new Address();
        Student swati = Student.builder().name("swati").rollNumber(1).address(address).build();


        Student clonedSwati = swati.clone();
        System.out.println(swati.getStudentString());

      //  swati.setName("Ms. Swati");
     //   System.out.println("updated swati " + swati.getStudentString());
        System.out.println(clonedSwati.getStudentString());


        Student deepClonedSwati = swati.deepClone();
        System.out.println(deepClonedSwati.getStudentString());



    }
}
