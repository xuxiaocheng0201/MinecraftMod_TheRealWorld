package com.xuxiaocheng.TheRealWorld.Ore.worldgen;

import com.xuxiaocheng.TheRealWorld.Core.log.LogBase;
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

public class WorldGenIronPyriteOre extends WorldGenBase {
    public WorldGenIronPyriteOre() {
        super(ConfigMain.config_generate_iron_pyrite.chance, OreGenEvent.GenerateMinable.EventType.CUSTOM);
    }

    @Override
    public boolean WorldGenOre(World world, Random random, BlockPos pos, int times) {
        if (!ConfigMain.config_generate_iron_pyrite.Gen)
            return true;
        int minY = ConfigMain.config_generate_iron_pyrite.minY;
        int maxY = ConfigMain.config_generate_iron_pyrite.maxY;
        int posX = pos.getX() + random.nextInt(15);
        int posY = minY + random.nextInt(maxY - minY);
        int posZ = pos.getZ() + random.nextInt(15);
        BlockPos blockpos = new BlockPos(posX, posY, posZ);
        int minSize = ConfigMain.config_generate_iron_pyrite.minSize;
        int maxSize = ConfigMain.config_generate_iron_pyrite.maxSize;
        WorldGenerator iron_pyrite = new WorldGenMinable(BlockLoader.IRON_ORE_PYRITE.getDefaultState(),
                minSize + random.nextInt(maxSize - minSize));
        iron_pyrite.generate(world, random, blockpos);
        return true;
    }

    public static void FixConfig() {
        final String category = "world_gen_iron_pyrite";
        if (ConfigMain.config_generate_iron_pyrite.chance < 0) {
            Log.logger(LogBase.LOGGER_LEVEL.ERROR, "The value of chance in " + category + " is too small! Now change it to 0.");
            ConfigMain.config_generate_iron_pyrite.chance = 0;
        }
        if (ConfigMain.config_generate_iron_pyrite.chance > 10000) {
            Log.logger(LogBase.LOGGER_LEVEL.WARN, "The value of chance in " + category + " is too big. It may reduce the speed of Minecraft start.");
        }
        if (ConfigMain.config_generate_iron_pyrite.maxY < 1) {
            Log.logger(LogBase.LOGGER_LEVEL.ERROR, "The value of maxY in " + category + " is too small! Now change it to 1");
            ConfigMain.config_generate_iron_pyrite.maxY = 1;
        }
        if (ConfigMain.config_generate_iron_pyrite.maxY > 255) {
            Log.logger(LogBase.LOGGER_LEVEL.ERROR, "The value of maxY in " + category + " is too big! Now change it to 255");
            ConfigMain.config_generate_iron_pyrite.maxY = 255;
        }
        if (ConfigMain.config_generate_iron_pyrite.minY < 1) {
            Log.logger(LogBase.LOGGER_LEVEL.ERROR, "The value of minY in " + category + " is too small! Now change it to 1");
            ConfigMain.config_generate_iron_pyrite.minY = 1;
        }
        if (ConfigMain.config_generate_iron_pyrite.minY > 255) {
            Log.logger(LogBase.LOGGER_LEVEL.ERROR, "The value of minY in " + category + " is too big! Now change it to 255");
            ConfigMain.config_generate_iron_pyrite.minY = 255;
        }
        if (ConfigMain.config_generate_iron_pyrite.minY > ConfigMain.config_generate_iron_pyrite.maxY) {
            Log.logger(LogBase.LOGGER_LEVEL.WARN, "The minY is bigger than maxY in " + category + ". Now swap them.");
            int temp = ConfigMain.config_generate_iron_pyrite.maxY;
            ConfigMain.config_generate_iron_pyrite.maxY = ConfigMain.config_generate_iron_pyrite.minY;
            ConfigMain.config_generate_iron_pyrite.minY = temp;
        }
        if (ConfigMain.config_generate_iron_pyrite.maxSize < 1) {
            Log.logger(LogBase.LOGGER_LEVEL.ERROR, "The value of maxSize in " + category + " is too small! Now change it to 2");
            ConfigMain.config_generate_iron_pyrite.maxSize = 2;
        }
        if (ConfigMain.config_generate_iron_pyrite.minSize < 1) {
            Log.logger(LogBase.LOGGER_LEVEL.ERROR, "The value of minSize in " + category + " is too small! Now change it to 1");
            ConfigMain.config_generate_iron_pyrite.minSize = 1;
        }
        if (ConfigMain.config_generate_iron_pyrite.minSize > ConfigMain.config_generate_iron_pyrite.maxSize) {
            Log.logger(LogBase.LOGGER_LEVEL.WARN, "The minSize is bigger than maxSize in " + category + ". Now swap them.");
            int temp = ConfigMain.config_generate_iron_pyrite.maxSize;
            ConfigMain.config_generate_iron_pyrite.maxSize = ConfigMain.config_generate_iron_siderite.minSize;
            ConfigMain.config_generate_iron_pyrite.minSize = temp;
        }
    }
}
