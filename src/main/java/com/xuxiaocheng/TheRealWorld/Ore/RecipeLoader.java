package com.xuxiaocheng.TheRealWorld.Ore;

import com.xuxiaocheng.TheRealWorld.Ore.recipe.*;
import net.minecraft.util.ResourceLocation;

public class RecipeLoader {
    public static final ResourceLocation resourceGroup = new ResourceLocation("the_real_world_ore");
    public static void load() {
        Log.logger(Log.LOGGER_LEVEL.DEBUG, "RecipeLoader load starting.");
        Log.logger(Log.LOGGER_LEVEL.DEBUG, "Register RecipeIronSiderite.");
        RecipeIronSiderite.register();
        Log.logger(Log.LOGGER_LEVEL.DEBUG, "Register RecipeIronPyrite.");
        RecipeIronPyrite.register();
        Log.logger(Log.LOGGER_LEVEL.DEBUG, "Register RecipeIronMagnetite.");
        RecipeIronMagnetite.register();
        Log.logger(Log.LOGGER_LEVEL.DEBUG, "Register RecipeIronHematite.");
        RecipeIronHematite.register();
        Log.logger(Log.LOGGER_LEVEL.DEBUG, "RecipeLoad load finished.");
    }
}
