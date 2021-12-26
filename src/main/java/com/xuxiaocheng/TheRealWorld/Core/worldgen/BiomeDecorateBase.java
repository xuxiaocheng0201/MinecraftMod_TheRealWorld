package com.xuxiaocheng.TheRealWorld.Core.worldgen;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeDecorator;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.Random;

public abstract class BiomeDecorateBase extends BiomeDecorator {
    @ParametersAreNonnullByDefault
    public void decorate(World world, Random random, Biome biome, BlockPos pos) {
        doOreGen(world, biome, random, pos);
        doPlantGen(world, biome, random, pos);
        doTreeGen(world, biome, random, pos);
        doMiscGen(world, biome, random, pos);
    }

    protected void doOreGen(World world, Biome biome, Random random, BlockPos pos) {}
    protected void doPlantGen(World world, Biome biome, Random random, BlockPos pos) {}
    protected void doTreeGen(World world, Biome biome, Random random, BlockPos pos) {}
    protected void doMiscGen(World world, Biome biome, Random random, BlockPos pos) {}
}
