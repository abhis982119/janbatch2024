package org.pbatch.collections.list.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LinkedListBasics {

    public static void main(String[] args) {
        List list = new LinkedList();


        list.add(10);
        list.add(true);  // heterogenous data allowed
        list.add(20); // insertion order preserved
        list.add(null); // null insertion allowed
        list.add(10); // duplicate allowed


        System.out.println(list);
    }
}
