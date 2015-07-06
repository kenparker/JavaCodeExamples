package com.maggioni.PartI.Whizlab.Pretest.Package2;

import com.maggioni.PartI.Whizlab.Pretest.Package1.InterfA;   // import needed as in another package
//import com.maggioni.Whizlab.Pretest.Package1.InterfDefaultAccess; // do not compile as Method not public and in another package

public class ClassImplementingInterfaceDemo2 implements InterfA/*,InterfDefaultAccess*/{

    public static void main(String[] args) {
        
    }

    @Override
    public void methodA() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void methodB() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
