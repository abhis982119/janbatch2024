package org.pbatch.multhreading.synchronizedkeyword.blocks.objectlevellock;

import lombok.SneakyThrows;

public class Salon {



    @SneakyThrows
    public  void getHairCut(){
        System.out.println(Thread.currentThread().getName() + " : Entered salon");
        synchronized (this) {
            System.out.println(Thread.currentThread().getName() + " : Hair cut started");
            Thread.sleep(4000);
            System.out.println(Thread.currentThread().getName() + ": Hair cut completed");
        }
        System.out.println(Thread.currentThread().getName() + " : Exit salon");

    }

}
