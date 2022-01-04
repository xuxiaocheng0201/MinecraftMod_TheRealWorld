package com.xuxiaocheng.TheRealWorld.Biome.config;

import com.xuxiaocheng.TheRealWorld.Biome.ConfigLoader;
import com.xuxiaocheng.TheRealWorld.Biome.Reference;
import com.xuxiaocheng.TheRealWorld.Core.log.LogBase;
import net.minecraftforge.common.config.Config;

@Config(modid = Reference.MOD_ID, name = Reference.PACKAGE, category = "main")
@Config.LangKey(ConfigLoader.tooltip_title + ".title")
public class ConfigMain {
    @Config.Comment("The log level, can be chosen in INFO, WARN, ERROR, DEBUG, ALL")
    @Config.LangKey(ConfigLoader.tooltip_title + ".log_level")
    @Config.RequiresMcRestart
    public static LogBase.LOGGER_LEVEL log_level = LogBase.LOGGER_LEVEL.WARN;

    @Config.Comment("Biome Volcano configuration.")
    @Config.LangKey(ConfigLoader.tooltip_title + ".config_biome_volcano")
    @Config.RequiresWorldRestart
    public static ConfigBiomeVolcano config_biome_volcano = new ConfigBiomeVolcano();
}
