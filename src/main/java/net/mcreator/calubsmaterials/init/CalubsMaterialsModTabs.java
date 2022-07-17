
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.calubsmaterials.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class CalubsMaterialsModTabs {
	public static CreativeModeTab TAB_CALUBS_MATERIALS;

	public static void load() {
		TAB_CALUBS_MATERIALS = new CreativeModeTab("tabcalubs_materials") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(CalubsMaterialsModItems.ULTINUM_INGOT.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
