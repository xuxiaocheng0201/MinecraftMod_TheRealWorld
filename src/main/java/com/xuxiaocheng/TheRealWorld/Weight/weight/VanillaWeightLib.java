package com.xuxiaocheng.TheRealWorld.Weight.weight;

import com.xuxiaocheng.TheRealWorld.Weight.DensityLoader;
import com.xuxiaocheng.TheRealWorld.Weight.WeightLoader;
import net.minecraft.init.Items;

public class VanillaWeightLib{
    public static void add() {
        WeightLoader.add(Items.AIR, 0);
        WeightLoader.add(Items.ACACIA_BOAT, 1980.0 * DensityLoader.DENSITY.get("acacia"));
        WeightLoader.add(Items.ACACIA_DOOR, 936.0 * DensityLoader.DENSITY.get("acacia"));
//        WeightLoader.add(Items.APPLE, .);
//        WeightLoader.add(Items.ARROW, );
//        WeightLoader.add(Items.ARMOR_STAND, );
    }
}
