package com.aviallon.vanillaplusbros.init;

import com.aviallon.vanillaplusbros.recipe.MergerRecipes;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Antoine Viallon on 01/07/2017.
 */
public class ModCrafting {

    public static void register() {

        //GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.copperoreblock, 4), "xIx", "III" , "xIx", 'I', Items.IRON_INGOT);
        GameRegistry.addSmelting(ModBlocks.copperoreblock, new ItemStack(ModItems.copperIngot), 0.5F);
        //GameRegistry.addSmelting(Blocks.OBSIDIAN, new ItemStack(ModItems.obsidianIngot), 2F);

        // Copper tools and weapons
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.copperPickaxe), "CCC", "xSx", "xSx", 'C', ModItems.copperIngot, 'S', Items.STICK);
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.obsidianPickaxe), "OOO", "xSx", "xSx", 'O', ModItems.obsidianIngot, 'S', Items.STICK);
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.copperAxe), "xCC", "xSC", "xSx", 'C', ModItems.copperIngot, 'S', Items.STICK);
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.copperSword), "xCx", "xCx", "xSx", 'C', ModItems.copperIngot, 'S', Items.STICK);
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.copperSpade), "xCx", "xSx", "xSx", 'C', ModItems.copperIngot, 'S', Items.STICK);
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.copperHoe), "xCC", "xSx", "xSx", 'C', ModItems.copperIngot, 'S', Items.STICK);
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.copperblock), "CCC", "CCC", "CCC", 'C', ModItems.copperIngot);

        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.merger), "xIx", "CCC", "RFR", 'R', Blocks.COBBLESTONE, 'I', Items.IRON_INGOT, 'F', Blocks.FURNACE, 'C', ModItems.copperIngot);

        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.copperIngot, 6), ModBlocks.copperblock);

        MergerRecipes.instance().addDualSmeltingRecipe(new ItemStack(Blocks.OBSIDIAN), new ItemStack(Blocks.IRON_ORE), new ItemStack(ModItems.obsidianIngot, 1), 300.0F);
        MergerRecipes.instance().addDualSmeltingRecipe(new ItemStack(Blocks.OBSIDIAN), new ItemStack(Items.IRON_INGOT), new ItemStack(ModItems.obsidianIngot, 1), 350.0F);
    }
}
