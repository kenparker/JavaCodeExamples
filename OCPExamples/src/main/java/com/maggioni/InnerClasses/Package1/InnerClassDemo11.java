package com.maggioni.InnerClasses.Package1;

public class InnerClassDemo11 {

    static int i;
    public class Inner1 {
        /*
        static members not allowed
        static int i;
        static class InnerStatic {         
        }
        */
    }
    
    interface InnerInt1 {     
    }
   
    public interface InnerInt2 {}
    protected interface InnerInt3 {}
    private interface InnerInt4 {}
    static interface InnerInt5 {}
    static enum InnerEnum {}
    
}
