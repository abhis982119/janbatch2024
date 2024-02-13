package org.pbatch.finalkeyword.finalvariable.withclass;
/*
SOLID

S : Single Responsibility Principle

DRY : Don't Repeat Yourself

 */
public final class Math {

    public  String complexOperation(int a, int b){

        m1();
        m2();
        m3();
        int sum = a+b;
        return sum + "-complexOperationOutput";
    }

    public void m1(){
        System.out.println("Math-m1()");
    }

    public void m2(){
        System.out.println("Math-m2()");
    }

    public void m3(){
        System.out.println("Math-m3()");
    }





}
