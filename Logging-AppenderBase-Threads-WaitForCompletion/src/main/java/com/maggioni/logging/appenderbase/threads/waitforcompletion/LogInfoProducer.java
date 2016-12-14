package com.maggioni.logging.appenderbase.threads.waitforcompletion;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogInfoProducer {

    private static final Logger logger = LoggerFactory.getLogger("root.LogInfoProducer");
    
    public void generateLog() {
        logger.info("Info Message");
        logger.debug("Hello {}", "Angelo");
    }
    
    
}
