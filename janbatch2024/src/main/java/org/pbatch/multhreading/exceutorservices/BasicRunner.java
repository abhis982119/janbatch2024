package org.pbatch.multhreading.exceutorservices;

import java.util.concurrent.*;

public class BasicRunner {

    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {


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



        ExecutorService executorService =   Executors.newFixedThreadPool(1);
        Future<Integer> futureSum =  executorService.submit(getSumTask);

     //    System.out.println(futureSum.get());
     //   System.out.println(futureSum.get(1000,TimeUnit.MILLISECONDS));;

        if(futureSum.isDone()){    // is used to avoid early blocking
            System.out.println(futureSum.get());
        }

        System.out.println("line-2");

        System.out.println(futureSum.get()); // equilent to join : converts code into blocking code

        executorService.shutdown();


    }
}
