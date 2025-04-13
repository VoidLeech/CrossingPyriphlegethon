package com.github.voidleech.template_mod.platform;

import com.github.voidleech.template_mod.TemplateMod;
import com.github.voidleech.template_mod.platform.services.IPlatformHelper;

import java.util.ServiceLoader;


public class Services {

    public static final IPlatformHelper PLATFORM = load(IPlatformHelper.class);

    public static <T> T load(Class<T> clazz) {

        final T loadedService = ServiceLoader.load(clazz)
                .findFirst()
                .orElseThrow(() -> new NullPointerException("Failed to load service for " + clazz.getName()));
        TemplateMod.LOGGER.debug("Loaded {} for service {}", loadedService, clazz);
        return loadedService;
    }
}