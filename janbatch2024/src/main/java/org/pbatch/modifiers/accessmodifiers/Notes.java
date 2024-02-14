package org.pbatch.modifiers.accessmodifiers;
/*
    public > proctected > default > private


    We cannot assign weaker access privilege on overridden method

 */

/*
class level : Default , Public
Impact area : import / class visibility


method level : public, protected, default, private
1. Default : Access with the package only

2. Protected : With the package  + child classes in other packages ( )
               ( For access with reference_var : projected methods properties/behavior from parent work as a private member of the child class)
               ( But if we inherit the class which inherited the proctected properties/behaviour then those behavior and properties will be propogated to the child class  )

3. Default : Access within the package

4. Private : Access within the class only

 */


public class Notes {
}
