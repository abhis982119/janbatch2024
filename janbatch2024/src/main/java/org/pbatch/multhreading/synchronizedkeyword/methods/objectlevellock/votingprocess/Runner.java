package org.pbatch.multhreading.synchronizedkeyword.methods.objectlevellock.votingprocess;

public class Runner {


    public static void main(String[] args) throws InterruptedException {
        VotingMachine votingMachine = new VotingMachine();
        VotingBooth votingBooth = new VotingBooth(votingMachine);

        Thread naresh = new Thread( () -> votingBooth.castVote());
        Thread suresh = new Thread( () -> votingBooth.castVote());
        Thread ravi = new Thread( () -> votingBooth.castVote());

        naresh.start();;
        suresh.start();
        ravi.start();

        Thread.sleep(2000);

        System.out.println(votingMachine.getCount());


    }
}
