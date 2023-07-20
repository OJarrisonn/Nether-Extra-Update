package com.ojarrisonn.nethereu.mixin;

import com.ojarrisonn.nethereu.item.ModItems;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.mob.HoglinBrain;
import net.minecraft.entity.mob.HoglinEntity;
import net.minecraft.entity.player.PlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

// FIXME: Not working
// TODO: Make them forget you
@Mixin(HoglinBrain.class)
public abstract class TotemEasesHoglin {
    @Inject(method = "setAttackTarget", at = @At("HEAD"))
    private static void injectSetAttackTarget(HoglinEntity hoglin, LivingEntity target, CallbackInfo info) {
        if (target.getType() == EntityType.PLAYER) {
            PlayerEntity player = (PlayerEntity) target;
            if (player.getInventory().contains(ModItems.TOTEM_OF_PIGLIN_SOUL.getDefaultStack())) {
                return;
            }
        }
    }
}
