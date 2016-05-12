package com.maggioni.AdvancedClassDesign.Factory.Abstract;

import com.maggioni.AdvancedClassDesign.Factory.Interface.Window;

public class GUIBilder {

    public void buildWindow(WindowAbstractFactory waf) {
        Window windowInstance = waf.getWindowInstance();
        windowInstance.setTitle("Helloooo");
    }
    
}
