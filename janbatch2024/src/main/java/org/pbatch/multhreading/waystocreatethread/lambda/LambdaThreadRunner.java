package org.pbatch.multhreading.waystocreatethread.lambda;

import java.sql.SQLOutput;

public class LambdaThreadRunner {

    public static void main(String[] args) {
        Runnable task  = ()  -> {
                System.out.println(Thread.currentThread().getName() + " : Thread working");
        };


        Runnable newTask =   ()  -> System.out.println(Thread.currentThread().getName() + ": thread working");


        Thread thread = new Thread(task);
        thread.start();

        Thread newThread = new Thread(newTask);
        newThread.start();;

        Thread lambdaThread = new Thread( () -> System.out.println(Thread.currentThread().getName() + " : thread working"));
        lambdaThread.start();
    }
}
