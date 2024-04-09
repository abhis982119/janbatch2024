package org.pbatch.collections.traversal.foreachloop.map;

import java.util.HashMap;
import java.util.Map;

public class MapTraversingForEachUsingValues {

    public static void main(String[] args) {
        Map<String, String> countryCityMap = new HashMap<>();
        countryCityMap.put("USA", "Washington D.C");
        countryCityMap.put("India", "Delhi");
        countryCityMap.put("China", "Beijing");


        for(String value : countryCityMap.values()){
            System.out.println(value);
        }
    }
}
