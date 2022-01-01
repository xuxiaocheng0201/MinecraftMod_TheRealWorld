package com.xuxiaocheng.TheRealWorld.Core.biome;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeProvider;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;

public class BiomeBase extends Biome {
    public BiomeBase(BiomeProperties properties) {
        super(properties);
    }

    public void PreRegister(int weight) {
        if (this.getRegistryName() == null)
            return;
        BiomeProvider.allowedBiomes.add(this);
        BiomeManager.addBiome(BiomeManager.BiomeType.WARM, new BiomeManager.BiomeEntry(this, weight));
    }
}
