package org.pbatch.oops.inheritence.parentReferenceVariable.animal;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
public class Animal {

    private String eyes;

    private String nose;

    private String color;

    private String teeth = "canine";


    public void eat(){
        System.out.println("Eating using " + teeth);
    }


}
