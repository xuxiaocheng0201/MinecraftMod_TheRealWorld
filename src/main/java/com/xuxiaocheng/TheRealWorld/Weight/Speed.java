package com.xuxiaocheng.TheRealWorld.Weight;

public class Speed {
    public static final double level_1 = 5000D;
    public static final double level_2 = 50000D;
    public static final double level_3 = 500000D;
    public static final double level_4 = 5000000D;
    public static final double level_5 = 50000000D;
    public static final double level_6 = 500000000D;
    public static final double level_7 = 5000000000D;

    // speed *= 100% - (15% * level)
    // level max = 7
    public static int getLevel(double weight) {
        double abs_weight = Math.abs(weight);
        if (abs_weight <= level_1)
            return 0;
        int negative = (weight < 0) ? -1 : 1;
        if (level_1 <= abs_weight && abs_weight <= level_2)
            return negative;
        if (level_2 <= abs_weight && abs_weight <= level_3)
            return negative * 2;
        if (level_3 <= abs_weight && abs_weight <= level_4)
            return negative * 3;
        if (level_4 <= abs_weight && abs_weight <= level_5)
            return negative * 4;
        if (level_5 <= abs_weight && abs_weight <= level_6)
            return negative * 5;
        if (level_6 <= abs_weight && abs_weight <= level_7)
            return negative * 6;
        return negative * 7;
    }
}
