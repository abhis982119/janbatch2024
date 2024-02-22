package org.pbatch.exceptionhandling.trycatchfinally.basics;

public class TryCatchRuntimeExceptionHandler {

    public static void main(String[] args) {
        System.out.println("line-1");
        try {
            System.out.println("try-line-1");
            System.out.println("try-line-2");
            int a = 1 / 0;
            System.out.println("line-3");
            System.out.println("line-4");
        }catch (ArithmeticException exception){
            System.out.println("catch-block-line-1");
            System.out.println("catch-block-line-2");
        }

        System.out.println("line-2");
    }
}
