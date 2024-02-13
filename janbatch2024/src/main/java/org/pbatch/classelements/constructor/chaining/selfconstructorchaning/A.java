package org.pbatch.classelements.constructor.chaining.selfconstructorchaning;

public class A {



    public A() {
        this(10);
        System.out.println("A-no-args constructor");
       // this(10); // java: call to this must be first statement in constructor

    }

    public A(int a){
        this(20,30);
        System.out.println("A-1-ags constructor");
    }

    public A(int a, int b){
        System.out.println("A-2-ags constructor");
    }
}
