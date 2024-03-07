package org.pbatch.multhreading.interviewquestions;

public class StartingThreadTwice {

    public static void main(String[] args) {
        Thread thread = new Thread(() -> System.out.println("Thread working"));
        thread.start();
        thread.start(); //Exception in thread "main" java.lang.IllegalThreadStateException
    }
}
