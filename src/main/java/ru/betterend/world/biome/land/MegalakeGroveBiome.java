package ru.betterend.world.biome.land;

import net.minecraft.world.entity.EntityType;
import ru.bclib.world.biomes.BCLBiomeDef;
import ru.betterend.BetterEnd;
import ru.betterend.registry.EndBlocks;
import ru.betterend.registry.EndEntities;
import ru.betterend.registry.EndFeatures;
import ru.betterend.registry.EndParticles;
import ru.betterend.registry.EndSounds;
import ru.betterend.registry.EndStructures;
import ru.betterend.world.biome.EndBiome;

public class MegalakeGroveBiome extends EndBiome {
	public MegalakeGroveBiome() {
		super(new BCLBiomeDef(BetterEnd.makeID("megalake_grove")).addStructureFeature(EndStructures.MEGALAKE_SMALL.getFeatureConfigured())
																 .setPlantsColor(73, 210, 209)
																 .setFogColor(178, 209, 248)
																 .setWaterAndFogColor(96, 163, 255)
																 .setFogDensity(2.0F)
																 .setParticles(EndParticles.GLOWING_SPHERE, 0.001F)
																 .setMusic(EndSounds.MUSIC_WATER)
																 .setLoop(EndSounds.AMBIENT_MEGALAKE_GROVE)
																 .setSurface(EndBlocks.END_MOSS)
																 .setDepth(0F)
																 .addFeature(EndFeatures.LACUGROVE)
																 .addFeature(EndFeatures.END_LOTUS)
																 .addFeature(EndFeatures.END_LOTUS_LEAF)
																 .addFeature(EndFeatures.BUBBLE_CORAL_RARE)
																 .addFeature(EndFeatures.END_LILY_RARE)
																 .addFeature(EndFeatures.UMBRELLA_MOSS)
																 //.addFeature(EndFeatures.PEARLBERRY)
																 .addFeature(EndFeatures.CREEPING_MOSS)
																 .addFeature(EndFeatures.CHARNIA_CYAN)
																 .addFeature(EndFeatures.CHARNIA_LIGHT_BLUE)
																 .addFeature(EndFeatures.CHARNIA_RED_RARE)
																 .addFeature(EndFeatures.MENGER_SPONGE)
																 .addMobSpawn(EndEntities.DRAGONFLY, 20, 1, 3)
																 .addMobSpawn(EndEntities.END_FISH, 20, 3, 8)
																 .addMobSpawn(EndEntities.CUBOZOA, 50, 3, 8)
																 .addMobSpawn(EndEntities.END_SLIME, 5, 1, 2)
																 .addMobSpawn(EntityType.ENDERMAN, 10, 1, 2));
	}
}
