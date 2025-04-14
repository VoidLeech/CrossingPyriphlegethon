package com.github.voidleech.crossing_pyriphlegethon;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(CrossingPyriphlegethon.MOD_ID)
public class CrossingPyriphlegethonForge {
    
    public CrossingPyriphlegethonForge() {
        CrossingPyriphlegethon.init();
        IEventBus forgeEventBus = MinecraftForge.EVENT_BUS;
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> () -> CrossingPyriphlegethonForgeClient.init(forgeEventBus, modEventBus));
    }
}