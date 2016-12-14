package com.maggioni.logging.appenderbase.threads.waitforcompletion;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class LogInfoLauncherTest {
    
    LogInfoLauncher logInfoLauncher = new LogInfoLauncher();
    
    public LogInfoLauncherTest() {
    }
    
    @Before
    public void setUp() {
        LogInfoLauncher.appender.start();
    }
    
    @After
    public void tearDown() {
        LogInfoLauncher.appender.stop();
    }

    @Test
    public void testMain() {
        logInfoLauncher.doIt();
        assertEquals(5, LogInfoLauncher.appender.getLogSize());
    }
    
}
