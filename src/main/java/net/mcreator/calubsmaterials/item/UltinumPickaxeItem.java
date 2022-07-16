
package net.mcreator.calubsmaterials.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.calubsmaterials.init.CalubsMaterialsModTabs;
import net.mcreator.calubsmaterials.init.CalubsMaterialsModItems;
import net.mcreator.calubsmaterials.init.CalubsMaterialsModBlocks;

public class UltinumPickaxeItem extends PickaxeItem {
	public UltinumPickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 2000;
			}

			public float getSpeed() {
				return 12f;
			}

			public float getAttackDamageBonus() {
				return 4f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 20;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(CalubsMaterialsModItems.ULTINUM_INGOT.get()),
						new ItemStack(CalubsMaterialsModBlocks.ULTINUM_BLOCK.get()));
			}
		}, 1, -3f, new Item.Properties().tab(CalubsMaterialsModTabs.TAB_CALUBS_MATERIALS));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}
