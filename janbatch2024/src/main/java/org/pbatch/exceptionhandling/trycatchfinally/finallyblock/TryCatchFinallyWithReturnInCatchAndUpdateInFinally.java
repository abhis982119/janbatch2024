package org.pbatch.exceptionhandling.trycatchfinally.finallyblock;

public class TryCatchFinallyWithReturnInCatchAndUpdateInFinally {

    public static void main(String[] args) {

        int value = getValue();
        System.out.println("Received value : " + value );
    }

    public static int getValue(){

        int a = 1;


        try{
            a = 2;
            int b = 1/0;
        }catch (Exception e){
            a = 3;
            return a;
        }finally {
            a = 5;
            return a;
        }

    }
}
/*

stack
-------
getValue()
------
int a = 5;
----

-----

-----

return : 3

-----

 */