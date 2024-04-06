package org.pbatch.collections.traversal.iterators.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorRunner {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);


        ListIterator<Integer> itr =  list.listIterator();

        while(itr.hasNext()){
            int value = itr.next();
            System.out.println(value);

            if(value > 30) {
                System.out.println("adding value");
                itr.add(50);
            }
        }

        for(int value : list){
            if(value > 30) {
                System.out.println("adding value");
      //          itr.add(50); java.util.ConcurrentModificationException
            }
        }
        System.out.println(list);
    }
}
