package org.pbatch.multhreading.interviewquestions;

public class UsingWaitAndNotifyOutsideSynchronizedArea {
/*
   wait and notify : cannot be called if the thread is not the owner of monitor i.e hold lock
 */
    public static void main(String[] args) throws InterruptedException {
        UsingWaitAndNotifyOutsideSynchronizedArea obj = new UsingWaitAndNotifyOutsideSynchronizedArea();
        obj.callWait();   // java.lang.IllegalMonitorStateException: current thread is not owner
        obj.callNotify(); //java.lang.IllegalMonitorStateException: current thread is not owner
    }


    public void callWait() throws InterruptedException {
        wait();  //java.lang.IllegalMonitorStateException: current thread is not owner
    }

    public void callNotify(){
        notify(); // java.lang.IllegalMonitorStateException: current thread is not owner
    }
}
