package org.pbatch.classelements.instanceblock;

public class A {

//instance block
    {
        System.out.println("Intance block of A");
    }


    //1-args constructor
    public A() {
        System.out.println("A()");
    }




    //instance method
    public void m1(){
        System.out.println("A-m1()");
    }


}
