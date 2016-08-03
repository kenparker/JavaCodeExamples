package com.maggioni.Boxing;

public class WrapperClassWideningDemo1 {

    int i;
    
    void devide(Double D){
        
        double w = D/i;
        System.out.println(w);
        System.out.println(D/i);
    }
    public static void main(String[] args) {
        Double d1 = 123.34;
        WrapperClassWideningDemo1 wc = new WrapperClassWideningDemo1();
        wc.devide(d1);
        
        Float f1 = 12.34f;
        //wc.devide(f1);    // compile error
        
        float f2 = 12.23f;
        //wc.devide(f2);    // compile error
    }

}
