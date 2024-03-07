package org.pbatch.multhreading.interviewquestions;

public class ThreadInterruptToNonSleepingThread {

    public static void main(String[] args) {
        Runnable task = () -> {

            while(true){
                System.out.println("Task started ");
            }
        };

        Thread thread = new Thread(task);
        thread.start();

        thread.interrupt(); // if thread is alive and sleeping or waiting( wait/join ) only then throw error
    }
}
