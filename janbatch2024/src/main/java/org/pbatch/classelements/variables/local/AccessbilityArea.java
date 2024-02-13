package org.pbatch.classelements.variables.local;

public class AccessbilityArea {

    public static void main(String[] args) {

        int a = 10;

        for(int i = 0; i < 5 ; i++){
            int sum = 0; // declaration + initialization
            sum += i;
        }

        System.out.println("value of a  : " + a);
     //   System.out.println("value of sum : " + sum); //java: cannot find symbol :   symbol:   variable sum

    }
}
