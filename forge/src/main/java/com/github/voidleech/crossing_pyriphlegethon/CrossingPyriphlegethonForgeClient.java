package com.github.voidleech.crossing_pyriphlegethon;

import com.github.voidleech.crossing_pyriphlegethon.entities.PhlegethonBoatType;
import com.github.voidleech.crossing_pyriphlegethon.entities.client.PhlegethonModelLayers;
import com.github.voidleech.oblivion.entities.client.OblivionBoatRenderer;
import net.minecraft.client.model.BoatModel;
import net.minecraft.client.model.ChestBoatModel;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

public class CrossingPyriphlegethonForgeClient {
    public static void init(IEventBus forgeEventBus, IEventBus modEventBus) {
        CrossingPyriphlegethonClient.init();
        modEventBus.addListener(CrossingPyriphlegethonForgeClient::onClientSetup);
        modEventBus.addListener(CrossingPyriphlegethonForgeClient::registerModelLayers);
    }


    public static void onClientSetup(FMLClientSetupEvent event)
    {
        OblivionBoatRenderer.registerBoatResources(PhlegethonBoatType.class, CrossingPyriphlegethon.MOD_ID);
    }


    public static void registerModelLayers(EntityRenderersEvent.RegisterLayerDefinitions event)
    {
        event.registerLayerDefinition(PhlegethonModelLayers.CRIMSON_BOAT_LAYER, BoatModel::createBodyModel);
        event.registerLayerDefinition(PhlegethonModelLayers.CRIMSON_CHEST_BOAT_LAYER, ChestBoatModel::createBodyModel);
        event.registerLayerDefinition(PhlegethonModelLayers.WARPED_BOAT_LAYER, BoatModel::createBodyModel);
        event.registerLayerDefinition(PhlegethonModelLayers.WARPED_CHEST_BOAT_LAYER, ChestBoatModel::createBodyModel);
    }
}
