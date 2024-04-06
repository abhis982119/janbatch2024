package org.pbatch.collections.traversal.iterators.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetIteratorRunner {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);

        Iterator<Integer> itr = set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
