package org.pbatch.collections.sorting.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
public class Student implements Comparable<Student> {

    public int rollNo;
    public String name;


    @Override
    public int compareTo(Student otherStudent) {
        return (rollNo < otherStudent.getRollNo()) ? -1 : ((rollNo == otherStudent.getRollNo()) ? 0 : 1);
        //return Integer.compare(rollNo, otherStudent.getRollNo());
    }
}
