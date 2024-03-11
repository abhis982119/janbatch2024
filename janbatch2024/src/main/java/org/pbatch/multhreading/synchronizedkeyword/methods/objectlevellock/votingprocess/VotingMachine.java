package org.pbatch.multhreading.synchronizedkeyword.methods.objectlevellock.votingprocess;

import lombok.Getter;

@Getter
public class VotingMachine {

    private  int count = 0;

    public synchronized void castVote(){
        int currentValue = count;  //tx, ty
        count = currentValue +1;
    }


}
