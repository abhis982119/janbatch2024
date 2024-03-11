package org.pbatch.multhreading.synchronizedkeyword.methods.objectlevellock.examples;

import org.pbatch.multhreading.synchronizedkeyword.methods.model.Washroom;

public class TwoObjectTwoThreadAccessRunner {


    public static void main(String[] args) {
        Washroom washroom = new Washroom();
        Washroom washroom1 = new Washroom();


        new Thread(washroom::useToilet).start();
        new Thread(washroom::useToilet).start();


        new Thread(washroom1::useToilet).start();
        new Thread(washroom1::useToilet).start();


    }
}
