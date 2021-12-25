package com.xuxiaocheng.TheRealWorld.Ore.worldgen;

import com.xuxiaocheng.TheRealWorld.Core.worldgen.WorldGenBase;
import com.xuxiaocheng.TheRealWorld.Ore.BlockLoader;
import com.xuxiaocheng.TheRealWorld.Ore.config.ConfigGenerateIronPyrite;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.event.terraingen.OreGenEvent;

import java.util.Random;

public class WorldGenIronPyriteOre extends WorldGenBase {
    private final WorldGenerator iron_pyrite;

    public WorldGenIronPyriteOre(Random random) {
        super(ConfigGenerateIronPyrite.chance, OreGenEvent.GenerateMinable.EventType.IRON);
        iron_pyrite = new WorldGenMinable(BlockLoader.IRON_ORE_PYRITE.getDefaultState(),
                ConfigGenerateIronPyrite.minSize + random.nextInt(ConfigGenerateIronPyrite.maxSize - ConfigGenerateIronPyrite.minSize));
    }

    @Override
    public boolean WorldGenOre(World world, Random random, BlockPos pos, int times) {
        if (!ConfigGenerateIronPyrite.Gen)
            return true;
        int posX = pos.getX() + random.nextInt(15);
        int posY = ConfigGenerateIronPyrite.minY + random.nextInt(ConfigGenerateIronPyrite.maxY - ConfigGenerateIronPyrite.minY);
        int posZ = pos.getZ() + random.nextInt(15);
        BlockPos blockpos = new BlockPos(posX, posY, posZ);
        iron_pyrite.generate(world, random, blockpos);
        return true;
    }
}
