
package net.mcreator.gbsadventure.block;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.common.IPlantable;

import net.minecraft.world.IBlockReader;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.gbsadventure.GbsAdventureModElements;

import java.util.List;
import java.util.Collections;

@GbsAdventureModElements.ModElement.Tag
public class COBBLEVOIDBlock extends GbsAdventureModElements.ModElement {
	@ObjectHolder("gbs_adventure:cobblevoid")
	public static final Block block = null;
	public COBBLEVOIDBlock(GbsAdventureModElements instance) {
		super(instance, 50);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.ORGANIC).sound(SoundType.GROUND).hardnessAndResistance(0.7999999999999999f, 10f)
					.setLightLevel(s -> 0));
			setRegistryName("cobblevoid");
		}

		@Override
		public boolean canSustainPlant(BlockState state, IBlockReader world, BlockPos pos, Direction direction, IPlantable plantable) {
			return true;
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}
	}
}
