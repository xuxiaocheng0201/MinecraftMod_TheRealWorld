package com.xuxiaocheng.TheRealWorld.Biome.biome;

import com.xuxiaocheng.TheRealWorld.Biome.Reference;
import com.xuxiaocheng.TheRealWorld.Biome.config.ConfigMain;
import com.xuxiaocheng.TheRealWorld.Core.biome.BiomeBase;
import com.xuxiaocheng.TheRealWorld.Core.block.BlockBase;
import com.xuxiaocheng.TheRealWorld.Core.biome.BiomeDecorateBase;
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

public class BiomeVolcano extends BiomeBase {
    private static final BiomeProperties properties =
            new BiomeProperties("volcano")
                    .setBaseBiome("extreme_hills")
                    .setBaseHeight((float) ConfigMain.config_biome_volcano.height)
                    .setHeightVariation(0.1F)
                    .setRainDisabled()
                    .setTemperature(120.0F)
                    .setWaterColor(Color.RED.getRGB());
    public static BiomeDictionary.Type[] types = new BiomeDictionary.Type[]{
            BiomeDictionary.Type.DEAD,
            BiomeDictionary.Type.DRY,
            BiomeDictionary.Type.HOT,
            BiomeDictionary.Type.MOUNTAIN,
            BiomeDictionary.Type.WASTELAND};

    public BiomeVolcano() {
        super(properties);
        this.setRegistryName(Reference.MOD_ID, "volcano");
        this.topBlock = Blocks.STONE.getDefaultState();
        this.fillerBlock = Blocks.STONE.getDefaultState();
        this.decorator = new Decorator();
        PreRegister(ConfigMain.config_biome_volcano.weight);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public int getSkyColorByTemp(float currentTemperature) {
        return Color.GRAY.getRGB() & Color.RED.getRGB();
    }

    public static class Decorator extends BiomeDecorateBase {
        @Override
        protected void doOreGen(World world, Biome biome, Random random, BlockPos pos) {
            com.xuxiaocheng.TheRealWorld.Ore.config.ConfigGenerateIronHematite config_generate_iron_hematite =
                    com.xuxiaocheng.TheRealWorld.Ore.config.ConfigMain.config_generate_iron_hematite;
            BlockBase IRON_ORE_HEMATITE =
                    com.xuxiaocheng.TheRealWorld.Ore.BlockLoader.IRON_ORE_HEMATITE;
            if (config_generate_iron_hematite.Gen) {
                int minSize = config_generate_iron_hematite.minSize;
                int maxSize = config_generate_iron_hematite.maxSize;
                int minY = config_generate_iron_hematite.minY;
                int maxY = config_generate_iron_hematite.maxY;
                for (int i = 0; i < config_generate_iron_hematite.chance; i++) {
                    WorldGenMinable generator = new WorldGenMinable(IRON_ORE_HEMATITE.getDefaultState(),
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
