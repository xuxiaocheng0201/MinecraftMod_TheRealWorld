package com.xuxiaocheng.TheRealWorld.Ore.config;

import com.xuxiaocheng.TheRealWorld.Ore.ConfigLoader;
import net.minecraftforge.common.config.Config;

public class ConfigGenerateIronPyrite {
    @Config.Comment("Generate Iron Pyrite Ore?")
    @Config.LangKey(ConfigLoader.tooltip_title + ".configGenerateIronPyrite.Gen")
    public boolean Gen = true;

    @Config.Comment("Generate chance in every chunk.")
    @Config.LangKey(ConfigLoader.tooltip_title + ".configGenerateIronPyrite.chance")
    @Config.RangeInt(min = 0, max = 100)
    public int chance = 20;

    @Config.Comment("Max height Pyrite can be generated.")
    @Config.LangKey(ConfigLoader.tooltip_title + ".configGenerateIronPyrite.maxY")
    @Config.RangeInt(min = 0, max = 255)
    public int maxY = 67;

    @Config.Comment("Min height Pyrite can be generated.")
    @Config.LangKey(ConfigLoader.tooltip_title + ".configGenerateIronPyrite.minY")
    @Config.RangeInt(min = 0, max = 255)
    public int minY = 4;

    @Config.Comment("Max size Pyrite can be generated once.")
    @Config.LangKey(ConfigLoader.tooltip_title + ".configGenerateIronPyrite.maxSize")
    @Config.RangeInt(min = 0)
    public int maxSize = 7;

    @Config.Comment("Min size Pyrite can be generated once.")
    @Config.LangKey(ConfigLoader.tooltip_title + ".configGenerateIronPyrite.minSize")
    @Config.RangeInt(min = 0)
    public int minSize = 3;
}
