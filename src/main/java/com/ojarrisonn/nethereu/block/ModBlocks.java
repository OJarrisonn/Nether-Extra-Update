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

import net.minecraft.world.gen.feature.TreeConfiguredFeatures;
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
    public static final Block BLACK_QUARTZ_PILLAR = registerBlock("black_quartz_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_PILLAR)
                    .mapColor(MapColor.DEEPSLATE_GRAY)
                    .strength(0.9f)));
    public static final Block SMOOTH_BLACK_QUARTZ = registerBlock("smooth_black_quartz",
            new Block(FabricBlockSettings.copyOf(Blocks.SMOOTH_QUARTZ)
                    .mapColor(MapColor.DEEPSLATE_GRAY)
                    .strength(0.9f)));
    public static final Block BLACK_QUARTZ_BRICKS = registerBlock("black_quartz_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BRICKS)
                    .mapColor(MapColor.DEEPSLATE_GRAY)
                    .strength(0.9f)));
    public static final Block CHISELED_BLACK_QUARTZ_BLOCK = registerBlock("chiseled_black_quartz_block",
            new Block(FabricBlockSettings.copyOf(Blocks.CHISELED_QUARTZ_BLOCK)
                    .mapColor(MapColor.DEEPSLATE_GRAY)
                    .strength(0.9f)));



    // Marble set ======================================================================================================
    public static final Block MARBLE = registerBlock("marble", new Block(FabricBlockSettings.copyOf(Blocks.DIORITE)));
    public static final Block POLISHED_MARBLE = registerBlock("polished_marble", new Block(FabricBlockSettings.copyOf(Blocks.POLISHED_DIORITE)));
    // TODO: Non-full blocks (stairs, slab, wall)



    // Soulstone set ===================================================================================================
    public static final Block SOUL_STONE = registerBlock("soul_stone", new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
    // TODO: remaining blocks



    // Blazing wood set ================================================================================================
    public static final Block BLAZING_NYLIUM = registerBlock("blazing_nylium", new NyliumBlock(FabricBlockSettings.copyOf(Blocks.CRIMSON_NYLIUM)));
    public static final Block BLAZING_FUNGUS = registerBlock("blazing_fungus", new FungusBlock(FabricBlockSettings.copyOf(Blocks.CRIMSON_FUNGUS).nonOpaque(), ModConfiguredFeatures.BLAZING_FUNGUS_PLANTED, BLAZING_NYLIUM));
    public static final Block INCANDESCENT_BLAZING_FUNGUS = registerBlock("incandescent_blazing_fungus", new IncandescentBlazingFungus(FabricBlockSettings.copyOf(BLAZING_FUNGUS).luminance(8)));
    public static final Block BLAZING_WART_BLOCK = registerBlock("blazing_wart_block", new Block(FabricBlockSettings.copyOf(Blocks.WARPED_WART_BLOCK)));
    public static final Block BLAZING_STEM = registerBlock("blazing_stem", new PillarBlock(FabricBlockSettings.copyOf(Blocks.CRIMSON_STEM)));
    public static final Block STRIPPED_BLAZING_STEM = registerBlock("stripped_blazing_stem", new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_CRIMSON_STEM)));
    public static final Block BLAZING_HYPHAE = registerBlock("blazing_hyphae", new PillarBlock(FabricBlockSettings.copyOf(Blocks.CRIMSON_HYPHAE)));
    public static final Block STRIPPED_BLAZING_HYPHAE = registerBlock("stripped_blazing_hyphae", new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_CRIMSON_HYPHAE)));
    public static final Block BLAZING_PLANKS = registerBlock("blazing_planks", new Block(FabricBlockSettings.copyOf(Blocks.CRIMSON_PLANKS)));
    // TODO: Non-full blocks (stairs, slab, fence, fence gate, door, trapdoor)



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
