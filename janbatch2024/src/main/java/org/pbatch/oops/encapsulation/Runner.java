package org.pbatch.oops.encapsulation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Runner {

    public static void main(String[] args) {
        Student student = new Student();
        student.m1(10);

        List<String> list = new ArrayList<>();
        list.add("10");
        list.add("20");
        list.add("30");
        list.add("40");

        int sum = list.stream().mapToInt(Integer::parseInt).sum();
        System.out.println(sum);

    }
}
