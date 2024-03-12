package org.pbatch.multhreading.synchronizedkeyword.blocks.classlevellock;

import lombok.SneakyThrows;

public class Salon {


    @SneakyThrows
    public  void getHairCut(){

        System.out.println(Thread.currentThread().getName() + " : Entered salon");
        synchronized (this) { // object level lock
            System.out.println(Thread.currentThread().getName() + " : Hair cut started");
            Thread.sleep(4000);
            System.out.println(Thread.currentThread().getName() + ": Hair cut completed");
        }

        synchronized (Salon.class) { //Class level lock
            makePayment();
        }
        System.out.println(Thread.currentThread().getName() + " : Exit salon");

    }


    @SneakyThrows
    public  static  void makePayment(){
        System.out.println(Thread.currentThread().getName()  + " started payment");
        Thread.sleep(2000);
        System.out.println(Thread.currentThread().getName()  + " completed payment");

    }


}
