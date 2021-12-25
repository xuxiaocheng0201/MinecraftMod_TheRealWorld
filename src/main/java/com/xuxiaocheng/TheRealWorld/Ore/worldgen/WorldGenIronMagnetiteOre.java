package com.xuxiaocheng.TheRealWorld.Ore.worldgen;

import com.xuxiaocheng.TheRealWorld.Core.worldgen.WorldGenBase;
import com.xuxiaocheng.TheRealWorld.Ore.BlockLoader;
import com.xuxiaocheng.TheRealWorld.Ore.config.ConfigGenerateIronMagnetite;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.event.terraingen.OreGenEvent;

import java.util.Random;

public class WorldGenIronMagnetiteOre extends WorldGenBase {
    private final WorldGenerator iron_magnetite;

    public WorldGenIronMagnetiteOre(Random random) {
        super(ConfigGenerateIronMagnetite.chance, OreGenEvent.GenerateMinable.EventType.IRON);
        iron_magnetite = new WorldGenMinable(BlockLoader.IRON_ORE_SIDERITE.getDefaultState(),
                ConfigGenerateIronMagnetite.minSize + random.nextInt(ConfigGenerateIronMagnetite.maxSize - ConfigGenerateIronMagnetite.minSize));
    }

    @Override
    public boolean WorldGenOre(World world, Random random, BlockPos pos, int times) {
        if (!ConfigGenerateIronMagnetite.Gen)
            return true;
        if (world.provider.getDimension() == 0) {
            int posX = pos.getX() + random.nextInt(15);
            int posY = ConfigGenerateIronMagnetite.minY + random.nextInt(ConfigGenerateIronMagnetite.maxY - ConfigGenerateIronMagnetite.minY);
            int posZ = pos.getZ() + random.nextInt(15);
            BlockPos blockpos = new BlockPos(posX, posY, posZ);
            iron_magnetite.generate(world, random, blockpos);
        }
        return true;
    }
}
