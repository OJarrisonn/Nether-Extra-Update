package com.ojarrisonn.nethereu;

import com.ojarrisonn.nethereu.block.ModBlocks;
import com.ojarrisonn.nethereu.block.ModFlammableBlockRegistry;
import com.ojarrisonn.nethereu.block.ModStrippableBlockRegistry;
import com.ojarrisonn.nethereu.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NetherEUMod implements ModInitializer {
    public static final String MODID = "nethereu";
	public static final Logger LOGGER = LoggerFactory.getLogger(NetherEUMod.MODID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModFlammableBlockRegistry.registerFlammableBlocks();
		ModStrippableBlockRegistry.registerStrippableBlocks();
	}
}