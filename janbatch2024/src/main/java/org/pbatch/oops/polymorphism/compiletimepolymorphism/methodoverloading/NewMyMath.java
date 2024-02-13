package org.pbatch.oops.polymorphism.compiletimepolymorphism.methodoverloading;

public class NewMyMath {

    public float add(long a, long b){
        System.out.println("long-add");
        return a+b;
    }

  /* public long add(float a, float b){   // compile time error
           System.out.println("float-add");
            return a +b;
        }
    }*/

   /* public float add(float a , float b){
        System.out.println("float-add");
        return a+b;
    }*/
}
