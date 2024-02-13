package org.pbatch.classelements.constructor.basic.dog;

public class Runner {

    public static void main(String[] args) {
        Dog dog = new Dog("Grey", "Huskey");
        System.out.println(dog);

        dog.setName("Leo");
        System.out.println(dog);



    }
}
