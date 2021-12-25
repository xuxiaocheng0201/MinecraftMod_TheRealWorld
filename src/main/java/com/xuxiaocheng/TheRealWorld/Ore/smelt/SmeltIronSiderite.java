package com.xuxiaocheng.TheRealWorld.Ore.smelt;

import com.xuxiaocheng.TheRealWorld.Ore.BlockLoader;
import com.xuxiaocheng.TheRealWorld.Ore.ItemLoader;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SmeltIronSiderite {
    public static void register() {
        GameRegistry.addSmelting(BlockLoader.IRON_ORE_SIDERITE, new ItemStack(ItemLoader.IRON_INGOT_SIDERITE), 0.7F);
    }
}
