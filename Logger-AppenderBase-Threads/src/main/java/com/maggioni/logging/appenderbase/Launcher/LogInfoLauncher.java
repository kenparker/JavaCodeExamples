package com.maggioni.logging.appenderbase.Launcher;

import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.AppenderBase;
import java.util.LinkedList;
import java.util.List;
import org.slf4j.LoggerFactory;

public class LogInfoLauncher extends ThreadLauncher{

    @Override
    public void submitLogGenerator() {
        this.es.execute(new LogInfoProducer());
    }
    
    public static void main(String[] args) {
        final InMemoryAppender appender = new InMemoryAppender();
        appender.start();
        new LogInfoLauncher().submitThreads();
        System.out.println(appender.log.toString());
        System.out.println(" size :" + appender.getLogSize());
        
        appender.stop();
    }
    
    
     private static class InMemoryAppender extends AppenderBase<ILoggingEvent> {

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
