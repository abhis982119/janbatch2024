package org.pbatch.multhreading.waitandnotify;

public class WaitRunner {


    public static void main(String[] args) throws InterruptedException {


        Driver driver = new Driver();

        new Thread(driver::reachDestinationAndWaitForClient).start();



        new Thread(driver::giveOTPtoDriver).start();











    }
}
