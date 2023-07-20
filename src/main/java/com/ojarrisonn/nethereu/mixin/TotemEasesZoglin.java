package com.ojarrisonn.nethereu.mixin;

import com.ojarrisonn.nethereu.item.ModItems;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.mob.ZoglinEntity;
import net.minecraft.entity.player.PlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

// TODO: Make them forget you
@Mixin(ZoglinEntity.class)
public class TotemEasesZoglin {
    @Inject(method = "shouldAttack", at = @At("HEAD"), cancellable = true)
    private void injectShouldAttack(LivingEntity entity, CallbackInfoReturnable<Boolean> info) {
        if (entity.getType() == EntityType.PLAYER) {
            PlayerEntity player = (PlayerEntity) entity;

            if (player.getInventory().contains(ModItems.TOTEM_OF_PIGLIN_SOUL.getDefaultStack())) {
                info.setReturnValue(false);
            }
        }
    }
}
