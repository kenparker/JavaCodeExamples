package com.maggioni.slf4j.example1;

import com.jcabi.log.Logger;

/**
 *
 * http://www.yegor256.com/2014/05/23/avoid-java-static-logger.html
 */
public class HelloDemo2 {
    
    public static void main(String[] args) {
        
        new HelloDemo2().bar(100);
    }
    
    void bar(int value) {
        Logger.debug(this, "method #bar(%d) was called", value);
        for (int i = 0; i < value; i++) {
            if (i % 2 == 0) {
                Logger.info(this,"Hello (%d)",i);
            } else {
                Logger.debug(this,"I'm on index (%d)",i);
            }
        }
    }
}
