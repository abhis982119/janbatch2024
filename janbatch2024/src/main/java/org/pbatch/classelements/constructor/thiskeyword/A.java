package org.pbatch.classelements.constructor.thiskeyword;

import lombok.ToString;

import javax.crypto.spec.PSource;

public class A {


    private int age ; //instance variable

    public A(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "A{" +
                "age=" + age +
                '}';
    }
}
