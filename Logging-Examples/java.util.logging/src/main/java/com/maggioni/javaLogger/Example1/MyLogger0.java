package com.maggioni.javaLogger.Example1;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Logger;

public class MyLogger0
{

    private static final String FILE_PATH = "C:/Users/magang/Documents/Logs/";
    static private FileHandler fileHdlr;
    static private MyFormatter formatterTxt;
    static private Handler conHdlr;

    static public void setup() throws IOException
    {

        Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

        // suppress the logging output to the console
        Logger rootLogger = Logger.getLogger("");
        Handler[] handlers = rootLogger.getHandlers();
        if (handlers[0] instanceof ConsoleHandler) {
            rootLogger.removeHandler(handlers[0]);
        }

       // logger.setLevel(Level.ALL);
        fileHdlr = new FileHandler(FILE_PATH + "Logging.txt");
        conHdlr = new ConsoleHandler();
        formatterTxt = new MyFormatter();

        // Create a TXT formatter
        fileHdlr.setFormatter(formatterTxt);
        conHdlr.setFormatter(formatterTxt);
        logger.addHandler(fileHdlr);
        logger.addHandler(conHdlr);
        logger.info("Test MyLogger");

    }

}
