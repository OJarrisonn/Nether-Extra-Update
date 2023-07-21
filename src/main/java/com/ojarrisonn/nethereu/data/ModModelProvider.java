package com.ojarrisonn.nethereu.data;

import com.ojarrisonn.nethereu.block.ModBlocks;
import com.ojarrisonn.nethereu.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator generator) {
        generator.registerCubeAllModelTexturePool(ModBlocks.BLACK_QUARTZ_ORE);
        generator.registerCubeAllModelTexturePool(ModBlocks.RUBY_ORE);
        generator.registerCubeAllModelTexturePool(ModBlocks.RUBY_BLOCK);
        generator.registerCubeAllModelTexturePool(ModBlocks.NICKEL_ORE);
        generator.registerCubeAllModelTexturePool(ModBlocks.NICKEL_BLOCK);
        generator.registerCubeAllModelTexturePool(ModBlocks.RAW_NICKEL_BLOCK);

        BlockStateModelGenerator.BlockTexturePool blazing_planks = generator.registerCubeAllModelTexturePool(ModBlocks.BLAZING_PLANKS);
        blazing_planks.stairs(ModBlocks.BLAZING_STAIRS);
        blazing_planks.slab(ModBlocks.BLAZING_SLAB);
        blazing_planks.fence(ModBlocks.BLAZING_FENCE);

        generator.registerLog(ModBlocks.BLAZING_STEM).log(ModBlocks.BLAZING_STEM).wood(ModBlocks.BLAZING_HYPHAE);
        generator.registerLog(ModBlocks.STRIPPED_BLAZING_STEM).log(ModBlocks.STRIPPED_BLAZING_STEM).wood(ModBlocks.STRIPPED_BLAZING_HYPHAE);

        generator.registerNetherrackBottomCustomTop(ModBlocks.BLAZING_NYLIUM);


        generator.registerCubeAllModelTexturePool(ModBlocks.BLAZING_WART_BLOCK);
        generator.registerTintableCross(ModBlocks.BLAZING_FUNGUS, BlockStateModelGenerator.TintType.NOT_TINTED);
        generator.registerTintableCross(ModBlocks.BLAZING_ROOTS, BlockStateModelGenerator.TintType.NOT_TINTED);
        generator.registerTintableCross(ModBlocks.INCANDESCENT_BLAZING_FUNGUS, BlockStateModelGenerator.TintType.NOT_TINTED);

        BlockStateModelGenerator.BlockTexturePool black_quartz_block = generator.registerCubeAllModelTexturePool(ModBlocks.BLACK_QUARTZ_BLOCK);
        black_quartz_block.stairs(ModBlocks.BLACK_QUARTZ_STAIRS);
        black_quartz_block.slab(ModBlocks.BLACK_QUARTZ_SLAB);

        BlockStateModelGenerator.BlockTexturePool smooth_black_quartz = generator.registerCubeAllModelTexturePool(ModBlocks.SMOOTH_BLACK_QUARTZ);
        smooth_black_quartz.stairs(ModBlocks.SMOOTH_BLACK_QUARTZ_STAIRS);
        smooth_black_quartz.slab(ModBlocks.SMOOTH_BLACK_QUARTZ_SLAB);

        generator.registerCubeAllModelTexturePool(ModBlocks.BLACK_QUARTZ_BRICKS);
        generator.registerCubeAllModelTexturePool(ModBlocks.CHISELED_BLACK_QUARTZ_BLOCK);
        generator.registerLog(ModBlocks.BLACK_QUARTZ_PILLAR).log(ModBlocks.BLACK_QUARTZ_PILLAR);

        BlockStateModelGenerator.BlockTexturePool soul_stone = generator.registerCubeAllModelTexturePool(ModBlocks.SOUL_STONE);
        soul_stone.stairs(ModBlocks.SOUL_STONE_STAIRS);
        soul_stone.slab(ModBlocks.SOUL_STONE_SLAB);
        soul_stone.wall(ModBlocks.SOUL_STONE_WALL);

        BlockStateModelGenerator.BlockTexturePool marble = generator.registerCubeAllModelTexturePool(ModBlocks.MARBLE);
        marble.stairs(ModBlocks.MARBLE_STAIRS);
        marble.slab(ModBlocks.MARBLE_SLAB);
        marble.wall(ModBlocks.MARBLE_WALL);

        BlockStateModelGenerator.BlockTexturePool polished_marble = generator.registerCubeAllModelTexturePool(ModBlocks.POLISHED_MARBLE);
        polished_marble.stairs(ModBlocks.POLISHED_MARBLE_STAIRS);
        polished_marble.slab(ModBlocks.POLISHED_MARBLE_SLAB);
    }

    @Override
    public void generateItemModels(ItemModelGenerator generator) {
        generator.register(ModItems.BLACK_QUARTZ, Models.GENERATED);
        generator.register(ModItems.NICKEL_INGOT, Models.GENERATED);
        generator.register(ModItems.NICKEL_NUGGET, Models.GENERATED);
        generator.register(ModItems.RAW_NICKEL, Models.GENERATED);
        generator.register(ModItems.SOUL_BLAZE_ROD, Models.GENERATED);
        generator.register(ModItems.SOUL_BLAZE_POWDER, Models.GENERATED);
        generator.register(ModItems.TOTEM_OF_PIGLIN_SOUL, Models.GENERATED);
        generator.register(ModItems.RUBY, Models.GENERATED);
        generator.register(ModItems.WARPED_BERRIES, Models.GENERATED);

    }
}
