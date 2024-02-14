package org.pbatch.modifiers.accessmodifiers.defaultModifer;

public class Runner {

    public static void main(String[] args) {
        DefaultClass defaultClass = new DefaultClass();

        ClassWithDefaultMethod classWithDefaultMethod = new ClassWithDefaultMethod();
        classWithDefaultMethod.m1();
    }
}
