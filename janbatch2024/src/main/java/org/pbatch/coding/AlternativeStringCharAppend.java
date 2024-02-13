package org.pbatch.coding;

public class AlternativeStringCharAppend {


    /*

          i          j
         012        012
         ACE        BDF

         loop     1st
         bulder : AB

     */
    public static void main(String[] args) {
        String s1 = new String("ACEGH");
        String s2 = new String("BDF");

        StringBuilder builder = new StringBuilder();
        int i = 0;
        int j = 0;

        while (i < s1.length() || j < s2.length()) {
            if (i < s1.length())  builder.append(s1.charAt(i++));
            if (j < s2.length())  builder.append(s2.charAt(j++));
        }

        System.out.println(builder);
    }
}
