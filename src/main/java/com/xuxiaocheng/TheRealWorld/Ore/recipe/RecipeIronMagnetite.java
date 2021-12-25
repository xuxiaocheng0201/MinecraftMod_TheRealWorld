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

public class RecipeIronMagnetite {
    private static final Ingredient iron_nugget_magnetite = Ingredient.fromStacks(OreDictionary.getOres("nuggetIronMagnetite").toArray(new ItemStack[0]));
    private static final Ingredient iron_ingot_magnetite = Ingredient.fromStacks(OreDictionary.getOres("ingotIronMagnetite").toArray(new ItemStack[0]));
    private static final Ingredient iron_block_magnetite = Ingredient.fromStacks(OreDictionary.getOres("blockIronMagnetite").toArray(new ItemStack[0]));

    public static void register() {
        GameRegistry.addShapelessRecipe(new ResourceLocation(Reference.MOD_ID+":iron_block_magnetite_1"), RecipeLoader.resourceGroup,
                new ItemStack(BlockLoader.IRON_BLOCK_SIDERITE),
                iron_ingot_magnetite, iron_ingot_magnetite, iron_ingot_magnetite,
                iron_ingot_magnetite, iron_ingot_magnetite, iron_ingot_magnetite,
                iron_ingot_magnetite, iron_ingot_magnetite, iron_ingot_magnetite);
        GameRegistry.addShapelessRecipe(new ResourceLocation(Reference.MOD_ID+":iron_block_magnetite_2"), RecipeLoader.resourceGroup,
                new ItemStack(ItemLoader.IRON_INGOT_SIDERITE, 9),
                iron_block_magnetite);
        GameRegistry.addShapelessRecipe(new ResourceLocation(Reference.MOD_ID+":iron_nugget_magnetite_1"), RecipeLoader.resourceGroup,
                new ItemStack(ItemLoader.IRON_INGOT_SIDERITE),
                iron_nugget_magnetite, iron_nugget_magnetite, iron_nugget_magnetite,
                iron_nugget_magnetite, iron_nugget_magnetite, iron_nugget_magnetite,
                iron_nugget_magnetite, iron_nugget_magnetite, iron_nugget_magnetite);
        GameRegistry.addShapelessRecipe(new ResourceLocation(Reference.MOD_ID+":iron_nugget_magnetite_2"), RecipeLoader.resourceGroup,
                new ItemStack(ItemLoader.IRON_NUGGET_SIDERITE, 9),
                iron_ingot_magnetite);
    }
}
