package org.pbatch.interfacepackage.abstractkeyword;

public abstract class AbstractClassWithNoAbstractMethod {

    public static boolean isEmpty(String str){
        return str == null || str.isEmpty();
    }

    public void m1(){
        System.out.println("m1()");
    }
}
