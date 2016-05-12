package com.maggioni.JavaClassDesign;

import com.maggioni.JavaClassDesign.InterfaceMembersDemo1.InterfaceInInterface;

public class InterfaceDemo1 implements InterfaceMembersDemo1, InterfaceInInterface{

    public static void main(String[] args) {
        ClassInInterface cii = new ClassInInterface();
        String methodABC = cii.methodABC();
        System.out.println(""+methodABC);
    }

    @Override
    public String StringMethod() {
        return "I'm from InterfaceDemo1";
    }

    @Override
    public String StringMethod2() {
        return "I'm from StringMethod2";
    }

    
}
