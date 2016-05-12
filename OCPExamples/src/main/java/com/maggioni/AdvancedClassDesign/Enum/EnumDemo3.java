package com.maggioni.AdvancedClassDesign.Enum;

import static com.maggioni.AdvancedClassDesign.Enum.EnumTitle1.MR;
import          com.maggioni.AdvancedClassDesign.Enum.other.EnumTitle4;
import          com.maggioni.AdvancedClassDesign.Enum.other.EnumTitle4.EnumTitle5;
import static   com.maggioni.AdvancedClassDesign.Enum.other.EnumTitle4.AA;

public class EnumDemo3 {

    EnumTitle1 title1 = EnumTitle1.MR;
    EnumTitle1 title2;    
    EnumTitle4 title4;
    EnumTitle4.EnumTitle5 title5;
    EnumTitle5 title51;
    
    public static void main(String[] args) {
        EnumDemo3 enumDemo3 = new EnumDemo3();
        enumDemo3.callMethodFromEnum();       
        enumDemo3.initializeEnumVariable();
        enumDemo3.printValues();
        
        
        String staticMemb = EnumTitle1.staticMemb();
        System.out.println(" " + staticMemb);
    }

    void initializeEnumVariable() {
        title1 = EnumTitle1.MRS;
        
        title2 = MR;            // work because of Import
        title2 = EnumTitle1.MR;
        //title2 = new EnumTitle1("Mr.");  // do not compile
        
        
        System.out.println(" " + EnumTitle1.valueOf("MR"));
        
        title4 = EnumTitle4.AA;
        title4 = AA;
        
        title5 = EnumTitle5.AABB;
        title51 = EnumTitle4.EnumTitle5.AABB;
         
        
        
    }

    private void callMethodFromEnum() {
        //String format = title2.format("hello", "there"); // java.lang.NullPointerException
        title2 = EnumTitle1.MS;
        String format = title2.format("hello", "there");
        System.out.println(" " +  format);
    }
    
    void printValues() {
        System.out.println("print eNum Values");
        for (EnumTitle1 val : title2.values()) {
            System.out.println(" " +  val);
        }
    }
}
