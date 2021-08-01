package ru.betterend.world.structures.features;

import net.minecraft.world.level.ChunkPos;
import net.minecraft.world.level.LevelHeightAccessor;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.BiomeSource;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.chunk.ChunkGenerator;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.levelgen.WorldgenRandom;
import net.minecraft.world.level.levelgen.feature.StructureFeature;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;

import java.util.Random;

public abstract class FeatureBaseStructure extends StructureFeature<NoneFeatureConfiguration> {
	protected static final BlockState AIR = Blocks.AIR.defaultBlockState();
	
	public FeatureBaseStructure() {
		super(NoneFeatureConfiguration.CODEC);
	}
	
	@Override
	protected boolean isFeatureChunk(ChunkGenerator chunkGenerator, BiomeSource biomeSource, long worldSeed, WorldgenRandom chunkRandom, ChunkPos pos, Biome biome, ChunkPos chunkPos, NoneFeatureConfiguration featureConfig, LevelHeightAccessor levelHeightAccessor) {
		return getGenerationHeight(pos, chunkGenerator, levelHeightAccessor) >= 20;
	}
	
	private static int getGenerationHeight(ChunkPos chunkPos, ChunkGenerator chunkGenerator, LevelHeightAccessor levelHeightAccessor) {
		Random random = new Random((long) (chunkPos.x + chunkPos.z * 10387313));
		Rotation blockRotation = Rotation.getRandom(random);
		int i = 5;
		int j = 5;
		if (blockRotation == Rotation.CLOCKWISE_90) {
			i = -5;
		}
		else if (blockRotation == Rotation.CLOCKWISE_180) {
			i = -5;
			j = -5;
		}
		else if (blockRotation == Rotation.COUNTERCLOCKWISE_90) {
			j = -5;
		}
		
		int k = chunkPos.getBlockX(7);
		int l = chunkPos.getBlockZ(7);
		int m = chunkGenerator.getFirstOccupiedHeight(k, l, Heightmap.Types.WORLD_SURFACE_WG, levelHeightAccessor);
		int n = chunkGenerator.getFirstOccupiedHeight(k, l + j, Heightmap.Types.WORLD_SURFACE_WG, levelHeightAccessor);
		int o = chunkGenerator.getFirstOccupiedHeight(k + i, l, Heightmap.Types.WORLD_SURFACE_WG, levelHeightAccessor);
		int p = chunkGenerator.getFirstOccupiedHeight(
			k + i,
			l + j,
			Heightmap.Types.WORLD_SURFACE_WG,
			levelHeightAccessor
		);
		return Math.min(Math.min(m, n), Math.min(o, p));
	}
}
