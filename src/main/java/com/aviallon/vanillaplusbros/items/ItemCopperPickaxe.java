package com.aviallon.vanillaplusbros.items;

import com.aviallon.vanillaplusbros.Reference;
import com.aviallon.vanillaplusbros.init.ModBlocks;
import net.minecraft.block.Block;
import com.google.common.collect.Sets;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;

import java.util.Set;

public class ItemCopperPickaxe extends ItemPickaxe {

    /*private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(new Block[] {
            Blocks.ACTIVATOR_RAIL,
            Blocks.COAL_ORE,
            Blocks.COBBLESTONE,
            Blocks.DETECTOR_RAIL,
            Blocks.DIAMOND_BLOCK,
            Blocks.DIAMOND_ORE,
            Blocks.DOUBLE_STONE_SLAB,
            Blocks.GOLDEN_RAIL,
            Blocks.GOLD_BLOCK,
            Blocks.GOLD_ORE,
            Blocks.ICE,
            Blocks.IRON_BLOCK,
            Blocks.IRON_ORE,
            Blocks.LAPIS_BLOCK,
            Blocks.LAPIS_ORE,
            Blocks.LIT_REDSTONE_ORE,
            Blocks.MOSSY_COBBLESTONE,
            Blocks.NETHERRACK,
            Blocks.PACKED_ICE,
            Blocks.RAIL,
            Blocks.REDSTONE_ORE,
            Blocks.SANDSTONE,
            Blocks.RED_SANDSTONE,
            Blocks.STONE,
            Blocks.STONE_SLAB,
            Blocks.STONE_BUTTON,
            Blocks.STONE_PRESSURE_PLATE,
            ModBlocks.copperoreblock
    });*/

    public ItemCopperPickaxe() {
        //super(3, 1F, Reference.VanillaPlusBroToolMaterials.COPPER.getToolMaterial(), EFFECTIVE_ON);
        super(Reference.VanillaPlusBroToolMaterials.COPPER.getToolMaterial());
        //this.canHarvestBlock(ModBlocks.copperoreblock.getDefaultState());
        setUnlocalizedName(Reference.VanillaPlusBroItems.COPPERPICKAXE.getUnlocalizedName());
        setRegistryName(Reference.VanillaPlusBroItems.COPPERPICKAXE.getRegistryName());
        setCreativeTab(CreativeTabs.TOOLS);
    }
}
