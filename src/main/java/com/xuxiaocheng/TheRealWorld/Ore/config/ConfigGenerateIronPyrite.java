package com.xuxiaocheng.TheRealWorld.Ore.config;

import com.xuxiaocheng.TheRealWorld.Ore.Log;
import net.minecraftforge.common.config.Configuration;

public class ConfigGenerateIronPyrite {
    private static final String category = "world_gen_iron_pyrite";

    private static final String Gen_comment = "Generate Iron Pyrite Ore?";
    public static boolean Gen = true;

    private static final String chance_comment = "Generate chance in every pos.";
    public static int chance = 20;

    private static final String maxY_comment = "Max height it can be generated.";
    public static int maxY = 67;

    private static final String minY_comment = "Min height it can be generated.";
    public static int minY = 4;

    private static final String maxSize_comment = "Max size it can be generate once.";
    public static int maxSize = 7;

    private static final String minSize_comment = "Min size it can be generate once.";
    public static int minSize = 3;

    public static void SetConfig(Configuration config) {
        Gen = config.get(category, "Gen", true, Gen_comment).getBoolean();
        chance = config.get(category, "chance", 4, chance_comment).getInt();
        maxY = config.get(category, "maxY", 67, maxY_comment).getInt();
        minY = config.get(category, "minY", 7, minY_comment).getInt();
        maxSize = config.get(category, "maxSize", maxSize, maxSize_comment).getInt();
        minSize = config.get(category, "minSize", minSize, minSize_comment).getInt();
    }

    public static void FixConfig() {
        if (chance < 0) {
            Log.logger(Log.LOGGER_LEVEL.ERROR, "The value of chance in " + category + " is too small! Now change it to 0.");
            chance = 0;
        }
        if (chance > 10000) {
            Log.logger(Log.LOGGER_LEVEL.WARN, "The value of chance in " + category + " is too big. It may reduce the speed of Minecraft start.");
        }
        if (maxY < 1) {
            Log.logger(Log.LOGGER_LEVEL.ERROR, "The value of maxY in " + category + " is too small! Now change it to 1");
            maxY = 1;
        }
        if (maxY > 256) {
            Log.logger(Log.LOGGER_LEVEL.ERROR, "The value of maxY in " + category + " is too big! Now change it to 256");
            maxY = 256;
        }
        if (minY < 1) {
            Log.logger(Log.LOGGER_LEVEL.ERROR, "The value of minY in " + category + " is too small! Now change it to 1");
            minY = 1;
        }
        if (minY > 256) {
            Log.logger(Log.LOGGER_LEVEL.ERROR, "The value of minY in " + category + " is too big! Now change it to 256");
            minY = 256;
        }
        if (minY > maxY) {
            Log.logger(Log.LOGGER_LEVEL.WARN, "The minY is bigger than maxY in " + category + ". Now swap them.");
            int temp = maxY;
            maxY = minY;
            minY = temp;
        }
        if (maxSize < 1) {
            Log.logger(Log.LOGGER_LEVEL.ERROR, "The value of maxSize in " + category + " is too small! Now change it to 2");
            maxSize = 2;
        }
        if (minSize < 1) {
            Log.logger(Log.LOGGER_LEVEL.ERROR, "The value of minSize in " + category + " is too small! Now change it to 1");
            minSize = 1;
        }
        if (minSize > maxSize) {
            Log.logger(Log.LOGGER_LEVEL.WARN, "The minSize is bigger than maxSize in " + category + ". Now swap them.");
            int temp = maxSize;
            maxSize = minSize;
            minSize = temp;
        }
    }
}
