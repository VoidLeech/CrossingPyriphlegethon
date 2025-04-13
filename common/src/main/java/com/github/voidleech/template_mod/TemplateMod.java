package com.github.voidleech.template_mod;

import com.github.voidleech.oblivion.util.Registration;
import com.mojang.logging.LogUtils;
import net.minecraftforge.fml.config.ModConfig;
import org.slf4j.Logger;

public class TemplateMod {

    public static final String MOD_ID = "template_mod";
    public static final Logger LOGGER = LogUtils.getLogger();

    public static void init() {
        // Vanilla registration order can be found in BuiltInRegistries, try to match it here
        // Fabric can have registration depend on config, but Forge can't, so don't.
        Registration.registerConfig(TemplateModConfig.COMMON, ModConfig.Type.COMMON, MOD_ID);
        Registration.registerConfig(TemplateModConfig.SERVER, ModConfig.Type.SERVER, MOD_ID);
    }
}