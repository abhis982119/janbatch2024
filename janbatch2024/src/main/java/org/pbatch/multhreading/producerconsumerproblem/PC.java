package org.pbatch.multhreading.producerconsumerproblem;

import lombok.SneakyThrows;

public class PC {


    private int capacity = 5;
    private int chipsProduced = 0;

    int maxBatch = 10;

    @SneakyThrows
    public void produce(){
        synchronized (this) {
            while (true) {
                while (chipsProduced < capacity) {
                    Thread.sleep(2000);
                    System.out.println(" product chip number : " + ++chipsProduced);
                }
                System.out.println("Factory capacity full, notifying consumer");
                notify();
                wait();
            }
        }
    }


    @SneakyThrows
    public void consume(){

        while(true) {

            synchronized (this) {
                while (chipsProduced > 0) {
                    Thread.sleep(1000);
                    System.out.println(" consumed chip number : " + chipsProduced--);
                }
                System.out.println("All chips consumed, notifying producer");
                notify();
                wait();

            }
        }
    }

}
