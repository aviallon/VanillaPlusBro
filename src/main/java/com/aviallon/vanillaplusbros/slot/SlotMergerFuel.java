package com.aviallon.vanillaplusbros.slot;

/**
 * Created by Antoine Viallon on 03/07/2017.
 */
import com.aviallon.vanillaplusbros.tileentities.TileMergerFurnace;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class SlotMergerFuel extends Slot {

    public SlotMergerFuel(IInventory inventoryIn, int index, int xPosition, int yPosition) {
        super(inventoryIn, index, xPosition, yPosition);
    }

    @Override
    public boolean isItemValid(ItemStack stack) {
        return TileMergerFurnace.isItemFuel(stack);
    }

    @Override
    public int getItemStackLimit(ItemStack stack) {
        return super.getItemStackLimit(stack);
    }
}
