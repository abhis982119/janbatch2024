package org.pbatch.classelements.method.methodstack;

public class A {

    private int instanceVariable;

    public void m1(){
        int a = 10;
        System.out.println("A-m1() with value : " + a);
        m2();
        System.out.println("A-m1() ends ");
    }

    public void m2(){
        System.out.println("A-m2()");
    }

/*

Stack                                                Heap
-------          ---------         --------       ---------
main()             m1()               m2()       9877678
------           ---------         ---------     A{ instanceVariable = 0, m1()}

------           -----------       ---------
String[]          int a=10
args

a=9877678
------           -----------       --------
a.m1()
7 ---->             11      ----->

------           -----------       -------
          <-----   void          <---- void
------          -----------        -------


 */


}
