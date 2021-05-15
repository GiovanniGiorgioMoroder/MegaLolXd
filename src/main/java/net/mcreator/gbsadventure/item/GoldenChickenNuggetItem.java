
package net.mcreator.gbsadventure.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.Food;
import net.minecraft.entity.LivingEntity;

import net.mcreator.gbsadventure.procedures.GoldenChickenNuggetFoodEatenProcedure;
import net.mcreator.gbsadventure.GbsAdventureModElements;

import java.util.Map;
import java.util.HashMap;

@GbsAdventureModElements.ModElement.Tag
public class GoldenChickenNuggetItem extends GbsAdventureModElements.ModElement {
	@ObjectHolder("gbs_adventure:golden_chicken_nugget")
	public static final Item block = null;
	public GoldenChickenNuggetItem(GbsAdventureModElements instance) {
		super(instance, 63);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(ItemGroup.FOOD).maxStackSize(64).rarity(Rarity.RARE)
					.food((new Food.Builder()).hunger(8).saturation(1f).setAlwaysEdible().build()));
			setRegistryName("golden_chicken_nugget");
		}

		@Override
		public int getUseDuration(ItemStack stack) {
			return 20;
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public boolean hasEffect(ItemStack itemstack) {
			return true;
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}

		@Override
		public ItemStack onItemUseFinish(ItemStack itemstack, World world, LivingEntity entity) {
			ItemStack retval = super.onItemUseFinish(itemstack, world, entity);
			double x = entity.getPosX();
			double y = entity.getPosY();
			double z = entity.getPosZ();
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				GoldenChickenNuggetFoodEatenProcedure.executeProcedure($_dependencies);
			}
			return retval;
		}
	}
}
