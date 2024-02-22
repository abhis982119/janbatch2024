package org.pbatch.exceptionhandling.trycatchfinally.catchprecedence;

public class CatchingMultipleExceptions {

    public static void main(String[] args)  {

        System.out.println("line-1");

        try{
            System.out.println("try-line-1");
            Thread.sleep(4000);
            int a = 1/0;
        }catch (InterruptedException interruptedException){
            System.out.println("catch-line-1");
            System.out.println(interruptedException.getMessage());
        }catch (Exception e){
            System.out.println("Unknown exception occured");
        }

        System.out.println("line-2");
    }
}
