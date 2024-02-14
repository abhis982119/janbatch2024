package org.pbatch.modifiers.accessmodifiers.changingaccessmodifiers;

public class B extends A{



   /* private void m1(){  //attempting to assign weaker access privileges; was protected
        System.out.println("B-m1()");
    }*/

    public void m2(){
        System.out.println("B-m2()");
    }
}
