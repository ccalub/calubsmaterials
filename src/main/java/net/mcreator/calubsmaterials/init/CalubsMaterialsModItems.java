
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.calubsmaterials.init;

import net.mcreator.calubsmaterials.item.UltinumSwordItem;
import net.mcreator.calubsmaterials.item.UltinumShovelItem;
import net.mcreator.calubsmaterials.item.UltinumPickaxeItem;
import net.mcreator.calubsmaterials.item.UltinumIngotItem;
import net.mcreator.calubsmaterials.item.UltinumAxeItem;
import net.mcreator.calubsmaterials.item.TungstenSwordItem;
import net.mcreator.calubsmaterials.item.TungstenShovelItem;
import net.mcreator.calubsmaterials.item.TungstenPickaxeItem;
import net.mcreator.calubsmaterials.item.TungstenIngotItem;
import net.mcreator.calubsmaterials.item.TungstenAxeItem;
import net.mcreator.calubsmaterials.item.TitaniumSwordItem;
import net.mcreator.calubsmaterials.item.TitaniumShovelItem;
import net.mcreator.calubsmaterials.item.TitaniumPickaxeItem;
import net.mcreator.calubsmaterials.item.TitaniumIngotItem;
import net.mcreator.calubsmaterials.item.TitaniumAxeItem;
import net.mcreator.calubsmaterials.item.SteelSwordItem;
import net.mcreator.calubsmaterials.item.SteelShovelItem;
import net.mcreator.calubsmaterials.item.SteelPickaxeItem;
import net.mcreator.calubsmaterials.item.SteelIngotItem;
import net.mcreator.calubsmaterials.item.SteelAxeItem;
import net.mcreator.calubsmaterials.item.SilverSwordItem;
import net.mcreator.calubsmaterials.item.SilverShovelItem;
import net.mcreator.calubsmaterials.item.SilverPickaxeItem;
import net.mcreator.calubsmaterials.item.SilverIngotItem;
import net.mcreator.calubsmaterials.item.SilverAxeItem;
import net.mcreator.calubsmaterials.item.RawTungstenItem;
import net.mcreator.calubsmaterials.item.RawTitaniumItem;
import net.mcreator.calubsmaterials.item.RawSilverItem;
import net.mcreator.calubsmaterials.item.RawPlatinumItem;
import net.mcreator.calubsmaterials.item.RawOsmiumItem;
import net.mcreator.calubsmaterials.item.RawLeadItem;
import net.mcreator.calubsmaterials.item.RawAluminumItem;
import net.mcreator.calubsmaterials.item.PlatinumSwordItem;
import net.mcreator.calubsmaterials.item.PlatinumShovelItem;
import net.mcreator.calubsmaterials.item.PlatinumPickaxeItem;
import net.mcreator.calubsmaterials.item.PlatinumIngotItem;
import net.mcreator.calubsmaterials.item.PlatinumAxeItem;
import net.mcreator.calubsmaterials.item.OsmiumSwordItem;
import net.mcreator.calubsmaterials.item.OsmiumShovelItem;
import net.mcreator.calubsmaterials.item.OsmiumPickaxeItem;
import net.mcreator.calubsmaterials.item.OsmiumIngotItem;
import net.mcreator.calubsmaterials.item.OsmiumAxeItem;
import net.mcreator.calubsmaterials.item.LeadIngotItem;
import net.mcreator.calubsmaterials.item.AluminumSwordItem;
import net.mcreator.calubsmaterials.item.AluminumShovelItem;
import net.mcreator.calubsmaterials.item.AluminumPickaxeItem;
import net.mcreator.calubsmaterials.item.AluminumIngotItem;
import net.mcreator.calubsmaterials.item.AluminumAxeItem;
import net.mcreator.calubsmaterials.CalubsMaterialsMod;

