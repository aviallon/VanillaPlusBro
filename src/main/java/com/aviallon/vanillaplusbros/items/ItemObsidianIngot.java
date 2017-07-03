package com.aviallon.vanillaplusbros.items;

import com.aviallon.vanillaplusbros.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemObsidianIngot extends Item {

    public ItemObsidianIngot(){
        setUnlocalizedName(Reference.VanillaPlusBroItems.OBSIDIANINGOT.getUnlocalizedName());
        setRegistryName(Reference.VanillaPlusBroItems.OBSIDIANINGOT.getRegistryName());
        setCreativeTab(CreativeTabs.MATERIALS);
    }
}
