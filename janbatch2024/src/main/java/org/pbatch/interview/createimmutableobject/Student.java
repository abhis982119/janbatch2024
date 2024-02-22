package org.pbatch.interview.createimmutableobject;

import lombok.*;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
public class Student implements  Cloneable {

    private String name;

    @Override
    public Student clone() throws CloneNotSupportedException {
        return (Student)super.clone();
    }
}
