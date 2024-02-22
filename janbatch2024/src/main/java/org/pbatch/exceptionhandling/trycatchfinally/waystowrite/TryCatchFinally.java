package org.pbatch.exceptionhandling.trycatchfinally.waystowrite;

public class TryCatchFinally {


    public static void main(String[] args) {

        try{
            System.out.println("try block ");
            int a = 1/0;
        }catch (Exception e){
            System.out.println("catch block");
        }finally {
            System.out.println("finally block");
        }

    }
}
