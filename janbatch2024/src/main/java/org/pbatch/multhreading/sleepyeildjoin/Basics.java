package org.pbatch.multhreading.sleepyeildjoin;

import java.sql.SQLOutput;

public class Basics {

    public static void main(String[] args) throws InterruptedException {

        System.out.println(Thread.currentThread().getName() + " :  starts ");

         Runnable task = () -> {
             System.out.println(Thread.currentThread().getName() + " : thread working");
             System.out.println(Thread.currentThread().getName() + " : thread will sleep for 3 sec");
             try {
                 Thread.sleep(3000);  // do not release processor
             } catch (InterruptedException e) {
                 throw new RuntimeException(e);
             }
             System.out.println(Thread.currentThread().getName() +  "Thread awake ");

             System.out.println("leaving processor at time :  " + System.currentTimeMillis());
             Thread.yield(); // release processor  processor
             System.out.println("processor reassigned at time  :  " + System.currentTimeMillis());


         };

         Thread thread = new Thread(task);
         thread.start();

         thread.join(); // waits, dont release the processor

        System.out.println(Thread.currentThread().getName() + " : ends ");
    }
}
