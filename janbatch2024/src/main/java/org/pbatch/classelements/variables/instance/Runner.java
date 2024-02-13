package org.pbatch.classelements.variables.instance;

public class Runner {


    public static void main(String[] args) {
        A a = new A();
        a.m1();
        a.m2();


      //Accessing instance (.) operator
        System.out.println("Instance variable access by (.) operator :  " + a.instanceVariable);

        //Accessing static variable
        System.out.println("static variable using class : " + A.staticVariable);

        //static variable access using (.) operator [Never recommended]
        System.out.println("static variable using (.) operator : " + a.staticVariable);



    }
}
