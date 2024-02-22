package org.pbatch.exceptionhandling.trycatchfinally.waystowrite;

public class TryTryCatchCatch {

    public static void main(String[] args) {

        System.out.println("line-1");
        try{
            try{

            }catch (Exception e){

            }
        }catch (Exception e){

        }
        System.out.println("line-2");
    }
}
