package org.pbatch.collections.traversal.iterators.list;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListIterator {
/*
               i
   [10,20,30, 40]
 */

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,20,30,40);

        Iterator<Integer> itr = list.iterator();

        while(itr.hasNext()){
            int value = itr.next();
            System.out.println(value);
        }
    }
}
