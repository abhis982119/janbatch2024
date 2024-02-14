package org.pbatch.modifiers.accessmodifiers;

import org.pbatch.modifiers.accessmodifiers.defaultModifer.ClassWithDefaultMethod;
import org.pbatch.modifiers.accessmodifiers.privatemodifier.PrivateClass;
import org.pbatch.modifiers.accessmodifiers.protectedmodifier.ProctectedClass;
import org.pbatch.modifiers.accessmodifiers.publicmodifier.PublicClass;

public class MethodLevelAccessModifierRunner extends ProctectedClass {


    public static void main(String[] args) {

        PublicClass publicClass = new PublicClass();
        publicClass.m1();

        ProctectedClass proctectedClass = new ProctectedClass();
      //  proctectedClass.m1(); //java: m1() has protected access

        MethodLevelAccessModifierRunner runner = new MethodLevelAccessModifierRunner();
        runner.m1();

        ClassWithDefaultMethod defaultClass = new ClassWithDefaultMethod();
        // defaultClass.m1(); //java: m1() is not public
        defaultClass.m2();

        PrivateClass privateClass = new PrivateClass();
      //  privateClass.m1(); //java: m1() has private access

    }
}
