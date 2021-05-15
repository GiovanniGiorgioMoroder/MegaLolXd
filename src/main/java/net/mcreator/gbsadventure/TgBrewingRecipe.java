
package net.mcreator.gbsadventure;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;

import net.mcreator.gbsadventure.item.EvilextractItem;
import net.mcreator.gbsadventure.item.DeathlolxdItem;
import net.mcreator.gbsadventure.item.DarkcalamityItem;

@GbsAdventureModElements.ModElement.Tag
public class TgBrewingRecipe extends GbsAdventureModElements.ModElement {
	public TgBrewingRecipe(GbsAdventureModElements instance) {
		super(instance, 35);
	}

	@Override
	public void init(FMLCommonSetupEvent event) {
		BrewingRecipeRegistry.addRecipe(Ingredient.fromStacks(new ItemStack(EvilextractItem.block, (int) (1))),
				Ingredient.fromStacks(new ItemStack(DeathlolxdItem.block, (int) (1))), new ItemStack(DarkcalamityItem.block, (int) (1)));
	}
}
