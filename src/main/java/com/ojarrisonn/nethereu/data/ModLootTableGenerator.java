package com.ojarrisonn.nethereu.data;

import com.ojarrisonn.nethereu.block.ModBlocks;
import com.ojarrisonn.nethereu.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.loottable.BlockLootTableGenerator;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;

public class ModLootTableGenerator extends FabricBlockLootTableProvider {
    public ModLootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.BLACK_QUARTZ_ORE, blackQuartzOreDrops(ModBlocks.BLACK_QUARTZ_ORE));
        addDrop(ModBlocks.RUBY_ORE, oreDrops(ModBlocks.RUBY_ORE, ModItems.RUBY));
        addDrop(ModBlocks.NICKEL_ORE, oreDrops(ModBlocks.NICKEL_ORE, ModItems.RAW_NICKEL));

        addDrop(ModBlocks.RUBY_BLOCK);
        addDrop(ModBlocks.RAW_NICKEL_BLOCK);
        addDrop(ModBlocks.NICKEL_BLOCK);

        addDrop(ModBlocks.BLAZING_WART_BLOCK);

        addDrop(ModBlocks.BLAZING_FUNGUS);
        addDrop(ModBlocks.INCANDESCENT_BLAZING_FUNGUS);
        addDrop(ModBlocks.BLAZING_ROOTS);

        addDrop(ModBlocks.BLAZING_HYPHAE);
        addDrop(ModBlocks.STRIPPED_BLAZING_HYPHAE);
        addDrop(ModBlocks.BLAZING_STEM);
        addDrop(ModBlocks.STRIPPED_BLAZING_STEM);

        addDrop(ModBlocks.BLAZING_PLANKS);
        addDrop(ModBlocks.BLAZING_STAIRS);
        addDrop(ModBlocks.BLAZING_SLAB);
        addDrop(ModBlocks.BLAZING_FENCE);

        addDropWithSilkTouch(ModBlocks.BLAZING_NYLIUM, Blocks.NETHERRACK);

        addDrop(ModBlocks.BLACK_QUARTZ_BLOCK);
        addDrop(ModBlocks.BLACK_QUARTZ_STAIRS);
        addDrop(ModBlocks.BLACK_QUARTZ_SLAB);
        addDrop(ModBlocks.CHISELED_BLACK_QUARTZ_BLOCK);
        addDrop(ModBlocks.BLACK_QUARTZ_BRICKS);
        addDrop(ModBlocks.BLACK_QUARTZ_PILLAR);
        addDrop(ModBlocks.SMOOTH_BLACK_QUARTZ);
        addDrop(ModBlocks.SMOOTH_BLACK_QUARTZ_STAIRS);
        addDrop(ModBlocks.SMOOTH_BLACK_QUARTZ_SLAB);

        addDrop(ModBlocks.MARBLE);
        addDrop(ModBlocks.MARBLE_STAIRS);
        addDrop(ModBlocks.MARBLE_SLAB);
        addDrop(ModBlocks.MARBLE_WALL);

        addDrop(ModBlocks.POLISHED_MARBLE);
        addDrop(ModBlocks.POLISHED_MARBLE_STAIRS);
        addDrop(ModBlocks.POLISHED_MARBLE_SLAB);

        addDrop(ModBlocks.SOUL_STONE);
        addDrop(ModBlocks.SOUL_STONE_SLAB);
        addDrop(ModBlocks.SOUL_STONE_STAIRS);
        addDrop(ModBlocks.SOUL_STONE_WALL);

        addDrop(ModBlocks.SOUL_STONE_BRICKS);
        addDrop(ModBlocks.SOUL_STONE_BRICK_SLAB);
        addDrop(ModBlocks.SOUL_STONE_BRICK_STAIRS);
        addDrop(ModBlocks.SOUL_STONE_BRICK_WALL);


    }

    public LootTable.Builder blackQuartzOreDrops(Block drop) {
        return BlockLootTableGenerator.dropsWithSilkTouch(drop, (LootPoolEntry.Builder)this.applyExplosionDecay(drop, ((LeafEntry.Builder) ItemEntry.builder(ModItems.BLACK_QUARTZ).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0f, 5.0f)))).apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))));
    }

}
