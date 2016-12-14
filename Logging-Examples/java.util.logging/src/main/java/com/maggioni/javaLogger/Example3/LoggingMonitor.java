package com.maggioni.javaLogger.Example3;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * http://www.java2s.com/Code/Java/Language-Basics/JavalogHierarchylogging.htm
 * also
 * http://tutorials.jenkov.com/java-logging/logger-hierarchy.html
 *
 * @author maggioni
 */
class ParentLogger {

    private Logger logger = Logger.getLogger("sam.logging");
    private Level level = null;

    public ParentLogger() {
        level = Level.SEVERE;
        logger.setLevel(level);
    }

    public void aMethod() {
        logger.log(Level.INFO, "Info message from Parent Logger");
        logger.log(Level.SEVERE, "Severe message from Parent Logger");
    }
}

class ChildLogger {

    private Logger logger = Logger.getLogger("sam.logging.child");
    private Level level = null;

    public ChildLogger() {
        level = Level.INFO;
        //setting the level of this child logger, if not specified, it
        // will use the level of the parent logger
        logger.setLevel(level);
    }

    public void aMethod() {
        logger.log(Level.INFO, "Info message from Child Logger");
        logger.log(Level.SEVERE, "Severe message from Child Logger");
    }
}

public class LoggingMonitor {

    public static void main(String[] args) {
        ParentLogger pLogger = new ParentLogger();
        ChildLogger cLogger = new ChildLogger();
        pLogger.aMethod();
        cLogger.aMethod();
    }
}
