package com.github.voidleech.crossing_pyriphlegethon;

import net.minecraftforge.eventbus.api.IEventBus;

public class CrossingPyriphlegethonForgeClient {
    public static void init(IEventBus forgeEventBus, IEventBus modEventBus) {
        CrossingPyriphlegethonClient.init();
    }
}
