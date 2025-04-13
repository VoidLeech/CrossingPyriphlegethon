package com.github.voidleech.template_mod;

import net.minecraftforge.eventbus.api.IEventBus;

public class TemplateModForgeClient {
    public static void init(IEventBus forgeEventBus, IEventBus modEventBus) {
        TemplateModClient.init();
    }
}
