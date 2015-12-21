package com.maggioni.StringStringBuilderStringBuffer;

public class FormattingDemo3 {

    public static void main(String[] args) {
        String eJava = "Guru";
        Integer start = 100;
        int i = 100;
        boolean win = true;
        Float duration = new Float(-1099.9999);
        
        //System.out.format("%d", eJava); // runtime error IllegalFormatConversionException
        System.out.printf("%5s %s \n", start, i);
        System.out.printf("left aligned: [%-12b]\n", win);
        System.out.printf("right aligned: [%12b]\n", win);
        System.out.format("%s12\n", eJava);
        //System.out.format("%d\n", duration); // runtime error
        System.out.format("[%+,-(20f]\n", duration);
        System.out.format("[%+,(20f]\n", duration);
    }

}
