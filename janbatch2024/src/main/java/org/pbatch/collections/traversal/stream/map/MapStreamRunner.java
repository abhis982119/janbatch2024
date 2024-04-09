package org.pbatch.collections.traversal.stream.map;

import java.util.HashMap;
import java.util.Map;

public class MapStreamRunner {

    /*
     Map don't work with streams
     */
    public static void main(String[] args) {
        Map<String, String> countryCityMap = new HashMap<>();
        countryCityMap.put("USA", "Washington D.C");
        countryCityMap.put("India", "Delhi");
        countryCityMap.put("China", "Beijing");


        countryCityMap.forEach((country, city) -> System.out.println(country + " : " + city));
        countryCityMap.forEach((k, v) -> System.out.println(k + " : " + v));

        countryCityMap.entrySet().stream().forEach(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));
    }
}
