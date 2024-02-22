package org.pbatch.stringinjava.stringinjava.equalstrings;

public class EqualString extends  Object{
    public static void main(String[] args) {

        String s1 = "Swati";
        String s2 = new String("Swati");
        String s3 = new String("Swati");
        String s4 = "Swati";


        if(s1 == s2){
            System.out.println("s1 == s2");
        }else{
            System.out.println("s1 != s2");  // s
        }

        if(s2 == s3){
            System.out.println("s2 == s3");
        }else{
            System.out.println("s2 != s3"); //s
        }


        if(s3 == s4){
            System.out.println("s3 == s4");
        }else{
            System.out.println("s3 != s4"); // s
        }

        if(s1 == s4){
            System.out.println("s1 == s4"); // s
        }else{
            System.out.println("s1 != s4");
        }



        if(s1.equals(s2)){
            System.out.println("s1.equals(s2)");
        }else{
            System.out.println("!s1.equals(s2)");
        }

        if(s2.equals(s3)){
            System.out.println("s2.equals(s3)");
        }else{
            System.out.println("!s2.equals(s3)");
        }


        if(s3.equals(s4)){
            System.out.println("s3.equals(s4)");
        }else{
            System.out.println("!s3.equals(s4)");
        }

        if(s1.equals(s4)){
            System.out.println("s1.equals(s4)");
        }else{
            System.out.println("!s1.equals(s4)");
        }



    }
}
