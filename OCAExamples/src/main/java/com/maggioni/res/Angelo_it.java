package com.maggioni.res;

import java.util.ListResourceBundle;

public class Angelo_it extends ListResourceBundle{
    private Object[][] listRB = {
        {"default", "default value from Angelo_it"}
    };

    @Override
    protected Object[][] getContents() {
        return listRB;
    }
    
}
