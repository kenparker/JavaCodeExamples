package com.maggioni.PartI.Whizlab.PracticeTestIII;
/*
http://docs.oracle.com/javase/7/docs/technotes/guides/language/underscores-literals.html
*/
public class UnderscoreLiteralDemo1 {

    public static void main(String[] args) {
            int _5 = 10;
            int x = _5;
            System.out.println(_5/x);
            int x4 = 5_______2;
            double d1 = 1.22;
            d1 = 1.33d;
            d1 = 1.3_3;
            d1 = 1_1.3_3;
            System.out.println("x4 :"+x4);
            
            int i = 10, y = 21;
            System.out.println(" "+i+y+"");
            System.out.println(i+y+" ");
                 
            
    }

}
