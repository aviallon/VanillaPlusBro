package com.aviallon.vanillaplusbros.items;

import com.aviallon.vanillaplusbros.init.ModBlocks;
import com.google.common.collect.Sets;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemTool;

import java.util.Set;

/**
 * Created by Antoine Viallon on 01/07/2017.
 */
public abstract class ItemAbstractPickaxe extends ItemTool{

    private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(new Block[] {
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
    });

    protected ItemAbstractPickaxe() {
        super(ToolMaterial.WOOD.getDamageVsEntity(), 0.01F, ToolMaterial.WOOD, EFFECTIVE_ON);
    }

    protected ItemAbstractPickaxe(ToolMaterial material) {
        super(material.getDamageVsEntity(), 0.01F, material, EFFECTIVE_ON);
    }

}
