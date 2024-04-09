package org.pbatch.collections.interviewquestions.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;

@Getter
@Setter
@Builder
@ToString
public class Student {

    private String name;

    private int rollNo;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;   // if both objects are on same memory address
        if (o == null || getClass() != o.getClass()) return false; // both classes should be same
        Student student = (Student) o;
        return rollNo == student.rollNo;
    }

    @Override
    public int hashCode() {
        return  rollNo;
    }
}
