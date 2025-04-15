package com.github.voidleech.crossing_pyriphlegethon.init;

import com.github.voidleech.crossing_pyriphlegethon.CrossingPyriphlegethon;
import com.github.voidleech.crossing_pyriphlegethon.entities.PhlegethonBoatType;
import com.github.voidleech.oblivion.items.OblivionBoatItem;
import com.github.voidleech.oblivion.services.Services;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;

import java.util.function.Supplier;

public class PhlegethonItems {

    public static final Supplier<OblivionBoatItem> CRIMSON_BOAT = register("crimson_boat", () -> new OblivionBoatItem(false, PhlegethonBoatType.CRIMSON, new Item.Properties().stacksTo(1)));
    public static final Supplier<OblivionBoatItem> CRIMSON_CHEST_BOAT = register("crimson_chest_boat", () -> new OblivionBoatItem(true, PhlegethonBoatType.CRIMSON, new Item.Properties().stacksTo(1)));
    public static final Supplier<OblivionBoatItem> WARPED_BOAT = register("warped_boat", () -> new OblivionBoatItem(false, PhlegethonBoatType.WARPED, new Item.Properties().stacksTo(1)));
    public static final Supplier<OblivionBoatItem> WARPED_CHEST_BOAT = register("warped_chest_boat", () -> new OblivionBoatItem(true, PhlegethonBoatType.WARPED, new Item.Properties().stacksTo(1)));

    public static <T extends Item> Supplier<T> register(String name, Supplier<T> sup){
        return Services.PLATFORM.register(BuiltInRegistries.ITEM, CrossingPyriphlegethon.MOD_ID, name, sup);
    }

    public static void init() {
    }
}
