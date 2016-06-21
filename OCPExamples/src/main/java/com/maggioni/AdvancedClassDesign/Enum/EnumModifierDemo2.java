package com.maggioni.AdvancedClassDesign.Enum;

import com.maggioni.AdvancedClassDesign.Enum.EnumModifierDemo2.EnumInner1;

public class EnumModifierDemo2 {

    EnumInner2 e2;
    EnumInner1 e1;
    
    enum EnumInner1 {
       I1A,I1B,I1C 
    }
    
    private enum EnumInner2 {
        I2A,I2B,I2C
    }
    
    protected enum EnumInner3 {
        I3A,I3B,I3C
    }
    
    public enum EnumInner4 {
        I4A,I4B,I4C
    }
}

class EnumModifierTest1 {
    
    EnumInner1 e1;
    EnumModifierDemo2.EnumInner3 e3;
    EnumModifierDemo2.EnumInner4 e4;
    
}
