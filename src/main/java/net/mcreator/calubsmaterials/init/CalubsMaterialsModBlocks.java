
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.calubsmaterials.init;

import net.mcreator.calubsmaterials.block.UltinumBlockBlock;
import net.mcreator.calubsmaterials.block.TungstenOreBlock;
import net.mcreator.calubsmaterials.block.TungstenBlockBlock;
import net.mcreator.calubsmaterials.block.TitaniumOreBlock;
import net.mcreator.calubsmaterials.block.TitaniumBlockBlock;
import net.mcreator.calubsmaterials.block.SteelBlockBlock;
import net.mcreator.calubsmaterials.block.SilverOreBlock;
import net.mcreator.calubsmaterials.block.SilverBlockBlock;
import net.mcreator.calubsmaterials.block.PlatinumOreBlock;
import net.mcreator.calubsmaterials.block.PlatinumBlockBlock;
import net.mcreator.calubsmaterials.block.OsmiumOreBlock;
import net.mcreator.calubsmaterials.block.OsmiumBlockBlock;
import net.mcreator.calubsmaterials.block.LeadOreBlock;
import net.mcreator.calubsmaterials.block.LeadBlockBlock;
import net.mcreator.calubsmaterials.block.DeepslateTungstenOreBlock;
import net.mcreator.calubsmaterials.block.DeepslateTitaniumOreBlock;
import net.mcreator.calubsmaterials.block.DeepslatePlatinumOreBlock;
import net.mcreator.calubsmaterials.block.DeepslateOsmiumOreBlock;
import net.mcreator.calubsmaterials.block.DeepslateLeadOreBlock;
import net.mcreator.calubsmaterials.block.AluminumOreBlock;
import net.mcreator.calubsmaterials.block.AluminumBlockBlock;
import net.mcreator.calubsmaterials.CalubsMaterialsMod;

public class CalubsMaterialsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, CalubsMaterialsMod.MODID);
	public static final RegistryObject<Block> ALUMINUM_ORE = REGISTRY.register("aluminum_ore", () -> new AluminumOreBlock());
	public static final RegistryObject<Block> TITANIUM_ORE = REGISTRY.register("titanium_ore", () -> new TitaniumOreBlock());
	public static final RegistryObject<Block> PLATINUM_ORE = REGISTRY.register("platinum_ore", () -> new PlatinumOreBlock());
	public static final RegistryObject<Block> LEAD_ORE = REGISTRY.register("lead_ore", () -> new LeadOreBlock());
	public static final RegistryObject<Block> SILVER_ORE = REGISTRY.register("silver_ore", () -> new SilverOreBlock());
	public static final RegistryObject<Block> TUNGSTEN_ORE = REGISTRY.register("tungsten_ore", () -> new TungstenOreBlock());
	public static final RegistryObject<Block> OSMIUM_ORE = REGISTRY.register("osmium_ore", () -> new OsmiumOreBlock());
	public static final RegistryObject<Block> DEEPSLATE_TITANIUM_ORE = REGISTRY.register("deepslate_titanium_ore",
			() -> new DeepslateTitaniumOreBlock());
	public static final RegistryObject<Block> DEEPSLATE_PLATINUM_ORE = REGISTRY.register("deepslate_platinum_ore",
			() -> new DeepslatePlatinumOreBlock());
	public static final RegistryObject<Block> DEEPSLATE_LEAD_ORE = REGISTRY.register("deepslate_lead_ore", () -> new DeepslateLeadOreBlock());
	public static final RegistryObject<Block> DEEPSLATE_TUNGSTEN_ORE = REGISTRY.register("deepslate_tungsten_ore",
			() -> new DeepslateTungstenOreBlock());
	public static final RegistryObject<Block> DEEPSLATE_OSMIUM_ORE = REGISTRY.register("deepslate_osmium_ore", () -> new DeepslateOsmiumOreBlock());
	public static final RegistryObject<Block> ALUMINUM_BLOCK = REGISTRY.register("aluminum_block", () -> new AluminumBlockBlock());
	public static final RegistryObject<Block> TITANIUM_BLOCK = REGISTRY.register("titanium_block", () -> new TitaniumBlockBlock());
	public static final RegistryObject<Block> PLATINUM_BLOCK = REGISTRY.register("platinum_block", () -> new PlatinumBlockBlock());
	public static final RegistryObject<Block> LEAD_BLOCK = REGISTRY.register("lead_block", () -> new LeadBlockBlock());
	public static final RegistryObject<Block> SILVER_BLOCK = REGISTRY.register("silver_block", () -> new SilverBlockBlock());
	public static final RegistryObject<Block> STEEL_BLOCK = REGISTRY.register("steel_block", () -> new SteelBlockBlock());
	public static final RegistryObject<Block> TUNGSTEN_BLOCK = REGISTRY.register("tungsten_block", () -> new TungstenBlockBlock());
	public static final RegistryObject<Block> OSMIUM_BLOCK = REGISTRY.register("osmium_block", () -> new OsmiumBlockBlock());
	public static final RegistryObject<Block> ULTINUM_BLOCK = REGISTRY.register("ultinum_block", () -> new UltinumBlockBlock());
}
