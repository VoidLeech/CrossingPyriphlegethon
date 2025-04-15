package com.github.voidleech.crossing_pyriphlegethon;

import com.github.voidleech.crossing_pyriphlegethon.init.PhlegethonItems;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class CrossingPyriphlegethon {

    public static final String MOD_ID = "crossing_pyriphlegethon";
    public static final Logger LOGGER = LogUtils.getLogger();

    public static void init() {
        PhlegethonItems.init();
    }
}