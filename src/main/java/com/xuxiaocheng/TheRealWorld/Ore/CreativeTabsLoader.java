package com.xuxiaocheng.TheRealWorld.Ore;

import com.xuxiaocheng.TheRealWorld.Core.log.LogBase;
import com.xuxiaocheng.TheRealWorld.Ore.creativetab.*;
import net.minecraft.creativetab.CreativeTabs;

public class CreativeTabsLoader {
    public static CreativeTabs TheRealWorld_Ore;

    public static void load() {
        Log.logger(LogBase.LOGGER_LEVEL.DEBUG, "CreativeTabsLoader load starting.");
        Log.logger(LogBase.LOGGER_LEVEL.ALL, "Instantiating CreativeTabOre.");
        TheRealWorld_Ore = new CreativeTabOre();
        Log.logger(LogBase.LOGGER_LEVEL.DEBUG, "CreativeTabsLoader load finished.");
    }
}
