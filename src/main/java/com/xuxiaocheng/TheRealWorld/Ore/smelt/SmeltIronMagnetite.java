package com.xuxiaocheng.TheRealWorld.Ore.smelt;

import com.xuxiaocheng.TheRealWorld.Ore.BlockLoader;
import com.xuxiaocheng.TheRealWorld.Ore.ItemLoader;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SmeltIronMagnetite {
    public static void register() {
        GameRegistry.addSmelting(BlockLoader.IRON_ORE_MAGNETITE, new ItemStack(ItemLoader.IRON_INGOT_MAGNETITE), 0.7F);
    }
}
