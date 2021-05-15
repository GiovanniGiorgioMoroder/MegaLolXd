
package net.mcreator.gbsadventure;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;

import net.mcreator.gbsadventure.item.EvilextractItem;
import net.mcreator.gbsadventure.block.PlatinumOreBlock;

@GbsAdventureModElements.ModElement.Tag
public class DarkcalamityrecipeBrewingRecipe extends GbsAdventureModElements.ModElement {
	public DarkcalamityrecipeBrewingRecipe(GbsAdventureModElements instance) {
		super(instance, 31);
	}

	@Override
	public void init(FMLCommonSetupEvent event) {
		BrewingRecipeRegistry.addRecipe(Ingredient.fromStacks(new ItemStack(Items.POTION, (int) (1))),
				Ingredient.fromStacks(new ItemStack(PlatinumOreBlock.block, (int) (1))), new ItemStack(EvilextractItem.block, (int) (1)));
	}
}
