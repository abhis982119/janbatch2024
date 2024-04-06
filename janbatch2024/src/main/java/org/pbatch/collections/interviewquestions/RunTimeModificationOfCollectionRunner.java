package org.pbatch.collections.interviewquestions;

import java.util.ArrayList;
import java.util.List;

public class RunTimeModificationOfCollectionRunner {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println(list);


        for(Integer value : list){  // ConcurrentModificationException
            System.out.println(value);
            System.out.println("abc");
            list.add(Integer.valueOf(50));
            System.out.println("def");
        }

        System.out.println(list);

    }
}
