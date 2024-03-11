package org.pbatch.multhreading.synchronizedkeyword.methods.model;

import lombok.SneakyThrows;

public class Washroom {

    @SneakyThrows
    public synchronized  void useToilet(){ //object-level-lock
        System.out.println(Thread.currentThread().getName() + " started using toilet");
        Thread.sleep(4000);
        useJetSpray();
        System.out.println(Thread.currentThread().getName() + " ended using toilet");
    }


    @SneakyThrows
    public synchronized void useJetSpray(){  // object-leve-lock
        System.out.println(Thread.currentThread().getName() + " started using jetSpray");
        Thread.sleep(4000);
        System.out.println(Thread.currentThread().getName() + " ended using jetSpray");
    }


    @SneakyThrows
    public static synchronized void getSoap(){  // class-level

        System.out.println(Thread.currentThread().getName() + " : Using soap dispenser - started");
        Thread.sleep(3000);
        System.out.println(Thread.currentThread().getName() + " : Using soap dispenser - ended");
    }

}
