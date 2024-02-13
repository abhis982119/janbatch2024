package org.pbatch.classelements.variables.local;

public class LocalVariableNeedsToInitializeBeforeUse {


    public static void main(String[] args) {
        int localVariable ;
     //   System.out.println(localVariable);  java: variable localVariable might not have been initialized
        System.out.println("local variable if not used, don't throw error");

        localVariable = 10; //initialized before use
        System.out.println(localVariable);

    }
}
