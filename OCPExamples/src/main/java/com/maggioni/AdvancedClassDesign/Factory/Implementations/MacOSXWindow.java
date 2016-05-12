package com.maggioni.AdvancedClassDesign.Factory.Implementations;

/*
import is needed as WIndow is in another package
*/
import com.maggioni.AdvancedClassDesign.Factory.Interface.*;

public class MacOSXWindow implements Window{

    @Override
    public void setTitle(String title) {
        System.out.println("setTitle() from MacOSXWindow");
    }

    @Override
    public void repaint() {
        System.out.println("setTitle() from MacOSXWindow");
    }
    
}
