package org.pbatch.multhreading.callables;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Supplier;

public class BasicRunner {

    public static void main(String[] args) {


        Callable<Integer> getSumTask = () -> {
            System.out.println(Thread.currentThread().getName() + " :  started working");
            Thread.sleep(3000);
            int sum = 0;
            for(int i = 0; i < 5; i++){
                sum += i;
            }
            System.out.println(Thread.currentThread().getName() + " :  ended working");
            return sum;
        };


        ExecutorService executorService =   Executors.newFixedThreadPool(4);
        executorService.submit(getSumTask);
        executorService.submit(getSumTask);
        executorService.submit(getSumTask);
        executorService.submit(getSumTask);

        executorService.shutdown();


    }
}
