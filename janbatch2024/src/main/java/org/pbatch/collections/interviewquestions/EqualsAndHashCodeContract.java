package org.pbatch.collections.interviewquestions;

import org.pbatch.collections.interviewquestions.model.Student;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class EqualsAndHashCodeContract {


    public static void main(String[] args) {

        Object PRESENT = new Object();

        Student naresh = Student.builder().name("Naresh").rollNo(1).build();
        Student naresh_clone= Student.builder().name("Naresh").rollNo(1).build();
        Student sima = Student.builder().name("Sima").rollNo(2).build();


        HashSet



        Map<Student,Object> studentMap = new HashMap<>();
        studentMap.put(naresh, PRESENT);
        studentMap.put(naresh_clone, PRESENT);
        studentMap.put(sima, PRESENT);

        System.out.println(studentMap);

    }
}
