package com.xuxiaocheng.TheRealWorld.Ore.recipe;

import com.xuxiaocheng.TheRealWorld.Ore.BlockLoader;
import com.xuxiaocheng.TheRealWorld.Ore.ItemLoader;
import com.xuxiaocheng.TheRealWorld.Ore.RecipeLoader;
import com.xuxiaocheng.TheRealWorld.Ore.Reference;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class RecipeIronHematite {
    private static final Ingredient iron_nugget_hematite = Ingredient.fromStacks(OreDictionary.getOres("nuggetIronHematite").toArray(new ItemStack[0]));
    private static final Ingredient iron_ingot_hematite = Ingredient.fromStacks(OreDictionary.getOres("ingotIronHematite").toArray(new ItemStack[0]));
    private static final Ingredient iron_block_hematite = Ingredient.fromStacks(OreDictionary.getOres("blockIronHematite").toArray(new ItemStack[0]));

    public static void register() {
        GameRegistry.addShapelessRecipe(new ResourceLocation(Reference.MOD_ID+":iron_block_hematite_1"), RecipeLoader.resourceGroup,
                new ItemStack(BlockLoader.IRON_BLOCK_HEMATITE),
                iron_ingot_hematite, iron_ingot_hematite, iron_ingot_hematite,
                iron_ingot_hematite, iron_ingot_hematite, iron_ingot_hematite,
                iron_ingot_hematite, iron_ingot_hematite, iron_ingot_hematite);
        GameRegistry.addShapelessRecipe(new ResourceLocation(Reference.MOD_ID+":iron_block_hematite_2"), RecipeLoader.resourceGroup,
                new ItemStack(ItemLoader.IRON_INGOT_HEMATITE, 9),
                iron_block_hematite);
        GameRegistry.addShapelessRecipe(new ResourceLocation(Reference.MOD_ID+":iron_nugget_hematite_1"), RecipeLoader.resourceGroup,
                new ItemStack(ItemLoader.IRON_INGOT_HEMATITE),
                iron_nugget_hematite, iron_nugget_hematite, iron_nugget_hematite,
                iron_nugget_hematite, iron_nugget_hematite, iron_nugget_hematite,
                iron_nugget_hematite, iron_nugget_hematite, iron_nugget_hematite);
        GameRegistry.addShapelessRecipe(new ResourceLocation(Reference.MOD_ID+":iron_nugget_hematite_2"), RecipeLoader.resourceGroup,
                new ItemStack(ItemLoader.IRON_NUGGET_HEMATITE, 9),
                iron_ingot_hematite);
    }
}
