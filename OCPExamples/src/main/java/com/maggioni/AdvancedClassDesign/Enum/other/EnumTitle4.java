package com.maggioni.AdvancedClassDesign.Enum.other;

import com.maggioni.AdvancedClassDesign.Enum.EnumTitle2;

public enum EnumTitle4 {
    AA;
    EnumTitle2 title2 = EnumTitle2.DR;
    
    protected class EnumClass5 {}
    protected enum EnumTitle41 {
        AWAWAW;
    }
    
    public enum EnumTitle5 {
        AABB;
        EnumTitle7 title7;
        EnumTitle51 title51;
        
        public enum EnumTitle51 {
            AAAAAAA;
        }
    }
    
    enum  EnumTitle6 {
        AABBCC, AABBDD;
        EnumTitle7 title7 = EnumTitle7.ABCD;
    }
    
    private enum EnumTitle7 {
        ABC, ABCD, ABCDE;
    }
}
