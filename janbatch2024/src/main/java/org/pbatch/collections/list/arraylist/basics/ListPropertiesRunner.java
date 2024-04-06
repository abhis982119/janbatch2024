package org.pbatch.collections.list.arraylist.basics;

import java.util.ArrayList;
import java.util.List;

public class ListPropertiesRunner {


    public static void main(String[] args) {
        List  list = new ArrayList<>();

        list.add(10);
        list.add(true);  // heterogenous data allowed
        list.add(20); // insertion order preserved
        list.add(null); // null insertion allowed
        list.add(10); // duplicate allowed


        System.out.println(list);

    }
}
