package com.xuxiaocheng.TheRealWorld.Ore;

import com.xuxiaocheng.TheRealWorld.Ore.smelt.SmeltIronMagnetite;
import com.xuxiaocheng.TheRealWorld.Ore.smelt.SmeltIronPyrite;
import com.xuxiaocheng.TheRealWorld.Ore.smelt.SmeltIronSiderite;

public class SmeltLoader {
    public static void load() {
        Log.logger(Log.LOGGER_LEVEL.DEBUG, "SmeltLoader load starting.");
        Log.logger(Log.LOGGER_LEVEL.DEBUG, "Register SmeltIronSiderite.");
        SmeltIronSiderite.register();
        Log.logger(Log.LOGGER_LEVEL.DEBUG, "Register SmeltIronPyrite.");
        SmeltIronPyrite.register();
        Log.logger(Log.LOGGER_LEVEL.DEBUG, "Register SmeltIronMagnetite.");
        SmeltIronMagnetite.register();
        Log.logger(Log.LOGGER_LEVEL.DEBUG, "SmeltLoader load finished.");
    }
}
