package com.log;


import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class log {

    private static final Logger log = LogManager.getLogger(log.class);

    public static void info(String message) {

        log.info(message);

    }

    public static void error(String message) {

        log.error(message);

    }

    public static void debug(String message) {

        log.debug(message);

    }

}