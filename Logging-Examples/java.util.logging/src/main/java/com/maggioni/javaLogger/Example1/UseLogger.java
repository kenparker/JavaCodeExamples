package com.maggioni.javaLogger.Example1;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UseLogger
{
    private final static Logger log = Logger.getLogger("MyLogger");

    public void doSomeThingsAndLog()
    {
        log.setLevel(Level.FINE);
        log.info("Test Message info");
        log.fine("Test Message fine");
        log.severe("Test Message severe");
    }

    public static void main(String[] args)
    {
        UseLogger tester = new UseLogger();
        try {
            MyLogger1.setup();
        } catch (IOException ex) {
            ex.printStackTrace();
            throw new RuntimeException("Problems with creating the log files");
        }   
        tester.doSomeThingsAndLog();
    }

}
