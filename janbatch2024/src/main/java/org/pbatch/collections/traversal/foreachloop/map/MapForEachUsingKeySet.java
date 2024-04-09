package org.pbatch.collections.traversal.foreachloop.map;

import java.util.HashMap;
import java.util.Map;

public class MapForEachUsingKeySet {

    public static void main(String[] args) {
        Map<String, String> countryCityMap = new HashMap<>();
        countryCityMap.put("USA", "Washington D.C");
        countryCityMap.put("India", "Delhi");
        countryCityMap.put("China", "Beijing");


   //     System.out.println(countryCityMap.get("China"));

        for(String key : countryCityMap.keySet()){
            System.out.println(key + " : " + countryCityMap.get(key));
        }

    }
}
