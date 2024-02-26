package org.pbatch.exceptionhandling.errorexamples;

public class OutOfMemoryErrorRunner {

    public static void main(String[] args) {
        try {
            System.out.println("line-1");
            System.out.println("line-2");
            System.out.println("line-3");
            Integer[] arr = new Integer[1000000000];
            System.out.println("Integer array size : " + arr.length);
            System.out.println("line-4");
            System.out.println("line-5");

        }catch (Error e){
            System.out.println("Error occered " + e.getMessage());
        }
        System.out.println("line-6");
    }
}
