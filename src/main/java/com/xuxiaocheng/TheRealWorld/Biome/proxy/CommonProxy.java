package com.xuxiaocheng.TheRealWorld.Biome.proxy;

import com.xuxiaocheng.TheRealWorld.Biome.BiomeLoader;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;

public class CommonProxy {
    public void preInit(FMLPreInitializationEvent event) {
    }
    public void init(FMLInitializationEvent event) {
        BiomeLoader.load();
    }
    public void postInit(FMLPostInitializationEvent event) {
    }
}
