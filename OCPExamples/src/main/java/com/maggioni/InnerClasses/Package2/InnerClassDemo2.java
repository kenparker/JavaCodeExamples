package com.maggioni.InnerClasses.Package2;

import com.maggioni.InnerClasses.Package1.OuterClassDemo1;

public class InnerClassDemo2 {

    public static void main(String[] args) {
        
    }

    void doSonthing() {
        OuterClassDemo1.PublicInnerClass ic = new OuterClassDemo1().new PublicInnerClass();
        // no variable available from PublicInnerClass
        
    }
}

class InnerClassDemo3 extends OuterClassDemo1{
    
    void doThat() {
        OuterClassDemo1 oc = new OuterClassDemo1();
        OuterClassDemo1.PublicInnerClass ic = oc.new PublicInnerClass();
        ic.publicInnerClassMember();
        super.p = "protected variable access with super";
        this.p = "protected variable access with this";
        
        InnerClassDemo3 icd3 = new InnerClassDemo3();
        InnerClassDemo3.ProtectedInnerClass icd3in = icd3.new ProtectedInnerClass(); // It works only because the constructor is public and the class is protected
                                                                    // if the class was not protected (default access) it does not work                                                                        
    }
    
    class InnerClassDemo21 extends PublicInnerClass {
       
        void dooo() {
            this.protVar = "now I can see you";
            super.protVar = "with super";
            this.protInnerClassMember();
         }
       
    }
}
