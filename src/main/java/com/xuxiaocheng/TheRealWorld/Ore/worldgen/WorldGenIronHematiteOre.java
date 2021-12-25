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

public class WorldGenIronHematiteOre extends WorldGenBase {
    private final WorldGenerator iron_hematite;

    public WorldGenIronHematiteOre(Random random) {
        super(ConfigMain.config_generate_iron_hematite.chance, OreGenEvent.GenerateMinable.EventType.CUSTOM);
        int minSize = ConfigMain.config_generate_iron_hematite.minSize;
        int maxSize = ConfigMain.config_generate_iron_hematite.maxSize;
        iron_hematite = new WorldGenMinable(BlockLoader.IRON_ORE_HEMATITE.getDefaultState(),
                minSize + random.nextInt(maxSize - minSize));
    }

    @Override
    public boolean WorldGenOre(World world, Random random, BlockPos pos, int times) {
        if (!ConfigMain.config_generate_iron_hematite.Gen)
            return true;
        if (world.provider.getDimension() == 0) {
            int minY = ConfigMain.config_generate_iron_hematite.minY;
            int maxY = ConfigMain.config_generate_iron_hematite.maxY;
            int posX = pos.getX() + random.nextInt(15);
            int posY = minY + random.nextInt(maxY - minY);
            int posZ = pos.getZ() + random.nextInt(15);
            BlockPos blockpos = new BlockPos(posX, posY, posZ);
            iron_hematite.generate(world, random, blockpos);
        }
        return true;
    }

    public static void FixConfig() {
        final String category = "world_gen_iron_hematite";
        if (ConfigMain.config_generate_iron_hematite.chance < 0) {
            Log.logger(Log.LOGGER_LEVEL.ERROR, "The value of chance in " + category + " is too small! Now change it to 0.");
            ConfigMain.config_generate_iron_hematite.chance = 0;
        }
        if (ConfigMain.config_generate_iron_hematite.chance > 10000) {
            Log.logger(Log.LOGGER_LEVEL.WARN, "The value of chance in " + category + " is too big. It may reduce the speed of Minecraft start.");
        }
        if (ConfigMain.config_generate_iron_hematite.maxY < 1) {
            Log.logger(Log.LOGGER_LEVEL.ERROR, "The value of maxY in " + category + " is too small! Now change it to 1");
            ConfigMain.config_generate_iron_hematite.maxY = 1;
        }
        if (ConfigMain.config_generate_iron_hematite.maxY > 255) {
            Log.logger(Log.LOGGER_LEVEL.ERROR, "The value of maxY in " + category + " is too big! Now change it to 255");
            ConfigMain.config_generate_iron_hematite.maxY = 255;
        }
        if (ConfigMain.config_generate_iron_hematite.minY < 1) {
            Log.logger(Log.LOGGER_LEVEL.ERROR, "The value of minY in " + category + " is too small! Now change it to 1");
            ConfigMain.config_generate_iron_hematite.minY = 1;
        }
        if (ConfigMain.config_generate_iron_hematite.minY > 255) {
            Log.logger(Log.LOGGER_LEVEL.ERROR, "The value of minY in " + category + " is too big! Now change it to 255");
            ConfigMain.config_generate_iron_hematite.minY = 255;
        }
        if (ConfigMain.config_generate_iron_hematite.minY > ConfigMain.config_generate_iron_hematite.maxY) {
            Log.logger(Log.LOGGER_LEVEL.WARN, "The minY is bigger than maxY in " + category + ". Now swap them.");
            int temp = ConfigMain.config_generate_iron_hematite.maxY;
            ConfigMain.config_generate_iron_hematite.maxY = ConfigMain.config_generate_iron_hematite.minY;
            ConfigMain.config_generate_iron_hematite.minY = temp;
        }
        if (ConfigMain.config_generate_iron_hematite.maxSize < 1) {
            Log.logger(Log.LOGGER_LEVEL.ERROR, "The value of maxSize in " + category + " is too small! Now change it to 2");
            ConfigMain.config_generate_iron_hematite.maxSize = 2;
        }
        if (ConfigMain.config_generate_iron_hematite.minSize < 1) {
            Log.logger(Log.LOGGER_LEVEL.ERROR, "The value of minSize in " + category + " is too small! Now change it to 1");
            ConfigMain.config_generate_iron_hematite.minSize = 1;
        }
        if (ConfigMain.config_generate_iron_hematite.minSize > ConfigMain.config_generate_iron_hematite.maxSize) {
            Log.logger(Log.LOGGER_LEVEL.WARN, "The minSize is bigger than maxSize in " + category + ". Now swap them.");
            int temp = ConfigMain.config_generate_iron_hematite.maxSize;
            ConfigMain.config_generate_iron_hematite.maxSize = ConfigMain.config_generate_iron_hematite.minSize;
            ConfigMain.config_generate_iron_hematite.minSize = temp;
        }
    }
}
