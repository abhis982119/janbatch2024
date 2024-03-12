package org.pbatch.multhreading.singletondesignpattern;

public class Runner {


    public static void main(String[] args) {
        SingletonClass singletonClass = SingletonClass.getInstance();
        SingletonClass singletonClass1= SingletonClass.getInstance();
        SingletonClass singletonClass2 = SingletonClass.getInstance();
        SingletonClass singletonClass4 = SingletonClass.getInstance();

        if(singletonClass == singletonClass1) System.out.println("true");
        if(singletonClass1 == singletonClass2) System.out.println("true");
        if(singletonClass2 == singletonClass4) System.out.println("true");


    }
}
