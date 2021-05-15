
package net.mcreator.gbsadventure.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.gbsadventure.GbsAdventureModElements;

@GbsAdventureModElements.ModElement.Tag
public class FrostBatEyeItem extends GbsAdventureModElements.ModElement {
	@ObjectHolder("gbs_adventure:frost_bat_eye")
	public static final Item block = null;
	public FrostBatEyeItem(GbsAdventureModElements instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.BREWING).maxStackSize(64).rarity(Rarity.RARE));
			setRegistryName("frost_bat_eye");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return -1;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
