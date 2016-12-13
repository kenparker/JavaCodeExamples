package com.maggioni.logging.appenderbase.Launcher;


import ch.qos.logback.classic.Logger;
import org.slf4j.LoggerFactory;

public class LogInfoProducer extends LogProducerBase{

    private static final Logger logger = (Logger) LoggerFactory.getLogger("root.loginfoproducer");
    
    @Override
    public void generateLog() {
        logger.info("Info Message");
        logger.info("Hello {}", "Angelo");
    }
    
    
}
