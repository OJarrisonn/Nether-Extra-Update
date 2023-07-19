package com.ojarrisonn.nethereu.data;

import com.ojarrisonn.nethereu.tags.ModBlockTags;
import com.ojarrisonn.nethereu.tags.ModItemTags;
import com.ojarrisonn.nethereu.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {

    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        copy(ModBlockTags.BLAZING_STEMS, ModItemTags.BLAZING_STEMS);

        getOrCreateTagBuilder(ModItemTags.GEMS).add(ModItems.RUBY);
        getOrCreateTagBuilder(ModItemTags.RUBIES).add(ModItems.RUBY);

        getOrCreateTagBuilder(ModItemTags.NICKEL_NUGGETS).add(ModItems.NICKEL_NUGGET);
        getOrCreateTagBuilder(ModItemTags.NICKEL_INGOTS).add(ModItems.NICKEL_INGOT);
        getOrCreateTagBuilder(ModItemTags.RAW_NICKEL_ORES).add(ModItems.RAW_NICKEL);

        copy(BlockTags.LOGS, ItemTags.LOGS);

    }
}
