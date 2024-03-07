package org.pbatch.multhreading.waystocreatethread.usingthreadclass;

public class ThreadRunner {

    public static void main(String[] args) {

        MyThread thread = new MyThread();
        thread.start();


        MyThread thread1 = new MyThread();
        thread1.start();

        System.out.println(Thread.currentThread().getName() +  " : line-1");
        System.out.println(Thread.currentThread().getName()  + " : line-2");
    }
}
