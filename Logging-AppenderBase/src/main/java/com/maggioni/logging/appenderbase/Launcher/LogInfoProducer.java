package com.maggioni.logging.appenderbase.Launcher;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogInfoProducer extends LogProducerBase{

    private static final Logger logger = LoggerFactory.getLogger(LogInfoProducer.class);
    
    @Override
    public void generateLog() {
        logger.info("Info Message");
        logger.info("Hello {}", "Angelo");
    }
    
    
}
