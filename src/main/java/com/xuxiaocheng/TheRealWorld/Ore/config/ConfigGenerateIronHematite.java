package com.xuxiaocheng.TheRealWorld.Ore.config;

import com.xuxiaocheng.TheRealWorld.Ore.ConfigLoader;
import net.minecraftforge.common.config.Config;

public class ConfigGenerateIronHematite {
    @Config.Comment("Generate Iron Hematite Ore?")
    @Config.LangKey(ConfigLoader.tooltip_title + ".configGenerateIronHematite.Gen")
    public boolean Gen = true;

    @Config.Comment("Generate chance in every chunk.")
    @Config.LangKey(ConfigLoader.tooltip_title + ".configGenerateIronHematite.chance")
    @Config.RangeInt(min = 0, max = 100)
    public int chance = 20;

    @Config.Comment("Max height Hematite can be generated.")
    @Config.LangKey(ConfigLoader.tooltip_title + ".configGenerateIronHematite.maxY")
    @Config.RangeInt(min = 0, max = 255)
    public int maxY = 67;

    @Config.Comment("Min height Hematite can be generated.")
    @Config.LangKey(ConfigLoader.tooltip_title + ".configGenerateIronHematite.minY")
    @Config.RangeInt(min = 0, max = 255)
    public int minY = 4;

    @Config.Comment("Max size Hematite can be generated once.")
    @Config.LangKey(ConfigLoader.tooltip_title + ".configGenerateIronHematite.maxSize")
    @Config.RangeInt(min = 0)
    public int maxSize = 7;

    @Config.Comment("Min size Hematite can be generated once.")
    @Config.LangKey(ConfigLoader.tooltip_title + ".configGenerateIronHematite.minSize")
    @Config.RangeInt(min = 0)
    public int minSize = 3;
}
