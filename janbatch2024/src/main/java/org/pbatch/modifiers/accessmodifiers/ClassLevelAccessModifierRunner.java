package org.pbatch.modifiers.accessmodifiers;

import org.pbatch.modifiers.accessmodifiers.publicmodifier.PublicClass;
/*
 Only Default and Public access-modifiers work at class level.

 */
public class ClassLevelAccessModifierRunner {

    public static void main(String[] args) {
    //    DefaultClass defaultClass = new DefaultClass(); //java: cannot find symbol

        PublicClass publicClass = new PublicClass();
    }
}
