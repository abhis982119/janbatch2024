package org.pbatch.oops.polymorphism.compiletimepolymorphism.operatoroverloading;

public class OpeartorOverloadingRunner {

    /*
    Operator overloading is not allowed in java
    But there is an implict overloading operator ( + )

    + : sum until number
    + : concatenate if one of the operands is string
        operand operator operand
          a        +         b


     */
    public static void main(String[] args) {

        String name = "Swati";
        System.out.println(10 + 20);           // 30
        System.out.println(name);             //  Swati
        System.out.println(10 + 20 + name);  //30Swati
        System.out.println(name + 10 + 20);  //Swati1020
        System.out.println(10 + name + 20);  //10Swati20
        System.out.println((10 + 20) + name); //30Swati
        System.out.println(name + (10 + 20)); //Swati30
    }

}
