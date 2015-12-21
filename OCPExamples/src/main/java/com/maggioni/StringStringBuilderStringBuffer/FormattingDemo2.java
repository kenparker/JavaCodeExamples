package com.maggioni.StringStringBuilderStringBuffer;

public class FormattingDemo2 {

    public static void main(String[] args) {
        double num1 = 7.12345678;
        int num2 = (int) 8.12345678;
        System.out.printf("num1=%f, num2=%2d, %b \n", num1, num2, num2);
        System.out.printf("num1=%f, num2=%d, %b \n", num1, num2, num2);
    }

}
