package com.xuxiaocheng.TheRealWorld.Biome;

import com.xuxiaocheng.TheRealWorld.Biome.biome.*;
import com.xuxiaocheng.TheRealWorld.Core.log.LogBase;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

@Mod.EventBusSubscriber(modid = Reference.MOD_ID)
public class BiomeLoader {
    public static Biome VOLCANO;

    public static void load() {
        Log.logger(LogBase.LOGGER_LEVEL.DEBUG, "BiomeLoader load starting.");
        Log.logger(LogBase.LOGGER_LEVEL.ALL, "Instantiating BiomeVolcano.");
        VOLCANO = new BiomeVolcano();
        Log.logger(LogBase.LOGGER_LEVEL.DEBUG, "BiomeLoader load finished.");
    }

    @SubscribeEvent
    public static void register(RegistryEvent.Register<Biome> event) {
        load();
        event.getRegistry().register(VOLCANO);
        BiomeDictionary.addTypes(VOLCANO, BiomeVolcano.types);
    }
}
