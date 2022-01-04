package com.xuxiaocheng.TheRealWorld.Weight;

import com.xuxiaocheng.TheRealWorld.Weight.config.ConfigMain;
import com.xuxiaocheng.TheRealWorld.Weight.weight.*;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

import java.util.HashMap;

public class WeightLoader {
    public static Double WEIGHT = 0D;
    private static final HashMap<Item, Double> weight_list = new HashMap<>();

    public static void load() {
        VanillaWeightLib.add();
    }

    public static Double getItemWeight(Item item) {
        if (!weight_list.containsKey(item))
            return ConfigMain.default_weight;
        return weight_list.get(item);
    }

    public static Double getItemsWeight(ItemStack item) {
        if (item.isEmpty() || item == ItemStack.EMPTY || item.getUnlocalizedName().equals("tile.air"))
            return 0D;
        return item.getCount() * getItemWeight(item.getItem());
    }

    public static void add(Item item, double weight) {
        add(item, Double.valueOf(weight));
    }

    public static void add(Item item, Double weight) {
        weight_list.put(item, weight);
    }

    public static void add(Block block, double weight) {
        ItemBlock item = new ItemBlock(block);
        add(item, Double.valueOf(weight));
    }

    public static void add(Block block, Double weight) {
        ItemBlock item = new ItemBlock(block);
        add(item, weight);
    }

    public static void set(Double weight) {
        WEIGHT = weight;
    }
}
