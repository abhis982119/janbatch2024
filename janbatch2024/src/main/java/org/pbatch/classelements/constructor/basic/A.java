package org.pbatch.classelements.constructor.basic;

import lombok.ToString;

@ToString
public class A {

    private int age;

    public A(int paramAge) {
            age = paramAge;
    }
}
