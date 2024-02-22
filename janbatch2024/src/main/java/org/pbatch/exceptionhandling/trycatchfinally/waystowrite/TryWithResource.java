package org.pbatch.exceptionhandling.trycatchfinally.waystowrite;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResource {

    public static void main(String[] args) throws IOException {


     try( BufferedReader reader = new BufferedReader(new FileReader("/Users/abhisheksharma/test.text"))) {

        StringBuilder builder = new StringBuilder();
        String line;
        while( (line = reader.readLine()) != null){
            builder.append(line).append("\n");
        }

        System.out.println(builder);
        }
    }

 }
