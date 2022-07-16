
package net.mcreator.calubsmaterials.world.features.ores;

import net.mcreator.calubsmaterials.init.CalubsMaterialsModBlocks;

import java.util.Set;
import java.util.Random;
import java.util.List;

public class DeepslateTungstenOreFeature extends OreFeature {
	public static DeepslateTungstenOreFeature FEATURE = null;
	public static Holder<ConfiguredFeature<OreConfiguration, ?>> CONFIGURED_FEATURE = null;
	public static Holder<PlacedFeature> PLACED_FEATURE = null;

	public static Feature<?> feature() {
		FEATURE = new DeepslateTungstenOreFeature();
		CONFIGURED_FEATURE = FeatureUtils.register("calubs_materials:deepslate_tungsten_ore", FEATURE, new OreConfiguration(
				DeepslateTungstenOreFeatureRuleTest.INSTANCE, CalubsMaterialsModBlocks.DEEPSLATE_TUNGSTEN_ORE.get().defaultBlockState(), 1));
		PLACED_FEATURE = PlacementUtils.register("calubs_materials:deepslate_tungsten_ore", CONFIGURED_FEATURE,
				List.of(CountPlacement.of(2), InSquarePlacement.spread(),
						HeightRangePlacement.uniform(VerticalAnchor.absolute(-40), VerticalAnchor.absolute(3)), BiomeFilter.biome()));
		return FEATURE;
	}

	public static Holder<PlacedFeature> placedFeature() {
		return PLACED_FEATURE;
	}

	public static final Set<ResourceLocation> GENERATE_BIOMES = null;
	private final Set<ResourceKey<Level>> generate_dimensions = Set.of(Level.OVERWORLD);

	public DeepslateTungstenOreFeature() {
		super(OreConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<OreConfiguration> context) {
		WorldGenLevel world = context.level();
		if (!generate_dimensions.contains(world.getLevel().dimension()))
			return false;
		return super.place(context);
	}

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
	private static class DeepslateTungstenOreFeatureRuleTest extends RuleTest {
		static final DeepslateTungstenOreFeatureRuleTest INSTANCE = new DeepslateTungstenOreFeatureRuleTest();
		private static final com.mojang.serialization.Codec<DeepslateTungstenOreFeatureRuleTest> CODEC = com.mojang.serialization.Codec
				.unit(() -> INSTANCE);
		private static final RuleTestType<DeepslateTungstenOreFeatureRuleTest> CUSTOM_MATCH = () -> CODEC;

		@SubscribeEvent
		public static void init(FMLCommonSetupEvent event) {
			Registry.register(Registry.RULE_TEST, new ResourceLocation("calubs_materials:deepslate_tungsten_ore_match"), CUSTOM_MATCH);
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
