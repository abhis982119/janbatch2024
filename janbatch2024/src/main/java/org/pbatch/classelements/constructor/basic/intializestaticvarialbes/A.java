package org.pbatch.classelements.constructor.basic.intializestaticvarialbes;

public class A {

    private static boolean hasTail = true; //static variable
    private String age ;  //instance variable


    public A(String age, boolean hasTail) {
        this.age = age;
        A.hasTail = hasTail; // we can assign values to static variables but we don't do it.
    }
}
