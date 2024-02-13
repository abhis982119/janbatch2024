package org.pbatch.classelements.constructor.chaining.animal;

import lombok.ToString;


public class Dog extends Animal {

    private String breed;


    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public Dog(String color, String breed) {
        super(color);
        this.breed = breed;
    }

}
