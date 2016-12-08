package com.maggioni.logging.appenderbase;

import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.AppenderBase;
import java.util.LinkedList;
import java.util.List;
import org.junit.AfterClass;
import org.junit.Test;
import org.junit.BeforeClass;
import org.slf4j.LoggerFactory;

public class LogProducerTest {
    private static final InMemoryAppender appender = new InMemoryAppender();
    private static LogProducer instance = new LogProducer();

    @BeforeClass
    public static void setUp() {
        appender.start();
    }

    @AfterClass
    public static void tearDown() {
        System.out.println(appender.toString());
        appender.stop();
    }

    @Test
    public void testLogInfo() {
        instance.logInfo();
    }

    @Test
    public void testLogDebug() {
        instance.logDebug();
    }

    private static class InMemoryAppender extends AppenderBase<ILoggingEvent> {

        private List<ILoggingEvent> log = new LinkedList<>();

        public InMemoryAppender() {
            Logger logger = (Logger) LoggerFactory.getLogger("root");
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

    }
}
