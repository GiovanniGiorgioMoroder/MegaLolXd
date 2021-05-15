package net.mcreator.gbsadventure.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;

import net.mcreator.gbsadventure.GbsAdventureModElements;
import net.mcreator.gbsadventure.GbsAdventureMod;

import java.util.Map;

@GbsAdventureModElements.ModElement.Tag
public class FireFishNaturalEntitySpawningConditionProcedure extends GbsAdventureModElements.ModElement {
	public FireFishNaturalEntitySpawningConditionProcedure(GbsAdventureModElements instance) {
		super(instance, 68);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				GbsAdventureMod.LOGGER.warn("Failed to load dependency entity for procedure FireFishNaturalEntitySpawningCondition!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				GbsAdventureMod.LOGGER.warn("Failed to load dependency x for procedure FireFishNaturalEntitySpawningCondition!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				GbsAdventureMod.LOGGER.warn("Failed to load dependency y for procedure FireFishNaturalEntitySpawningCondition!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				GbsAdventureMod.LOGGER.warn("Failed to load dependency z for procedure FireFishNaturalEntitySpawningCondition!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				GbsAdventureMod.LOGGER.warn("Failed to load dependency world for procedure FireFishNaturalEntitySpawningCondition!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)).isSolid())) {
			if (!entity.world.isRemote())
				entity.remove();
		}
		if ((world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z))) != null
				&& world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
						.equals(new ResourceLocation("gbs_adventure:voidlands")))) {
			if (!entity.world.isRemote())
				entity.remove();
		}
	}
}
