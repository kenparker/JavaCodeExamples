package com.maggioni.MostMissed.PracticeTestII;

import java.util.Enumeration;
import java.util.ResourceBundle;

public class ResourceBundlesDemo1 extends ResourceBundle{

    public static void main(String[] args) {
        
    }

    @Override
    protected Object handleGetObject(String key) {
        return new Object();
    }

    @Override
    public Enumeration<String> getKeys() {
        return null;
    }

}
