package com.xuxiaocheng.TheRealWorld.Weight;

import com.xuxiaocheng.TheRealWorld.Weight.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION,
        acceptedMinecraftVersions = Reference.ACCEPTED_VERSION,
        guiFactory = "com.xuxiaocheng.TheRealWorld.Weight.ConfigLoader",
        dependencies = "required-after:the_real_world_ore@[1.0.5,);")
public class TheRealWorld_Weight {
    @Instance
    public static TheRealWorld_Weight instance;
    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
    public static CommonProxy proxy;
    @EventHandler
    public static void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
    }
    @EventHandler
    public static void init(FMLInitializationEvent event) {
        proxy.init(event);
    }
    @EventHandler
    public static void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }
}
