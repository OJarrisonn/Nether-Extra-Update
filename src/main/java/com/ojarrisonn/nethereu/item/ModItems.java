package com.ojarrisonn.nethereu.item;

import com.ojarrisonn.nethereu.NetherEUMod;
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
    public static final Item NICKEL_INGOT = registerItem("nickel_ingot", new Item(new FabricItemSettings()));
    public static final Item NICKEL_NUGGET = registerItem("nickel_nugget", new Item(new FabricItemSettings()));
    public static final Item RUBY = registerItem("ruby", new Item(new FabricItemSettings()));
    public static final Item TOTEM_OF_PIGLIN_SOUL = registerItem("totem_of_piglin_soul", new Item(new FabricItemSettings()));
    public static final Item WARPED_BERRIES = registerItem("warped_berries", new Item(new FabricItemSettings().food(FoodComponents.SWEET_BERRIES)));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(SOUL_BLAZE_ROD);
        entries.add(SOUL_BLAZE_POWDER);
        entries.add(BLACK_QUARTZ);
        entries.add(NICKEL_INGOT);
        entries.add(NICKEL_NUGGET);
        entries.add(RUBY);
    }

    private static void addItemsToFoodItemGroup(FabricItemGroupEntries entries) {
        entries.add(TOTEM_OF_PIGLIN_SOUL);
    }

    private static void addItemsToWeaponsItemGroup(FabricItemGroupEntries entries) {
        entries.add(WARPED_BERRIES);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(NetherEUMod.MODID, name), item);
    }

    public static void registerModItems() {
        NetherEUMod.LOGGER.info("Registering Mod Items for " + NetherEUMod.MODID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
