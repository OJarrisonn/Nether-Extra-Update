package com.ojarrisonn.nethereu.block;

import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;

public class ModStrippableBlockRegistry {
    public static void registerStrippableBlocks() {
        StrippableBlockRegistry.register(ModBlocks.BLAZING_STEM, ModBlocks.STRIPPED_BLAZING_STEM);
        StrippableBlockRegistry.register(ModBlocks.BLAZING_HYPHAE, ModBlocks.STRIPPED_BLAZING_HYPHAE);
    }
}