public class CalubsMaterialsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CalubsMaterialsMod.MODID);
	public static final RegistryObject<Item> ALUMINUM_INGOT = REGISTRY.register("aluminum_ingot", () -> new AluminumIngotItem());
	public static final RegistryObject<Item> TITANIUM_INGOT = REGISTRY.register("titanium_ingot", () -> new TitaniumIngotItem());
	public static final RegistryObject<Item> PLATINUM_INGOT = REGISTRY.register("platinum_ingot", () -> new PlatinumIngotItem());
	public static final RegistryObject<Item> LEAD_INGOT = REGISTRY.register("lead_ingot", () -> new LeadIngotItem());
	public static final RegistryObject<Item> SILVER_INGOT = REGISTRY.register("silver_ingot", () -> new SilverIngotItem());
	public static final RegistryObject<Item> STEEL_INGOT = REGISTRY.register("steel_ingot", () -> new SteelIngotItem());
	public static final RegistryObject<Item> TUNGSTEN_INGOT = REGISTRY.register("tungsten_ingot", () -> new TungstenIngotItem());
	public static final RegistryObject<Item> OSMIUM_INGOT = REGISTRY.register("osmium_ingot", () -> new OsmiumIngotItem());
	public static final RegistryObject<Item> ULTINUM_INGOT = REGISTRY.register("ultinum_ingot", () -> new UltinumIngotItem());
	public static final RegistryObject<Item> RAW_ALUMINUM = REGISTRY.register("raw_aluminum", () -> new RawAluminumItem());
	public static final RegistryObject<Item> RAW_TITANIUM = REGISTRY.register("raw_titanium", () -> new RawTitaniumItem());
	public static final RegistryObject<Item> RAW_PLATINUM = REGISTRY.register("raw_platinum", () -> new RawPlatinumItem());
	public static final RegistryObject<Item> RAW_LEAD = REGISTRY.register("raw_lead", () -> new RawLeadItem());
	public static final RegistryObject<Item> RAW_SILVER = REGISTRY.register("raw_silver", () -> new RawSilverItem());
	public static final RegistryObject<Item> RAW_TUNGSTEN = REGISTRY.register("raw_tungsten", () -> new RawTungstenItem());
	public static final RegistryObject<Item> RAW_OSMIUM = REGISTRY.register("raw_osmium", () -> new RawOsmiumItem());
	public static final RegistryObject<Item> ALUMINUM_ORE = block(CalubsMaterialsModBlocks.ALUMINUM_ORE, CalubsMaterialsModTabs.TAB_CALUBS_MATERIALS);
	public static final RegistryObject<Item> TITANIUM_ORE = block(CalubsMaterialsModBlocks.TITANIUM_ORE, CalubsMaterialsModTabs.TAB_CALUBS_MATERIALS);
	public static final RegistryObject<Item> PLATINUM_ORE = block(CalubsMaterialsModBlocks.PLATINUM_ORE, CalubsMaterialsModTabs.TAB_CALUBS_MATERIALS);
	public static final RegistryObject<Item> LEAD_ORE = block(CalubsMaterialsModBlocks.LEAD_ORE, CalubsMaterialsModTabs.TAB_CALUBS_MATERIALS);
	public static final RegistryObject<Item> SILVER_ORE = block(CalubsMaterialsModBlocks.SILVER_ORE, CalubsMaterialsModTabs.TAB_CALUBS_MATERIALS);
	public static final RegistryObject<Item> TUNGSTEN_ORE = block(CalubsMaterialsModBlocks.TUNGSTEN_ORE, CalubsMaterialsModTabs.TAB_CALUBS_MATERIALS);
	public static final RegistryObject<Item> OSMIUM_ORE = block(CalubsMaterialsModBlocks.OSMIUM_ORE, CalubsMaterialsModTabs.TAB_CALUBS_MATERIALS);
	public static final RegistryObject<Item> DEEPSLATE_TITANIUM_ORE = block(CalubsMaterialsModBlocks.DEEPSLATE_TITANIUM_ORE,
			CalubsMaterialsModTabs.TAB_CALUBS_MATERIALS);
	public static final RegistryObject<Item> DEEPSLATE_PLATINUM_ORE = block(CalubsMaterialsModBlocks.DEEPSLATE_PLATINUM_ORE,
			CalubsMaterialsModTabs.TAB_CALUBS_MATERIALS);
	public static final RegistryObject<Item> DEEPSLATE_LEAD_ORE = block(CalubsMaterialsModBlocks.DEEPSLATE_LEAD_ORE,
			CalubsMaterialsModTabs.TAB_CALUBS_MATERIALS);
	public static final RegistryObject<Item> DEEPSLATE_TUNGSTEN_ORE = block(CalubsMaterialsModBlocks.DEEPSLATE_TUNGSTEN_ORE,
			CalubsMaterialsModTabs.TAB_CALUBS_MATERIALS);
	public static final RegistryObject<Item> DEEPSLATE_OSMIUM_ORE = block(CalubsMaterialsModBlocks.DEEPSLATE_OSMIUM_ORE,
			CalubsMaterialsModTabs.TAB_CALUBS_MATERIALS);
	public static final RegistryObject<Item> ALUMINUM_BLOCK = block(CalubsMaterialsModBlocks.ALUMINUM_BLOCK,
			CalubsMaterialsModTabs.TAB_CALUBS_MATERIALS);
	public static final RegistryObject<Item> TITANIUM_BLOCK = block(CalubsMaterialsModBlocks.TITANIUM_BLOCK,
			CalubsMaterialsModTabs.TAB_CALUBS_MATERIALS);
	public static final RegistryObject<Item> PLATINUM_BLOCK = block(CalubsMaterialsModBlocks.PLATINUM_BLOCK,
			CalubsMaterialsModTabs.TAB_CALUBS_MATERIALS);
	public static final RegistryObject<Item> LEAD_BLOCK = block(CalubsMaterialsModBlocks.LEAD_BLOCK, CalubsMaterialsModTabs.TAB_CALUBS_MATERIALS);
	public static final RegistryObject<Item> SILVER_BLOCK = block(CalubsMaterialsModBlocks.SILVER_BLOCK, CalubsMaterialsModTabs.TAB_CALUBS_MATERIALS);
	public static final RegistryObject<Item> STEEL_BLOCK = block(CalubsMaterialsModBlocks.STEEL_BLOCK, CalubsMaterialsModTabs.TAB_CALUBS_MATERIALS);
	public static final RegistryObject<Item> TUNGSTEN_BLOCK = block(CalubsMaterialsModBlocks.TUNGSTEN_BLOCK,
			CalubsMaterialsModTabs.TAB_CALUBS_MATERIALS);
	public static final RegistryObject<Item> OSMIUM_BLOCK = block(CalubsMaterialsModBlocks.OSMIUM_BLOCK, CalubsMaterialsModTabs.TAB_CALUBS_MATERIALS);
	public static final RegistryObject<Item> ULTINUM_BLOCK = block(CalubsMaterialsModBlocks.ULTINUM_BLOCK,
			CalubsMaterialsModTabs.TAB_CALUBS_MATERIALS);
	public static final RegistryObject<Item> ALUMINUM_PICKAXE = REGISTRY.register("aluminum_pickaxe", () -> new AluminumPickaxeItem());
	public static final RegistryObject<Item> ALUMINUM_SWORD = REGISTRY.register("aluminum_sword", () -> new AluminumSwordItem());
	public static final RegistryObject<Item> ALUMINUM_AXE = REGISTRY.register("aluminum_axe", () -> new AluminumAxeItem());
	public static final RegistryObject<Item> ALUMINUM_SHOVEL = REGISTRY.register("aluminum_shovel", () -> new AluminumShovelItem());
	public static final RegistryObject<Item> TITANIUM_PICKAXE = REGISTRY.register("titanium_pickaxe", () -> new TitaniumPickaxeItem());
	public static final RegistryObject<Item> TITANIUM_SWORD = REGISTRY.register("titanium_sword", () -> new TitaniumSwordItem());
	public static final RegistryObject<Item> TITANIUM_AXE = REGISTRY.register("titanium_axe", () -> new TitaniumAxeItem());
	public static final RegistryObject<Item> TITANIUM_SHOVEL = REGISTRY.register("titanium_shovel", () -> new TitaniumShovelItem());
	public static final RegistryObject<Item> PLATINUM_PICKAXE = REGISTRY.register("platinum_pickaxe", () -> new PlatinumPickaxeItem());
	public static final RegistryObject<Item> PLATINUM_SWORD = REGISTRY.register("platinum_sword", () -> new PlatinumSwordItem());
	public static final RegistryObject<Item> PLATINUM_AXE = REGISTRY.register("platinum_axe", () -> new PlatinumAxeItem());
	public static final RegistryObject<Item> PLATINUM_SHOVEL = REGISTRY.register("platinum_shovel", () -> new PlatinumShovelItem());
	public static final RegistryObject<Item> SILVER_PICKAXE = REGISTRY.register("silver_pickaxe", () -> new SilverPickaxeItem());
	public static final RegistryObject<Item> SILVER_SWORD = REGISTRY.register("silver_sword", () -> new SilverSwordItem());
	public static final RegistryObject<Item> SILVER_AXE = REGISTRY.register("silver_axe", () -> new SilverAxeItem());
	public static final RegistryObject<Item> SILVER_SHOVEL = REGISTRY.register("silver_shovel", () -> new SilverShovelItem());
	public static final RegistryObject<Item> STEEL_PICKAXE = REGISTRY.register("steel_pickaxe", () -> new SteelPickaxeItem());
	public static final RegistryObject<Item> STEEL_SWORD = REGISTRY.register("steel_sword", () -> new SteelSwordItem());
	public static final RegistryObject<Item> STEEL_AXE = REGISTRY.register("steel_axe", () -> new SteelAxeItem());
	public static final RegistryObject<Item> STEEL_SHOVEL = REGISTRY.register("steel_shovel", () -> new SteelShovelItem());
	public static final RegistryObject<Item> TUNGSTEN_PICKAXE = REGISTRY.register("tungsten_pickaxe", () -> new TungstenPickaxeItem());
	public static final RegistryObject<Item> TUNGSTEN_SWORD = REGISTRY.register("tungsten_sword", () -> new TungstenSwordItem());
	public static final RegistryObject<Item> TUNGSTEN_AXE = REGISTRY.register("tungsten_axe", () -> new TungstenAxeItem());
	public static final RegistryObject<Item> TUNGSTEN_SHOVEL = REGISTRY.register("tungsten_shovel", () -> new TungstenShovelItem());
	public static final RegistryObject<Item> OSMIUM_PICKAXE = REGISTRY.register("osmium_pickaxe", () -> new OsmiumPickaxeItem());
	public static final RegistryObject<Item> OSMIUM_SWORD = REGISTRY.register("osmium_sword", () -> new OsmiumSwordItem());
	public static final RegistryObject<Item> OSMIUM_AXE = REGISTRY.register("osmium_axe", () -> new OsmiumAxeItem());
	public static final RegistryObject<Item> OSMIUM_SHOVEL = REGISTRY.register("osmium_shovel", () -> new OsmiumShovelItem());
	public static final RegistryObject<Item> ULTINUM_PICKAXE = REGISTRY.register("ultinum_pickaxe", () -> new UltinumPickaxeItem());
	public static final RegistryObject<Item> ULTINUM_SWORD = REGISTRY.register("ultinum_sword", () -> new UltinumSwordItem());
	public static final RegistryObject<Item> ULTINUM_AXE = REGISTRY.register("ultinum_axe", () -> new UltinumAxeItem());
	public static final RegistryObject<Item> ULTINUM_SHOVEL = REGISTRY.register("ultinum_shovel", () -> new UltinumShovelItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
