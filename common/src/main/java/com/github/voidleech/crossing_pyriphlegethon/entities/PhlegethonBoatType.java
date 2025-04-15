package com.github.voidleech.crossing_pyriphlegethon.entities;

import com.github.voidleech.crossing_pyriphlegethon.CrossingPyriphlegethon;
import com.github.voidleech.crossing_pyriphlegethon.init.PhlegethonItems;
import com.github.voidleech.oblivion.entities.OblivionBoatType;
import com.github.voidleech.oblivion.items.OblivionBoatItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

import java.util.function.Supplier;

public enum PhlegethonBoatType implements OblivionBoatType {

    CRIMSON(() -> Blocks.CRIMSON_PLANKS, "crimson", () -> PhlegethonItems.CRIMSON_BOAT.get(), () -> PhlegethonItems.CRIMSON_CHEST_BOAT.get()),
    WARPED(() -> Blocks.WARPED_PLANKS, "warped", () -> PhlegethonItems.WARPED_BOAT.get(), () -> PhlegethonItems.WARPED_CHEST_BOAT.get());

    private final String name;
    private final Supplier<? extends OblivionBoatItem> boat;
    private final Supplier<? extends OblivionBoatItem> chestBoat;
    private final Supplier<? extends Block> planks;

    PhlegethonBoatType(Supplier<? extends Block> planks, String name, Supplier<? extends OblivionBoatItem> boat, Supplier<? extends OblivionBoatItem> chestBoat) {
        this.name = name;
        this.boat = boat;
        this.chestBoat = chestBoat;
        this.planks = planks;
        initOBT();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getNamespace() {
        return CrossingPyriphlegethon.MOD_ID;
    }

    @Override
    public Item getBoat() {
        return boat.get();
    }

    @Override
    public Item getChestBoat() {
        return chestBoat.get();
    }

    @Override
    public boolean fireResistant() {
        return true;
    }

    @Override
    public Block getPlanks() {
        return planks.get();
    }
}