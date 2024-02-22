package org.pbatch.stringinjava.stringbuffer;

import org.pbatch.clone.model.Address;
import org.pbatch.clone.model.Student;

/*
 https://www.facebook.com?name=swatijaingmail.com&password=89081hkhsdkaja
 */
public class StringBufferRunnable {

    public static void main(String[] args) {
        String s1 = "Swati";
        String s2 = new String("Swati");

        StringBuffer s3 = new StringBuffer("Swati");
        if(s1 == s2){
            System.out.println("s1 == s2");
        }else{
            System.out.println("s1 != s2");
        }

   /*   // Compile time exception : cannot compare different objects using ==

      if(s1 == s3){
            System.out.println("s1 == s3");
        }else{
            System.out.println("s1 != s3");    //s
        }

        if(s2 == s3){
            System.out.println("s2 == s3");
        }else{
            System.out.println("s2 != s3");  //s3
        }
*/

        if(s1.equals(s2)){
            System.out.println("s1.equals(s2)"); //s
        }else{
            System.out.println("!s1.equals(s2)");
        }

        if(s3.equals(s2)){
            System.out.println("s3.equals(s2)");
        }else{
            System.out.println("!s3.equals(s2)");//s
        }

        if(s3.equals(s1)){
            System.out.println("s3.equals(s1)");
        }else{
            System.out.println("!s3.equals(s1)"); //s
        }


        if(s2.equals(s3)){
            System.out.println("s2.equals(s3)");
        }else{
            System.out.println("!s2.equals(s3)");  //s
        }

    }
}
