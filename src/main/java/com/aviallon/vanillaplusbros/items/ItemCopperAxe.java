package com.aviallon.vanillaplusbros.items;

import com.aviallon.vanillaplusbros.Reference;
import com.aviallon.vanillaplusbros.init.ModBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemPickaxe;

public class ItemCopperAxe extends ItemAxe {


    public ItemCopperAxe() {
        super(Reference.VanillaPlusBroToolMaterials.COPPER.getToolMaterial(), 8F, -3.1F);
        //super((Reference.VanillaPlusBroToolMaterials.COPPER.getToolMaterial()));
        setUnlocalizedName(Reference.VanillaPlusBroItems.COPPERAXE.getUnlocalizedName());
        setRegistryName(Reference.VanillaPlusBroItems.COPPERAXE.getRegistryName());
        setCreativeTab(CreativeTabs.TOOLS);
    }
}
