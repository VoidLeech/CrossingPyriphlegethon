package com.github.voidleech.template_mod;

import net.fabricmc.api.ModInitializer;

public class TemplateModFabric implements ModInitializer {
    
    @Override
    public void onInitialize() {
        TemplateMod.init();
    }
}
