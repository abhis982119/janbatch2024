package org.pbatch.stringinjava.stringinjava.numberofobjects;

public class NumberOfObjectCreated {

    public static void main(String[] args) {

        String s1 = "Swati";  // +1
        String s2 = "Sima";   // +1

        String s3 = new String("Swati");  // +1
        String s4 = new String("Swati");  // +1
        String s5 = new String("Sima");   // +1

        String s6 = " Jain";   // +1


        String s7 = s1 + s6;  // +1

        String s8 = " Doge";  // +1

        String s9 = s5 +s8;   // +1

        String s10 = "Swati";

        s5.concat(s8);   //+1


        s1.concat(s8);  // +1

        s3.substring(0,1);
    }
}
