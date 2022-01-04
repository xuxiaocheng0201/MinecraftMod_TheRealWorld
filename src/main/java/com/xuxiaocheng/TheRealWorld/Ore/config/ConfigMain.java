package com.xuxiaocheng.TheRealWorld.Ore.config;

import com.xuxiaocheng.TheRealWorld.Core.log.LogBase;
import com.xuxiaocheng.TheRealWorld.Ore.ConfigLoader;
import com.xuxiaocheng.TheRealWorld.Ore.Log;
import com.xuxiaocheng.TheRealWorld.Ore.Reference;
import net.minecraftforge.common.config.Config;

@Config(modid = Reference.MOD_ID, name = Reference.PACKAGE, category = "main")
@Config.LangKey(ConfigLoader.tooltip_title + ".title")
public class ConfigMain {
    @Config.Comment("The log level, can be chosen in INFO, WARN, ERROR, DEBUG, ALL")
    @Config.LangKey(ConfigLoader.tooltip_title + ".log_level")
    @Config.RequiresMcRestart
    public static LogBase.LOGGER_LEVEL log_level = LogBase.LOGGER_LEVEL.WARN;

    @Config.Comment("Generate Iron Siderite configuration.")
    @Config.LangKey(ConfigLoader.tooltip_title + ".config_generate_iron_siderite")
    public static ConfigGenerateIronSiderite config_generate_iron_siderite = new ConfigGenerateIronSiderite();

    @Config.Comment("Generate Iron Pyrite configuration.")
    @Config.LangKey(ConfigLoader.tooltip_title + ".config_generate_iron_pyrite")
    public static ConfigGenerateIronPyrite config_generate_iron_pyrite = new ConfigGenerateIronPyrite();

    @Config.Comment("Generate Iron Magnetite configuration.")
    @Config.LangKey(ConfigLoader.tooltip_title + ".config_generate_iron_magnetite")
    public static ConfigGenerateIronMagnetite config_generate_iron_magnetite = new ConfigGenerateIronMagnetite();

    @Config.Comment("Generate Iron Hematite configuration.")
    @Config.LangKey(ConfigLoader.tooltip_title + ".config_generate_iron_hematite")
    public static ConfigGenerateIronHematite config_generate_iron_hematite = new ConfigGenerateIronHematite();
}
