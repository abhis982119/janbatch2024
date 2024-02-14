package org.pbatch.modifiers.accessmodifiers.runnerpackage;

import org.pbatch.modifiers.accessmodifiers.protectedmodifier.A;

public class ProtectedClassUsageRunner {

    public static void main(String[] args) {
        B b = new B();
        //  b.m1(); //  m1() has protected access
        b.callParentm1();


        C c = new C();
        c.callParentm1();

    }
}
