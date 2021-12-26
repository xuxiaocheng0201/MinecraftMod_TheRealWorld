package com.xuxiaocheng.TheRealWorld.Biome.config;

import com.xuxiaocheng.TheRealWorld.Biome.ConfigLoader;
import com.xuxiaocheng.TheRealWorld.Biome.Log;
import com.xuxiaocheng.TheRealWorld.Biome.Reference;
import net.minecraftforge.common.config.Config;

@Config(modid = Reference.MOD_ID, name = Reference.PACKAGE, category = "main")
@Config.LangKey(ConfigLoader.tooltip_title + ".title")
public class ConfigMain {
    @Config.Comment("The log level, can be chosen in INFO, WARN, ERROR, DEBUG, ALL")
    @Config.LangKey(ConfigLoader.tooltip_title + ".log_level")
    public static Log.LOGGER_LEVEL log_level = Log.LOGGER_LEVEL.WARN;
}
