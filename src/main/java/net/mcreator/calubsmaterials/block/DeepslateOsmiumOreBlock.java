
package net.mcreator.calubsmaterials.block;

import net.minecraft.world.level.material.Material;

import net.mcreator.calubsmaterials.procedures.OsmiumOreFortuneProcedure;
import net.mcreator.calubsmaterials.init.CalubsMaterialsModItems;

import java.util.List;
import java.util.Collections;

public class DeepslateOsmiumOreBlock extends Block {
	public DeepslateOsmiumOreBlock() {
		super(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.DEEPSLATE).strength(1.5f, 10f).requiresCorrectToolForDrops());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
		if (player.getInventory().getSelected().getItem() instanceof TieredItem tieredItem)
			return tieredItem.getTier().getLevel() >= 2;
		return false;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(CalubsMaterialsModItems.RAW_OSMIUM.get()));
	}

	@Override
	public boolean onDestroyedByPlayer(BlockState blockstate, Level world, BlockPos pos, Player entity, boolean willHarvest, FluidState fluid) {
		boolean retval = super.onDestroyedByPlayer(blockstate, world, pos, entity, willHarvest, fluid);
		OsmiumOreFortuneProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ(), entity);
		return retval;
	}
}
