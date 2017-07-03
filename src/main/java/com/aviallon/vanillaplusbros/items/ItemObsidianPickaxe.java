package com.aviallon.vanillaplusbros.items;

import com.aviallon.vanillaplusbros.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class ItemObsidianPickaxe extends ItemPickaxe {

    public ItemObsidianPickaxe() {
        super(Reference.VanillaPlusBroToolMaterials.OBSIDIAN.getToolMaterial());
        setUnlocalizedName(Reference.VanillaPlusBroItems.OBSIDIANPICKAXE.getUnlocalizedName());
        setRegistryName(Reference.VanillaPlusBroItems.OBSIDIANPICKAXE.getRegistryName());
        setCreativeTab(CreativeTabs.TOOLS);
    }
}
