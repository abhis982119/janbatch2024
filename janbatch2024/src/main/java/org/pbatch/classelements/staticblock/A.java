package org.pbatch.classelements.staticblock;

public class A {



    //static block : will be executed once during class load time
    static {
        System.out.println("static  block of A");
        companyName = "www.facebook.com";
    }


    private static String companyName ; //static variable
    //1-args constructor
    public A() {
        System.out.println("A() : " + companyName );
    }




    //static method
    public  static void m1(){
        System.out.println("A-m1() :" + companyName);
    }
}
