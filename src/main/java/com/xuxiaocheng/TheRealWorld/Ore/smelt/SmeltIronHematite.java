package com.xuxiaocheng.TheRealWorld.Ore.smelt;

import com.xuxiaocheng.TheRealWorld.Ore.BlockLoader;
import com.xuxiaocheng.TheRealWorld.Ore.ItemLoader;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SmeltIronHematite {
    public static void register() {
        GameRegistry.addSmelting(BlockLoader.IRON_ORE_HEMATITE, new ItemStack(ItemLoader.IRON_INGOT_HEMATITE), 0.7F);
    }
}
