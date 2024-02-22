package org.pbatch.interview.wrapper;

/*
Java cache Integer values from -128 to 127 i.e for wrapper classes in given range on single object will be created
 */
public class IntergerCachedRangeInterviewQuestions {

    public static void main(String[] args) {
        Integer a = Integer.valueOf(127);
        Integer b = Integer.valueOf(127);

        /*  false

        Integer a = Integer.valueOf(127);
        Integer b = Integer.valueOf(127);
*/


        if(a == b){
            System.out.println("data found ");  // 18-lakh
        }else{
            System.out.println("Data inserted into db");
        }
    }
}
