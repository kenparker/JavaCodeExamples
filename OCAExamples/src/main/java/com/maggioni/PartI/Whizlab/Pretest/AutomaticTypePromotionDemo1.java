package com.maggioni.PartI.Whizlab.Pretest;

import java.util.ArrayList;
import java.util.List;

public class AutomaticTypePromotionDemo1 {

    public static void main(String[] args) {
        byte b = 10;
        int i = 12;
        char c = 65;
        
        int res = b+c;
        System.out.println("b+c =" + res);
        
        long x = 10;
        float f = 10.3f;
        b = 8;
        float resf = b*x;
        double resd = b*x;
        
        StringBuilder sb = new StringBuilder(); // capacity of 16
        List ls = new ArrayList(); // capacity of ten
    }

}
