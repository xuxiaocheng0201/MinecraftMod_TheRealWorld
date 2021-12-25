package com.xuxiaocheng.TheRealWorld.Ore.config;

import com.xuxiaocheng.TheRealWorld.Ore.ConfigLoader;
import net.minecraftforge.common.config.Config;

public class ConfigGenerateIronSiderite {
    @Config.Comment("Generate Iron Siderite Ore?")
    @Config.LangKey(ConfigLoader.tooltip_title + ".configGenerateIronSiderite.Gen")
    public boolean Gen = true;

    @Config.Comment("Generate chance in every chunk.")
    @Config.LangKey(ConfigLoader.tooltip_title + ".configGenerateIronSiderite.chance")
    @Config.RangeInt(min = 1)
    public int chance = 20;

    @Config.Comment("Max height Siderite can be generated.")
    @Config.LangKey(ConfigLoader.tooltip_title + ".configGenerateIronSiderite.maxY")
    @Config.RangeInt(min = 0, max = 255)
    public int maxY = 67;

    @Config.Comment("Min height Siderite can be generated.")
    @Config.LangKey(ConfigLoader.tooltip_title + ".configGenerateIronSiderite.minY")
    @Config.RangeInt(min = 0, max = 255)
    public int minY = 4;

    @Config.Comment("Max size Siderite can be generated once.")
    @Config.LangKey(ConfigLoader.tooltip_title + ".configGenerateIronSiderite.maxSize")
    @Config.RangeInt(min = 0)
    public int maxSize = 7;

    @Config.Comment("Min size Siderite can be generated once.")
    @Config.LangKey(ConfigLoader.tooltip_title + ".configGenerateIronSiderite.minSize")
    @Config.RangeInt(min = 0)
    public int minSize = 3;
}
