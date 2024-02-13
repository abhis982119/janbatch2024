package org.pbatch.classelements.constructor.chaining.parentchildcontructorchaining;

public class B extends  A{

    public B() {
         //super()// if we don't provide super here, JVM will put it here.
        System.out.println("B-noarg constructor");
      //  super(); //call to super must be first statement in constructor
    }
}
