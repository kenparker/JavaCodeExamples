package com.maggioni.beta;

import org.apache.logging.log4j.*;

public class Demo2 {

    private static Logger log = LogManager.getLogger(Demo2.class.getName());
    
    public static void main(String[] args) {
        
        log.info("Info message");
        
        log.error("Error message");
        
        log.debug("Debug message");
        
        log.warn("Warning message");
    }
    
}
