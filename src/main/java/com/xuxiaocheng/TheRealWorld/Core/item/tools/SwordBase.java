package com.xuxiaocheng.TheRealWorld.Core.item.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class SwordBase extends ItemSword {
    public SwordBase(String name, ToolMaterial materialIn, CreativeTabs tab) {
        super(materialIn);
        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(tab);
    }
}
