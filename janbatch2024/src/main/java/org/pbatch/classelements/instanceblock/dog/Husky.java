package org.pbatch.classelements.instanceblock.dog;

import lombok.ToString;



 @ToString
public class Husky {



    //instance-block to hardcode instance variable
    {
        breed = "Husky";
    }

    private String breed ;

    private String color;

    private String name;

    public Husky(String color ) {
        this.color = color;
    }


    public void setName(String name) {
        this.name = name;
    }
}
