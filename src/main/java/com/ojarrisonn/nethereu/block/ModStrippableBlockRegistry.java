package com.ojarrisonn.nethereu.block;

import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;

public class ModStrippableBlockRegistry {
    /**
     * Triggers the registering of blocks that can be stripped with an axe
     * */
    public static void registerStrippableBlocks() {
        StrippableBlockRegistry.register(ModBlocks.BLAZING_STEM, ModBlocks.STRIPPED_BLAZING_STEM);
        StrippableBlockRegistry.register(ModBlocks.BLAZING_HYPHAE, ModBlocks.STRIPPED_BLAZING_HYPHAE);
    }
}
