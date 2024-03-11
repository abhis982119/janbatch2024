package org.pbatch.multhreading.synchronizedkeyword.methods.objectlevellock.votingprocess;

public class MultipleThreadsUsingVotingMachine {

    public static void main(String[] args) throws InterruptedException {
        VotingMachine votingMachine = new VotingMachine();
        VotingBooth votingBooth = new VotingBooth(votingMachine);

        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                new Thread(() -> votingBooth.castVote()).start();
            }
        };

        for(int i =0; i < 50; i++) {
            new Thread(task).start();
        }



        Thread.sleep(10000);
        System.out.println("total vote casted  : " + votingMachine.getCount());
    }
}
