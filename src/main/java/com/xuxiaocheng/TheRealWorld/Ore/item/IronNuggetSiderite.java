package com.xuxiaocheng.TheRealWorld.Ore.item;

import com.xuxiaocheng.TheRealWorld.Core.item.ItemBase;
import com.xuxiaocheng.TheRealWorld.Ore.CreativeTabsLoader;
import com.xuxiaocheng.TheRealWorld.Ore.ItemLoader;
import com.xuxiaocheng.TheRealWorld.Ore.Reference;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

@Mod.EventBusSubscriber(modid = Reference.MOD_ID)
public class IronNuggetSiderite extends ItemBase {
    public IronNuggetSiderite() {
        super("iron_nugget_siderite", CreativeTabsLoader.TheRealWorld_Ore);
        PreRegister(ItemLoader.ITEMS);
    }

    @SubscribeEvent
    public void register(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(this);
        OreDictionary.registerOre("nuggetIronSiderite", this);
    }

    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public void register_model(ModelRegistryEvent event) {
        ItemBase.registerRender(this);
    }
}
