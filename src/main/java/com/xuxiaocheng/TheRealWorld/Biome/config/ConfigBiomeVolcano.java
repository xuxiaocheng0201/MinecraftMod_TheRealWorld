package com.xuxiaocheng.TheRealWorld.Biome.config;

import com.xuxiaocheng.TheRealWorld.Biome.ConfigLoader;
import net.minecraftforge.common.config.Config;

public class ConfigBiomeVolcano {
    @Config.Comment("Generate Biome Volcano?")
    @Config.LangKey(ConfigLoader.tooltip_title + ".configBiomeVolcano.Gen")
    public boolean Gen = true;

    @Config.Comment("Generate weight. Higher number is higher chance(lower is lower).")
    @Config.LangKey(ConfigLoader.tooltip_title + ".configBiomeVolcano.weight")
    @Config.RangeInt(min = 0)
    public int weight = 3;

    @Config.Comment("Generate height.")
    @Config.LangKey(ConfigLoader.tooltip_title + ".configBiomeVolcano.height")
    @Config.RangeDouble(min = 0F)
    @Config.RequiresMcRestart
    public double height = 4.3F;
}
