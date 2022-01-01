package com.xuxiaocheng.TheRealWorld.Core.worldgen;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.event.terraingen.OreGenEvent;
import net.minecraftforge.event.terraingen.TerrainGen;

import java.util.Random;
import javax.annotation.ParametersAreNonnullByDefault;

public abstract class WorldGenBase extends WorldGenerator {
    private static int chance = 1;
    private static OreGenEvent.GenerateMinable.EventType type = OreGenEvent.GenerateMinable.EventType.CUSTOM;

    public WorldGenBase(int chances) {
        chance = chances;
    }

    public WorldGenBase(int chances, OreGenEvent.GenerateMinable.EventType types) {
        this(chances);
        type = types;
    }

    public abstract boolean WorldGenOre(World world, Random random, BlockPos pos, int times);

    @Override
    @ParametersAreNonnullByDefault
    public boolean generate(World world, Random random, BlockPos pos) {
        if (TerrainGen.generateOre(world, random, this, pos, type))
            for (int i = 1; i <= chance; i++)
                if (!WorldGenOre(world, random, pos, i))
                    return false;
        return true;
    }
}
