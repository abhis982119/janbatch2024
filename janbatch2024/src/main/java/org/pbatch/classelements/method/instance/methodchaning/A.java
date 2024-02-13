package org.pbatch.classelements.method.instance.methodchaning;

public class A {

    public void m1(){  //instance method
        System.out.println("A-m1()");
        m2();
        System.out.println("A-m1()");

    }

    public void m2(){  //instance method
        System.out.println("A-m2()");
        m3();
        System.out.println("A-m2()");
    }

    public void m3(){ //instance method
        System.out.println("A-m3()");
    }
}
