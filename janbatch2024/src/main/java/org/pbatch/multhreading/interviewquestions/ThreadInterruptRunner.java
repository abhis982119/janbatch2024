package org.pbatch.multhreading.interviewquestions;

import java.sql.SQLOutput;

public class ThreadInterruptRunner {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("main thread started ");
        Runnable task = () -> {
            System.out.println(Thread.currentThread().getName() + " : Thread task started");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println(Thread.currentThread().getName() + " : Thread task ended");
        };


        Thread thread = new Thread(task);
        thread.start();

        Thread.sleep(2000);
        thread.interrupt();

        System.out.println("main thread ended");
    }
}
