package com.maggioni.AdvancedClassDesign.Factory.Interface;

public class MSWindows implements Window{

    @Override
    public void setTitle(String title) {
        System.out.println("setTible() from MSWindows");
    }

    @Override
    public void repaint() {
        System.out.println("repaint() from MSWindows");
    }
    
}
