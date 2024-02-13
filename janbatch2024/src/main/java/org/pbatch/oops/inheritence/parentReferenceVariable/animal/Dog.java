package org.pbatch.oops.inheritence.parentReferenceVariable.animal;

import lombok.AllArgsConstructor;


public class Dog extends Animal{

    private String tail = "tail";


    public void wagTail(){
        System.out.println("wagging " + tail);
    }


}
