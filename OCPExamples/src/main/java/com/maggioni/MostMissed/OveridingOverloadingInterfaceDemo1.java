package com.maggioni.MostMissed;

import java.io.IOException;
import java.sql.SQLException;

public class OveridingOverloadingInterfaceDemo1 implements T1,T2{

    public static void main(String[] args) {
       // System.out.println(""+VALUE); // do not compile; reference ambiguos
       System.out.println(""+T1.VALUE); // works print -> 1
       System.out.println(""+T2.VALUE); // works print -> 2
       
       OveridingOverloadingInterfaceDemo1 c = new OveridingOverloadingInterfaceDemo1();
        System.out.println(""+((T1)c).VALUE); // print -> 1
    }

    @Override
    public void m1()  {
        // do a lot of stuff
    }

}

interface T1 {
    int VALUE = 1;
    void m1() throws IOException;
}

interface T2 {
    int VALUE = 2;
    void m1() throws SQLException;
}