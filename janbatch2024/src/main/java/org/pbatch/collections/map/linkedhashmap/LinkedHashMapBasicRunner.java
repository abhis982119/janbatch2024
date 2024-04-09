package org.pbatch.collections.map.linkedhashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapBasicRunner {

    public static void main(String[] args) {
        Map<String,String> countryCityMap = new LinkedHashMap<>();
        countryCityMap.put("India", "Delhi");
        countryCityMap.put("India", "Delhi"); //Duplicate key not allowed, will update the value
        countryCityMap.put("China", "Beijing");
        countryCityMap.put("China", "Delhi");  // //Duplicate key not allowed, will update the value






        System.out.println(countryCityMap);

    }
}
