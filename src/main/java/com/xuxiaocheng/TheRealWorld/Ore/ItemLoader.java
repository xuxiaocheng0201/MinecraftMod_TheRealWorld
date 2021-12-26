package com.xuxiaocheng.TheRealWorld.Ore;

import com.xuxiaocheng.TheRealWorld.Core.item.ItemBase;
import com.xuxiaocheng.TheRealWorld.Ore.item.*;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemLoader {
    public static List<Item> ITEMS = new ArrayList<>();

    public static ItemBase IRON_INGOT_SIDERITE;
    public static ItemBase IRON_NUGGET_SIDERITE;
    public static ItemBase IRON_INGOT_PYRITE;
    public static ItemBase IRON_NUGGET_PYRITE;
    public static ItemBase IRON_INGOT_MAGNETITE;
    public static ItemBase IRON_NUGGET_MAGNETITE;
    public static ItemBase IRON_INGOT_HEMATITE;
    public static ItemBase IRON_NUGGET_HEMATITE;

    public static void load() {
        Log.logger(Log.LOGGER_LEVEL.DEBUG, "ItemLoader load starting.");
        Log.logger(Log.LOGGER_LEVEL.ALL, "Instantiating IronIngotSiderite.");
        IRON_INGOT_SIDERITE = new IronIngotSiderite();
        Log.logger(Log.LOGGER_LEVEL.ALL, "Instantiating IronNuggetSiderite.");
        IRON_NUGGET_SIDERITE = new IronNuggetSiderite();
        Log.logger(Log.LOGGER_LEVEL.ALL, "Instantiating IronIngotPyrite.");
        IRON_INGOT_PYRITE = new IronIngotPyrite();
        Log.logger(Log.LOGGER_LEVEL.ALL, "Instantiating IronNuggetPyrite.");
        IRON_NUGGET_PYRITE = new IronNuggetPyrite();
        Log.logger(Log.LOGGER_LEVEL.ALL, "Instantiating IronIngotMagnetite.");
        IRON_INGOT_MAGNETITE = new IronIngotMagnetite();
        Log.logger(Log.LOGGER_LEVEL.ALL, "Instantiating IronNuggetMagnetite.");
        IRON_NUGGET_MAGNETITE = new IronNuggetMagnetite();
        Log.logger(Log.LOGGER_LEVEL.ALL, "Instantiating IronIngotHematite.");
        IRON_INGOT_HEMATITE = new IronIngotHematite();
        Log.logger(Log.LOGGER_LEVEL.ALL, "Instantiating IronNuggetHematite.");
        IRON_NUGGET_HEMATITE = new IronNuggetHematite();
        Log.logger(Log.LOGGER_LEVEL.DEBUG, "ItemLoader load finished.");
    }
}
