package org.pbatch.garbagecollection;

import lombok.SneakyThrows;

public class Runner {

    @SneakyThrows
    public static void main(String[] args) {
        A a = new A();
        a.m1();

        a = null;

        System.gc(); // request jvm : please start garbage collection

        Thread.sleep(500);
    }
}
