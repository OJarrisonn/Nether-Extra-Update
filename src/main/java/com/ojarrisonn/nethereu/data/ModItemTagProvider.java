package com.ojarrisonn.nethereu.data;

import com.ojarrisonn.nethereu.block.ModBlocks;
import com.ojarrisonn.nethereu.tags.ModBlockTags;
import com.ojarrisonn.nethereu.tags.ModItemTags;
import com.ojarrisonn.nethereu.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {

    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        addItemsToTag(ModItemTags.BLAZING_STEMS,
                ModBlocks.BLAZING_STEM,
                ModBlocks.BLAZING_HYPHAE,
                ModBlocks.STRIPPED_BLAZING_HYPHAE,
                ModBlocks.STRIPPED_BLAZING_STEM);

        addItemsToTag(ModItemTags.GEMS, ModItems.RUBY);
        addItemsToTag(ModItemTags.RUBIES, ModItems.RUBY);
        addItemsToTag(ModItemTags.RUBY_ORES, ModBlocks.RUBY_ORE);
        addItemsToTag(ModItemTags.RUBY_BLOCKS, ModBlocks.RUBY_BLOCK);

        addItemsToTag(ModItemTags.NICKEL_NUGGETS, ModItems.NICKEL_NUGGET);
        addItemsToTag(ModItemTags.NICKEL_INGOTS, ModItems.NICKEL_INGOT);
        addItemsToTag(ModItemTags.RAW_NICKEL_ORES, ModItems.RAW_NICKEL);
        addItemsToTag(ModItemTags.NICKEL_ORES, ModBlocks.NICKEL_ORE);
        addItemsToTag(ModItemTags.NICKEL_BLOCKS, ModBlocks.NICKEL_BLOCK);

        getOrCreateTagBuilder(ItemTags.LOGS).addTag(ModItemTags.BLAZING_STEMS);

        getOrCreateTagBuilder(ItemTags.NON_FLAMMABLE_WOOD).addTag(ModItemTags.BLAZING_STEMS);
    }

    private void addItemsToTag(TagKey<Item> tag, ItemConvertible... itemConvertibles) {
        Item[] items = new Item[itemConvertibles.length];

        getOrCreateTagBuilder(tag).add(Arrays.stream(itemConvertibles).map(ItemConvertible::asItem).toList().toArray(items));
    }

}
