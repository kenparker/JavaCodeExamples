package com.maggioni.javaLogger.Example1;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SimpleFormatterExample
{

    private static Logger logger = Logger.getLogger("SimpleFormatterExample");

    private static void logMessages()
    {
        logger.info("Line One");
        logger.fine("Line Two");
        logger.severe("Line Three");
        
    }

    public static void main(String[] args) throws IOException
    {
        logger.setUseParentHandlers(false);

        FileHandler fileHdlr = new FileHandler("C:/Users/magang/Documents/Logs/logging.txt");
        Handler conHdlr = new ConsoleHandler();
        
        final MyFormatter myFormatter = new MyFormatter();
        conHdlr.setFormatter(myFormatter);
        fileHdlr.setFormatter(myFormatter);
        logger.addHandler(conHdlr);
        logger.addHandler(fileHdlr);
        logger.setLevel(Level.INFO);
        logMessages();

    }

}
