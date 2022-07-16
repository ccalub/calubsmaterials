
package net.mcreator.calubsmaterials.item;

import net.mcreator.calubsmaterials.init.CalubsMaterialsModTabs;
import net.mcreator.calubsmaterials.init.CalubsMaterialsModItems;
import net.mcreator.calubsmaterials.init.CalubsMaterialsModBlocks;

public class TungstenShovelItem extends ShovelItem {
	public TungstenShovelItem() {
		super(new Tier() {
			public int getUses() {
				return 1900;
			}

			public float getSpeed() {
				return 9f;
			}

			public float getAttackDamageBonus() {
				return 2.5f;
			}

			public int getLevel() {
				return 3;
			}

			public int getEnchantmentValue() {
				return 5;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(CalubsMaterialsModItems.TUNGSTEN_INGOT.get()),
						new ItemStack(CalubsMaterialsModBlocks.TUNGSTEN_BLOCK.get()));
			}
		}, 1, -3f, new Item.Properties().tab(CalubsMaterialsModTabs.TAB_CALUBS_MATERIALS));
	}
}
