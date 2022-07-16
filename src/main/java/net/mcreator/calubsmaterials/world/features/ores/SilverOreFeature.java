
package net.mcreator.calubsmaterials.world.features.ores;

import net.mcreator.calubsmaterials.init.CalubsMaterialsModBlocks;

import java.util.Set;
import java.util.Random;
import java.util.List;

public class SilverOreFeature extends OreFeature {
	public static SilverOreFeature FEATURE = null;
	public static Holder<ConfiguredFeature<OreConfiguration, ?>> CONFIGURED_FEATURE = null;
	public static Holder<PlacedFeature> PLACED_FEATURE = null;

	public static Feature<?> feature() {
		FEATURE = new SilverOreFeature();
		CONFIGURED_FEATURE = FeatureUtils.register("calubs_materials:silver_ore", FEATURE,
				new OreConfiguration(SilverOreFeatureRuleTest.INSTANCE, CalubsMaterialsModBlocks.SILVER_ORE.get().defaultBlockState(), 10));
		PLACED_FEATURE = PlacementUtils.register("calubs_materials:silver_ore", CONFIGURED_FEATURE,
				List.of(CountPlacement.of(2), InSquarePlacement.spread(),
						HeightRangePlacement.uniform(VerticalAnchor.absolute(15), VerticalAnchor.absolute(64)), BiomeFilter.biome()));
		return FEATURE;
	}

	public static Holder<PlacedFeature> placedFeature() {
		return PLACED_FEATURE;
	}

	public static final Set<ResourceLocation> GENERATE_BIOMES = null;
	private final Set<ResourceKey<Level>> generate_dimensions = Set.of(Level.OVERWORLD);

	public SilverOreFeature() {
		super(OreConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<OreConfiguration> context) {
		WorldGenLevel world = context.level();
		if (!generate_dimensions.contains(world.getLevel().dimension()))
			return false;
		return super.place(context);
	}

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
	private static class SilverOreFeatureRuleTest extends RuleTest {
		static final SilverOreFeatureRuleTest INSTANCE = new SilverOreFeatureRuleTest();
		private static final com.mojang.serialization.Codec<SilverOreFeatureRuleTest> CODEC = com.mojang.serialization.Codec.unit(() -> INSTANCE);
		private static final RuleTestType<SilverOreFeatureRuleTest> CUSTOM_MATCH = () -> CODEC;

		@SubscribeEvent
		public static void init(FMLCommonSetupEvent event) {
			Registry.register(Registry.RULE_TEST, new ResourceLocation("calubs_materials:silver_ore_match"), CUSTOM_MATCH);
		}

		private List<Block> base_blocks = null;

		public boolean test(BlockState blockAt, Random random) {
			if (base_blocks == null) {
				base_blocks = List.of(Blocks.STONE);
			}
			return base_blocks.contains(blockAt.getBlock());
		}

		protected RuleTestType<?> getType() {
			return CUSTOM_MATCH;
		}
	}
}
