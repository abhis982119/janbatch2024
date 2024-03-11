package org.pbatch.multhreading.synchronizedkeyword.methods.classlevellock.examples;

import org.pbatch.multhreading.synchronizedkeyword.methods.model.Washroom;

public class MultipleObjects {

    public static void main(String[] args) {
        Washroom washroom1 = new Washroom();
        Washroom washroom2 = new Washroom();

        new Thread(washroom1::useToilet).start();
        new Thread(washroom2::useToilet).start();

      //  new Thread(Washroom::getSoap).start();
        new Thread(() -> washroom1.getSoap()).start();
        new Thread(() -> washroom2.getSoap()).start();
    }
}
