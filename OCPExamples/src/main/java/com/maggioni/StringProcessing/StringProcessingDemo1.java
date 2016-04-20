package com.maggioni.StringProcessing;

public class StringProcessingDemo1 {

    public static void main(String[] args) {
        String[] split = "name:john;;sex:m;;".split(";");
        for (String split1 : split) {
            System.out.println(split1);
        }
    }

}
