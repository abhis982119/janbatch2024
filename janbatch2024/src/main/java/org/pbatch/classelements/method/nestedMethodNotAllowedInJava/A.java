package org.pbatch.classelements.method.nestedMethodNotAllowedInJava;

public class A {

    public void m1(){
        System.out.println("A-m1()");
      /*  public void m2(){   // nested methods not allowed in java
            System.out.println("A-m2()");
        }*/
    }



    public static  class B{  //Nested classes are allowed
        public void m1(){
            System.out.println("NestedClass B-m1()");
        }


    }



}
