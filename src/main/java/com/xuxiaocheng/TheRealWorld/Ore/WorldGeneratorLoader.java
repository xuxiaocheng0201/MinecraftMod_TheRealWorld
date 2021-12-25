package com.xuxiaocheng.TheRealWorld.Ore;

import com.xuxiaocheng.TheRealWorld.Core.worldgen.WorldGenBase;
import com.xuxiaocheng.TheRealWorld.Ore.config.ConfigMain;
import com.xuxiaocheng.TheRealWorld.Ore.worldgen.*;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.terraingen.OreGenEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = Reference.MOD_ID)
public class WorldGeneratorLoader {
    public static WorldGenBase IRON_SIDERITE_ORE_GEN;
    public static WorldGenBase IRON_PYRITE_ORE_GEN;
    public static WorldGenBase IRON_MAGNETITE_ORE_GEN;
    public static WorldGenBase IRON_HEMATITE_ORE_GEN;

    @SubscribeEvent
    public void onOreGenPost(OreGenEvent.Post event) {
        if (ConfigMain.config_generate_iron_siderite.Gen) {
            WorldGenIronSideriteOre.FixConfig();
            IRON_SIDERITE_ORE_GEN = new WorldGenIronSideriteOre(event.getRand());
            IRON_SIDERITE_ORE_GEN.generate(event.getWorld(), event.getRand(), event.getPos());
        }
        if (ConfigMain.config_generate_iron_pyrite.Gen) {
            WorldGenIronPyriteOre.FixConfig();
            IRON_PYRITE_ORE_GEN = new WorldGenIronPyriteOre(event.getRand());
            IRON_PYRITE_ORE_GEN.generate(event.getWorld(), event.getRand(), event.getPos());
        }
        if (ConfigMain.config_generate_iron_magnetite.Gen) {
            WorldGenIronMagnetiteOre.FixConfig();
            IRON_MAGNETITE_ORE_GEN = new WorldGenIronMagnetiteOre(event.getRand());
            IRON_MAGNETITE_ORE_GEN.generate(event.getWorld(), event.getRand(), event.getPos());
        }
        if (ConfigMain.config_generate_iron_magnetite.Gen) {
            WorldGenIronHematiteOre.FixConfig();
            IRON_HEMATITE_ORE_GEN = new WorldGenIronHematiteOre(event.getRand());
            IRON_HEMATITE_ORE_GEN.generate(event.getWorld(), event.getRand(), event.getPos());
        }
    }

    public WorldGeneratorLoader() {
        MinecraftForge.ORE_GEN_BUS.register(this);
    }
}
