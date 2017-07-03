package com.aviallon.vanillaplusbros.init;

import com.aviallon.vanillaplusbros.blocks.BlockCopperBlock;
import com.aviallon.vanillaplusbros.blocks.BlockCopperOre;
import com.aviallon.vanillaplusbros.blocks.BlockMerger;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {

    public static Block copperoreblock;
    public static Block copperblock;
    public static Block merger;

    public static void init() {
        copperoreblock = new BlockCopperOre();
        copperblock = new BlockCopperBlock();
        merger = new BlockMerger();
    }

    public static void register() {
        registerBlock(copperoreblock);
        registerBlock(merger);
        registerBlock(copperblock);
    }

    private static void registerBlock(Block block){
        GameRegistry.register(block);
        //GameRegistry.register(dual_furnace);

        ItemBlock item = new ItemBlock(block);
        item.setRegistryName(block.getRegistryName());
        //item.setUnlocalizedName(block.getUnlocalizedName());
        GameRegistry.register(item);
    }

    public static void registerRenders() {
        registerRenders(copperoreblock);
        registerRenders(merger);
        registerRenders(copperblock);
    }

    private static void registerRenders(Block block) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(Item.getItemFromBlock(block).getRegistryName(),"inventory"));
    }
}
