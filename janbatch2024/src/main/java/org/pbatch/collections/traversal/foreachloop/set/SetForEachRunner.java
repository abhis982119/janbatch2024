package org.pbatch.collections.traversal.foreachloop.set;

import java.util.HashSet;
import java.util.Set;

public class SetForEachRunner {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);


        for(Integer value : set){
            System.out.println(value);
        }
    }
}
