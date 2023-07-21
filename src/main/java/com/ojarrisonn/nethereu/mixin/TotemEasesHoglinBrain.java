package com.ojarrisonn.nethereu.mixin;

import com.ojarrisonn.nethereu.NetherEUMod;
import com.ojarrisonn.nethereu.item.ModItems;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.brain.MemoryModuleType;
import net.minecraft.entity.mob.HoglinBrain;
import net.minecraft.entity.mob.HoglinEntity;
import net.minecraft.entity.player.PlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(HoglinBrain.class)
public abstract class TotemEasesHoglinBrain {
    // Makes Hoglins not attack blessed players
    @Inject(method = "targetEnemy", at = @At("HEAD"), cancellable = true)
    private static void injectTargetEnemy(HoglinEntity hoglin, LivingEntity target, CallbackInfo info) {
        NetherEUMod.LOGGER.info("Checking target: " + target);
        if (target.getType() == EntityType.PLAYER) {
            PlayerEntity player = (PlayerEntity) target;
            if (player.getInventory().contains(ModItems.TOTEM_OF_PIGLIN_SOUL.getDefaultStack())) {
                NetherEUMod.LOGGER.info("Stop attacking target: " + target);
                hoglin.getBrain().forget(MemoryModuleType.ANGRY_AT);
                hoglin.getBrain().forget(MemoryModuleType.ATTACK_TARGET);

                info.cancel();
            }
        }
    }

    // Makes Hoglins stop attacking players that got blessed
    @Inject(method = "onAttacking", at = @At("HEAD"), cancellable = true)
    private static void injectOnAttacking(HoglinEntity hoglin, LivingEntity target, CallbackInfo info) {
        NetherEUMod.LOGGER.info("Checking target: " + target);
        if (target.getType() == EntityType.PLAYER) {
            PlayerEntity player = (PlayerEntity) target;
            if (player.getInventory().contains(ModItems.TOTEM_OF_PIGLIN_SOUL.getDefaultStack())) {
                NetherEUMod.LOGGER.info("Stop attacking target: " + target);
                hoglin.getBrain().forget(MemoryModuleType.ANGRY_AT);
                hoglin.getBrain().forget(MemoryModuleType.ATTACK_TARGET);

                info.cancel();
            }
        }
    }

    @Inject(method = "setAttackTarget", at = @At("HEAD"), cancellable = true)
    private static void injectSetAttackTarget(HoglinEntity hoglin, LivingEntity target, CallbackInfo info) {
        NetherEUMod.LOGGER.info("Checking target: " + target);
        if (target.getType() == EntityType.PLAYER) {
            PlayerEntity player = (PlayerEntity) target;
            if (player.getInventory().contains(ModItems.TOTEM_OF_PIGLIN_SOUL.getDefaultStack())) {
                NetherEUMod.LOGGER.info("Stop attacking target: " + target);
                hoglin.getBrain().forget(MemoryModuleType.ANGRY_AT);
                hoglin.getBrain().forget(MemoryModuleType.ATTACK_TARGET);

                info.cancel();
            }
        }
    }

    @Inject(method = "setAttackTargetIfCloser", at = @At("HEAD"), cancellable = true)
    private static void injectSetAttackTargetIfCloser(HoglinEntity hoglin, LivingEntity target, CallbackInfo info) {
        NetherEUMod.LOGGER.info("Checking target: " + target);
        if (target.getType() == EntityType.PLAYER) {
            PlayerEntity player = (PlayerEntity) target;
            if (player.getInventory().contains(ModItems.TOTEM_OF_PIGLIN_SOUL.getDefaultStack())) {
                NetherEUMod.LOGGER.info("Stop attacking target: " + target);
                hoglin.getBrain().forget(MemoryModuleType.ANGRY_AT);
                hoglin.getBrain().forget(MemoryModuleType.ATTACK_TARGET);

                info.cancel();
            }
        }
    }

    @Inject(method = "askAdultsForHelp", at = @At("HEAD"), cancellable = true)
    private static void injectAskAdultForHelp(HoglinEntity hoglin, LivingEntity targetCandidate, CallbackInfo info) {
        NetherEUMod.LOGGER.info("Checking target: " + targetCandidate);
        if (targetCandidate.getType() == EntityType.PLAYER) {
            PlayerEntity player = (PlayerEntity) targetCandidate;
            if (player.getInventory().contains(ModItems.TOTEM_OF_PIGLIN_SOUL.getDefaultStack())) {
                NetherEUMod.LOGGER.info("Stop attacking target: " + targetCandidate);
                hoglin.getBrain().forget(MemoryModuleType.ANGRY_AT);
                hoglin.getBrain().forget(MemoryModuleType.ATTACK_TARGET);

                info.cancel();
            }
        }
    }

    @Inject(method = "onAttacked", at = @At("HEAD"), cancellable = true)
    private static void injectOnAttacked(HoglinEntity hoglin, LivingEntity attacker, CallbackInfo info) {
        NetherEUMod.LOGGER.info("Checking target: " + attacker);
        if (attacker.getType() == EntityType.PLAYER) {
            PlayerEntity player = (PlayerEntity) attacker;
            if (player.getInventory().contains(ModItems.TOTEM_OF_PIGLIN_SOUL.getDefaultStack())) {
                NetherEUMod.LOGGER.info("Stop attacking target: " + attacker);
                hoglin.getBrain().forget(MemoryModuleType.ANGRY_AT);
                hoglin.getBrain().forget(MemoryModuleType.ATTACK_TARGET);

                info.cancel();
            }
        }
    }

}
