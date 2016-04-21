package com.maggioni.StringProcessing;

public class FormattingDemo5 {

    public static void main(String[] args) {
        int i1 = 100;
        double d1 = 12.3456789;
        System.out.printf("\"%-5d4\"\n",i1);        // "100  4"
        System.out.printf("\"%-+5d4\"\n",i1);       // "+100 4"
        //System.out.printf("\"%-+5d4\"\n",d1);       IllegalFormatConversionException (RunTimeError)
        System.out.printf("\"%f4\"\n",d1);       // "12,3450004"
        System.out.printf("\"%f\"\n",d1);       // "12,345679" (roundet to 6 decimals
        System.out.printf("\"%.3f\"\n",d1);       // "12,346" (roundet to 3 decimals
        //System.out.printf("\"%-.3f\"\n",d1);       // MissingFormatWidthException
        System.out.printf("\"%-8.3f\"\n",d1);       // "12,346  "
        System.out.printf("\"%8.3f\"\n",d1);       // "  12,346"
        System.out.printf("\"%+.3f\"\n",d1);       // "+12,346"
        //System.out.printf("\"%+.3c\"\n",d1);       // IllegalFormatPrecisionException
        //System.out.printf("\"%c\"\n",d1);       // java.util.IllegalFormatConversionException
        
        String s1 = "hello";
        System.out.printf("\"%s\"\n",s1);       // "hello"
        System.out.printf("\"%s\"\n",d1);       // "12.3456789"
        System.out.printf("\"%10.3s\"\n",d1);       // "       12."
        //System.out.printf("\"%,3s\"\n",d1);       // FormatFlagsConversionMismatchException
        System.out.printf("\"%s\"\n",i1);       // "100"
        System.out.printf("\"%5s\"\n",i1);       // "  100"
        
        
        boolean b = false;
        System.out.printf("\"%b\"\n",d1);       // "true"
        System.out.printf("\"%b\"\n",i1);       // "true"
        System.out.printf("\"%b\"\n",s1);       // "true"
        System.out.printf("\"%b\"\n",b);       // "false"
        //System.out.printf("\"%c\"\n",b);       // IllegalFormatConversionException
    }

}
