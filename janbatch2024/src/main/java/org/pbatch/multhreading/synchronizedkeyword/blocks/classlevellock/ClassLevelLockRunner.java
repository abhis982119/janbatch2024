package org.pbatch.multhreading.synchronizedkeyword.blocks.classlevellock;

public class ClassLevelLockRunner {
/*
Assuming both salon have one payment counter
 */
    public static void main(String[] args) {
        Salon salon1 = new Salon();
        Salon salon2 = new Salon();

        new Thread(salon1::getHairCut).start();
        new Thread(salon2::getHairCut).start();




    }
}
