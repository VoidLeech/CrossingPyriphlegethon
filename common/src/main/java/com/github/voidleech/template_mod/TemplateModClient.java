package com.github.voidleech.template_mod;

import com.github.voidleech.oblivion.util.Registration;
import net.minecraftforge.fml.config.ModConfig;

public class TemplateModClient {
    public static void init() {
        Registration.registerConfig(TemplateModClientConfig.CLIENT, ModConfig.Type.CLIENT, TemplateMod.MOD_ID);
    }
}
