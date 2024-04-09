package org.pbatch.collections.map.treemap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapBasicRunner {


    public static void main(String[] args) {
        Map<String, String> countryCityMap = new TreeMap<>();
        countryCityMap.put("USA", "Washington D.C");
        countryCityMap.put("India", "Delhi");
        countryCityMap.put("India", "Delhi"); //Duplicate key not allowed, will update the value
        countryCityMap.put("China", "Beijing");
        countryCityMap.put("China", "Delhi");  // //Duplicate key not allowed, will update the value


        System.out.println(countryCityMap);


    }
}
