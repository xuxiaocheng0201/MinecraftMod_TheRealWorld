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

public class RecipeIronPyrite {
    private static final Ingredient iron_nugget_pyrite = Ingredient.fromStacks(OreDictionary.getOres("nuggetIronPyrite").toArray(new ItemStack[0]));
    private static final Ingredient iron_ingot_pyrite = Ingredient.fromStacks(OreDictionary.getOres("ingotIronPyrite").toArray(new ItemStack[0]));
    private static final Ingredient iron_block_pyrite = Ingredient.fromStacks(OreDictionary.getOres("blockIronPyrite").toArray(new ItemStack[0]));

    public static void register() {
        GameRegistry.addShapelessRecipe(new ResourceLocation(Reference.MOD_ID+":iron_block_pyrite_1"), RecipeLoader.resourceGroup,
                new ItemStack(BlockLoader.IRON_BLOCK_PYRITE),
                iron_ingot_pyrite, iron_ingot_pyrite, iron_ingot_pyrite,
                iron_ingot_pyrite, iron_ingot_pyrite, iron_ingot_pyrite,
                iron_ingot_pyrite, iron_ingot_pyrite, iron_ingot_pyrite);
        GameRegistry.addShapelessRecipe(new ResourceLocation(Reference.MOD_ID+":iron_block_pyrite_2"), RecipeLoader.resourceGroup,
                new ItemStack(ItemLoader.IRON_INGOT_PYRITE, 9),
                iron_block_pyrite);
        GameRegistry.addShapelessRecipe(new ResourceLocation(Reference.MOD_ID+":iron_nugget_pyrite_1"), RecipeLoader.resourceGroup,
                new ItemStack(ItemLoader.IRON_INGOT_PYRITE),
                iron_nugget_pyrite, iron_nugget_pyrite, iron_nugget_pyrite,
                iron_nugget_pyrite, iron_nugget_pyrite, iron_nugget_pyrite,
                iron_nugget_pyrite, iron_nugget_pyrite, iron_nugget_pyrite);
        GameRegistry.addShapelessRecipe(new ResourceLocation(Reference.MOD_ID+":iron_nugget_pyrite_2"), RecipeLoader.resourceGroup,
                new ItemStack(ItemLoader.IRON_NUGGET_PYRITE, 9),
                iron_ingot_pyrite);
    }
}
