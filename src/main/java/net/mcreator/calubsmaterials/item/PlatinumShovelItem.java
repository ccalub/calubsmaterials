
package net.mcreator.calubsmaterials.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.calubsmaterials.init.CalubsMaterialsModTabs;
import net.mcreator.calubsmaterials.init.CalubsMaterialsModItems;
import net.mcreator.calubsmaterials.init.CalubsMaterialsModBlocks;

public class PlatinumShovelItem extends ShovelItem {
	public PlatinumShovelItem() {
		super(new Tier() {
			public int getUses() {
				return 500;
			}

			public float getSpeed() {
				return 7f;
			}

			public float getAttackDamageBonus() {
				return 2.5f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 20;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(CalubsMaterialsModItems.PLATINUM_INGOT.get()),
						new ItemStack(CalubsMaterialsModBlocks.PLATINUM_BLOCK.get()));
			}
		}, 1, -3f, new Item.Properties().tab(CalubsMaterialsModTabs.TAB_CALUBS_MATERIALS));
	}
}
