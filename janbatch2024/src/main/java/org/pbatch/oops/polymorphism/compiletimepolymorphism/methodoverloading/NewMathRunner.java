package org.pbatch.oops.polymorphism.compiletimepolymorphism.methodoverloading;

public class NewMathRunner {

    public static void main(String[] args) {
        NewMyMath math = new NewMyMath();
          math.add(4,5);    // long
        //math.add(4.0, 4.5 );  // error
          math.add((short)4, (short)5);  // error
          math.add(300000000, 300000000);  // error
    }
}
