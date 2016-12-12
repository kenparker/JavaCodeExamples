package com.maggioni.logging.appenderbase;

import com.maggioni.logging.appenderbase.Launcher.LogInfoLauncher;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.AppenderBase;
import java.util.LinkedList;
import java.util.List;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.LoggerFactory;

public class LogProducerTest {

    private final InMemoryAppender appender = new InMemoryAppender();
    private static LogProducer instance = new LogProducer();

    @Before
    public void setUp() {
        appender.start();
    }

    @After
    public void tearDown() {
        System.out.println(appender.toString());
        appender.stop();
    }

    @Test
    public void testLogInfo() {
        instance.logInfo();
        Assert.assertEquals(2, appender.getLogSize());
    }

    @Test
    public void testLogDebug() {
        instance.logDebug();
        Assert.assertEquals(1, appender.getLogSize());
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

        public int getLogSize() {
            return log.size();
        }

    }
}
