package org.pbatch.multhreading.synchronizedkeyword.methods.objectlevellock.examples;

import org.pbatch.multhreading.synchronizedkeyword.methods.model.Washroom;

/*
Object level lock : takes lock of entire synchronized area

 */
public class SameObjectDifferentSynchronizedMethodAccessRunner {

    public static void main(String[] args) {
        Washroom washroom = new Washroom();

        new Thread(washroom::useToilet).start();
        new Thread(washroom::useToilet).start();
        new Thread(washroom::useJetSpray).start();
    }
}
