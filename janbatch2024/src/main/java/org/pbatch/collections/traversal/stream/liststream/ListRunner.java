package org.pbatch.collections.traversal.stream.liststream;

import java.util.Arrays;
import java.util.List;

public class ListRunner {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 30 , 40);

        list.forEach( value -> System.out.println(value));
        list.forEach(System.out::println);

        list.stream().forEach(value -> System.out.println(value));
        list.stream().forEach(System.out::println);


    }
}
