package org.pbatch.collections.traversal.stream.set;

import java.util.HashSet;
import java.util.Set;

public class SetStreamRunner {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);

        set.forEach(System.out::println);



        //set.forEach( value -> System.out.println(value));

       // set.stream().forEach(System.out::println);
    }
}
