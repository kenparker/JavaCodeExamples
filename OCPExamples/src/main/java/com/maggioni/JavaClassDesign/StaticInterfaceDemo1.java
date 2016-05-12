package com.maggioni.JavaClassDesign;

public class StaticInterfaceDemo1 {

    public static void main(String[] args) {
        
        InnerClassDemo innerClassDemo = new StaticInterfaceDemo1().new InnerClassDemo();
        innerClassDemo.method();
    }

    static interface StaticInt {
        String XYZ = "Hello";
        void method();
    }
    
    class InnerClassDemo implements StaticInt {

        @Override
        public void method() {
            System.out.println("do something "+XYZ);
        }
        
    }
}
