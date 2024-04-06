package org.pbatch.collections.set.treeset;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(40);
        set.add(20);
        set.add(30);



        System.out.println(set.add(40));
        System.out.println(set.add(50));


        System.out.println(set);
    }
}
