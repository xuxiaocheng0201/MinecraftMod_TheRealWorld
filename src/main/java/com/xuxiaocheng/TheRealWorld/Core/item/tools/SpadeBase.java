package com.xuxiaocheng.TheRealWorld.Core.item.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;

public class SpadeBase extends ItemSpade {
    public SpadeBase(String name, ToolMaterial materialIn, CreativeTabs tab) {
        super(materialIn);
        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(tab);
    }
}
