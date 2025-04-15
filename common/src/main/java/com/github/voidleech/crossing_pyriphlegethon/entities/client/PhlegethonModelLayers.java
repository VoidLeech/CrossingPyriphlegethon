package com.github.voidleech.crossing_pyriphlegethon.entities.client;

import com.github.voidleech.crossing_pyriphlegethon.CrossingPyriphlegethon;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.resources.ResourceLocation;

public class PhlegethonModelLayers {
    public static final ModelLayerLocation CRIMSON_BOAT_LAYER = new ModelLayerLocation(
            new ResourceLocation(CrossingPyriphlegethon.MOD_ID, "boat/crimson"), "main");
    public static final ModelLayerLocation CRIMSON_CHEST_BOAT_LAYER = new ModelLayerLocation(
            new ResourceLocation(CrossingPyriphlegethon.MOD_ID, "chest_boat/crimson"), "main");
    public static final ModelLayerLocation WARPED_BOAT_LAYER = new ModelLayerLocation(
            new ResourceLocation(CrossingPyriphlegethon.MOD_ID, "boat/warped"), "main");
    public static final ModelLayerLocation WARPED_CHEST_BOAT_LAYER = new ModelLayerLocation(
            new ResourceLocation(CrossingPyriphlegethon.MOD_ID, "chest_boat/warped"), "main");
}
