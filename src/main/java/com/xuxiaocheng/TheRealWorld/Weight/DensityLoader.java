package com.xuxiaocheng.TheRealWorld.Weight;

import com.xuxiaocheng.TheRealWorld.Weight.density.VanillaDensityLib;

import java.util.HashMap;

public class DensityLoader {
    public static HashMap<String, Double> DENSITY = new HashMap<>();

    public static void load() {
        VanillaDensityLib.add();
    }
}
