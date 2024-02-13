package org.pbatch.classelements.method.recursionoverflow;

public class A {

    public void m1(){
        System.out.println("A-m1() overflow");
        m1();  //recusion : StackOverFlowError
    }
}
