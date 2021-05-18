package ru.betterend.blocks;

import java.util.Optional;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.client.color.block.BlockColor;
import net.minecraft.client.color.item.ItemColor;
import ru.betterend.interfaces.IColorProvider;
import ru.betterend.client.models.Patterns;
import ru.betterend.util.BlocksHelper;

public class HydraluxPetalColoredBlock extends HydraluxPetalBlock implements IColorProvider {
	public HydraluxPetalColoredBlock(FabricBlockSettings settings) {
		super(settings);
	}
	
	@Override
	public BlockColor getProvider() {
		return (state, world, pos, tintIndex) -> {
			return BlocksHelper.getBlockColor(this);
		};
	}

	@Override
	public ItemColor getItemProvider() {
		return (stack, tintIndex) -> {
			return BlocksHelper.getBlockColor(this);
		};
	}

	@Override
	public Optional<String> getModelString(String block) {
		String path = "betterend:block/block_petal_colored";
		return Patterns.createJson(Patterns.BLOCK_PETAL_COLORED, path, path);
	}

}
