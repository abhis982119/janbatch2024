package org.pbatch.classelements.allelements;

public class A {

    //static-block
    static{
        System.out.println("A-static block"); //1st
    }

    //instance-block
    {
        System.out.println("A-instance block");   //2nd
    }


    //constructor
    public A() {
        System.out.println("A-constructor");   // 3rd
    }

    //instance-variable
    private String companyName = "www.facebook.com";



    //instance-method
    public void m1(){
        System.out.println("A-m1()");  //4th
    }

    //static-method
    public static void m2(){
        System.out.println("A-m2() [static]");  //5th
    }
}
