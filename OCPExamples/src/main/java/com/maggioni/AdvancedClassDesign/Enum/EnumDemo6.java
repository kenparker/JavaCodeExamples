package com.maggioni.AdvancedClassDesign.Enum;

import com.maggioni.AdvancedClassDesign.Enum.Better2.Faster;

public class EnumDemo6 {
    public static void main(String[] args) {
        Better2.Faster f1 = Faster.Higher;
        Faster f2 = Faster.Higher;
        Faster f3 = Faster.Longer;
        
        Better2 b;
        Faster f;
        /*
        DO not compile
        b.f g = Faster.Longer;
        */
    }
}

class Better2 {
    enum Faster {
        Higher, Longer
    }
}
