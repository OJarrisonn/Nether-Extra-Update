package com.ojarrisonn.nethereu.tags;

import com.ojarrisonn.nethereu.NetherEUMod;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModBlockTags {
    public static final TagKey<Block> BLAZING_STEMS = register("blazing_stems");

    public static final TagKey<Block> RUBY_ORES = registerCommon("ruby_ores");
    public static final TagKey<Block> NICKEL_ORES = registerCommon("nickel_ores");
    public static final TagKey<Block> RUBY_BLOCKS = registerCommon("ruby_blocks");
    public static final TagKey<Block> NICKEL_BLOCKS = registerCommon("nickel_blocks");
    public static final TagKey<Block> RAW_NICKEL_BLOCKS = registerCommon("raw_nickel_blocks");

    private static TagKey<Block> register(String id) {
        return TagKey.of(RegistryKeys.BLOCK, new Identifier(NetherEUMod.MODID, id));
    }

    private static TagKey<Block> registerCommon(String id) {
        return TagKey.of(RegistryKeys.BLOCK, new Identifier("c", id));
    }

}
