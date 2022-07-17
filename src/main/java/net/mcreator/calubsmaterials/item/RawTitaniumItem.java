
package net.mcreator.calubsmaterials.item;

import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.calubsmaterials.init.CalubsMaterialsModTabs;

public class RawTitaniumItem extends Item {
	public RawTitaniumItem() {
		super(new Item.Properties().tab(CalubsMaterialsModTabs.TAB_CALUBS_MATERIALS).stacksTo(64).rarity(Rarity.UNCOMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
