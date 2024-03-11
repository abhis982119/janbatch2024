package org.pbatch.multhreading.synchronizedkeyword.methods.objectlevellock.votingprocess;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class VotingBooth {


    private VotingMachine votingMachine;


    public void castVote(){
        votingMachine.castVote();
    }

}
