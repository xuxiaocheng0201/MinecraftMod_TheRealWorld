package com.xuxiaocheng.TheRealWorld.Ore.block;

import com.xuxiaocheng.TheRealWorld.Core.block.BlockBase;
import com.xuxiaocheng.TheRealWorld.Ore.BlockLoader;
import com.xuxiaocheng.TheRealWorld.Ore.CreativeTabsLoader;
import com.xuxiaocheng.TheRealWorld.Ore.ItemLoader;
import com.xuxiaocheng.TheRealWorld.Ore.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

@Mod.EventBusSubscriber(modid = Reference.MOD_ID)
public class IronOreHematite extends BlockBase {
    public IronOreHematite() {
        super("iron_ore_hematite", Material.ROCK, CreativeTabsLoader.TheRealWorld_Ore);
        this.setHardness(3);
        this.setHarvestLevel("pickaxe", 1);
        this.setResistance(13);
        PreRegister(BlockLoader.BLOCKS, ItemLoader.ITEMS);
    }

    @SubscribeEvent
    public void register(RegistryEvent.Register<Block> event) {
        event.getRegistry().register(this);
    }

    @SubscribeEvent
    public void register_item(RegistryEvent.Register<Item> event) {
        if (this.getRegistryName() == null)
            return;
        Item item = new ItemBlock(this);
        item.setRegistryName(this.getRegistryName());
        event.getRegistry().register(item);
        OreDictionary.registerOre("oreIron", this);
        OreDictionary.registerOre("oreIronHematite", item);
    }

    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public void register_model(ModelRegistryEvent event) {
        BlockBase.registerRender(this);
    }
}
