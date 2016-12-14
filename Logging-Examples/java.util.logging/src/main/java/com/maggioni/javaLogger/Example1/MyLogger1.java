package com.maggioni.javaLogger.Example1;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyLogger1
{
    private static final String FILE_PATH = "C:/Users/magang/Documents/Logs/";
    static private FileHandler fileHdlr;
    static private MyFormatter formatterTxt;
    static private Handler conHdlr;

    private static final Logger logger = Logger.getLogger("MyLogger");

    static public void setup() throws IOException
    {
        logger.setUseParentHandlers(false);
        fileHdlr = new FileHandler(FILE_PATH + "Logging.txt");
        conHdlr = new ConsoleHandler();
        formatterTxt = new MyFormatter();
        fileHdlr.setFormatter(formatterTxt);
        fileHdlr.setLevel(Level.ALL);
        conHdlr.setFormatter(formatterTxt);
        conHdlr.setLevel(Level.ALL);
        logger.addHandler(fileHdlr);
        logger.addHandler(conHdlr);
  

    }

}
