package org.pbatch.collections.sorting.comparable.list.wrappersorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortingRunner {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(40);
        list.add(10);
        list.add(30);

        System.out.println(list);

        Collections.sort(list);

        System.out.println(list);


    }
}
