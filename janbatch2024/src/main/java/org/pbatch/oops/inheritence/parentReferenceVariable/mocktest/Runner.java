package org.pbatch.oops.inheritence.parentReferenceVariable.mocktest;

public class Runner {

    public static void main(String[] args) {
        A a = new A();
        a.m1();         //A-m1()
        a.m2();         //A-m2()

        A a1 = new B();
        a1.m1();        // b-m1()
        a1.m2();        // a-m2()
    //  a1.m3();        //compile time error

/*    //    B b = new A(); //compile time error : child class reference variable cannot hold parent class object
        b.m1();
        b.m2();
        b.m3();*/


        B b = new B();
        b.m1();       //b-m1()
        b.m2();       //a-m2()
        b.m3();       //b-m1()

    }

}

/*
----------                                                         ---------
main()                                                              HEAP
-----------                                                        ----------
String[] args                                                       123
-------                                                             B{ m1(), m3() , A-m2()  }
a1 = 123
a.m1()
-------

-------





 */
