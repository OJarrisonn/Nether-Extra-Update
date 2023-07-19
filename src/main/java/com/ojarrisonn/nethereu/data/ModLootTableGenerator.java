package com.ojarrisonn.nethereu.data;

import com.ojarrisonn.nethereu.block.ModBlocks;
import com.ojarrisonn.nethereu.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Blocks;

public class ModLootTableGenerator extends FabricBlockLootTableProvider {
    public ModLootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.RUBY_ORE, oreDrops(ModBlocks.RUBY_ORE, ModItems.RUBY));
        addDrop(ModBlocks.NICKEL_ORE, oreDrops(ModBlocks.NICKEL_ORE, ModItems.RAW_NICKEL));

        addDrop(ModBlocks.RUBY_BLOCK);
        addDrop(ModBlocks.RAW_NICKEL_BLOCK);
        addDrop(ModBlocks.NICKEL_BLOCK);

        addDrop(ModBlocks.BLAZING_WART_BLOCK);
        addDrop(ModBlocks.BLAZING_FUNGUS);
        addDrop(ModBlocks.BLAZING_HYPHAE);
        addDrop(ModBlocks.STRIPPED_BLAZING_HYPHAE);
        addDrop(ModBlocks.BLAZING_STEM);
        addDrop(ModBlocks.STRIPPED_BLAZING_STEM);
        addDrop(ModBlocks.BLAZING_PLANKS);

        addDropWithSilkTouch(ModBlocks.BLAZING_NYLIUM, Blocks.NETHERRACK);

        addDrop(ModBlocks.BLACK_QUARTZ_BLOCK);
        addDrop(ModBlocks.CHISELED_BLACK_QUARTZ_BLOCK);
        addDrop(ModBlocks.BLACK_QUARTZ_BRICKS);
        addDrop(ModBlocks.BLACK_QUARTZ_PILLAR);
        addDrop(ModBlocks.SMOOTH_BLACK_QUARTZ);

        addDrop(ModBlocks.MARBLE);
        addDrop(ModBlocks.POLISHED_MARBLE);

        addDrop(ModBlocks.SOUL_STONE);


    }
}
