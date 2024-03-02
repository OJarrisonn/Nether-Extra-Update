package com.ojarrisonn.nethereu.item;

import com.ojarrisonn.nethereu.NetherEUMod;
import com.ojarrisonn.nethereu.block.ModBlocks;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item SOUL_BLAZE_ROD = registerItem("soul_blaze_rod", new Item(new FabricItemSettings()));
    public static final Item SOUL_BLAZE_POWDER = registerItem("soul_blaze_powder", new Item(new FabricItemSettings()));
    public static final Item BLACK_QUARTZ = registerItem("black_quartz", new Item(new FabricItemSettings()));
    public static final Item RAW_NICKEL = registerItem("raw_nickel", new Item(new FabricItemSettings()));
    public static final Item NICKEL_INGOT = registerItem("nickel_ingot", new Item(new FabricItemSettings()));
    public static final Item NICKEL_NUGGET = registerItem("nickel_nugget", new Item(new FabricItemSettings()));
    public static final Item RUBY = registerItem("ruby", new Item(new FabricItemSettings()));
    public static final Item TOTEM_OF_PIGLIN_SOUL = registerItem("totem_of_piglin_soul", new TotemOfPiglinSoul(new FabricItemSettings().maxCount(1)));
    public static final Item WARPED_BERRIES = registerItem("warped_berries", new AliasedBlockItem(ModBlocks.WARPED_BERRY_BUSH, new FabricItemSettings().food(FoodComponents.SWEET_BERRIES)));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(SOUL_BLAZE_ROD);
        entries.add(SOUL_BLAZE_POWDER);
        entries.add(BLACK_QUARTZ);
        entries.add(RAW_NICKEL);
        entries.add(NICKEL_INGOT);
        entries.add(NICKEL_NUGGET);
        entries.add(RUBY);
    }

    private static void addItemsToFoodItemGroup(FabricItemGroupEntries entries) {
        entries.add(WARPED_BERRIES);
    }

    private static void addItemsToCombatItemGroup(FabricItemGroupEntries entries) {
        entries.add(TOTEM_OF_PIGLIN_SOUL);
    }

    private static void addItemsToBuildingBlocksItemGroup(FabricItemGroupEntries entries) {
        entries.add(ModBlocks.RUBY_BLOCK);
        entries.add(ModBlocks.NICKEL_BLOCK);

        entries.add(ModBlocks.BLACK_QUARTZ_BLOCK);
        entries.add(ModBlocks.BLACK_QUARTZ_STAIRS);
        entries.add(ModBlocks.BLACK_QUARTZ_SLAB);
        entries.add(ModBlocks.BLACK_QUARTZ_PILLAR);
        entries.add(ModBlocks.SMOOTH_BLACK_QUARTZ);
        entries.add(ModBlocks.SMOOTH_BLACK_QUARTZ_STAIRS);
        entries.add(ModBlocks.SMOOTH_BLACK_QUARTZ_SLAB);
        entries.add(ModBlocks.BLACK_QUARTZ_BRICKS);
        entries.add(ModBlocks.CHISELED_BLACK_QUARTZ_BLOCK);

        entries.add(ModBlocks.MARBLE);
        entries.add(ModBlocks.MARBLE_STAIRS);
        entries.add(ModBlocks.MARBLE_SLAB);
        entries.add(ModBlocks.MARBLE_WALL);
        entries.add(ModBlocks.POLISHED_MARBLE);
        entries.add(ModBlocks.POLISHED_MARBLE_STAIRS);
        entries.add(ModBlocks.POLISHED_MARBLE_SLAB);

        entries.add(ModBlocks.SOUL_STONE);
        entries.add(ModBlocks.SOUL_STONE_STAIRS);
        entries.add(ModBlocks.SOUL_STONE_SLAB);
        entries.add(ModBlocks.SOUL_STONE_WALL);

        entries.add(ModBlocks.SOUL_STONE_BRICKS);
        entries.add(ModBlocks.SOUL_STONE_BRICK_STAIRS);
        entries.add(ModBlocks.SOUL_STONE_BRICK_SLAB);
        entries.add(ModBlocks.SOUL_STONE_BRICK_WALL);

        entries.add(ModBlocks.BLAZING_STEM);
        entries.add(ModBlocks.STRIPPED_BLAZING_STEM);
        entries.add(ModBlocks.BLAZING_HYPHAE);
        entries.add(ModBlocks.STRIPPED_BLAZING_HYPHAE);

        entries.add(ModBlocks.BLAZING_PLANKS);
        entries.add(ModBlocks.BLAZING_STAIRS);
        entries.add(ModBlocks.BLAZING_SLAB);
        entries.add(ModBlocks.BLAZING_FENCE);
        entries.add(ModBlocks.BLAZING_FENCE_GATE);
    }

    private static void addItemsToNaturalItemGroup(FabricItemGroupEntries entries) {
        entries.add(ModBlocks.MARBLE);
        entries.add(ModBlocks.SOUL_STONE);

        entries.add(ModBlocks.BLAZING_NYLIUM);
        entries.add(ModBlocks.BLAZING_WART_BLOCK);
        entries.add(ModBlocks.BLAZING_FUNGUS);
        entries.add(ModBlocks.BLAZING_ROOTS);
        entries.add(ModBlocks.INCANDESCENT_BLAZING_FUNGUS);
        entries.add(ModBlocks.BLAZING_STEM);
        entries.add(ModBlocks.WARPED_BERRY_BUSH);

        entries.add(ModBlocks.BLACK_QUARTZ_ORE);
        entries.add(ModBlocks.NICKEL_ORE);
        entries.add(ModBlocks.RUBY_ORE);

        entries.add(ModBlocks.RAW_NICKEL_BLOCK);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(NetherEUMod.MODID, name), item);
    }

    public static void registerModItems() {
        NetherEUMod.LOGGER.info("Registering Mod Items for " + NetherEUMod.MODID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(ModItems::addItemsToCombatItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::addItemsToFoodItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(ModItems::addItemsToBuildingBlocksItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(ModItems::addItemsToNaturalItemGroup);
    }
}
