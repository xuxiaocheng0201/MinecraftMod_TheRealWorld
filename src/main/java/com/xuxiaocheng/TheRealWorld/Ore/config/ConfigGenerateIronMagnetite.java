package com.xuxiaocheng.TheRealWorld.Ore.config;

import com.xuxiaocheng.TheRealWorld.Ore.ConfigLoader;
import net.minecraftforge.common.config.Config;

public class ConfigGenerateIronMagnetite {
    @Config.Comment("Generate Iron Magnetite Ore?")
    @Config.LangKey(ConfigLoader.tooltip_title + ".configGenerateIronMagnetite.Gen")
    public boolean Gen = true;

    @Config.Comment("Generate chance in every chunk.")
    @Config.LangKey(ConfigLoader.tooltip_title + ".configGenerateIronMagnetite.chance")
    @Config.RangeInt(min = 1)
    public int chance = 20;

    @Config.Comment("Max height Magnetite can be generated.")
    @Config.LangKey(ConfigLoader.tooltip_title + ".configGenerateIronMagnetite.maxY")
    @Config.RangeInt(min = 0, max = 255)
    public int maxY = 67;

    @Config.Comment("Min height Magnetite can be generated.")
    @Config.LangKey(ConfigLoader.tooltip_title + ".configGenerateIronMagnetite.minY")
    @Config.RangeInt(min = 0, max = 255)
    public int minY = 4;

    @Config.Comment("Max size Magnetite can be generated once.")
    @Config.LangKey(ConfigLoader.tooltip_title + ".configGenerateIronMagnetite.maxSize")
    @Config.RangeInt(min = 0)
    public int maxSize = 7;

    @Config.Comment("Min size Magnetite can be generated once.")
    @Config.LangKey(ConfigLoader.tooltip_title + ".configGenerateIronMagnetite.minSize")
    @Config.RangeInt(min = 0)
    public int minSize = 3;
}
