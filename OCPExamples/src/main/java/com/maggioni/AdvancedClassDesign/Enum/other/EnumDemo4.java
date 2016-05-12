package com.maggioni.AdvancedClassDesign.Enum.other;

import com.maggioni.AdvancedClassDesign.Enum.EnumTitle2;
import static com.maggioni.AdvancedClassDesign.Enum.EnumTitle2.DR;
import com.maggioni.AdvancedClassDesign.Enum.other.EnumTitle4.EnumClass5;

public class EnumDemo4{

    // EnumTitle1 title1;       // DO not Compile
    EnumTitle2 title1;
    EnumTitle4.EnumTitle5 title5;
    EnumTitle4.EnumTitle6 title6;
    EnumTitle4.EnumTitle41 title41;
    
    EnumClass5 enumClass5;
    
    public static void main(String[] args) {
        EnumDemo4 demo4 = new EnumDemo4();
        
    }
    
    void doSomething1() {
        title1 = EnumTitle2.DR;
        title1 = DR;
        title5.title51 = EnumTitle4.EnumTitle5.EnumTitle51.AAAAAAA;
        title5.title51 = EnumTitle4.EnumTitle5.EnumTitle51.AAAAAAA;
    }

}
