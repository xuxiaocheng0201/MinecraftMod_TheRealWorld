package com.xuxiaocheng.TheRealWorld.Ore;

import com.xuxiaocheng.TheRealWorld.Ore.config.ConfigMain;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class Log {
    private static final Logger mod_logger = LogManager.getLogger(Reference.MOD_ID);

    public enum LOGGER_LEVEL{
        INFO, WARN, ERROR, DEBUG, ALL
    }

    public static void logger(String message) {
        logger(LOGGER_LEVEL.INFO, message);
    }

    public static void logger(LOGGER_LEVEL level, String message) {
        if (level == LOGGER_LEVEL.INFO) {
            mod_logger.info(message);
            return;
        }
        if (level == LOGGER_LEVEL.WARN && ConfigMain.log_level != LOGGER_LEVEL.INFO) {
            mod_logger.warn(message);
            return;
        }
        if (level == LOGGER_LEVEL.ERROR && ConfigMain.log_level != LOGGER_LEVEL.INFO && ConfigMain.log_level != LOGGER_LEVEL.WARN) {
            mod_logger.error(message);
            return;
        }
        if (level == LOGGER_LEVEL.DEBUG && ConfigMain.log_level != LOGGER_LEVEL.INFO && ConfigMain.log_level != LOGGER_LEVEL.WARN && ConfigMain.log_level != LOGGER_LEVEL.ERROR) {
            mod_logger.debug(message);
            return;
        }
        mod_logger.info(message);
    }
}
