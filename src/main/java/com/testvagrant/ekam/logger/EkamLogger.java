package com.testvagrant.ekam.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EkamLogger {

    private EkamLogger() {}

    private static final class LoggerHolder {
        public static final Logger logger = LoggerFactory.getLogger(EkamLogger.class);
    }

    public static Logger ekamLogger() {
        return LoggerHolder.logger;
    }

}
