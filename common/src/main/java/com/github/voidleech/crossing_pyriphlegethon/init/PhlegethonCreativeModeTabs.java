package com.github.voidleech.crossing_pyriphlegethon.init;

import com.github.voidleech.crossing_pyriphlegethon.CrossingPyriphlegethon;
import com.github.voidleech.oblivion.services.Services;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;

import java.util.function.Supplier;

public class PhlegethonCreativeModeTabs {
    public static final Supplier<CreativeModeTab> TAB = register("phlegethon_tab",
            () -> CreativeModeTab.builder(CreativeModeTab.Row.TOP, 0)
                    .title(Component.translatable("itemGroup.crossing_pyriphlegethon.base"))
                    .icon(PhlegethonItems.CRIMSON_BOAT.get()::getDefaultInstance)
                    .displayItems(new PhlegethonDisplayItemGenerator())
                    .build());

    public static <T extends CreativeModeTab> Supplier<T> register(String name, Supplier<T> sup){
        return Services.PLATFORM.register(BuiltInRegistries.CREATIVE_MODE_TAB, CrossingPyriphlegethon.MOD_ID, name, sup);
    }

    public static void init() {
    }

    private static class PhlegethonDisplayItemGenerator implements CreativeModeTab.DisplayItemsGenerator {

        @Override
        public void accept(CreativeModeTab.ItemDisplayParameters parameters, CreativeModeTab.Output output) {
            output.accept(PhlegethonItems.CRIMSON_BOAT.get());
            output.accept(PhlegethonItems.CRIMSON_CHEST_BOAT.get());
            output.accept(PhlegethonItems.WARPED_BOAT.get());
            output.accept(PhlegethonItems.WARPED_CHEST_BOAT.get());
        }
    }

}
