package com.xuxiaocheng.TheRealWorld.Core.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;

public class BlockBase extends Block {
    public BlockBase(String name, Material material, CreativeTabs tab) {
        super(material);
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
        this.setCreativeTab(tab);
    }

    public void PreRegister(List<Block> BLOCKS, List<Item> ITEMS) {
        if (this.getRegistryName() == null)
            return;
        BLOCKS.add(this);
        Item item = new ItemBlock(this);
        item.setRegistryName(this.getRegistryName());
        ITEMS.add(item);
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SideOnly(Side.CLIENT)
    public static void registerRender(Block block) {
        if (block.getRegistryName() == null)
            return;
        ModelResourceLocation model = new ModelResourceLocation(block.getRegistryName(), "inventory");
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, model);
    }
}
