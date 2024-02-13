package org.pbatch.classelements.method.staticmethod.methodchaining;

/*
 Area                          Can Access
 Static Context Area   :  Static Context Area

 Instance Context Area :   Static Context Area
                           Instance Context Area

 */
public class A {

  private int instanceVariable;

    public static  void m1(){  //static method
        System.out.println("A-m1()");
       // m2();  //non-static method m2() cannot be referenced from a static context
        System.out.println("A-m1()");
    }

    public  void m2(){  // instance method
        System.out.println("A-m2()");
        System.out.println("A-m1() ");
        m3();
        System.out.println("A-m2()");
    }

    public static void m3(){ //static method
        System.out.println("A-m3()");
    }
}
