package com.maggioni.PartI.Whizlab.Pretest.WorkingWithMethodsAndEncapsulation.second;

import com.maggioni.PartI.Whizlab.Pretest.WorkingWithMethodsAndEncapsulation.first.AA;

public class BB extends AA{

    int x = j;
    public static void main(String[] args) {
        AA a = new AA();
        // a.j does not work as it is a protected variable in another package
        
        AASon ab = new AASon();
        System.out.println("" + ab.getJ()); // this is a way to overrule the protected access of the vaiable j
    }

}
