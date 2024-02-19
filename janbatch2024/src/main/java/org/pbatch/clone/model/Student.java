package org.pbatch.clone.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.pbatch.interfacepackage.markerinterface.A;

@Builder
@Getter
@Setter

public class Student implements Cloneable {

    private int rollNumber;
    private String name;

    private Address  address = new Address();


    @Override
    public Student clone() throws CloneNotSupportedException {
        return (Student) super.clone();
    }


    public Student deepClone() throws  CloneNotSupportedException {
        Student student = (Student) super.clone();
        student.setAddress( new Address());
        return student;
    }


    public String getStudentString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                ", address=" + getAddress() +
                '}';
    }
}
