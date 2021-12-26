package com.xuxiaocheng.TheRealWorld.Ore;

import com.xuxiaocheng.TheRealWorld.Core.block.BlockBase;
import com.xuxiaocheng.TheRealWorld.Ore.block.*;
import net.minecraft.block.Block;

import java.util.ArrayList;
import java.util.List;

public class BlockLoader {
    public static final List<Block> BLOCKS = new ArrayList<>();

    public static BlockBase IRON_ORE_SIDERITE;
    public static BlockBase IRON_BLOCK_SIDERITE;
    public static BlockBase IRON_ORE_PYRITE;
    public static BlockBase IRON_BLOCK_PYRITE;
    public static BlockBase IRON_ORE_MAGNETITE;
    public static BlockBase IRON_BLOCK_MAGNETITE;
    public static BlockBase IRON_ORE_HEMATITE;
    public static BlockBase IRON_BLOCK_HEMATITE;

    public static void load() {
        Log.logger(Log.LOGGER_LEVEL.DEBUG, "BlockLoader load starting.");
        Log.logger(Log.LOGGER_LEVEL.ALL, "Instantiating IronOreSiderite.");
        IRON_ORE_SIDERITE = new IronOreSiderite();
        Log.logger(Log.LOGGER_LEVEL.ALL, "Instantiating IronBlockSiderite.");
        IRON_BLOCK_SIDERITE = new IronBlockSiderite();
        Log.logger(Log.LOGGER_LEVEL.ALL, "Instantiating IronOrePyrite.");
        IRON_ORE_PYRITE = new IronOrePyrite();
        Log.logger(Log.LOGGER_LEVEL.ALL, "Instantiating IronBlockPyrite.");
        IRON_BLOCK_PYRITE = new IronBlockPyrite();
        Log.logger(Log.LOGGER_LEVEL.ALL, "Instantiating IronOreMagnetite");
        IRON_ORE_MAGNETITE = new IronOreMagnetite();
        Log.logger(Log.LOGGER_LEVEL.ALL, "Instantiating IronBlockMagnetite.");
        IRON_BLOCK_MAGNETITE = new IronBlockMagnetite();
        Log.logger(Log.LOGGER_LEVEL.ALL, "Instantiating IronOreHematite");
        IRON_ORE_HEMATITE = new IronOreHematite();
        Log.logger(Log.LOGGER_LEVEL.ALL, "Instantiating IronBlockHematite.");
        IRON_BLOCK_HEMATITE = new IronBlockHematite();
        Log.logger(Log.LOGGER_LEVEL.DEBUG, "BlockLoader load finished.");
    }
}
