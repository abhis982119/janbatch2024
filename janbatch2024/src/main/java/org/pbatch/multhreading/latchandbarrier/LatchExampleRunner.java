package org.pbatch.multhreading.latchandbarrier;

import org.pbatch.modifiers.accessmodifiers.runnerpackage.C;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CountDownLatch;

public class LatchExampleRunner {

    public static void main(String[] args) throws InterruptedException {

        CountDownLatch latch = new CountDownLatch(2);   //2

        Runnable fetchCarrotTask = () ->{
            System.out.println(Thread.currentThread().getName() + " : carrot fetched ");
            latch.countDown();   //1
        };

        Runnable fetchMawaTask = () -> {
            System.out.println(Thread.currentThread().getName() + " : mawa fetched ");
            latch.countDown(); //0
        };


        Runnable makeCarrotPudding = () -> {
            try {
                latch.await();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + " : made carrot pudding");
        };


        CompletableFuture.runAsync(fetchCarrotTask);
        CompletableFuture.runAsync(fetchMawaTask);
        CompletableFuture.runAsync(makeCarrotPudding);

        Thread.sleep(2000);

    }
}
