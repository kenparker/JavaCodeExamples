package com.maggioni.res;

import java.util.ListResourceBundle;

public class Angelo_de extends ListResourceBundle{

    @Override
    protected Object[][] getContents() {
        return res;
    }
    
    private Object[][] res = {
        {"default", "default value from de"}
    };
}
