package org.pbatch.multhreading.waystocreatethread.anonymousclass.basic;

public class AnonymousRunner {

    public static void main(String[] args) {
        A a = new A();
        a.m1();

        A b = new A(){
           public void m1(){
               System.out.println("Anonymous-m1()");
           }

        };

        b.m1();
    }
}
