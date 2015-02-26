package com.maggioni.slf4j.example1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * http://java.dzone.com/articles/how-configure-slf4j-different
 */
public class HelloDemo1 {

    private final static Logger LOGGER = LoggerFactory.getLogger(HelloDemo1.class);
   
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                LOGGER.info("Hello {}",i);
            } else {
                LOGGER.debug("I'm on index {}",i);
            }
        }
    }
    
}
