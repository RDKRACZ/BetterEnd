package ru.betterend.world.biome.land;

import net.minecraft.data.worldgen.StructureFeatures;
import net.minecraft.world.entity.EntityType;
import ru.bclib.world.biomes.BCLBiomeDef;
import ru.betterend.BetterEnd;
import ru.betterend.registry.EndBlocks;
import ru.betterend.registry.EndFeatures;
import ru.betterend.registry.EndParticles;
import ru.betterend.registry.EndSounds;
import ru.betterend.world.biome.EndBiome;

public class UmbrellaJungleBiome extends EndBiome {
	public UmbrellaJungleBiome() {
		super(new BCLBiomeDef(BetterEnd.makeID("umbrella_jungle")).setFogColor(87, 223, 221)
																  .setWaterAndFogColor(119, 198, 253)
																  .setFoliageColor(27, 183, 194)
																  .setFogDensity(2.3F)
																  .setParticles(EndParticles.JUNGLE_SPORE, 0.001F)
																  .setMusic(EndSounds.MUSIC_FOREST)
																  .setLoop(EndSounds.AMBIENT_UMBRELLA_JUNGLE)
																  .setSurface(EndBlocks.JUNGLE_MOSS)
																  .addFeature(EndFeatures.END_LAKE)
																  .addFeature(EndFeatures.UMBRELLA_TREE)
																  .addFeature(EndFeatures.JELLYSHROOM)
																  .addFeature(EndFeatures.TWISTED_UMBRELLA_MOSS)
																  .addFeature(EndFeatures.SMALL_JELLYSHROOM_FLOOR)
																  .addFeature(EndFeatures.JUNGLE_GRASS)
																  .addFeature(EndFeatures.CYAN_MOSS)
																  .addFeature(EndFeatures.CYAN_MOSS_WOOD)
																  .addFeature(EndFeatures.JUNGLE_FERN_WOOD)
																  .addFeature(EndFeatures.SMALL_JELLYSHROOM_WALL)
																  .addFeature(EndFeatures.SMALL_JELLYSHROOM_WOOD)
																  .addFeature(EndFeatures.SMALL_JELLYSHROOM_CEIL)
																  .addFeature(EndFeatures.JUNGLE_VINE)
																  .addFeature(EndFeatures.CHARNIA_CYAN)
																  .addFeature(EndFeatures.CHARNIA_GREEN)
																  .addFeature(EndFeatures.CHARNIA_LIGHT_BLUE)
																  .addFeature(EndFeatures.CHARNIA_RED_RARE)
																  .addStructureFeature(StructureFeatures.END_CITY)
																  .addMobSpawn(EntityType.ENDERMAN, 50, 1, 2));
	}
}