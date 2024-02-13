package org.pbatch.classelements.constructor.basic.dog;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Dog {

    private String color;

    private String breed;

    private String name;

    public Dog(String color, String breed) {
        this.color = color;
        this.breed = breed;
    }

    public void setName(String name) {
        this.name = name;
    }
}
