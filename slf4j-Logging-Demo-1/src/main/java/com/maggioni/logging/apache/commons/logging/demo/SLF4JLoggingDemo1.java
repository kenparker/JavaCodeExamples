package com.maggioni.logging.apache.commons.logging.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SLF4JLoggingDemo1 
{
 private static Logger log = LoggerFactory.getLogger(SLF4JLoggingDemo1.class);
    public static void main( String[] args )
    {
        log.info("Apache Commong Logging Demo 1");
    }
}
