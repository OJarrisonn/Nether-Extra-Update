package com.ojarrisonn.nethereu.data;

import com.ojarrisonn.nethereu.tags.ModBlockTags;
import com.ojarrisonn.nethereu.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        addBlocksToTag(BlockTags.NYLIUM, ModBlocks.BLAZING_NYLIUM);

        addBlocksToTag(ModBlockTags.BLAZING_STEMS,
                ModBlocks.BLAZING_STEM,
                ModBlocks.BLAZING_HYPHAE,
                ModBlocks.STRIPPED_BLAZING_HYPHAE,
                ModBlocks.STRIPPED_BLAZING_STEM);

        addBlocksToTag(BlockTags.WART_BLOCKS, ModBlocks.BLAZING_WART_BLOCK);

        addBlocksToTag(BlockTags.REPLACEABLE,
                ModBlocks.INCANDESCENT_BLAZING_FUNGUS,
                ModBlocks.BLAZING_ROOTS);

        addBlocksToTag(BlockTags.REPLACEABLE_BY_TREES,
                ModBlocks.INCANDESCENT_BLAZING_FUNGUS,
                ModBlocks.BLAZING_ROOTS);

        addBlocksToTag(BlockTags.PLANKS, ModBlocks.BLAZING_PLANKS);

        addBlocksToTag(BlockTags.WOODEN_SLABS, ModBlocks.BLAZING_SLAB);
        addBlocksToTag(BlockTags.SLABS, ModBlocks.BLAZING_SLAB);
        addBlocksToTag(BlockTags.WOODEN_STAIRS, ModBlocks.BLAZING_STAIRS);
        addBlocksToTag(BlockTags.STAIRS, ModBlocks.BLAZING_STAIRS);
        addBlocksToTag(BlockTags.WOODEN_FENCES, ModBlocks.BLAZING_FENCE);
        addBlocksToTag(BlockTags.FENCES, ModBlocks.BLAZING_FENCE);

        addBlocksToTag(BlockTags.PIGLIN_REPELLENTS, ModBlocks.INCANDESCENT_BLAZING_FUNGUS);

        addBlocksToTag(ModBlockTags.NICKEL_ORES, ModBlocks.NICKEL_ORE);
        addBlocksToTag(ModBlockTags.NICKEL_BLOCKS, ModBlocks.NICKEL_BLOCK);
        addBlocksToTag(ModBlockTags.RAW_NICKEL_BLOCKS, ModBlocks.RAW_NICKEL_BLOCK);

        addBlocksToTag(ModBlockTags.RUBY_ORES, ModBlocks.RUBY_ORE);
        addBlocksToTag(ModBlockTags.RUBY_BLOCKS, ModBlocks.RUBY_BLOCK);

        addBlocksToTag(BlockTags.BASE_STONE_NETHER,
                ModBlocks.MARBLE,
                ModBlocks.SOUL_STONE);

        addBlocksToTag(BlockTags.SOUL_FIRE_BASE_BLOCKS, ModBlocks.SOUL_STONE);
        addBlocksToTag(BlockTags.SOUL_SPEED_BLOCKS, ModBlocks.SOUL_STONE);

        addBlocksToTag(BlockTags.PICKAXE_MINEABLE,
                ModBlocks.NICKEL_BLOCK,
                ModBlocks.NICKEL_ORE,
                ModBlocks.RAW_NICKEL_BLOCK,
                ModBlocks.RUBY_BLOCK,
                ModBlocks.RUBY_ORE,
                ModBlocks.SOUL_STONE,
                ModBlocks.SOUL_STONE_STAIRS,
                ModBlocks.SOUL_STONE_SLAB,
                ModBlocks.MARBLE,
                ModBlocks.MARBLE_STAIRS,
                ModBlocks.MARBLE_SLAB,
                ModBlocks.MARBLE_WALL,
                ModBlocks.POLISHED_MARBLE,
                ModBlocks.POLISHED_MARBLE_STAIRS,
                ModBlocks.POLISHED_MARBLE_SLAB,
                ModBlocks.BLACK_QUARTZ_ORE,
                ModBlocks.BLACK_QUARTZ_BLOCK,
                ModBlocks.BLACK_QUARTZ_PILLAR,
                ModBlocks.BLACK_QUARTZ_BRICKS,
                ModBlocks.CHISELED_BLACK_QUARTZ_BLOCK,
                ModBlocks.SMOOTH_BLACK_QUARTZ,
                ModBlocks.SMOOTH_BLACK_QUARTZ_STAIRS,
                ModBlocks.SMOOTH_BLACK_QUARTZ_SLAB);

        addBlocksToTag(BlockTags.NEEDS_STONE_TOOL,
                ModBlocks.BLACK_QUARTZ_ORE,
                ModBlocks.BLACK_QUARTZ_BLOCK,
                ModBlocks.BLACK_QUARTZ_STAIRS,
                ModBlocks.BLACK_QUARTZ_SLAB,
                ModBlocks.BLACK_QUARTZ_PILLAR,
                ModBlocks.BLACK_QUARTZ_BRICKS,
                ModBlocks.CHISELED_BLACK_QUARTZ_BLOCK,
                ModBlocks.SMOOTH_BLACK_QUARTZ,
                ModBlocks.SMOOTH_BLACK_QUARTZ_STAIRS,
                ModBlocks.SMOOTH_BLACK_QUARTZ_SLAB,
                ModBlocks.NICKEL_ORE,
                ModBlocks.RAW_NICKEL_BLOCK);

        addBlocksToTag(BlockTags.NEEDS_IRON_TOOL,
                ModBlocks.NICKEL_BLOCK,
                ModBlocks.RUBY_BLOCK,
                ModBlocks.RUBY_ORE);

        getOrCreateTagBuilder(BlockTags.LOGS)
                .addTag(ModBlockTags.BLAZING_STEMS);

        getOrCreateTagBuilder(BlockTags.BEACON_BASE_BLOCKS)
                .addTag(ModBlockTags.NICKEL_BLOCKS)
                .addTag(ModBlockTags.RUBY_BLOCKS);
    }

    private void addBlocksToTag(TagKey<Block> tag, Block... blocks) {
        getOrCreateTagBuilder(tag).add(blocks);
    }
}
