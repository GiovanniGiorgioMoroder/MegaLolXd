package net.mcreator.gbsadventure.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.gbsadventure.GbsAdventureModElements;
import net.mcreator.gbsadventure.GbsAdventureMod;

import java.util.Map;

@GbsAdventureModElements.ModElement.Tag
public class MagmaRifleBulletHitsLivingEntityProcedure extends GbsAdventureModElements.ModElement {
	public MagmaRifleBulletHitsLivingEntityProcedure(GbsAdventureModElements instance) {
		super(instance, 15);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				GbsAdventureMod.LOGGER.warn("Failed to load dependency entity for procedure MagmaRifleBulletHitsLivingEntity!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.setFire((int) 5);
	}
}
