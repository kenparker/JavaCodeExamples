
package com.maggioni.res;

import java.util.ListResourceBundle;


public class Angelo extends ListResourceBundle{

    @Override
    protected Object[][] getContents() {
        return new Object[][] {
            {"default", "default value"},
            {"hello", "hello from Angelo"},
            {"label","labelname"}
        };
    }
    
}
