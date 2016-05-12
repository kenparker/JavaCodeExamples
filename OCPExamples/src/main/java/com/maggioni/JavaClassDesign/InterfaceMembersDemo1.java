package com.maggioni.JavaClassDesign;

public interface InterfaceMembersDemo1 {

    String StringMethod();
    String STRINGCONSTANT = "Hello";
    
    class ClassInInterface {
        
        String methodABC() {
            return "I'm from ClassInInterface";
        }
    }
    
    
    interface InterfaceInInterface {
        String STRINGCONSTANT2 = "Hello from InterfaceInInterface";
        
        String StringMethod2();
    }
    
    static interface InterfaceInInterface2 {
        
    }
    
    interface InterfaceInInterface3 {
        
    }

}
