
package net.mcreator.gbsadventure.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.Food;

import net.mcreator.gbsadventure.GbsAdventureModElements;

@GbsAdventureModElements.ModElement.Tag
public class RawChickenNuggetItem extends GbsAdventureModElements.ModElement {
	@ObjectHolder("gbs_adventure:raw_chicken_nugget")
	public static final Item block = null;
	public RawChickenNuggetItem(GbsAdventureModElements instance) {
		super(instance, 59);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(ItemGroup.FOOD).maxStackSize(64).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(2).saturation(0f).meat().build()));
			setRegistryName("raw_chicken_nugget");
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}
	}
}
