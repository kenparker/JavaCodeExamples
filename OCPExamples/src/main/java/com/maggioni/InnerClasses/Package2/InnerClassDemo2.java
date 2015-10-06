package com.maggioni.InnerClasses.Package2;

import com.maggioni.InnerClasses.Package1.OuterClass;

public class InnerClassDemo2 {

    public static void main(String[] args) {
        
    }

    void doSonthing() {
        OuterClass.PublicInnerClass ic = new OuterClass().new PublicInnerClass();
        // no variable available from PublicInnerClass
        
    }
}

class InnerClassDemo3 extends OuterClass{
    
    void doThat() {
        OuterClass oc = new OuterClass();
        OuterClass.PublicInnerClass ic = oc.new PublicInnerClass();
        ic.publicInnerClassMember();
        super.p = "protected variable access with super";
        this.p = "protected variable access with this";
        
        InnerClassDemo3 icd3 = new InnerClassDemo3();
        InnerClassDemo3.InnerClass icd3in = icd3.new InnerClass(); // It works only because the constructor is public and the class is protected
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
