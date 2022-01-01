package com.xuxiaocheng.TheRealWorld.Core.log;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class LogBase {
    public enum LOGGER_LEVEL{
        INFO, ERROR, WARN, DEBUG, ALL
    }

    protected static Logger mod_logger = null;
    protected static LOGGER_LEVEL log_level = LOGGER_LEVEL.WARN;

    protected static void base_logger(String message) {
        base_logger(LOGGER_LEVEL.ALL, message);
    }

    protected static void base_logger(LOGGER_LEVEL level, String message) {
        if (mod_logger == null)
            mod_logger = LogManager.getLogger();
        if (level == LOGGER_LEVEL.ALL &&
                log_level != LOGGER_LEVEL.INFO &&
                log_level != LOGGER_LEVEL.ERROR &&
                log_level != LOGGER_LEVEL.WARN &&
                log_level != LOGGER_LEVEL.DEBUG) {
            mod_logger.info(message);
            return;
        }
        if (level == LOGGER_LEVEL.DEBUG &&
                log_level != LOGGER_LEVEL.INFO &&
                log_level != LOGGER_LEVEL.ERROR &&
                log_level != LOGGER_LEVEL.WARN) {
            mod_logger.info(message);
            return;
        }
        if (level == LOGGER_LEVEL.WARN &&
                log_level != LOGGER_LEVEL.INFO &&
                log_level != LOGGER_LEVEL.ERROR) {
            mod_logger.warn(message);
            return;
        }
        if (level == LOGGER_LEVEL.ERROR &&
                log_level != LOGGER_LEVEL.INFO) {
            mod_logger.error(message);
            return;
        }
        if (level == LOGGER_LEVEL.INFO)
            mod_logger.info(message);
    }
}
