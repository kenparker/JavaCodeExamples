package com.maggioni.logging.appenderbase.threads.waitforcompletion;

import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.AppenderBase;
import java.util.LinkedList;
import java.util.List;
import org.slf4j.LoggerFactory;

public class LogInfoLauncher extends ThreadLauncher{

    private static final Logger logger = (Logger) LoggerFactory.getLogger("root.LogInfoLauncher");
    public static final InMemoryAppender appender = new InMemoryAppender();
    
    @Override
    protected void submitLogGenerator() {
        logger.info("submit");
        new LogInfoProducer().generateLog();
    }
    
    public static void main(String[] args) {
        logger.info("appender startet");
        appender.start();
        new LogInfoLauncher().doIt();
        logger.info(appender.log.toString());
        logger.info(" size :" + appender.getLogSize());
        
        appender.stop();
    }
    
    
     public static class InMemoryAppender extends AppenderBase<ILoggingEvent> {

        private List<ILoggingEvent> log = new LinkedList<>();

        public InMemoryAppender() {
            Logger logger = (Logger) LoggerFactory.getLogger("root");
            logger.info("InMemory");
            logger.addAppender(this);
        }

        @Override
        protected void append(ILoggingEvent e) {
            log.add(e);
        }

        @Override
        public String toString() {
            return "InMemoryAppender{" + "log=" + log + '}';
        }

        public int getLogSize() {
            return log.size();
        }

    }
}
