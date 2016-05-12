package com.maggioni.AdvancedClassDesign.Enum;

import   com.maggioni.AdvancedClassDesign.Enum.Better.Faster;
import static com.maggioni.AdvancedClassDesign.Enum.Better.Faster.Longer;
public class EnumDemo1 {

    public static void main(String[] args) {
        Better.Faster b = Better.Faster.Higher; // It do not need an import
        Faster c = Longer; // It works because of the Static import
        
        Better.Faster b2;
        b2 = Better.Faster.Higher;
    }

}

class Better {
    enum Faster {Higher, Longer};
    
    void doS() {
        Faster f = Faster.Higher;
        
        Faster g = Longer;
        
    }
}
