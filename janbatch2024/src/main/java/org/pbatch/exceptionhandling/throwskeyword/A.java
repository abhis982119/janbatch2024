package org.pbatch.exceptionhandling.throwskeyword;

import java.sql.SQLOutput;

public class A {


    public void m1() throws InterruptedException{
        System.out.println("A-m1() starts");
        Thread.sleep(4000);
        System.out.println("A-m1() ends");
    }
}
