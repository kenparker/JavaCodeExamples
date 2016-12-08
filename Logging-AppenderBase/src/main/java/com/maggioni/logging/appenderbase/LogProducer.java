package com.maggioni.logging.appenderbase;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogProducer { 
    private static final Logger logger = LoggerFactory.getLogger(LogProducer.class);
    
    public void logInfo() {
        logger.info("Info Message");
        logger.info("Hello {}", "Angelo");
    }
    
    public void logDebug() {
        logger.debug("Debug Message");
    }
}
