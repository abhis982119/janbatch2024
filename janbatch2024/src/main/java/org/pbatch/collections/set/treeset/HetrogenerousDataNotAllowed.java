package org.pbatch.collections.set.treeset;

import java.util.Set;
import java.util.TreeSet;

public class HetrogenerousDataNotAllowed {

    public static void main(String[] args) {
        Set  set = new TreeSet<>();
        set.add(10);
        set.add(40);
        set.add(20);
        set.add(30);
        set.add(Boolean.TRUE); //Exception in thread "main" java.lang.ClassCastException: class java.lang.Integer cannot be cast to class java.lang.Boolean (java.lang.Integer and java.lang.Boolean are in module java.base of loader 'bootstrap')
        set.add("Killbillpandey"); //Exception



        System.out.println(set.add(40));
        System.out.println(set.add(50));


        System.out.println(set);
    }
}
