package com.maggioni.res;

import java.util.ListResourceBundle;

public class Angelo_it_IT extends ListResourceBundle{

    

    @Override
    protected Object[][] getContents() {
        return new Object[][] {{"hello", new StringBuilder("ciao")}};
    }

}
