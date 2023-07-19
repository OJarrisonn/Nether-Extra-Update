package com.ojarrisonn.nethereu.tags;

import com.ojarrisonn.nethereu.NetherEUMod;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModItemTags {
    public static final TagKey<Item> BLAZING_STEMS = registerCommon("blazing_stems");

    public static final TagKey<Item> GEMS = registerCommon("gems");
    public static final TagKey<Item> RUBIES = registerCommon("rubies");
    public static final TagKey<Item> NICKEL_NUGGETS = registerCommon("nickel_nuggets");
    public static final TagKey<Item> NICKEL_INGOTS = registerCommon("nickel_ingots");
    public static final TagKey<Item> RAW_NICKEL_ORES = registerCommon("raw_nickel_ores");

    private static TagKey<Item> register(String id) {
        return TagKey.of(RegistryKeys.ITEM, new Identifier(NetherEUMod.MODID, id));
    }

    private static TagKey<Item> registerCommon(String id) {
        return TagKey.of(RegistryKeys.ITEM, new Identifier("c", id));
    }
}
