package org.pbatch.multhreading.synchronizedkeyword.methods.objectlevellock.examples;

import org.pbatch.multhreading.synchronizedkeyword.methods.model.Washroom;

public class SingleObjectTwoThreadAccesss {

    public static void main(String[] args) {
        Washroom washroom = new Washroom();

        //new Thread(() -> washroom.useToilet()).start();
        new Thread(washroom::useToilet).start();
        new Thread(washroom::useToilet).start();
        new Thread(washroom::useToilet).start();
    }
}
