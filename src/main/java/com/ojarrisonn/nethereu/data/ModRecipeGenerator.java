package com.ojarrisonn.nethereu.data;

import com.ojarrisonn.nethereu.block.ModBlocks;
import com.ojarrisonn.nethereu.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.recipe.book.RecipeCategory;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.RUBY, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RUBY_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.NICKEL_INGOT, RecipeCategory.BUILDING_BLOCKS, ModBlocks.NICKEL_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.NICKEL_NUGGET, RecipeCategory.BUILDING_BLOCKS, ModItems.NICKEL_INGOT,
                "nickel_ingot_from_nugget", "nickel_ingot", "nickel_nugget_from_ingot", "nickel_nugget");

        offerSmelting(exporter, List.of(ModItems.RAW_NICKEL), RecipeCategory.MISC, ModItems.NICKEL_INGOT, 0.7f, 200, "nickel_ingot");
        offerSmelting(exporter, List.of(ModBlocks.RUBY_ORE), RecipeCategory.MISC, ModItems.RUBY, 0.7f, 200, "ruby");
    }
}
