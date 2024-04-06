package org.pbatch.collections.traversal.forloop.list;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListTraversal {

    public static void main(String[] args) {
        //    List<Integer> list = Arrays.asList(10,20,30,40);
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

    }
}
