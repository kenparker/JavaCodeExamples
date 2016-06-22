package com.maggioni.AdvancedClassDesign.Enum;

public enum EnumQ21 {

    ASSERT(1.4),            // need a constructor with a double
    DO, IF, WHILE;          // need a constructor without parameters
    double version = 1.0;

    EnumQ21() {
        this.version = 1.0;
    }

    EnumQ21(double version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "EnumQ21{" + "version=" + version + " name=" + this.name() + " ordinal=" + this.ordinal() + '}';
    } 
    
    public static void main(String args[]) {
        EnumQ21[] keywords = EnumQ21.values();
        for (EnumQ21 keyword : keywords) {
            System.out.println(keyword + " " +  keyword.name() + " " +  keyword.version +  " " +  keyword.toString());
        }
        
        EnumQ21 valueOf = valueOf("WHILE");
        
        System.out.println("valueOf(\"WHILE\")=" +  valueOf);
        valueOf = ASSERT;
        System.out.println("ASSERT=" +  valueOf);
    }
}
