package org.pbatch.multhreading.waystocreatethread.anonymousclass.threadcreation;

import org.pbatch.multhreading.waystocreatethread.usingrunnableinterface.MyRunnable;

public class ThreadRunner {

    public static void main(String[] args) {
        //Runnable runnable = new MyRunnable();

        Runnable task  = new Runnable(){
            @Override
            public void run(){
                System.out.println(Thread.currentThread().getName() + " : Thread working");
            }
        };

        Thread thread = new Thread(task);
        thread.start();




    }
}
