package com.xuxiaocheng.TheRealWorld.Ore.smelt;

import com.xuxiaocheng.TheRealWorld.Ore.BlockLoader;
import com.xuxiaocheng.TheRealWorld.Ore.ItemLoader;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SmeltIronPyrite {
    public static void register() {
        GameRegistry.addSmelting(BlockLoader.IRON_ORE_PYRITE, new ItemStack(ItemLoader.IRON_INGOT_PYRITE), 0.7F);
    }
}
