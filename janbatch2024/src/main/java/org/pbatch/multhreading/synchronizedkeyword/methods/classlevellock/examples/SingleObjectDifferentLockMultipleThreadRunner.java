package org.pbatch.multhreading.synchronizedkeyword.methods.classlevellock.examples;

import org.pbatch.multhreading.synchronizedkeyword.methods.model.Washroom;

public class SingleObjectDifferentLockMultipleThreadRunner {


    public static void main(String[] args) {
        Washroom washroom = new Washroom();

        new Thread(washroom::useToilet).start();
        new Thread(washroom::useToilet).start();


        new Thread(Washroom::getSoap).start();
    }
}
