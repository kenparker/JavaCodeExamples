package com.maggioni.PartI.Chapter2.Examples;

import static com.maggioni.PartI.Chapter2.Examples.xcom.Stuff.*;
import static java.lang.System.out;

public class User {

    public static void main(String[] args) {
        new User().go3();
        go2(); // work static member called
        // new User().go2; does not work because go2() is a static member
    }
    //void go() {out.println(doStuff(MY_CONSTANT));} do not compile because doStuff() and MY_CONSTANt has default access
    void  go3() {out.println(doStuff2(MY_CONSTANT2));}
    static void go2() {}
    
}
