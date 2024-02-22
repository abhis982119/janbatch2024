package org.pbatch.exceptionhandling.trycatchfinally.catchprecedence;

public class InValidPrecendenceRunner {

    public static void main(String[] args) {
        System.out.println("line-1");

        try{
            System.out.println("try-line-1");
            Thread.sleep(4000);
            int a = 1/0;
        }catch (Exception e){
            System.out.println("Unknown exception occured");
        }
    /*    catch (InterruptedException interruptedException){  //  exception java.lang.InterruptedException has already been caught
            System.out.println("catch-line-1");
            System.out.println(interruptedException.getMessage());
        }*/

        System.out.println("line-2");
    }
}
