package com.ojarrisonn.nethereu.world;

import com.ojarrisonn.nethereu.NetherEUMod;
import com.ojarrisonn.nethereu.block.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.world.gen.blockpredicate.BlockPredicate;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.HugeFungusFeatureConfig;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> BLAZING_FUNGUS_PLANTED = registerKey("blazing_fungus_planted");


    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        register(context, BLAZING_FUNGUS_PLANTED, Feature.HUGE_FUNGUS,
                new HugeFungusFeatureConfig(
                    ModBlocks.BLAZING_NYLIUM.getDefaultState(),
                    ModBlocks.BLAZING_STEM.getDefaultState(),
                    ModBlocks.BLAZING_WART_BLOCK.getDefaultState(),
                    Blocks.SHROOMLIGHT.getDefaultState(),
                    BlockPredicate.replaceable(),
                    true
                )
        );
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String id) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(NetherEUMod.MODID, id));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context, RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC config) {
        context.register(key, new ConfiguredFeature<>(feature, config));
    }
}
