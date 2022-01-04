package com.xuxiaocheng.TheRealWorld.Weight.proxy;

import com.xuxiaocheng.TheRealWorld.Weight.CapabilityLoader;
import com.xuxiaocheng.TheRealWorld.Weight.DensityLoader;
import com.xuxiaocheng.TheRealWorld.Weight.WeightLoader;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;

public class CommonProxy {
    public void preInit(FMLPreInitializationEvent event) {
        DensityLoader.load();
        WeightLoader.load();
        CapabilityLoader.register();
    }
    public void init(FMLInitializationEvent event) {
    }
    public void postInit(FMLPostInitializationEvent event) {
    }
}
