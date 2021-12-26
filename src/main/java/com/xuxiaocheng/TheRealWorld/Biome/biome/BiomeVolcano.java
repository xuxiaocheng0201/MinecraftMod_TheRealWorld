package com.xuxiaocheng.TheRealWorld.Biome.biome;

import com.xuxiaocheng.TheRealWorld.Biome.Reference;
import com.xuxiaocheng.TheRealWorld.Core.worldgen.BiomeDecorateBase;
import com.xuxiaocheng.TheRealWorld.Ore.BlockLoader;
import com.xuxiaocheng.TheRealWorld.Ore.config.ConfigMain;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.awt.*;
import java.util.Random;

public class BiomeVolcano extends Biome {
    private static final Biome.BiomeProperties properties = new BiomeProperties("TheRealWorld Volcano");

    static {
        properties.setRainDisabled();
        properties.setTemperature(120.0F);
        properties.setWaterColor(Color.RED.getRGB());
        properties.setBaseHeight(150);
        properties.setHeightVariation(0.05F);
    }

    public BiomeVolcano() {
        super(properties);
        setRegistryName(Reference.MOD_ID, "volcano");
        this.topBlock = Blocks.GRASS.getDefaultState();
        this.fillerBlock = Blocks.STONE.getDefaultState();
        this.spawnableCaveCreatureList.clear();
        this.spawnableCreatureList.clear();
        this.spawnableMonsterList.clear();
        this.spawnableWaterCreatureList.clear();
        this.decorator = new Decorator();
    }

    public BiomeDictionary.Type[] getTypes() {
        return new BiomeDictionary.Type[] {
                BiomeDictionary.Type.DEAD,
                BiomeDictionary.Type.DRY,
                BiomeDictionary.Type.HOT,
                BiomeDictionary.Type.MOUNTAIN,
                BiomeDictionary.Type.WASTELAND};
    }

    @SideOnly(Side.CLIENT)
    public int getSkyColorByTemp(float currentTemperature) {
        return Color.GRAY.getRGB();
    }

    public static class Decorator extends BiomeDecorateBase {
        @Override
        protected void doOreGen(World world, Biome biome, Random random, BlockPos pos) {
            if (ConfigMain.config_generate_iron_hematite.Gen) {
                int minSize = ConfigMain.config_generate_iron_hematite.minSize;
                int maxSize = ConfigMain.config_generate_iron_hematite.maxSize;
                int minY = ConfigMain.config_generate_iron_hematite.minY;
                int maxY = ConfigMain.config_generate_iron_hematite.maxY;
                for (int i = 0; i < ConfigMain.config_generate_iron_hematite.chance; i++) {
                    WorldGenMinable generator = new WorldGenMinable(BlockLoader.IRON_ORE_HEMATITE.getDefaultState(),
                            minSize + random.nextInt(maxSize - minSize),
                            BlockMatcher.forBlock(Blocks.STONE));
                    generator.generate(world, random, pos.add(random.nextInt(15),
                            random.nextInt((maxY - minY) / 2),
                            random.nextInt(15)));
                }
            }
        }
        @Override
        protected void doPlantGen(World world, Biome biome, Random random, BlockPos pos) {

        }
        @Override
        protected void doTreeGen(World world, Biome biome, Random random, BlockPos pos) {

        }
        @Override
        protected void doMiscGen(World world, Biome biome, Random random, BlockPos pos) {

        }
    }
}
