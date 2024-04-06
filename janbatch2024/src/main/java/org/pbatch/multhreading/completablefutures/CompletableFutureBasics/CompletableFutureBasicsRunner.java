package org.pbatch.multhreading.completablefutures.CompletableFutureBasics;

import java.util.concurrent.*;
import java.util.function.Supplier;

public class CompletableFutureBasicsRunner {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Runnable task = () -> System.out.println(Thread.currentThread().getName() + " : Running");
        Callable callTask = Executors.callable(task);

        CompletableFuture.runAsync(task);
     //   CompletableFuture.supplyAsync(callTask);  // completable don't work with callble

        Supplier<Integer> supplierTask = () -> {
            System.out.println(Thread.currentThread().getName() + " : Running");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + " : Ended");
            return 0;
        };

        CompletableFuture<Integer> completableFuture =  CompletableFuture.supplyAsync(supplierTask);
        System.out.println(completableFuture.get());

    }
}
