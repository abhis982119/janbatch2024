package org.pbatch.garbagecollection;

public class A extends Object{

    public void m1(){
        System.out.println("A-m1();");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Deleting object");
    }
}
