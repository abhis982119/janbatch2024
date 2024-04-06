package org.pbatch.multhreading.latchandbarrier;

import java.sql.SQLOutput;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CyclicBarrier;

public class BarrierRunner {

    public static void main(String[] args) throws InterruptedException {

        CyclicBarrier barrier = new CyclicBarrier(10, ()-> System.out.println("***** Barrier-Broken *******"));

        Runnable raceTask = () -> {
            System.out.println(Thread.currentThread().getName() + " ready for race ");
            try {
                barrier.await();
            } catch (InterruptedException | BrokenBarrierException e) {
                throw new RuntimeException(e);
            }

            System.out.println(Thread.currentThread().getName() + " :  Started race ");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        for(int i = 0; i < 10; i++){
            Thread.sleep(1000);
            CompletableFuture.runAsync(raceTask);
        }


        Thread.sleep(4000);
    }
}
