package org.pbatch.collections.traversal.forloop.list;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListTraversal {

    public static void main(String[] args) {
    //    List<Integer> list = Arrays.asList(10,20,30,40);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

    }
}
