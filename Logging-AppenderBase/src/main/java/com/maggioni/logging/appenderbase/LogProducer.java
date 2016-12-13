package com.maggioni.logging.appenderbase;

import ch.qos.logback.classic.Logger;
import org.slf4j.LoggerFactory;

public class LogProducer { 
    private static final Logger logger = (Logger) LoggerFactory.getLogger("root.logproducer");
    
    public void logInfo() {
        logger.info("Info Message");
        logger.info("Hello {}", "Angelo");
    }
    
    public void logDebug() {
        logger.debug("Debug Message");
    }
}
