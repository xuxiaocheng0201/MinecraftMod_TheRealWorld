package com.xuxiaocheng.TheRealWorld.Weight.config;

import com.xuxiaocheng.TheRealWorld.Weight.ConfigLoader;
import com.xuxiaocheng.TheRealWorld.Weight.Reference;
import com.xuxiaocheng.TheRealWorld.Core.log.LogBase;
import net.minecraftforge.common.config.Config;

@Config(modid = Reference.MOD_ID, name = Reference.PACKAGE, category = "main")
@Config.LangKey(ConfigLoader.tooltip_title + ".title")
public class ConfigMain {
    @Config.Comment("The log level, can be chosen in INFO, WARN, ERROR, DEBUG, ALL")
    @Config.LangKey(ConfigLoader.tooltip_title + ".log_level")
    @Config.RequiresMcRestart
    public static LogBase.LOGGER_LEVEL log_level = LogBase.LOGGER_LEVEL.WARN;

    @Config.Comment("The weight factor (multiple)")
    @Config.LangKey(ConfigLoader.tooltip_title + ".multiple")
    @Config.RangeDouble(min = 0D, max = 100000000D)
    public static double multiple = 1D;

    @Config.Comment("The default weight of an unsupported item.")
    @Config.LangKey(ConfigLoader.tooltip_title + ".default_weight")
    public static double default_weight = 100D;

    @Config.Comment("The ticks between weight reflect.")
    @Config.LangKey(ConfigLoader.tooltip_title + ".ticks")
    @Config.RangeInt(min = 1, max = 6000)
    public static int ticks = 200;
}
