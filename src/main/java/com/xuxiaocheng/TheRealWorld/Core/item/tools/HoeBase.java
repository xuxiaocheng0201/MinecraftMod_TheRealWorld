package com.xuxiaocheng.TheRealWorld.Core.item.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;

public class HoeBase extends ItemHoe {
    public HoeBase(String name, ToolMaterial materialIn, CreativeTabs tab) {
        super(materialIn);
        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(tab);
    }
}
