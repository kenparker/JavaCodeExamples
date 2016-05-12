package com.maggioni.AdvancedClassDesign.Factory.Abstract;



public class ClientAbstractFactoryDemo1 {

    public static void main(String[] args) {

        String platform = "MS";
        
        WindowAbstractFactory waf = null;
        switch(platform) {
            case "MS": waf = new MSWindowFactory();
        }
        
        GUIBilder gui = new GUIBilder();
        gui.buildWindow(waf);
    }

}
