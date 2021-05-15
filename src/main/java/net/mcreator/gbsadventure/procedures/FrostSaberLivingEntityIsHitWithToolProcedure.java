package net.mcreator.gbsadventure.procedures;

import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.gbsadventure.potion.IpotermyPotion;
import net.mcreator.gbsadventure.GbsAdventureModElements;
import net.mcreator.gbsadventure.GbsAdventureMod;

import java.util.Map;

@GbsAdventureModElements.ModElement.Tag
public class FrostSaberLivingEntityIsHitWithToolProcedure extends GbsAdventureModElements.ModElement {
	public FrostSaberLivingEntityIsHitWithToolProcedure(GbsAdventureModElements instance) {
		super(instance, 1);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				GbsAdventureMod.LOGGER.warn("Failed to load dependency entity for procedure FrostSaberLivingEntityIsHitWithTool!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(IpotermyPotion.potion, (int) 60, (int) 1));
	}
}
