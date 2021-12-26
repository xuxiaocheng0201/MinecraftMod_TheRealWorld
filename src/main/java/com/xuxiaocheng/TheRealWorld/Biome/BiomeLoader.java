package com.xuxiaocheng.TheRealWorld.Biome;

import com.xuxiaocheng.TheRealWorld.Biome.biome.*;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class BiomeLoader {
    public static final BiomeVolcano VOLCANO = new BiomeVolcano();

    public static void load() {
        Log.logger(Log.LOGGER_LEVEL.DEBUG, "BiomeLoader load starting.");
        Log.logger(Log.LOGGER_LEVEL.ALL, "Instantiating BiomeVolcano.");
        ForgeRegistries.BIOMES.register(VOLCANO);
        BiomeDictionary.addTypes(VOLCANO, VOLCANO.getTypes());
        Log.logger(Log.LOGGER_LEVEL.DEBUG, "BiomeLoader load finished.");
    }
}
