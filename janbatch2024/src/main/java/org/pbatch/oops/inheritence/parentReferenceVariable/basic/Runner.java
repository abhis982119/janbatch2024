package org.pbatch.oops.inheritence.parentReferenceVariable.basic;

public class Runner {

    public static void main(String[] args) {
  /*      A a = new A();
        a.m1();   // A-m1()
*/
   /*     B b = new B();
        b.m1();  // B-m1()    //override
        b.m2();  // B-m2()*/

        A a = new B();
        a.m1();  // B-m1()
    //  a.m2();  // compilation error
        B b  = (B) a;
        b.m2();

     /*   B b = new A();             //compile time error
        b.m1();   // a.m1(), b.m1()
        b.m2();   // b.m2()*/
    }
}
