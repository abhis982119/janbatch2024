package org.pbatch.oops.polymorphism.compiletimepolymorphism.methodoverloading;

public class Runner {

    public static void main(String[] args) {
        MyMath math = new MyMath();

/*
        math.add(5.5f, 10.2);     //double

         math.add(5.5, 10);      //double
         math.add(5.5f, 10.5f); //
*/


      //  math.add((short)5,(short)10);
      //  math.add((byte)5,(byte)10);
      //  math.add(5l, 10l);

    /*    byte a = 5;
        byte b = 10;
        math.add(a,b);*/


        //   math.add(3000000000, 3000000000);  // integer number too large


    }
}
