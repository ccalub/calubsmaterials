
package net.mcreator.calubsmaterials.world.features.ores;

import net.mcreator.calubsmaterials.init.CalubsMaterialsModBlocks;

import java.util.Set;
import java.util.Random;
import java.util.List;

public class DeepslatePlatinumOreFeature extends OreFeature {
	public static DeepslatePlatinumOreFeature FEATURE = null;
	public static Holder<ConfiguredFeature<OreConfiguration, ?>> CONFIGURED_FEATURE = null;
	public static Holder<PlacedFeature> PLACED_FEATURE = null;

	public static Feature<?> feature() {
		FEATURE = new DeepslatePlatinumOreFeature();
		CONFIGURED_FEATURE = FeatureUtils.register("calubs_materials:deepslate_platinum_ore", FEATURE, new OreConfiguration(
				DeepslatePlatinumOreFeatureRuleTest.INSTANCE, CalubsMaterialsModBlocks.DEEPSLATE_PLATINUM_ORE.get().defaultBlockState(), 6));
		PLACED_FEATURE = PlacementUtils.register("calubs_materials:deepslate_platinum_ore", CONFIGURED_FEATURE,
				List.of(CountPlacement.of(4), InSquarePlacement.spread(),
						HeightRangePlacement.uniform(VerticalAnchor.absolute(-60), VerticalAnchor.absolute(10)), BiomeFilter.biome()));
		return FEATURE;
	}

	public static Holder<PlacedFeature> placedFeature() {
		return PLACED_FEATURE;
	}

	public static final Set<ResourceLocation> GENERATE_BIOMES = null;
	private final Set<ResourceKey<Level>> generate_dimensions = Set.of(Level.OVERWORLD);

	public DeepslatePlatinumOreFeature() {
		super(OreConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<OreConfiguration> context) {
		WorldGenLevel world = context.level();
		if (!generate_dimensions.contains(world.getLevel().dimension()))
			return false;
		return super.place(context);
	}

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
	private static class DeepslatePlatinumOreFeatureRuleTest extends RuleTest {
		static final DeepslatePlatinumOreFeatureRuleTest INSTANCE = new DeepslatePlatinumOreFeatureRuleTest();
		private static final com.mojang.serialization.Codec<DeepslatePlatinumOreFeatureRuleTest> CODEC = com.mojang.serialization.Codec
				.unit(() -> INSTANCE);
		private static final RuleTestType<DeepslatePlatinumOreFeatureRuleTest> CUSTOM_MATCH = () -> CODEC;

		@SubscribeEvent
		public static void init(FMLCommonSetupEvent event) {
			Registry.register(Registry.RULE_TEST, new ResourceLocation("calubs_materials:deepslate_platinum_ore_match"), CUSTOM_MATCH);
		}

		private List<Block> base_blocks = null;

		public boolean test(BlockState blockAt, Random random) {
			if (base_blocks == null) {
				base_blocks = List.of(Blocks.DEEPSLATE);
			}
			return base_blocks.contains(blockAt.getBlock());
		}

		protected RuleTestType<?> getType() {
			return CUSTOM_MATCH;
		}
	}
}
