package com.xuxiaocheng.TheRealWorld.Ore;

import com.xuxiaocheng.TheRealWorld.Core.log.LogBase;
import com.xuxiaocheng.TheRealWorld.Ore.config.ConfigMain;
import org.apache.logging.log4j.LogManager;

public class Log extends LogBase {
    static {
        mod_logger = LogManager.getLogger(Reference.MOD_ID);
        log_level = ConfigMain.log_level;
    }

    public static void logger(String message) {
        log_level = ConfigMain.log_level;
        base_logger(message);
    }

    public static void logger(LOGGER_LEVEL level, String message) {
        log_level = ConfigMain.log_level;
        base_logger(level, message);
    }
}
