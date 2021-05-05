package ru.betterend.item;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.object.builder.v1.client.model.FabricModelPredicateProviderRegistry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ElytraItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import ru.betterend.BetterEnd;
import ru.betterend.interfaces.MultiModelItem;
import ru.betterend.registry.EndItems;

public class ArmoredElytra extends ElytraItem implements MultiModelItem {

	private final ResourceLocation wingTexture;
	private final Item repairItem;
	private final double movementFactor;

	public ArmoredElytra(String name, Item repairItem, int durability, double movementFactor, boolean fireproof) {
		super(fireproof ? EndItems.makeItemSettings().equipmentSlot(stack -> EquipmentSlot.CHEST)
							.durability(durability).rarity(Rarity.RARE).fireResistant() :
						  EndItems.makeItemSettings().equipmentSlot(stack -> EquipmentSlot.CHEST)
							.durability(durability).rarity(Rarity.RARE));
		this.wingTexture = BetterEnd.makeID("textures/entity/" + name + ".png");
		this.repairItem = repairItem;
		this.movementFactor = movementFactor;
	}

	public double getMovementFactor() {
		return movementFactor;
	}

	@Environment(EnvType.CLIENT)
	public ResourceLocation getWingTexture() {
		return wingTexture;
	}

	@Override
	public boolean isValidRepairItem(ItemStack itemStack, ItemStack itemStack2) {
		return itemStack2.getItem() == repairItem;
	}

	@Override
	@Environment(EnvType.CLIENT)
	public void registerModelPredicate() {
		FabricModelPredicateProviderRegistry.register(this, new ResourceLocation("broken"),
				(itemStack, clientLevel, livingEntity) -> ElytraItem.isFlyEnabled(itemStack) ? 0.0F : 1.0F);
	}
}