package com.maggioni.CollectionsAndGenerics.MostDifficults;

public class StringProcessingToughDemo1 {

    public static void main(String[] args) {
        System.out.printf("%1$s %s %<s %3$s %s","A","B","C");
        // -> A A A C B
        
        /*
        There are two things here:
        1. When you don't specify the argument index or relative indexing (i.e. the < flag) in the format specifier, 
        it means that you are using ordinary indexing. 
        Each format specifier that uses ordinary indexing is assigned a sequential implicit index into argument list which is independent of the indices used by explicit or relative indexing.

        The ordinary index starts with the first format specifier that does not use explicit index.

        In this case,  it starts with the middle %s. Therefore, it prints the first argument which is A.

        2. < is used for relative indexing. It means you want to use the argument that was used for the previous format specifier. 
        In this case, it was A. Therefore, it prints A again.

        This is explained further here: http://docs.oracle.com/javase/7/docs/api/java/util/Formatter.html
        
        You need to remember the following rules for format specification:  
        1. The general syntax is %[arg_index$][flags][width][.precision]conversion char Argument numbering starts with 1 (not 0). 
        So to print the first argument, you should use 1$ (if you are using explicit ordering).  
        2. A format specification must start with a % and end with a conversion char ( b boolean, c char,  d integer, f floating point, and s string). 
        Anything before a % and after the conversion character is printed as it is. 
        For example, printf("xxx%1$dyyy%2$dzzz", 10, 20) will be print xxx10yyy20zzz. Arg-index, flags, width, and .precision are all optional.  
        3. You need to remember the following flags:     
        a. "-" Left justify this argument - Must specify width as well.     
        b. "+" Include a sign (+ or -) with this argument - Applicable only if conversion char is d or f (i.e. for numbers).     
        c. "0" Pad this argument with zeroes  - Applicable only if conversion char is d or f (i.e. for numbers). Must specify width as well.     
        d. "," Use locale-specific grouping separators (i.e., the comma in 123,456)  - Applicable only if conversion char is d or f (i.e. for numbers).     
        e. "(" Enclose negative numbers in parentheses  - Applicable only if conversion char is d or f (i.e. for numbers). 
        */
    }

}
