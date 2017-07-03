package com.aviallon.vanillaplusbros.blocks;

import com.aviallon.vanillaplusbros.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

/**
 * Created by Antoine Viallon on 30/06/2017.
 */
public class BlockCopperBlock extends Block {

    public BlockCopperBlock() {
        super(Material.IRON);
        setUnlocalizedName(Reference.VanillaPlusBroBlocks.COPPERBLOCK.getUnlocalizedName());
        setRegistryName(Reference.VanillaPlusBroBlocks.COPPERBLOCK.getRegistryName());
        setHardness(7.0F);
        setResistance(16.0F);
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        //setLightLevel(0.1F);
        //setLightOpacity(1);
        setHarvestLevel("pickaxe", 1);
    }
}
