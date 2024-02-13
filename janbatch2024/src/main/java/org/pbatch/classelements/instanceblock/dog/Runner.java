package org.pbatch.classelements.instanceblock.dog;

public class Runner {

    public static void main(String[] args) {
        Dog husky = new Dog("Husky","Grey");
        Dog labrador = new Dog("Labrador", "Golden");

        System.out.println(husky);
        System.out.println(labrador);


        Husky leo = new Husky( "Grey");
        System.out.println("leo : " + leo);
    }
}
