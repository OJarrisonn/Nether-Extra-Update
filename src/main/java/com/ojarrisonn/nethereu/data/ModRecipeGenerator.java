package com.ojarrisonn.nethereu.data;

import com.ojarrisonn.nethereu.block.ModBlocks;
import com.ojarrisonn.nethereu.item.ModItems;
import com.ojarrisonn.nethereu.tags.ModItemTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

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
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.RAW_NICKEL, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_NICKEL_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.NICKEL_NUGGET, RecipeCategory.BUILDING_BLOCKS, ModItems.NICKEL_INGOT,
                "nickel_ingot_from_nugget", "nickel_ingot", "nickel_nugget_from_ingot", "nickel_nugget");
        offer2x2CompactingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_QUARTZ_BLOCK, ModItems.BLACK_QUARTZ);

        offerSmelting(exporter, List.of(ModBlocks.BLACK_QUARTZ_ORE), RecipeCategory.MISC, ModItems.BLACK_QUARTZ, 0.7f, 200, "black_quartz");
        offerSmelting(exporter, List.of(ModBlocks.NICKEL_ORE), RecipeCategory.MISC, ModItems.NICKEL_INGOT, 0.7f, 200, "nickel_ingot");
        offerSmelting(exporter, List.of(ModItems.RAW_NICKEL), RecipeCategory.MISC, ModItems.NICKEL_INGOT, 0.7f, 200, "nickel_ingot");
        offerSmelting(exporter, List.of(ModBlocks.RUBY_ORE), RecipeCategory.MISC, ModItems.RUBY, 0.7f, 200, "ruby");

        offerBlasting(exporter, List.of(ModBlocks.BLACK_QUARTZ_ORE), RecipeCategory.MISC, ModItems.BLACK_QUARTZ, 0.7f, 100, "black_quartz");
        offerBlasting(exporter, List.of(ModBlocks.NICKEL_ORE), RecipeCategory.MISC, ModItems.NICKEL_INGOT, 0.7f, 100, "nickel_ingot");
        offerBlasting(exporter, List.of(ModItems.RAW_NICKEL), RecipeCategory.MISC, ModItems.NICKEL_INGOT, 0.7f, 100, "nickel_ingot");
        offerBlasting(exporter, List.of(ModBlocks.RUBY_ORE), RecipeCategory.MISC, ModItems.RUBY, 0.7f, 100, "ruby");

        offerSmelting(exporter, List.of(ModBlocks.BLACK_QUARTZ_BLOCK), RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_BLACK_QUARTZ, 0.7f, 200, "black_quartz");

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLAZING_PLANKS)
                        .input(ModItemTags.BLAZING_STEMS).group("blazing_planks")
                        .criterion(FabricRecipeProvider.hasItem(ModBlocks.BLAZING_STEM), FabricRecipeProvider.conditionsFromTag(ModItemTags.BLAZING_STEMS))
                        .offerTo(exporter, FabricRecipeProvider.getItemPath(ModBlocks.BLAZING_PLANKS));

        offerBarkBlockRecipe(exporter, ModBlocks.BLAZING_HYPHAE, ModBlocks.BLAZING_STEM);
        offerBarkBlockRecipe(exporter, ModBlocks.STRIPPED_BLAZING_HYPHAE, ModBlocks.STRIPPED_BLAZING_STEM);

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_QUARTZ_BRICKS, ModBlocks.BLACK_QUARTZ_BLOCK);
        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SOUL_STONE_BRICKS, ModBlocks.SOUL_STONE);
        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_MARBLE, ModBlocks.MARBLE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLAZING_SLAB, ModBlocks.BLAZING_PLANKS);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MARBLE_SLAB, ModBlocks.MARBLE);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_MARBLE_SLAB, ModBlocks.POLISHED_MARBLE);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SOUL_STONE_SLAB, ModBlocks.SOUL_STONE);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SOUL_STONE_BRICK_SLAB, ModBlocks.SOUL_STONE_BRICKS);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_QUARTZ_SLAB, ModBlocks.BLACK_QUARTZ_BLOCK);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_BLACK_QUARTZ_SLAB, ModBlocks.SMOOTH_BLACK_QUARTZ);

        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MARBLE_WALL, ModBlocks.MARBLE);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SOUL_STONE_WALL, ModBlocks.SOUL_STONE);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SOUL_STONE_BRICK_WALL, ModBlocks.SOUL_STONE_BRICKS);

        createFenceRecipe(ModBlocks.BLAZING_FENCE, Ingredient.ofItems(ModBlocks.BLAZING_PLANKS))
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.BLAZING_PLANKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.BLAZING_PLANKS))
                .group("blazing_fence")
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModBlocks.BLAZING_FENCE)));

        createFenceGateRecipe(ModBlocks.BLAZING_FENCE_GATE, Ingredient.ofItems(ModBlocks.BLAZING_PLANKS))
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.BLAZING_PLANKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.BLAZING_PLANKS))
                .group("blazing_fence_gate")
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName((ModBlocks.BLAZING_FENCE_GATE))));

        offerStairsRecipe(exporter, ModBlocks.BLAZING_STAIRS, ModBlocks.BLAZING_PLANKS);
        offerStairsRecipe(exporter, ModBlocks.MARBLE_STAIRS, ModBlocks.MARBLE);
        offerStairsRecipe(exporter, ModBlocks.POLISHED_MARBLE_STAIRS, ModBlocks.POLISHED_MARBLE);
        offerStairsRecipe(exporter, ModBlocks.SOUL_STONE_STAIRS, ModBlocks.SOUL_STONE);
        offerStairsRecipe(exporter, ModBlocks.SOUL_STONE_BRICK_STAIRS, ModBlocks.SOUL_STONE_BRICKS);
        offerStairsRecipe(exporter, ModBlocks.BLACK_QUARTZ_STAIRS, ModBlocks.BLACK_QUARTZ_BLOCK);
        offerStairsRecipe(exporter, ModBlocks.SMOOTH_BLACK_QUARTZ_STAIRS, ModBlocks.SMOOTH_BLACK_QUARTZ);

        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_QUARTZ_PILLAR, ModBlocks.BLACK_QUARTZ_BLOCK);
        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_BLACK_QUARTZ_BLOCK, ModBlocks.BLACK_QUARTZ_PILLAR);

        offerShapelessRecipe(exporter, ModItems.SOUL_BLAZE_POWDER, ModItems.SOUL_BLAZE_ROD, "soul_blaze_powder", 2);
    }

    private static void offerStairsRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible stairs, ItemConvertible source) {
        createStairsRecipe(stairs, Ingredient.ofItems(source))
                .criterion(FabricRecipeProvider.hasItem(source), FabricRecipeProvider.conditionsFromItem(source))
                .group(FabricRecipeProvider.getItemPath(stairs))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getItemPath(stairs)));
    }
}
