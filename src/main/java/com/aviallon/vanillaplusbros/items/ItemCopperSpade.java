package com.aviallon.vanillaplusbros.items;

import com.aviallon.vanillaplusbros.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;

public class ItemCopperSpade extends ItemSpade {

    public ItemCopperSpade() {

        super(Reference.VanillaPlusBroToolMaterials.COPPER.getToolMaterial());
        setUnlocalizedName(Reference.VanillaPlusBroItems.COPPERSPADE.getUnlocalizedName());
        setRegistryName(Reference.VanillaPlusBroItems.COPPERSPADE.getRegistryName());
        setCreativeTab(CreativeTabs.TOOLS);
    }
}
