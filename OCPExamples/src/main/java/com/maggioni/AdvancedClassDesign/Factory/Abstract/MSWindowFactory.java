package com.maggioni.AdvancedClassDesign.Factory.Abstract;

import com.maggioni.AdvancedClassDesign.Factory.Interface.MSWindows;
import com.maggioni.AdvancedClassDesign.Factory.Interface.Window;

public class MSWindowFactory extends WindowAbstractFactory{

    @Override
    public Window getWindowInstance() {
        System.out.println("instance of MS windows");
        return new MSWindows();
    }

    

}
