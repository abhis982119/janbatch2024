package org.pbatch.collections.traversal.foreachloop.map;

import java.util.HashMap;
import java.util.Map;

/*
For-each is only for list, and set interfaces
 */

public class MapForEachUsingEntrySet {

    public static void main(String[] args) {
        Map<String, String> countryCityMap = new HashMap<>();
        countryCityMap.put("USA", "Washington D.C");
        countryCityMap.put("India", "Delhi");
        countryCityMap.put("China", "Beijing");



        for(Map.Entry<String,String> entry : countryCityMap.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }


    }
}
