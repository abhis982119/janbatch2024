package org.pbatch.exceptionhandling.trycatchfinally.waystowrite;

import java.io.IOException;

public class TryWIthMultipleCatchWithSameImplemetation {

    public static void main(String[] args) {
        try{
            System.out.println("line-1");
            Thread.sleep(4000);
            throw new IOException("My message");
        }catch (InterruptedException  | IOException | ArithmeticException e ){
            System.out.println("Error occured " + e.getMessage());
        }  catch(Exception e){
          System.out.println("Parent handling exception : " );
        }
    }
}
