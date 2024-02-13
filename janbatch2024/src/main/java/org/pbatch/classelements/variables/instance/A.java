package org.pbatch.classelements.variables.instance;

 public  class A {


       static int staticVariable ; //static variable
       int instanceVariable; // instance variable // Memory allocated during : object creation



     // instance method
    public void m1(){
        int a = 10;   // memory is allocated during method execution
        System.out.println(a);
        System.out.println(instanceVariable);
    }

    public void m2(){
        System.out.println(staticVariable);
    }

}
