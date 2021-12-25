package com.xuxiaocheng.TheRealWorld.Ore.config;

import com.xuxiaocheng.TheRealWorld.Ore.ConfigLoader;
import net.minecraftforge.common.config.Config;

public class ConfigGenerateIronSiderite {
//    private static final String category = "world_gen_iron_siderite";

    @Config.Comment("Generate Iron Siderite Ore?")
    @Config.LangKey(ConfigLoader.tooltip_title + ".configGenerateIronSiderite.Gen")
    public boolean Gen = true;

    @Config.Comment("Generate chance in every chunk.")
    @Config.LangKey(ConfigLoader.tooltip_title + ".configGenerateIronSiderite.chance")
    @Config.RangeInt(min = 1)
    public int chance = 20;

    @Config.Comment("Max height Siderite can be generated.")
    @Config.LangKey(ConfigLoader.tooltip_title + ".configGenerateIronSiderite.maxY")
    @Config.RangeInt(min = 0, max = 255)
    public int maxY = 67;

    @Config.Comment("Min height Siderite can be generated.")
    @Config.LangKey(ConfigLoader.tooltip_title + ".configGenerateIronSiderite.minY")
    @Config.RangeInt(min = 0, max = 255)
    public int minY = 4;

    @Config.Comment("Max size Siderite can be generated once.")
    @Config.LangKey(ConfigLoader.tooltip_title + ".configGenerateIronSiderite.maxSize")
    @Config.RangeInt(min = 0)
    public int maxSize = 7;

    @Config.Comment("Min size Siderite can be generated once.")
    @Config.LangKey(ConfigLoader.tooltip_title + ".configGenerateIronSiderite.minSize")
    @Config.RangeInt(min = 0)
    public int minSize = 3;

//    public static void FixConfig() {
//        if (chance < 0) {
//            Log.logger(Log.LOGGER_LEVEL.ERROR, "The value of chance in " + category + " is too small! Now change it to 0.");
//            chance = 0;
//        }
//        if (chance > 10000) {
//            Log.logger(Log.LOGGER_LEVEL.WARN, "The value of chance in " + category + " is too big. It may reduce the speed of Minecraft start.");
//        }
//        if (maxY < 1) {
//            Log.logger(Log.LOGGER_LEVEL.ERROR, "The value of maxY in " + category + " is too small! Now change it to 1");
//            maxY = 1;
//        }
//        if (maxY > 256) {
//            Log.logger(Log.LOGGER_LEVEL.ERROR, "The value of maxY in " + category + " is too big! Now change it to 256");
//            maxY = 256;
//        }
//        if (minY < 1) {
//            Log.logger(Log.LOGGER_LEVEL.ERROR, "The value of minY in " + category + " is too small! Now change it to 1");
//            minY = 1;
//        }
//        if (minY > 256) {
//            Log.logger(Log.LOGGER_LEVEL.ERROR, "The value of minY in " + category + " is too big! Now change it to 256");
//            minY = 256;
//        }
//        if (minY > maxY) {
//            Log.logger(Log.LOGGER_LEVEL.WARN, "The minY is bigger than maxY in " + category + ". Now swap them.");
//            int temp = maxY;
//            maxY = minY;
//            minY = temp;
//        }
//        if (maxSize < 1) {
//            Log.logger(Log.LOGGER_LEVEL.ERROR, "The value of maxSize in " + category + " is too small! Now change it to 2");
//            maxSize = 2;
//        }
//        if (minSize < 1) {
//            Log.logger(Log.LOGGER_LEVEL.ERROR, "The value of minSize in " + category + " is too small! Now change it to 1");
//            minSize = 1;
//        }
//        if (minSize > maxSize) {
//            Log.logger(Log.LOGGER_LEVEL.WARN, "The minSize is bigger than maxSize in " + category + ". Now swap them.");
//            int temp = maxSize;
//            maxSize = minSize;
//            minSize = temp;
//        }
//    }
}
