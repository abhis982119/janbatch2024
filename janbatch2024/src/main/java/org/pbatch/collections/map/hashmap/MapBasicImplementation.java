package org.pbatch.collections.map.hashmap;

import java.util.HashMap;
import java.util.Map;

public class MapBasicImplementation {

    public static void main(String[] args) {
        Map<String,String> countryCityMap = new HashMap<>();
        countryCityMap.put("India", "Delhi");
        countryCityMap.put("India", "Delhi"); //Duplicate key not allowed, will update the value
        countryCityMap.put("China", "Beijing");//Insertion order not preserved
        countryCityMap.put("China", "Delhi");  // //Duplicate key not allowed, will update the value






        System.out.println(countryCityMap);

    }
}
