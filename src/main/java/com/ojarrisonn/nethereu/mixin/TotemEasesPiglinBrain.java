package com.ojarrisonn.nethereu.mixin;

import com.ojarrisonn.nethereu.item.ModItems;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.mob.AbstractPiglinEntity;
import net.minecraft.entity.mob.PiglinBrain;
import net.minecraft.entity.mob.PiglinEntity;
import net.minecraft.entity.player.PlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PiglinBrain.class)
public abstract class TotemEasesPiglinBrain {
    @Inject(method = "wearsGoldArmor", at = @At("HEAD"), cancellable = true)
    private static void injectWearsGoldArmor(LivingEntity entity, CallbackInfoReturnable<Boolean> info) {
        if (entity.getType() == EntityType.PLAYER) {
            PlayerEntity player = (PlayerEntity) entity;

            if (player.getInventory().contains(ModItems.TOTEM_OF_PIGLIN_SOUL.getDefaultStack())) {
                info.setReturnValue(true);
            }
        }
    }

    @Inject(method = "onAttacked", at = @At("HEAD"), cancellable = true)
    private static void injectOnAttacked(PiglinEntity piglin, LivingEntity attacker, CallbackInfo info) {
        if (attacker.getType() == EntityType.PLAYER) {
            PlayerEntity player = (PlayerEntity) attacker;

            if (player.getInventory().contains(ModItems.TOTEM_OF_PIGLIN_SOUL.getDefaultStack())) {
                info.cancel();
            }
        }
    }

    @Inject(method = "tryRevenge", at = @At("HEAD"), cancellable = true)
    private static void injectTryRevenge(AbstractPiglinEntity piglin, LivingEntity target, CallbackInfo info) {
        if (target.getType() == EntityType.PLAYER) {
            PlayerEntity player = (PlayerEntity) target;

            if (player.getInventory().contains(ModItems.TOTEM_OF_PIGLIN_SOUL.getDefaultStack())) {
                info.cancel();
            }
        }
    }
}