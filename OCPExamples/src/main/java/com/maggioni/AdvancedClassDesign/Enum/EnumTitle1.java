package com.maggioni.AdvancedClassDesign.Enum;

enum EnumTitle1 {

    MR("Mr."), MRS("Mrs."), MS("Ms.");

    private String title;

    private EnumTitle1(String s) {
        this.title = s;
    }

    public String format(String first, String last) {
        return title+ " "+first+" "+last;
    }
    
    static String staticMemb() {
        return "static";
    }
}
