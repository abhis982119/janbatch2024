package org.pbatch.multhreading.waitandnotify;

import lombok.SneakyThrows;

public class Driver {

    @SneakyThrows
    public void reachDestinationAndWaitForClient() {
        System.out.println("Reached destination");
        System.out.println("waiting for client at destination");

        synchronized (this) {
            wait();
        }

        System.out.println("taking client to city tour");
    }

    public void giveOTPtoDriver(){
        System.out.println("opt submitted successfully");
        synchronized (this) {
            notify();
        }
    }
}
