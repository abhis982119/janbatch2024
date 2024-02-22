package org.pbatch.exceptionhandling.trycatchfinally.finallyblock;

public class TryFinallyWithExceptionOnTry {


    public static void main(String[] args) throws InterruptedException {
        try{
            System.out.println("try-block");
            int a = 1/0;
            System.out.println("line-3");
            System.out.println("line-4");
        }finally {
            System.out.println("finally-block");
        }
    }
}
