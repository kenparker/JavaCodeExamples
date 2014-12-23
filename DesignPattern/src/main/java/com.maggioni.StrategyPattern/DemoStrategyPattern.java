package com.maggioni;

/**
 *
 * http://java67.blogspot.de/2014/12/strategy-pattern-in-java-with-sample.html
 */
public class DemoStrategyPattern {

    public static void main(String[] args) {
       
        int[] var = {5,4,3,6};
        
        Context ctx = new Context(new BubbleSort());
        ctx.arrange(var);
        
    }
    
}
