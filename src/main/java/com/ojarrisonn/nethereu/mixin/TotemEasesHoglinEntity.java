package com.ojarrisonn.nethereu.mixin;

import com.ojarrisonn.nethereu.NetherEUMod;
import com.ojarrisonn.nethereu.item.ModItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.HoglinEntity;
import net.minecraft.entity.player.PlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(HoglinEntity.class)
public class TotemEasesHoglinEntity {
    @Inject(method = "tryAttack", at = @At("HEAD"), cancellable = true)
    private void injectTryAttack(Entity target, CallbackInfoReturnable<Boolean> info) {
        NetherEUMod.LOGGER.info("Trying to attack: " + target);
        if (target.getType() == EntityType.PLAYER) {
            PlayerEntity player = (PlayerEntity) target;

            if (player.getInventory().contains(ModItems.TOTEM_OF_PIGLIN_SOUL.getDefaultStack())) {
                NetherEUMod.LOGGER.info("Stop attacking: " + target);

                info.setReturnValue(false);
            }
        }
    }
}
