package com.ojarrisonn.nethereu;

import com.ojarrisonn.nethereu.block.ModBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class NetherEUModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(),
                ModBlocks.BLAZING_FUNGUS,
                ModBlocks.INCANDESCENT_BLAZING_FUNGUS,
                ModBlocks.WARPED_BERRY_BUSH);
    }
}
