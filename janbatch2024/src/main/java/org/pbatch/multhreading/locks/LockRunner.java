package org.pbatch.multhreading.locks;

import java.util.concurrent.CompletableFuture;

public class LockRunner {


    public static void main(String[] args) throws InterruptedException {
        Washroom washroom = new Washroom();

        CompletableFuture.runAsync(washroom::useToilet);
        CompletableFuture.runAsync(washroom::useToilet);

        Thread.sleep(5000);
    }
}
