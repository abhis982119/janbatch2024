package org.pbatch.collections.traversal.foreachloop.list;

import java.util.Arrays;
import java.util.List;

public class ListForEachLoopRunner {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 30 , 40);

        for(Integer value : list){
            System.out.println(value);
        }
    }
}
