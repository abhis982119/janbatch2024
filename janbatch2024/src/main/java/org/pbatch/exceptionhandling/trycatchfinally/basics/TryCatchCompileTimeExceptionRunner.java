package org.pbatch.exceptionhandling.trycatchfinally.basics;

import lombok.SneakyThrows;

import java.util.concurrent.ExecutionException;

public class TryCatchCompileTimeExceptionRunner {


    public static void main(String[] args)   {
        System.out.println("line-1");
        System.out.println("line-2");
        try {
            Thread.sleep(4000);
        }catch (Throwable e){
            System.out.println("catch-line-1");
        }


        System.out.println("line-3");
        System.out.println("line-4");
    }
}
