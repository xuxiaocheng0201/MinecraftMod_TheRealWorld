package com.xuxiaocheng.TheRealWorld.Ore;

import com.xuxiaocheng.TheRealWorld.Ore.creativetab.CreativeTabOre;
import net.minecraft.creativetab.CreativeTabs;

public class CreativeTabsLoader {
    public static CreativeTabs TheRealWorld_Ore;
    public static void load() {
        Log.logger(Log.LOGGER_LEVEL.DEBUG, "CreativeTabsLoader load starting.");
        Log.logger(Log.LOGGER_LEVEL.DEBUG, "Instantiating CreativeTabOre.");
        TheRealWorld_Ore = new CreativeTabOre();
        Log.logger(Log.LOGGER_LEVEL.DEBUG, "CreativeTabsLoader load finished.");
    }
}
