
package net.mcreator.calubsmaterials.item;

import net.mcreator.calubsmaterials.init.CalubsMaterialsModTabs;

public class RawPlatinumItem extends Item {
	public RawPlatinumItem() {
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
