package com.maggioni.AdvancedClassDesign.Factory.Static;

import com.maggioni.AdvancedClassDesign.Factory.Interface.Window;

public class ClientStaticFactoryDemo1 {

    public static void main(String[] args) {
        Window window = WindowStaticFactory.getWindowInstance("MS");
        window.setTitle("Hello");
        window.repaint();
    }

}
