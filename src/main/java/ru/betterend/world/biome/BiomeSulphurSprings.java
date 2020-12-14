package ru.betterend.world.biome;

import net.minecraft.entity.EntityType;
import ru.betterend.registry.EndEntities;
import ru.betterend.registry.EndFeatures;
import ru.betterend.registry.EndParticles;
import ru.betterend.registry.EndSounds;
import ru.betterend.world.surface.SurfaceBuilders;

public class BiomeSulphurSprings extends EndBiome {
	public BiomeSulphurSprings() {
		super(new BiomeDefinition("sulphur_springs")
				.setSurface(SurfaceBuilders.SULPHURIC_SURFACE)
				.setMusic(EndSounds.MUSIC_SULPHUR_SPRINGS)
				.setLoop(EndSounds.AMBIENT_SULPHUR_SPRINGS)
				.setWaterColor(25, 90, 157)
				.setWaterFogColor(30, 65, 61)
				.setFogColor(207, 194, 62)
				.setFogDensity(1.5F)
				.setCaves(false)
				.setParticles(EndParticles.SULPHUR_PARTICLE, 0.001F)
				.addFeature(EndFeatures.GEYSER)
				.addFeature(EndFeatures.SURFACE_VENT)
				.addFeature(EndFeatures.SULPHURIC_LAKE)
				.addFeature(EndFeatures.SULPHURIC_CAVE)
				.addFeature(EndFeatures.HYDRALUX)
				.addFeature(EndFeatures.CHARNIA_GREEN)
				.addFeature(EndFeatures.CHARNIA_ORANGE)
				.addFeature(EndFeatures.CHARNIA_RED_RARE)
				.addMobSpawn(EndEntities.END_FISH, 50, 3, 8)
				.addMobSpawn(EndEntities.CUBOZOA, 50, 3, 8)
				.addMobSpawn(EntityType.ENDERMAN, 50, 1, 4));
	}
}
