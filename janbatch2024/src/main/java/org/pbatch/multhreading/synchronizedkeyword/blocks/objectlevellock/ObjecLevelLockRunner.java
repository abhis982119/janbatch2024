package org.pbatch.multhreading.synchronizedkeyword.blocks.objectlevellock;

import org.pbatch.multhreading.synchronizedkeyword.blocks.classlevellock.Salon;

public class ObjecLevelLockRunner {


    public static void main(String[] args) {
        Salon salon = new Salon();

        new Thread(salon::getHairCut).start();
        new Thread(salon::getHairCut).start();
        new Thread(salon::getHairCut).start();
        new Thread(salon::getHairCut).start();

    }
}
