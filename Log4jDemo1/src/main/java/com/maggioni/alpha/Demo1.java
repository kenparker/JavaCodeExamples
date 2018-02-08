package com.maggioni.alpha;

import org.apache.logging.log4j.*;

public class Demo1 {

    private static Logger log = LogManager.getLogger(Demo1.class.getName());
    
    public static void main(String[] args) {
        
        log.info("Info message");
        
        log.error("Error message");
        
        log.debug("Debug message");
        
        log.warn("Warning message");
    }
    
}
