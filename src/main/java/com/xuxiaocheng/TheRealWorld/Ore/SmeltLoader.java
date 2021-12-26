package com.xuxiaocheng.TheRealWorld.Ore;

import com.xuxiaocheng.TheRealWorld.Ore.smelt.*;

public class SmeltLoader {
    public static void load() {
        Log.logger(Log.LOGGER_LEVEL.DEBUG, "SmeltLoader load starting.");
        Log.logger(Log.LOGGER_LEVEL.ALL, "Register SmeltIronSiderite.");
        SmeltIronSiderite.register();
        Log.logger(Log.LOGGER_LEVEL.ALL, "Register SmeltIronPyrite.");
        SmeltIronPyrite.register();
        Log.logger(Log.LOGGER_LEVEL.ALL, "Register SmeltIronMagnetite.");
        SmeltIronMagnetite.register();
        Log.logger(Log.LOGGER_LEVEL.ALL, "Register SmeltIronHematite.");
        SmeltIronHematite.register();
        Log.logger(Log.LOGGER_LEVEL.DEBUG, "SmeltLoader load finished.");
    }
}
