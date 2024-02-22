package org.pbatch.exceptionhandling.trycatchfinally.waystowrite;

public class TryCatchTryCatch {

    public static void main(String[] args) {

        System.out.println("line-1");
        try {

        } catch (Exception e) {
            try {

            } catch (Exception ex) {

            }
        }

        System.out.println("line-1");
    }
}
