package com.github.voidleech.crossing_pyriphlegethon;

import com.github.voidleech.oblivion.util.Registration;
import com.mojang.logging.LogUtils;
import net.minecraftforge.fml.config.ModConfig;
import org.slf4j.Logger;

public class CrossingPyriphlegethon {

    public static final String MOD_ID = "crossing_pyriphlegethon";
    public static final Logger LOGGER = LogUtils.getLogger();

    public static void init() {
        // Vanilla registration order can be found in BuiltInRegistries, try to match it here
        // Fabric can have registration depend on config, but Forge can't, so don't.
    }
}