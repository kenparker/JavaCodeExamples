/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maggioni.javaLogger.Example2;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

/**
 * http://www.onjava.com/pub/a/onjava/2002/06/19/log.html?page=2
 * 
 * @author magang
 */
public class MyLogging_1 {

    private static final Logger log = Logger.getLogger(MyLogging_1.class.getName());

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        MyLogging_1 mylog = new MyLogging_1();
        mylog.showConfLogger();
        mylog.testFormatter();
        
    }

    

    public void testFormatter() throws IOException {

        log.setUseParentHandlers(false);

        Handler fileHandler = new FileHandler("TestLogger.txt");
        Handler consoleHandler = new ConsoleHandler();
        log.addHandler(consoleHandler);
        log.addHandler(fileHandler);
        // examples with different logging level for logger and handlers
        consoleHandler.setLevel(Level.INFO);
        log.setLevel(Level.ALL);      

        Formatter formatter = new MyFormatter_1();
        consoleHandler.setFormatter(formatter);
        System.out.println("Formatter    :" + consoleHandler.getFormatter());

        fileHandler.setFormatter(formatter);

        log.fine("1. test fine");
        log.info("2. test info");
        log.warning("3. test warning");

    }

    public void testLogging() throws IOException {

        log.setLevel(Level.WARNING);
    
        log.fine("1. test fine");
        log.info("2. test info");
        log.warning("3. test warning");

    }
    
    public void showConfLogger() throws IOException {
        
        System.out.println("UseParentHandlers   :" + log.getUseParentHandlers());      
        System.out.printf("The logManager is : %s: \n", LogManager.getLogManager());
        System.out.printf("The logManager/root logger is : %s: \n", LogManager.getLogManager().getLogger(""));
        System.out.printf("The parent logger is          : %s: \n", log.getParent());
        System.out.printf("The current logger is         : %s: \n", log.getName());
        System.out.printf("Logging level : %s \n", log.getLevel());
        for (Handler handler : log.getParent().getHandlers()) {
            System.out.printf("handler parent: %s %s \n", handler.toString(), handler.getLevel());
        }
        for (Handler handler : log.getHandlers()) {
            System.out.printf("handler child : %s %s \n", handler.toString(), handler.getLevel());
        }
    }
   
}
