package com.xuxiaocheng.TheRealWorld.Ore.worldgen;

import com.xuxiaocheng.TheRealWorld.Core.worldgen.WorldGenBase;
import com.xuxiaocheng.TheRealWorld.Ore.BlockLoader;
import com.xuxiaocheng.TheRealWorld.Ore.config.ConfigGenerateIronSiderite;
import com.xuxiaocheng.TheRealWorld.Ore.config.ConfigMain;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.event.terraingen.OreGenEvent;

import java.util.Random;

public class WorldGenIronSideriteOre extends WorldGenBase {
    private final WorldGenerator iron_siderite;

    public WorldGenIronSideriteOre(Random random) {
        super(ConfigMain.config_generate_iron_siderite.chance, OreGenEvent.GenerateMinable.EventType.IRON);
        int minSize = ConfigMain.config_generate_iron_siderite.minSize;
        int maxSize = ConfigMain.config_generate_iron_siderite.maxSize;
        iron_siderite = new WorldGenMinable(BlockLoader.IRON_ORE_SIDERITE.getDefaultState(),
                minSize + random.nextInt(maxSize - minSize));
    }

    @Override
    public boolean WorldGenOre(World world, Random random, BlockPos pos, int times) {
        if (!ConfigMain.config_generate_iron_siderite.Gen)
            return true;
        if (world.provider.getDimension() == 0) {
            int minY = ConfigMain.config_generate_iron_siderite.minY;
            int maxY = ConfigMain.config_generate_iron_siderite.maxY;
            int posX = pos.getX() + random.nextInt(15);
            int posY = minY + random.nextInt(maxY - minY);
            int posZ = pos.getZ() + random.nextInt(15);
            BlockPos blockpos = new BlockPos(posX, posY, posZ);
            iron_siderite.generate(world, random, blockpos);
        }
        return true;
    }
}
