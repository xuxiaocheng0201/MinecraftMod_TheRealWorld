package com.xuxiaocheng.TheRealWorld.Ore.config;

import com.xuxiaocheng.TheRealWorld.Ore.ConfigLoader;
import com.xuxiaocheng.TheRealWorld.Ore.Log;
import com.xuxiaocheng.TheRealWorld.Ore.Reference;
import net.minecraftforge.common.config.Config;

@Config(modid = Reference.MOD_ID, name = Reference.PACKAGE, category = "main")
@Config.LangKey(ConfigLoader.tooltip_title + ".title")
public class ConfigMain {
    @Config.Comment("The log level, can be chosen in INFO, WARN, ERROR, DEBUG, ALL")
    @Config.LangKey(ConfigLoader.tooltip_title + ".log_level")
    public static Log.LOGGER_LEVEL log_level = Log.LOGGER_LEVEL.ERROR;

    @Config.Comment("Generate Iron Siderite configuration.")
    @Config.LangKey(ConfigLoader.tooltip_title + ".config_generate_iron_siderite")
    public static ConfigGenerateIronSiderite config_generate_iron_siderite = new ConfigGenerateIronSiderite();

}
