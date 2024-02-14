package org.pbatch.interfacepackage.interfacekeyword.A;

public interface A {

    int count = 10;  // public static final  []

    void m1(); // public abstract by default


    default void m2() {    // default method are allowed in java  java-8 onwards
        System.out.println("Payment-m2()");
    }

}
