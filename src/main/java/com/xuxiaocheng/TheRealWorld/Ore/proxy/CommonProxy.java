package com.xuxiaocheng.TheRealWorld.Ore.proxy;

import com.xuxiaocheng.TheRealWorld.Ore.*;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;

public class CommonProxy {
    public void preInit(FMLPreInitializationEvent event) {
        CreativeTabsLoader.load();
        ItemLoader.load();
        BlockLoader.load();
        new WorldGeneratorLoader();
    }
    public void init(FMLInitializationEvent event) {
        RecipeLoader.load();
        SmeltLoader.load();
    }
    public void postInit(FMLPostInitializationEvent event) {

    }
}
