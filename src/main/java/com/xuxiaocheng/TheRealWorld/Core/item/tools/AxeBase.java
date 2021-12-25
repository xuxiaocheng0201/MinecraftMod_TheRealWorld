package com.xuxiaocheng.TheRealWorld.Core.item.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

public class AxeBase extends ItemAxe {
    public AxeBase(String name, ToolMaterial materialIn, CreativeTabs tab) {
        super(materialIn);
        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(tab);
    }
}
