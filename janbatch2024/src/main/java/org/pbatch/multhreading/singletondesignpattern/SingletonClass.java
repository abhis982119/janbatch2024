package org.pbatch.multhreading.singletondesignpattern;

public class SingletonClass {

    private static SingletonClass singletonClass;
    private SingletonClass() {
    }

    public static SingletonClass getInstance(){


        if(singletonClass != null) {
           return singletonClass;
        }

        synchronized (SingletonClass.class){  //t1,t2,t3,t4
            if(singletonClass != null) {
                singletonClass = new SingletonClass();
            }
        }

        return singletonClass;
    }
}
