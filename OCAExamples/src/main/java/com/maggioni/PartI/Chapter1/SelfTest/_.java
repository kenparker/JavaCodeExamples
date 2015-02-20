package com.maggioni.PartI.Chapter1.SelfTest;

import static java.lang.System.*;

public class _ {
    
    public static void main(String[] __A_V_) {
        String[] b = {"-","A","."};
        
        String $ = "";
        for (int x = 0; ++x < b.length; ) //tricky is here the ++x. This means adding 1 before the statement  
            $ += b[x]; // the elemt 0 = "-" is never used because the for loop start with the 1rst element
        out.println($);  // output : A.
    }

}
