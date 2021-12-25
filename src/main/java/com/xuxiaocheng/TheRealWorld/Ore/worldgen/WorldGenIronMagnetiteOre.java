package com.xuxiaocheng.TheRealWorld.Ore.worldgen;

import com.xuxiaocheng.TheRealWorld.Core.worldgen.WorldGenBase;
import com.xuxiaocheng.TheRealWorld.Ore.BlockLoader;
import com.xuxiaocheng.TheRealWorld.Ore.Log;
import com.xuxiaocheng.TheRealWorld.Ore.config.ConfigMain;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.event.terraingen.OreGenEvent;

import java.util.Random;

public class WorldGenIronMagnetiteOre extends WorldGenBase {
    private final WorldGenerator iron_magnetite;

    public WorldGenIronMagnetiteOre(Random random) {
        super(ConfigMain.config_generate_iron_magnetite.chance, OreGenEvent.GenerateMinable.EventType.CUSTOM);
        int minSize = ConfigMain.config_generate_iron_magnetite.minSize;
        int maxSize = ConfigMain.config_generate_iron_magnetite.maxSize;
        iron_magnetite = new WorldGenMinable(BlockLoader.IRON_ORE_SIDERITE.getDefaultState(),
                minSize + random.nextInt(maxSize - minSize));
    }

    @Override
    public boolean WorldGenOre(World world, Random random, BlockPos pos, int times) {
        if (!ConfigMain.config_generate_iron_magnetite.Gen)
            return true;
        if (world.provider.getDimension() == 0) {
            int minY = ConfigMain.config_generate_iron_magnetite.minY;
            int maxY = ConfigMain.config_generate_iron_magnetite.maxY;
            int posX = pos.getX() + random.nextInt(15);
            int posY = minY + random.nextInt(maxY - minY);
            int posZ = pos.getZ() + random.nextInt(15);
            BlockPos blockpos = new BlockPos(posX, posY, posZ);
            iron_magnetite.generate(world, random, blockpos);
        }
        return true;
    }

    public static void FixConfig() {
        final String category = "world_gen_iron_magnetite";
        if (ConfigMain.config_generate_iron_magnetite.chance < 0) {
            Log.logger(Log.LOGGER_LEVEL.ERROR, "The value of chance in " + category + " is too small! Now change it to 0.");
            ConfigMain.config_generate_iron_magnetite.chance = 0;
        }
        if (ConfigMain.config_generate_iron_magnetite.chance > 10000) {
            Log.logger(Log.LOGGER_LEVEL.WARN, "The value of chance in " + category + " is too big. It may reduce the speed of Minecraft start.");
        }
        if (ConfigMain.config_generate_iron_magnetite.maxY < 1) {
            Log.logger(Log.LOGGER_LEVEL.ERROR, "The value of maxY in " + category + " is too small! Now change it to 1");
            ConfigMain.config_generate_iron_magnetite.maxY = 1;
        }
        if (ConfigMain.config_generate_iron_magnetite.maxY > 255) {
            Log.logger(Log.LOGGER_LEVEL.ERROR, "The value of maxY in " + category + " is too big! Now change it to 255");
            ConfigMain.config_generate_iron_magnetite.maxY = 255;
        }
        if (ConfigMain.config_generate_iron_magnetite.minY < 1) {
            Log.logger(Log.LOGGER_LEVEL.ERROR, "The value of minY in " + category + " is too small! Now change it to 1");
            ConfigMain.config_generate_iron_magnetite.minY = 1;
        }
        if (ConfigMain.config_generate_iron_magnetite.minY > 255) {
            Log.logger(Log.LOGGER_LEVEL.ERROR, "The value of minY in " + category + " is too big! Now change it to 255");
            ConfigMain.config_generate_iron_magnetite.minY = 255;
        }
        if (ConfigMain.config_generate_iron_magnetite.minY > ConfigMain.config_generate_iron_magnetite.maxY) {
            Log.logger(Log.LOGGER_LEVEL.WARN, "The minY is bigger than maxY in " + category + ". Now swap them.");
            int temp = ConfigMain.config_generate_iron_magnetite.maxY;
            ConfigMain.config_generate_iron_magnetite.maxY = ConfigMain.config_generate_iron_magnetite.minY;
            ConfigMain.config_generate_iron_magnetite.minY = temp;
        }
        if (ConfigMain.config_generate_iron_magnetite.maxSize < 1) {
            Log.logger(Log.LOGGER_LEVEL.ERROR, "The value of maxSize in " + category + " is too small! Now change it to 2");
            ConfigMain.config_generate_iron_magnetite.maxSize = 2;
        }
        if (ConfigMain.config_generate_iron_magnetite.minSize < 1) {
            Log.logger(Log.LOGGER_LEVEL.ERROR, "The value of minSize in " + category + " is too small! Now change it to 1");
            ConfigMain.config_generate_iron_magnetite.minSize = 1;
        }
        if (ConfigMain.config_generate_iron_magnetite.minSize > ConfigMain.config_generate_iron_magnetite.maxSize) {
            Log.logger(Log.LOGGER_LEVEL.WARN, "The minSize is bigger than maxSize in " + category + ". Now swap them.");
            int temp = ConfigMain.config_generate_iron_magnetite.maxSize;
            ConfigMain.config_generate_iron_magnetite.maxSize = ConfigMain.config_generate_iron_magnetite.minSize;
            ConfigMain.config_generate_iron_magnetite.minSize = temp;
        }
    }
}
