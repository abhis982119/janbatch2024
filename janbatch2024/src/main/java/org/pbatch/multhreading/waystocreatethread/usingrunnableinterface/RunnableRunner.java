package org.pbatch.multhreading.waystocreatethread.usingrunnableinterface;

public class RunnableRunner {

    public static void main(String[] args) {
        MyRunnable task = new MyRunnable();
        Thread thread = new Thread(task);
        thread.start(); // register thread to thread-scheduler

        Thread thread1 = new Thread(task);
        thread1.start(); // register thread to thread-scheduler

        System.out.println( Thread.currentThread().getName() + " : line-1");
        System.out.println( Thread.currentThread().getName() + " : line-2");
    }
}
