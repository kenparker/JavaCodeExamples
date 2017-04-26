package com.maggioni.logging.apache.commons.logging.demo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class CommonLoggingDemo1 
{
 private static Log log = LogFactory.getLog(CommonLoggingDemo1.class);
    public static void main( String[] args )
    {
        log.info("Apache Commong Logging Demo 1");
    }
}
