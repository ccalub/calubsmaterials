
package net.mcreator.calubsmaterials.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.calubsmaterials.init.CalubsMaterialsModTabs;
import net.mcreator.calubsmaterials.init.CalubsMaterialsModItems;
import net.mcreator.calubsmaterials.init.CalubsMaterialsModBlocks;

public class TitaniumPickaxeItem extends PickaxeItem {
	public TitaniumPickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 2200;
			}

			public float getSpeed() {
				return 7f;
			}

			public float getAttackDamageBonus() {
				return 2f;
			}

			public int getLevel() {
				return 3;
			}

			public int getEnchantmentValue() {
				return 5;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(CalubsMaterialsModItems.TITANIUM_INGOT.get()),
						new ItemStack(CalubsMaterialsModBlocks.TITANIUM_BLOCK.get()));
			}
		}, 1, -3f, new Item.Properties().tab(CalubsMaterialsModTabs.TAB_CALUBS_MATERIALS));
	}

	@Override
	public boolean hasContainerItem(ItemStack stack) {
		return true;
	}

	@Override
	public ItemStack getContainerItem(ItemStack itemstack) {
		return new ItemStack(this);
	}

	@Override
	public boolean isRepairable(ItemStack itemstack) {
		return false;
	}
}
