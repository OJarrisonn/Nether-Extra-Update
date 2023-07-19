package com.ojarrisonn.nethereu.data;

import com.ojarrisonn.nethereu.tags.ModBlockTags;
import com.ojarrisonn.nethereu.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(BlockTags.NYLIUM).add(ModBlocks.BLAZING_NYLIUM);

        getOrCreateTagBuilder(ModBlockTags.BLAZING_STEMS)
                .add(ModBlocks.BLAZING_STEM)
                .add(ModBlocks.BLAZING_HYPHAE)
                .add(ModBlocks.STRIPPED_BLAZING_HYPHAE)
                .add(ModBlocks.STRIPPED_BLAZING_STEM);

        getOrCreateTagBuilder(BlockTags.LOGS).addTag(ModBlockTags.BLAZING_STEMS);

        getOrCreateTagBuilder(BlockTags.PLANKS).add(ModBlocks.BLAZING_PLANKS);

        getOrCreateTagBuilder(BlockTags.PIGLIN_REPELLENTS).add(ModBlocks.INCANDESCENT_BLAZING_FUNGUS);
    }
}
