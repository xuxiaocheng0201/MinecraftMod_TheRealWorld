package com.xuxiaocheng.TheRealWorld.Biome;

import com.xuxiaocheng.TheRealWorld.Biome.config.ConfigMain;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class Log {
    private static final Logger mod_logger = LogManager.getLogger(Reference.MOD_ID);

    public enum LOGGER_LEVEL{
        INFO, ERROR, WARN, DEBUG, ALL
    }

    public static void logger(String message) {
        logger(LOGGER_LEVEL.ALL, message);
    }

    public static void logger(LOGGER_LEVEL level, String message) {
        if (level == LOGGER_LEVEL.ALL &&
                ConfigMain.log_level != LOGGER_LEVEL.INFO &&
                ConfigMain.log_level != LOGGER_LEVEL.ERROR &&
                ConfigMain.log_level != LOGGER_LEVEL.WARN &&
                ConfigMain.log_level != LOGGER_LEVEL.DEBUG) {
            mod_logger.info(message);
            return;
        }
        if (level == LOGGER_LEVEL.DEBUG &&
                ConfigMain.log_level != LOGGER_LEVEL.INFO &&
                ConfigMain.log_level != LOGGER_LEVEL.ERROR &&
                ConfigMain.log_level != LOGGER_LEVEL.WARN) {
            mod_logger.debug(message);
            return;
        }
        if (level == LOGGER_LEVEL.WARN &&
                ConfigMain.log_level != LOGGER_LEVEL.INFO &&
                ConfigMain.log_level != LOGGER_LEVEL.ERROR) {
            mod_logger.warn(message);
            return;
        }
        if (level == LOGGER_LEVEL.ERROR &&
                ConfigMain.log_level != LOGGER_LEVEL.INFO) {
            mod_logger.error(message);
            return;
        }
        if (level == LOGGER_LEVEL.INFO)
            mod_logger.info(message);
    }
}
