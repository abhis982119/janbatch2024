package org.pbatch.multhreading.basics;

public class MainThreadRunner {

    public static void main(String[] args) {

        System.out.println("Thread name: " + Thread.currentThread().getName());  // thread-name
        System.out.println("thread group  : " + Thread.currentThread().getThreadGroup());  // thread-group
        System.out.println("Thread priority : " + Thread.currentThread().getPriority());

    }
}

