package com.maggioni.CollectionsAndGenerics.MostDifficults;

/*
1. - sign will left justify, + sign will put + because the number is positive, 5 specifies the width which causes an extra space AFTER  (because of left justification) the number. 4 is beyond the format specificate and is printed as is.

2. ( removes the -sign for negative numbers and puts them in parentheses. +10 is beyond the format specification so will be printed as it. Note that no summation is performed here.

3. The output shows a $ sign before the number, so it has to printed as is, which means it must come before the format specification. Next, the default precision for floating point numbers is 6, which causes 0's to be printed if the decimal part of the number is less than 6. We want only 2, so it has to be .2. Thus, the answer is $%.2f

4. It is straight forward. world is appended to str. So it must come after the format specification.

5 and 6. 2$ implies second argument. c implies a character. So the second argument must be ch. Similarly, first argument must be i1.


You need to remember the following rules for format specification:

1. The general syntax is %[arg_index$][flags][width][.precision]conversion char

2. A format specification must start with a % and end with a conversion char ( b boolean, c char,  d integer, f floating point, and s string). Anything before a % and after the conversion character is printed as it is. For example, printf("xxx%1$dyyy%2$dzzz", 10, 20) will be print xxx10yyy20zzz. Arg-index, flags, width, and .precision are all optional.

3. You need to remember the following flags:
	a. "-" Left justify this argument - Must specify width as well.
	b. "+" Include a sign (+ or -) with this argument - Applicable only if conversion char is d or f (i.e. for numbers).
	c. "0" Pad this argument with zeroes  - Applicable only if conversion char is d or f (i.e. for numbers). Must specify width as well.
	d. "," Use locale-specific grouping separators (i.e., the comma in 123,456)  - Applicable only if conversion char is d or f (i.e. for numbers).
	e. "(" Enclose negative numbers in parentheses  - Applicable only if conversion char is d or f (i.e. for numbers).


*/
public class StringProcessingVeryTough1 {

    public static void main(String[] args) {
        boolean b = true;
        int i1 = 100;
        int i2 = -200;
        double d = -23.20;
        char ch = 'm';
        String str = "hello";
        
        System.out.printf("\"%-+6d4\"\n", i1);  // "+100  4"
        System.out.printf("\"%+6d4\"\n", i1);   // "  +1004"
        System.out.printf("%-+6d4\n", i1);      // +100  4
        
        System.out.printf("\"%(d+10\"\n", i2);  // "(200)+10"
        
        System.out.printf("\"$%.2f\"\n", d);        // "$-23,20"
        System.out.printf("\"$%2f\"\n", d);         // "$-23,200000"
        System.out.printf("\"$%f\"\n", d);          // "$-23,200000"
        
        
        System.out.printf("\"%2$c + %1$d\"\n", i1, ch);          // "m + 100"
    }

}
