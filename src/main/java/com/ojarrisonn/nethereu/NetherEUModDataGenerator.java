package com.ojarrisonn.nethereu;

import com.ojarrisonn.nethereu.data.ModLootTableGenerator;
import com.ojarrisonn.nethereu.data.ModModelProvider;
import com.ojarrisonn.nethereu.data.ModRecipeGenerator;
import com.ojarrisonn.nethereu.data.ModWorldGenerator;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class NetherEUModDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModLootTableGenerator::new);
		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModRecipeGenerator::new);
		pack.addProvider(ModWorldGenerator::new);
	}
}
