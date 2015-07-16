package com.maggioni.PartII.NumberFormatting;

import static java.lang.String.format;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Arrays;

/*
http://java67.blogspot.de/2015/06/how-to-add-comma-to-numbers-in-java.html
http://java67.blogspot.sg/2014/06/how-to-format-float-or-double-number-java-example.html
*/
public class NumberFormatDemo1 {

    public static void main(String[] args) {
        double[] numbers = {1.0, 1.2346, 1_234.56711, 12.345_678, 12345678};
        System.out.println(" double numbers : " + Arrays.toString(numbers));

        // Example 1 using NumberFormat
        System.out.println(" NumberFormat Example :");
        NumberFormat nf = NumberFormat.getInstance();
        nf.setGroupingUsed(true); // rounding and 3 dec places
        nf.setMaximumFractionDigits(2); // 2 dec places
        for (double number : numbers) {
            System.out.println(nf.format(number));
        }
        
        Arrays.stream(numbers)
                .forEach(d -> System.out.println(nf.format(d)));
        
        // Example 2 using DecimalFormat
        System.out.println(" DecimalFormat Example :");
        DecimalFormat df = new DecimalFormat("#,###.##");
        Arrays.stream(numbers)
                .forEach(d -> System.out.println(df.format(d)));
        
        DecimalFormat df2 = new DecimalFormat();
        df2.setGroupingSize(3);
        Arrays.stream(numbers)
                .forEach(d -> System.out.println(df2.format(d)));
        
        // Example 3 using prinf
        System.out.println(" printf Example :"); // do not print trailing zeros
        Arrays.stream(numbers)
                .forEach(d -> System.out.printf("%.2f\n", d)); // %.2f format  both Double and Float date type
        Arrays.stream(numbers)
                .forEach(d -> System.out.printf("%0,10.2f\n", d)); // ..
        
        // Example 4 format
        String format = format("%1f %2s", 1.234, "hello ");
        System.out.println(" " +  format);
        
        
    }

}
