
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.calubsmaterials.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Holder;

import net.mcreator.calubsmaterials.world.features.ores.TungstenOreFeature;
import net.mcreator.calubsmaterials.world.features.ores.TitaniumOreFeature;
import net.mcreator.calubsmaterials.world.features.ores.SilverOreFeature;
import net.mcreator.calubsmaterials.world.features.ores.PlatinumOreFeature;
import net.mcreator.calubsmaterials.world.features.ores.OsmiumOreFeature;
import net.mcreator.calubsmaterials.world.features.ores.LeadOreFeature;
import net.mcreator.calubsmaterials.world.features.ores.DeepslateTungstenOreFeature;
import net.mcreator.calubsmaterials.world.features.ores.DeepslateTitaniumOreFeature;
import net.mcreator.calubsmaterials.world.features.ores.DeepslatePlatinumOreFeature;
import net.mcreator.calubsmaterials.world.features.ores.DeepslateLeadOreFeature;
import net.mcreator.calubsmaterials.world.features.ores.AluminumOreFeature;
import net.mcreator.calubsmaterials.CalubsMaterialsMod;

import java.util.function.Supplier;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber
public class CalubsMaterialsModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, CalubsMaterialsMod.MODID);
	private static final List<FeatureRegistration> FEATURE_REGISTRATIONS = new ArrayList<>();
	public static final RegistryObject<Feature<?>> ALUMINUM_ORE = register("aluminum_ore", AluminumOreFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_ORES, AluminumOreFeature.GENERATE_BIOMES, AluminumOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> TITANIUM_ORE = register("titanium_ore", TitaniumOreFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_ORES, TitaniumOreFeature.GENERATE_BIOMES, TitaniumOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> PLATINUM_ORE = register("platinum_ore", PlatinumOreFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_ORES, PlatinumOreFeature.GENERATE_BIOMES, PlatinumOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> LEAD_ORE = register("lead_ore", LeadOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, LeadOreFeature.GENERATE_BIOMES, LeadOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> SILVER_ORE = register("silver_ore", SilverOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, SilverOreFeature.GENERATE_BIOMES, SilverOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> TUNGSTEN_ORE = register("tungsten_ore", TungstenOreFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_ORES, TungstenOreFeature.GENERATE_BIOMES, TungstenOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> OSMIUM_ORE = register("osmium_ore", OsmiumOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, OsmiumOreFeature.GENERATE_BIOMES, OsmiumOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> DEEPSLATE_TITANIUM_ORE = register("deepslate_titanium_ore", DeepslateTitaniumOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, DeepslateTitaniumOreFeature.GENERATE_BIOMES,
					DeepslateTitaniumOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> DEEPSLATE_PLATINUM_ORE = register("deepslate_platinum_ore", DeepslatePlatinumOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, DeepslatePlatinumOreFeature.GENERATE_BIOMES,
					DeepslatePlatinumOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> DEEPSLATE_LEAD_ORE = register("deepslate_lead_ore", DeepslateLeadOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, DeepslateLeadOreFeature.GENERATE_BIOMES,
					DeepslateLeadOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> DEEPSLATE_TUNGSTEN_ORE = register("deepslate_tungsten_ore", DeepslateTungstenOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, DeepslateTungstenOreFeature.GENERATE_BIOMES,
					DeepslateTungstenOreFeature::placedFeature));

	private static RegistryObject<Feature<?>> register(String registryname, Supplier<Feature<?>> feature, FeatureRegistration featureRegistration) {
		FEATURE_REGISTRATIONS.add(featureRegistration);
		return REGISTRY.register(registryname, feature);
	}

	@SubscribeEvent
	public static void addFeaturesToBiomes(BiomeLoadingEvent event) {
		for (FeatureRegistration registration : FEATURE_REGISTRATIONS) {
			if (registration.biomes() == null || registration.biomes().contains(event.getName()))
				event.getGeneration().getFeatures(registration.stage()).add(registration.placedFeature().get());
		}
	}

	private static record FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes,
			Supplier<Holder<PlacedFeature>> placedFeature) {
	}
}
