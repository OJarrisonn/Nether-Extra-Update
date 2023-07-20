package com.ojarrisonn.nethereu.mixin;

import com.ojarrisonn.nethereu.item.ModItems;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.mob.PiglinBrain;
import net.minecraft.entity.player.PlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

// TODO: Make them forget you
@Mixin(PiglinBrain.class)
public abstract class TotemEasesPiglin {
    @Inject(method = "wearsGoldArmor", at = @At("HEAD"), cancellable = true)
    private static void injectWearsGoldArmor(LivingEntity entity, CallbackInfoReturnable<Boolean> info) {
        if (entity.getType() == EntityType.PLAYER) {
            PlayerEntity player = (PlayerEntity) entity;

            if (player.getInventory().contains(ModItems.TOTEM_OF_PIGLIN_SOUL.getDefaultStack())) {
                info.setReturnValue(true);
            }
        }
    }
}