package com.xuxiaocheng.TheRealWorld.Core.item.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class PickaxeBase extends ItemPickaxe {
    public PickaxeBase(String name, ToolMaterial materialIn, CreativeTabs tab) {
        super(materialIn);
        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(tab);
    }
}
