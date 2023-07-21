package com.ojarrisonn.nethereu.mixin;

import com.ojarrisonn.nethereu.item.ModItems;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.brain.MemoryModuleType;
import net.minecraft.entity.mob.AbstractPiglinEntity;
import net.minecraft.entity.mob.PiglinBruteBrain;
import net.minecraft.entity.mob.PiglinBruteEntity;
import net.minecraft.entity.player.PlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

// TODO: Make them forget you
// TODO: Stop them trying to start attacking you
@Mixin(PiglinBruteBrain.class)
public abstract class TotemEasesPiglinBruteBrain {

    @Inject(method = "isTarget", at = @At("HEAD"), cancellable = true)
    private static void injectIsTarget(AbstractPiglinEntity piglin, LivingEntity entity, CallbackInfoReturnable<Boolean> info) {
        if (entity.getType() == EntityType.PLAYER) {
            PlayerEntity player = (PlayerEntity) entity;
            if (player.getInventory().contains(ModItems.TOTEM_OF_PIGLIN_SOUL.getDefaultStack())) {
                piglin.getBrain().forget(MemoryModuleType.ATTACK_TARGET);
                piglin.getBrain().forget(MemoryModuleType.ANGRY_AT);
                info.setReturnValue(false);
            }
        }
    }

    @Inject(method = "setTarget", at = @At("HEAD"), cancellable = true)
    private static void injectSetTarget(PiglinBruteEntity piglinBrute, LivingEntity target, CallbackInfo info) {
        if (target.getType() == EntityType.PLAYER) {
            PlayerEntity player = (PlayerEntity) target;
            if (player.getInventory().contains(ModItems.TOTEM_OF_PIGLIN_SOUL.getDefaultStack())) {
                piglinBrute.getBrain().forget(MemoryModuleType.ANGRY_AT);
                piglinBrute.getBrain().forget(MemoryModuleType.ATTACK_TARGET);
                info.cancel();
            }
        }
    }
}
