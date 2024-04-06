package org.pbatch.collections.set.linkedhashset;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {

    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);

        System.out.println(set.add(40));
        System.out.println(set.add(50));


        System.out.println(set);
    }
}
