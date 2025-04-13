package com.github.voidleech.template_mod;

import net.fabricmc.api.ClientModInitializer;

public class TemplateModFabricClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        TemplateModClient.init();
    }
}
