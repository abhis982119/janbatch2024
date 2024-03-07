package org.pbatch.multhreading.waystocreatethread.usingthreadclass;

public class MyThread extends Thread{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " : started working. ");
    }
}
