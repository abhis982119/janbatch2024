package org.pbatch.collections.sorting.comparable.list.userdefined;

import org.pbatch.collections.sorting.model.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserDefnedSorting {

    public static void main(String[] args) {

        Student naresh = Student.builder().name("Naresh").rollNo(1).build();
        Student sima = Student.builder().name("Sima").rollNo(2).build();

        List<Student> students = new ArrayList<>();

        students.add(sima);
        students.add(naresh);


        System.out.println(students);

        Collections.sort(students);

        System.out.println(students);

    }
}
