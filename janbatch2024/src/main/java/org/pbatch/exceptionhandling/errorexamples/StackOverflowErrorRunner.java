package org.pbatch.exceptionhandling.errorexamples;

public class StackOverflowErrorRunner {

    public static void main(String[] args) {
        System.out.println("line-1");
        System.out.println("line-2");
        System.out.println("line-3");
        m1();
        System.out.println("line-4");
        System.out.println("line-5");
        System.out.println("line-6");
    }

    public static void m1(){
        System.out.println("m1()");
        m1();  //  java.lang.StackOverflowError
    }
}
