package org.pbatch.oops.polymorphism.compiletimepolymorphism.methodoverloading;

public class MyMath {

    public int add(int a, int b){
        System.out.println("int-add ");
        return a+b;
    }


    public int add(byte a, byte b) {
        System.out.println("byte-add");
        return a+b;
    }

    public int add(short a, short b){
        System.out.println("short-add");
        return a+b;
    }

    public long add(long a, long b){
        System.out.println("long-add");
        return a+b;
    }


    public Double add(double a, double b){
        System.out.println("double-add");
        return a+b;
    }

    public float add(float a, float b){
        System.out.println("float-add");
        return a+b;
    }

}
