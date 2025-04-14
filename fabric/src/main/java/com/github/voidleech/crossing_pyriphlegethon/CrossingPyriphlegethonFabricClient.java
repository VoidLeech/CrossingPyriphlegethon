package com.github.voidleech.crossing_pyriphlegethon;

import net.fabricmc.api.ClientModInitializer;

public class CrossingPyriphlegethonFabricClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        CrossingPyriphlegethonClient.init();
    }
}
