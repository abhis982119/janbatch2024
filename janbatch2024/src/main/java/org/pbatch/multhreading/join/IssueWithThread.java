package org.pbatch.multhreading.join;

public class IssueWithThread {

    public static void main(String[] args) throws InterruptedException {

        Thread girlBoyMeetTask = new Thread(() -> System.out.println("Girl boy meet and ready to marry"));
        Thread panditjiDateCounselling = new Thread(() -> System.out.println("Astrologer finalized date"));
        Thread brotherBookVenue = new Thread(() -> System.out.println("venue booked"));
        Thread mamaPrintingCard = new Thread(() -> System.out.println("mama printed card"));
        Thread shopping = new Thread(() -> System.out.println("bride/groom buying Cloth  "));
        Thread parentsDistributedCard = new Thread( () -> System.out.println("parent distribute cards"));
        Thread marriageSuccessful = new Thread(() -> System.out.println("Marriage successfully registered")) ;

        girlBoyMeetTask.start();
        girlBoyMeetTask.join(); // main-thread will wait until girlBoyMeetTaks-thread is dead

        Thread.yield();


        panditjiDateCounselling.start();
        panditjiDateCounselling.join();


        shopping.start();

        brotherBookVenue.start();
        brotherBookVenue.join();

        mamaPrintingCard.start();
        mamaPrintingCard.join();

        parentsDistributedCard.start();
        parentsDistributedCard.join();


        marriageSuccessful.start();

    }
}
