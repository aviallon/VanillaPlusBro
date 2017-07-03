package com.aviallon.vanillaplusbros.items;

import com.aviallon.vanillaplusbros.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;

public class ItemCopperSword extends ItemSword {

    public ItemCopperSword() {

        super(Reference.VanillaPlusBroToolMaterials.COPPER.getToolMaterial());
        setUnlocalizedName(Reference.VanillaPlusBroItems.COPPERSWORD.getUnlocalizedName());
        setRegistryName(Reference.VanillaPlusBroItems.COPPERSWORD.getRegistryName());
        setCreativeTab(CreativeTabs.COMBAT);
    }
}
