package com.xuxiaocheng.TheRealWorld.Ore;

import com.xuxiaocheng.TheRealWorld.Core.worldgen.WorldGenBase;
import com.xuxiaocheng.TheRealWorld.Ore.config.ConfigGenerateIronMagnetite;
import com.xuxiaocheng.TheRealWorld.Ore.config.ConfigGenerateIronPyrite;
import com.xuxiaocheng.TheRealWorld.Ore.config.ConfigGenerateIronSiderite;
import com.xuxiaocheng.TheRealWorld.Ore.config.ConfigMain;
import com.xuxiaocheng.TheRealWorld.Ore.worldgen.WorldGenIronMagnetiteOre;
import com.xuxiaocheng.TheRealWorld.Ore.worldgen.WorldGenIronPyriteOre;
import com.xuxiaocheng.TheRealWorld.Ore.worldgen.WorldGenIronSideriteOre;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.terraingen.OreGenEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = Reference.MOD_ID)
public class WorldGeneratorLoader {
    public static WorldGenBase IRON_SIDERITE_ORE_GEN;
    public static WorldGenBase IRON_PYRITE_ORE_GEN;
    public static WorldGenBase IRON_MAGNETITE_ORE_GEN;

    @SubscribeEvent
    public void onOreGenPost(OreGenEvent.Post event) {
        if (ConfigMain.config_generate_iron_siderite.Gen) {
            Log.logger(Log.LOGGER_LEVEL.DEBUG, "Generating iron siderite.");
            IRON_SIDERITE_ORE_GEN = new WorldGenIronSideriteOre(event.getRand());
            IRON_SIDERITE_ORE_GEN.generate(event.getWorld(), event.getRand(), event.getPos());
        }
        if (ConfigGenerateIronPyrite.Gen) {
            Log.logger(Log.LOGGER_LEVEL.DEBUG, "Generating iron pyrite.");
            IRON_PYRITE_ORE_GEN = new WorldGenIronPyriteOre(event.getRand());
            IRON_PYRITE_ORE_GEN.generate(event.getWorld(), event.getRand(), event.getPos());
        }
        if (ConfigGenerateIronMagnetite.Gen) {
            Log.logger(Log.LOGGER_LEVEL.DEBUG, "Generating iron magnetite.");
            IRON_MAGNETITE_ORE_GEN = new WorldGenIronMagnetiteOre(event.getRand());
            IRON_MAGNETITE_ORE_GEN.generate(event.getWorld(), event.getRand(), event.getPos());
        }
    }

    public WorldGeneratorLoader() {
        MinecraftForge.ORE_GEN_BUS.register(this);
    }
}
