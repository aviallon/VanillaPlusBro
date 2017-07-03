package com.aviallon.vanillaplusbros.items;

import com.aviallon.vanillaplusbros.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemCopperIngot extends Item {

    public ItemCopperIngot(){
        setUnlocalizedName(Reference.VanillaPlusBroItems.COPPERINGOT.getUnlocalizedName());
        setRegistryName(Reference.VanillaPlusBroItems.COPPERINGOT.getRegistryName());
        setCreativeTab(CreativeTabs.MATERIALS);
    }
}
