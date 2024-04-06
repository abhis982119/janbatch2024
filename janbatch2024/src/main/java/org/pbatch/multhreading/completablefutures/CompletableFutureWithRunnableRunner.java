package org.pbatch.multhreading.completablefutures;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureWithRunnableRunner {

    public static void main(String[] args) throws InterruptedException {

        CompletableFuture.runAsync(() -> System.out.println(Thread.currentThread().getName() + " : Running"));
        CompletableFuture.runAsync(() -> System.out.println(Thread.currentThread().getName() + " : Running"));
        CompletableFuture.runAsync(() -> System.out.println(Thread.currentThread().getName() + " : Running"));
        CompletableFuture.runAsync(() -> System.out.println(Thread.currentThread().getName() + " : Running"));

        Thread.sleep(3000);
    }
}
