package org.pbatch.finalkeyword.finalvariable.withclass;

public class Runner {

    public static void main(String[] args) {
        Math math = new Math();
        System.out.println(math.complexOperation(2,5));

        NewMathClass newMathClass = new NewMathClass();
        System.out.println(newMathClass.complexOperation(2,5));
    }
}
