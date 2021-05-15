
package net.mcreator.gbsadventure;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;

import net.mcreator.gbsadventure.item.RuniumItem;
import net.mcreator.gbsadventure.item.EsswenceItem;

@GbsAdventureModElements.ModElement.Tag
public class SdfBrewingRecipe extends GbsAdventureModElements.ModElement {
	public SdfBrewingRecipe(GbsAdventureModElements instance) {
		super(instance, 39);
	}

	@Override
	public void init(FMLCommonSetupEvent event) {
		BrewingRecipeRegistry.addRecipe(Ingredient.fromStacks(new ItemStack(Items.POTION, (int) (1))),
				Ingredient.fromStacks(new ItemStack(RuniumItem.block, (int) (1))), new ItemStack(EsswenceItem.block, (int) (1)));
	}
}
