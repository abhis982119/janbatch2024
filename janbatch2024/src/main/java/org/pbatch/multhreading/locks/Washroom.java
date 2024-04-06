package org.pbatch.multhreading.locks;

import lombok.SneakyThrows;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Washroom {

    private Lock lock = new ReentrantLock();
    private ReentrantLock reentrantLock = new ReentrantLock();
    @SneakyThrows
    public void useToilet()  {
        System.out.println(Thread.currentThread().getName() + " : entered washroom ");
        lock.lock();
        System.out.println(Thread.currentThread().getName() + " started using washroom ");
        Thread.sleep(3000);
        System.out.println(Thread.currentThread().getName() + " ended using washroom ");
        lock.unlock();
    }

}
