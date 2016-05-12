package com.maggioni.AdvancedClassDesign.Factory.Static;

import com.maggioni.AdvancedClassDesign.Factory.Implementations.MacOSXWindow;
import com.maggioni.AdvancedClassDesign.Factory.Interface.*;

public class WindowStaticFactory {

    static Window getWindowInstance(String windowType) {
        Window window;
        switch (windowType) {
            case "MS":
                window = new MSWindows();
                break;
            case "MAC":
                window = new MacOSXWindow();
                break;
            default:
                window = null;
        }
        return window;
    }
}
