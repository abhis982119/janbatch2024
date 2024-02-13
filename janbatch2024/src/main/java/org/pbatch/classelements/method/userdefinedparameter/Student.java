package org.pbatch.classelements.method.userdefinedparameter;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
public class Student {

    private String name;
    private int rollNumber;

    public void m1(){
        System.out.println("A-m1()");
    }

}
