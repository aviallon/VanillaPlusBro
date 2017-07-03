package com.aviallon.vanillaplusbros.blocks;

import com.aviallon.vanillaplusbros.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

/**
 * Created by Antoine Viallon on 30/06/2017.
 */
public class BlockCopperOre extends Block {

    public BlockCopperOre() {
        super(Material.IRON);
        setUnlocalizedName(Reference.VanillaPlusBroBlocks.COPPERORE.getUnlocalizedName());
        setRegistryName(Reference.VanillaPlusBroBlocks.COPPERORE.getRegistryName());
        setHardness(6.0F);
        setResistance(12.0F);
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        //setLightLevel(0.1F);
        //setLightOpacity(1);
        setHarvestLevel("pickaxe", 1);
    }
}
