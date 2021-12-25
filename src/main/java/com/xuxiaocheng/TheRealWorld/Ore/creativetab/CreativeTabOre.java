package com.xuxiaocheng.TheRealWorld.Ore.creativetab;

import com.xuxiaocheng.TheRealWorld.Ore.BlockLoader;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

import javax.annotation.Nonnull;

public class CreativeTabOre extends CreativeTabs {
    public CreativeTabOre() {
        super("TheRealWorld_Ore");
    }
    @Override
    @Nonnull
    public ItemStack getTabIconItem() {
        return new ItemStack(BlockLoader.IRON_ORE_SIDERITE);
    }
}
