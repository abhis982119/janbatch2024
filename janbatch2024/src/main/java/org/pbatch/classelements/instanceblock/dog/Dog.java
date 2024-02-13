package org.pbatch.classelements.instanceblock.dog;

import lombok.ToString;

@ToString
public class Dog {

    private String breed;

    private String color;

    private String name;

    public Dog(String breed, String color) {
        this.breed = breed;
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }
}
