
package net.mcreator.gbsadventure;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;

import net.mcreator.gbsadventure.item.NightLongVisionPotionItem;
import net.mcreator.gbsadventure.item.FrostBatEyeItem;

@GbsAdventureModElements.ModElement.Tag
public class LongNightRecipeBrewingRecipe extends GbsAdventureModElements.ModElement {
	public LongNightRecipeBrewingRecipe(GbsAdventureModElements instance) {
		super(instance, 26);
	}

	@Override
	public void init(FMLCommonSetupEvent event) {
		BrewingRecipeRegistry.addRecipe(Ingredient.fromStacks(new ItemStack(Items.POTION, (int) (1))),
				Ingredient.fromStacks(new ItemStack(FrostBatEyeItem.block, (int) (1))), new ItemStack(NightLongVisionPotionItem.block, (int) (1)));
	}
}
