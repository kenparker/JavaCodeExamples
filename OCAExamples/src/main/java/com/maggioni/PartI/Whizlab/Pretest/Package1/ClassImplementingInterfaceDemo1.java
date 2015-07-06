package com.maggioni.PartI.Whizlab.Pretest.Package1;

public class ClassImplementingInterfaceDemo1 implements InterfA, InterfDefaultAccess{

    public static void main(String[] args) {
        
    }

    @Override
    public void methodA() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    /* the following code will not compile because the method signature is the same as the previous method with the same name
    public String methodA() {
    }
    */

    public String methodA(String s) {
        methodA();
        return s;
    }
    
    @Override
    public void methodB() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void methodC() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
