package org.pbatch.multhreading.waystocreatethread.usingrunnableinterface;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " : Thread started working");
    }
}
