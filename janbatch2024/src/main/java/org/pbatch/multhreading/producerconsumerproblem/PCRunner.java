package org.pbatch.multhreading.producerconsumerproblem;

public class PCRunner {

    public static void main(String[] args) {
        PC pc = new PC();

        new Thread(pc::produce).start();
        new Thread(pc::consume).start();
    }
}
