package com.ojarrisonn.nethereu.block;

import com.ojarrisonn.nethereu.NetherEUMod;
import com.ojarrisonn.nethereu.world.ModConfiguredFeatures;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import org.jetbrains.annotations.Nullable;

import java.util.Optional;

public class ModBlocks {

    public static final Block RUBY_ORE = registerBlock("ruby_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE)
                    .mapColor(MapColor.BRIGHT_RED)));
    public static final Block RUBY_BLOCK = registerBlock("ruby_block",
            new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK)
                    .mapColor(MapColor.BRIGHT_RED)));
    public static final Block NICKEL_ORE = registerBlock("nickel_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_ORE)));
    public static final Block NICKEL_BLOCK = registerBlock("nickel_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)
                    .mapColor(MapColor.YELLOW)));
    public static final Block RAW_NICKEL_BLOCK = registerBlock("raw_nickel_block",
            new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK)
                    .mapColor(MapColor.YELLOW)));

    // Black Quartz set ================================================================================================
    public static final Block BLACK_QUARTZ_BLOCK = registerBlock("black_quartz_block",
            new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK)
                    .mapColor(MapColor.DEEPSLATE_GRAY)
                    .strength(0.9f)));
    public static final Block BLACK_QUARTZ_STAIRS = registerBlock("black_quartz_stairs", new StairsBlock(BLACK_QUARTZ_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(BLACK_QUARTZ_BLOCK)));
    public static final Block BLACK_QUARTZ_SLAB = registerBlock("black_quartz_slab", new SlabBlock(FabricBlockSettings.copyOf(BLACK_QUARTZ_BLOCK)));
    public static final Block BLACK_QUARTZ_PILLAR = registerBlock("black_quartz_pillar", new PillarBlock(FabricBlockSettings.copyOf(BLACK_QUARTZ_BLOCK)));
    public static final Block SMOOTH_BLACK_QUARTZ = registerBlock("smooth_black_quartz", new Block(FabricBlockSettings.copyOf(BLACK_QUARTZ_BLOCK)));
    public static final Block SMOOTH_BLACK_QUARTZ_STAIRS = registerBlock("smooth_black_quartz_stairs", new StairsBlock(SMOOTH_BLACK_QUARTZ.getDefaultState(), FabricBlockSettings.copyOf(BLACK_QUARTZ_BLOCK)));
    public static final Block SMOOTH_BLACK_QUARTZ_SLAB = registerBlock("smooth_black_quartz_slab", new SlabBlock(FabricBlockSettings.copyOf(BLACK_QUARTZ_BLOCK)));
    public static final Block BLACK_QUARTZ_BRICKS = registerBlock("black_quartz_bricks", new Block(FabricBlockSettings.copyOf(BLACK_QUARTZ_BLOCK)));
    public static final Block CHISELED_BLACK_QUARTZ_BLOCK = registerBlock("chiseled_black_quartz_block", new Block(FabricBlockSettings.copyOf(BLACK_QUARTZ_BLOCK)));

    public static final Block BLACK_QUARTZ_ORE = registerBlock("black_quartz_ore", new Block(FabricBlockSettings.copyOf(Blocks.NETHER_QUARTZ_ORE)));


    // Marble set ======================================================================================================
    public static final Block MARBLE = registerBlock("marble", new Block(FabricBlockSettings.copyOf(Blocks.DIORITE)));
    public static final Block MARBLE_STAIRS = registerBlock("marble_stairs", new StairsBlock(MARBLE.getDefaultState(), FabricBlockSettings.copyOf(MARBLE)));
    public static final Block MARBLE_SLAB = registerBlock("marble_slab", new SlabBlock(FabricBlockSettings.copyOf(MARBLE)));
    public static final Block MARBLE_WALL = registerBlock("marble_wall", new WallBlock(FabricBlockSettings.copyOf(MARBLE)));

    public static final Block POLISHED_MARBLE = registerBlock("polished_marble", new Block(FabricBlockSettings.copyOf(Blocks.POLISHED_DIORITE)));
    public static final Block POLISHED_MARBLE_STAIRS = registerBlock("polished_marble_stairs", new StairsBlock(POLISHED_MARBLE.getDefaultState(), FabricBlockSettings.copyOf(POLISHED_MARBLE)));
    public static final Block POLISHED_MARBLE_SLAB = registerBlock("polished_marble_slab", new SlabBlock(FabricBlockSettings.copyOf(POLISHED_MARBLE)));



    // Soulstone set ===================================================================================================
    public static final Block SOUL_STONE = registerBlock("soul_stone", new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.BROWN)));
    public static final Block SOUL_STONE_STAIRS = registerBlock("soul_stone_stairs", new StairsBlock(SOUL_STONE.getDefaultState(), FabricBlockSettings.copyOf(SOUL_STONE)));
    public static final Block SOUL_STONE_SLAB = registerBlock("soul_stone_slab", new SlabBlock(FabricBlockSettings.copyOf(SOUL_STONE)));
    public static final Block SOUL_STONE_WALL = registerBlock("soul_stone_wall", new WallBlock(FabricBlockSettings.copyOf(SOUL_STONE)));

    public static final Block SOUL_STONE_BRICKS = registerBlock("soul_stone_bricks", new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).mapColor(MapColor.BROWN)));
    public static final Block SOUL_STONE_BRICK_STAIRS = registerBlock("soul_stone_brick_stairs", new StairsBlock(SOUL_STONE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(SOUL_STONE)));
    public static final Block SOUL_STONE_BRICK_SLAB = registerBlock("soul_stone_brick_slab", new SlabBlock(FabricBlockSettings.copyOf(SOUL_STONE_BRICKS)));
    public static final Block SOUL_STONE_BRICK_WALL = registerBlock("soul_stone_brick_wall", new WallBlock(FabricBlockSettings.copyOf(SOUL_STONE_BRICKS)));

    // Blazing wood set ================================================================================================
    public static final Block BLAZING_NYLIUM = registerBlock("blazing_nylium", new NyliumBlock(FabricBlockSettings.copyOf(Blocks.CRIMSON_NYLIUM).mapColor(MapColor.ORANGE)));
    public static final Block BLAZING_FUNGUS = registerBlock("blazing_fungus", new FungusBlock(FabricBlockSettings.copyOf(Blocks.CRIMSON_FUNGUS).mapColor(MapColor.ORANGE).nonOpaque(), ModConfiguredFeatures.BLAZING_FUNGUS_PLANTED, BLAZING_NYLIUM));
    public static final Block INCANDESCENT_BLAZING_FUNGUS = registerBlock("incandescent_blazing_fungus", new IncandescentBlazingFungus(FabricBlockSettings.copyOf(BLAZING_FUNGUS).mapColor(MapColor.PALE_YELLOW).luminance(8)));
    public static final Block BLAZING_ROOTS = registerBlock("blazing_roots", new RootsBlock(FabricBlockSettings.copyOf(Blocks.CRIMSON_ROOTS).mapColor(MapColor.ORANGE)));
    public static final Block BLAZING_WART_BLOCK = registerBlock("blazing_wart_block", new Block(FabricBlockSettings.copyOf(Blocks.WARPED_WART_BLOCK).mapColor(MapColor.ORANGE)));

    public static final Block BLAZING_STEM = registerBlock("blazing_stem", new PillarBlock(FabricBlockSettings.copyOf(Blocks.CRIMSON_STEM).mapColor(MapColor.ORANGE)));
    public static final Block STRIPPED_BLAZING_STEM = registerBlock("stripped_blazing_stem", new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_CRIMSON_STEM).mapColor(MapColor.ORANGE)));
    public static final Block BLAZING_HYPHAE = registerBlock("blazing_hyphae", new PillarBlock(FabricBlockSettings.copyOf(Blocks.CRIMSON_HYPHAE).mapColor(MapColor.ORANGE)));
    public static final Block STRIPPED_BLAZING_HYPHAE = registerBlock("stripped_blazing_hyphae", new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_CRIMSON_HYPHAE).mapColor(MapColor.ORANGE)));

    public static final Block BLAZING_PLANKS = registerBlock("blazing_planks", new Block(FabricBlockSettings.copyOf(Blocks.CRIMSON_PLANKS).mapColor(MapColor.ORANGE)));
    public static final Block BLAZING_STAIRS = registerBlock("blazing_stairs", new StairsBlock(BLAZING_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.CRIMSON_PLANKS).mapColor(MapColor.ORANGE)));
    public static final Block BLAZING_SLAB = registerBlock("blazing_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.CRIMSON_PLANKS).mapColor(MapColor.ORANGE)));
    public static final Block BLAZING_FENCE = registerBlock("blazing_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.CRIMSON_PLANKS).mapColor(MapColor.ORANGE)));
    //public static final Block BLAZING_FENCE_GATE = registerBlock("blazing_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.CRIMSON_PLANKS).mapColor(MapColor.ORANGE)));

    // TODO: Non-full blocks (, fence gate, door, trapdoor)



    // Helper functions ================================================================================================
    private static Block registerBlock(String name, Block block) {
        return registerBlock(name, block, null);
    }

    private static Block registerBlock(String name, Block block, @Nullable FabricItemSettings settings) {
        registerBlockItem(name, block, settings);

        return Registry.register(Registries.BLOCK, new Identifier(NetherEUMod.MODID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, @Nullable FabricItemSettings settings) {
        return Registry.register(
                Registries.ITEM,
                new Identifier(NetherEUMod.MODID, name),
                new BlockItem(
                        block,
                        Optional
                                .ofNullable(settings)
                                .orElse(new FabricItemSettings())
                )
        );
    }

    public static void registerModBlocks() {
        NetherEUMod.LOGGER.info("Registering Mod Blocks for " + NetherEUMod.MODID);
    }
}
