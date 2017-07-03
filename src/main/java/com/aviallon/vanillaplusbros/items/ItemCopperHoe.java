package com.aviallon.vanillaplusbros.items;

import com.aviallon.vanillaplusbros.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemSpade;

public class ItemCopperHoe extends ItemHoe {

    public ItemCopperHoe() {

        super(Reference.VanillaPlusBroToolMaterials.COPPER.getToolMaterial());
        setUnlocalizedName(Reference.VanillaPlusBroItems.COPPERHOE.getUnlocalizedName());
        setRegistryName(Reference.VanillaPlusBroItems.COPPERHOE.getRegistryName());
        setCreativeTab(CreativeTabs.TOOLS);
    }
}
