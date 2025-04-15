package com.github.voidleech.crossing_pyriphlegethon;

import com.github.voidleech.crossing_pyriphlegethon.entities.PhlegethonBoatType;
import com.github.voidleech.crossing_pyriphlegethon.entities.client.PhlegethonModelLayers;
import com.github.voidleech.oblivion.entities.client.OblivionBoatRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.minecraft.client.model.BoatModel;
import net.minecraft.client.model.ChestBoatModel;

public class CrossingPyriphlegethonFabricClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        CrossingPyriphlegethonClient.init();
        OblivionBoatRenderer.registerBoatResources(PhlegethonBoatType.class, CrossingPyriphlegethon.MOD_ID);
        EntityModelLayerRegistry.registerModelLayer(PhlegethonModelLayers.CRIMSON_BOAT_LAYER, BoatModel::createBodyModel);
        EntityModelLayerRegistry.registerModelLayer(PhlegethonModelLayers.CRIMSON_CHEST_BOAT_LAYER, ChestBoatModel::createBodyModel);
        EntityModelLayerRegistry.registerModelLayer(PhlegethonModelLayers.WARPED_BOAT_LAYER, BoatModel::createBodyModel);
        EntityModelLayerRegistry.registerModelLayer(PhlegethonModelLayers.WARPED_CHEST_BOAT_LAYER, ChestBoatModel::createBodyModel);
    }
}
