package com.ojarrisonn.nethereu.data;

import com.ojarrisonn.nethereu.tags.ModBlockTags;
import com.ojarrisonn.nethereu.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
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
        addBlocksToBlockTag(BlockTags.NYLIUM, ModBlocks.BLAZING_NYLIUM);

        addBlocksToBlockTag(ModBlockTags.BLAZING_STEMS,
                ModBlocks.BLAZING_STEM,
                ModBlocks.BLAZING_HYPHAE,
                ModBlocks.STRIPPED_BLAZING_HYPHAE,
                ModBlocks.STRIPPED_BLAZING_STEM);

        addBlocksToBlockTag(BlockTags.WART_BLOCKS, ModBlocks.BLAZING_WART_BLOCK);

        addBlocksToBlockTag(BlockTags.REPLACEABLE,
                ModBlocks.INCANDESCENT_BLAZING_FUNGUS,
                ModBlocks.BLAZING_ROOTS);

        addBlocksToBlockTag(BlockTags.REPLACEABLE_BY_TREES,
                ModBlocks.INCANDESCENT_BLAZING_FUNGUS,
                ModBlocks.BLAZING_ROOTS);

        addBlocksToBlockTag(BlockTags.PLANKS, ModBlocks.BLAZING_PLANKS);

        addBlocksToBlockTag(BlockTags.WOODEN_SLABS, ModBlocks.BLAZING_SLAB);
        addBlocksToBlockTag(BlockTags.SLABS, ModBlocks.BLAZING_SLAB);
        addBlocksToBlockTag(BlockTags.WOODEN_STAIRS, ModBlocks.BLAZING_STAIRS);
        addBlocksToBlockTag(BlockTags.STAIRS, ModBlocks.BLAZING_STAIRS);
        addBlocksToBlockTag(BlockTags.WOODEN_FENCES, ModBlocks.BLAZING_FENCE, ModBlocks.BLAZING_FENCE_GATE);
        addBlocksToBlockTag(BlockTags.FENCES, ModBlocks.BLAZING_FENCE, ModBlocks.BLAZING_FENCE_GATE);

        addBlocksToBlockTag(BlockTags.PIGLIN_REPELLENTS, ModBlocks.INCANDESCENT_BLAZING_FUNGUS);

        addBlocksToBlockTag(ModBlockTags.NICKEL_ORES, ModBlocks.NICKEL_ORE);
        addBlocksToBlockTag(ModBlockTags.NICKEL_BLOCKS, ModBlocks.NICKEL_BLOCK);
        addBlocksToBlockTag(ModBlockTags.RAW_NICKEL_BLOCKS, ModBlocks.RAW_NICKEL_BLOCK);

        addBlocksToBlockTag(ModBlockTags.RUBY_ORES, ModBlocks.RUBY_ORE);
        addBlocksToBlockTag(ModBlockTags.RUBY_BLOCKS, ModBlocks.RUBY_BLOCK);

        addBlocksToBlockTag(BlockTags.BASE_STONE_NETHER,
                ModBlocks.MARBLE,
                ModBlocks.SOUL_STONE);

        addBlocksToBlockTag(BlockTags.WALLS,
                ModBlocks.MARBLE_WALL,
                ModBlocks.SOUL_STONE_WALL,
                ModBlocks.SOUL_STONE_BRICK_WALL);

        addBlocksToBlockTag(BlockTags.STONE_BRICKS,
                ModBlocks.SOUL_STONE_BRICKS);

        addBlocksToBlockTag(BlockTags.STAIRS,
                ModBlocks.SOUL_STONE_STAIRS,
                ModBlocks.SOUL_STONE_BRICK_STAIRS,
                ModBlocks.BLACK_QUARTZ_STAIRS,
                ModBlocks.SMOOTH_BLACK_QUARTZ_STAIRS,
                ModBlocks.MARBLE_STAIRS,
                ModBlocks.POLISHED_MARBLE_STAIRS);

        addBlocksToBlockTag(BlockTags.SLABS,
                ModBlocks.SOUL_STONE_SLAB,
                ModBlocks.SOUL_STONE_BRICK_SLAB,
                ModBlocks.BLACK_QUARTZ_SLAB,
                ModBlocks.SMOOTH_BLACK_QUARTZ_SLAB,
                ModBlocks.MARBLE_SLAB,
                ModBlocks.POLISHED_MARBLE_SLAB);

        addBlocksToBlockTag(BlockTags.SMELTS_TO_GLASS,
                Blocks.SOUL_SAND);

        addBlocksToBlockTag(BlockTags.SOUL_FIRE_BASE_BLOCKS,
                ModBlocks.SOUL_STONE,
                ModBlocks.SOUL_STONE_WALL,
                ModBlocks.SOUL_STONE_STAIRS,
                ModBlocks.SOUL_STONE_SLAB,
                ModBlocks.SOUL_STONE_BRICKS,
                ModBlocks.SOUL_STONE_BRICK_STAIRS,
                ModBlocks.SOUL_STONE_BRICK_SLAB,
                ModBlocks.SOUL_STONE_BRICK_WALL);

        addBlocksToBlockTag(BlockTags.SOUL_SPEED_BLOCKS,
                ModBlocks.SOUL_STONE,
                ModBlocks.SOUL_STONE_WALL,
                ModBlocks.SOUL_STONE_STAIRS,
                ModBlocks.SOUL_STONE_SLAB,
                ModBlocks.SOUL_STONE_BRICKS,
                ModBlocks.SOUL_STONE_BRICK_STAIRS,
                ModBlocks.SOUL_STONE_BRICK_SLAB,
                ModBlocks.SOUL_STONE_BRICK_WALL);

        addBlocksToBlockTag(BlockTags.PICKAXE_MINEABLE,
                ModBlocks.NICKEL_BLOCK,
                ModBlocks.NICKEL_ORE,
                ModBlocks.RAW_NICKEL_BLOCK,

                ModBlocks.RUBY_BLOCK,
                ModBlocks.RUBY_ORE,

                ModBlocks.SOUL_STONE,
                ModBlocks.SOUL_STONE_STAIRS,
                ModBlocks.SOUL_STONE_SLAB,
                ModBlocks.SOUL_STONE_WALL,

                ModBlocks.SOUL_STONE_BRICKS,
                ModBlocks.SOUL_STONE_BRICK_STAIRS,
                ModBlocks.SOUL_STONE_BRICK_SLAB,
                ModBlocks.SOUL_STONE_BRICK_WALL,

                ModBlocks.MARBLE,
                ModBlocks.MARBLE_STAIRS,
                ModBlocks.MARBLE_SLAB,
                ModBlocks.MARBLE_WALL,

                ModBlocks.POLISHED_MARBLE,
                ModBlocks.POLISHED_MARBLE_STAIRS,
                ModBlocks.POLISHED_MARBLE_SLAB,

                ModBlocks.BLACK_QUARTZ_ORE,
                ModBlocks.BLACK_QUARTZ_BLOCK,
                ModBlocks.BLACK_QUARTZ_STAIRS,
                ModBlocks.BLACK_QUARTZ_SLAB,
                ModBlocks.BLACK_QUARTZ_PILLAR,
                ModBlocks.BLACK_QUARTZ_BRICKS,
                ModBlocks.CHISELED_BLACK_QUARTZ_BLOCK,

                ModBlocks.SMOOTH_BLACK_QUARTZ,
                ModBlocks.SMOOTH_BLACK_QUARTZ_STAIRS,
                ModBlocks.SMOOTH_BLACK_QUARTZ_SLAB);

        addBlocksToBlockTag(BlockTags.HOE_MINEABLE,
                ModBlocks.WARPED_BERRY_BUSH);

        addBlocksToBlockTag(BlockTags.NEEDS_STONE_TOOL,
                ModBlocks.NICKEL_ORE,
                ModBlocks.RAW_NICKEL_BLOCK);

        addBlocksToBlockTag(BlockTags.NEEDS_IRON_TOOL,
                ModBlocks.NICKEL_BLOCK,
                ModBlocks.RUBY_BLOCK,
                ModBlocks.RUBY_ORE);

        addBlocksToBlockTag(BlockTags.HOGLIN_REPELLENTS,
                ModBlocks.WARPED_BERRY_BUSH);

        addBlocksToBlockTag(BlockTags.PIGLIN_REPELLENTS,
                ModBlocks.WARPED_BERRY_BUSH);

        addBlockTagsToBlockTag(BlockTags.LOGS,
                ModBlockTags.BLAZING_STEMS);

        addBlockTagsToBlockTag(BlockTags.BEACON_BASE_BLOCKS,
                ModBlockTags.NICKEL_BLOCKS,
                ModBlockTags.RUBY_BLOCKS);

    }

    private void addBlocksToBlockTag(TagKey<Block> tag, Block... blocks) {
        getOrCreateTagBuilder(tag).add(blocks);
    }

    @SafeVarargs
    private void addBlockTagsToBlockTag(TagKey<Block> tag, TagKey<Block>... tags) {
        FabricTagBuilder builder = getOrCreateTagBuilder(tag);

        for (TagKey<Block> t : tags) {
            builder.addTag(t);
        }
    }
}
