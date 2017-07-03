package com.aviallon.vanillaplusbros.init;

import com.aviallon.vanillaplusbros.Reference;
import com.aviallon.vanillaplusbros.items.*;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {

    public static Item obsidianIngot;
    public static Item obsidianPickaxe;
    public static Item copperIngot;
    public static Item copperPickaxe;
    public static Item copperAxe;
    public static Item copperSpade;
    public static Item copperSword;
    public static Item copperHoe;

    public static void init() {
        obsidianIngot = new ItemObsidianIngot();
        obsidianPickaxe = new ItemObsidianPickaxe();
        copperIngot = new ItemCopperIngot();
        copperPickaxe = new ItemCopperPickaxe();
        copperAxe =  new ItemCopperAxe();
        copperSpade = new ItemCopperSpade();
        copperSword = new ItemCopperSword();
        copperHoe = new ItemCopperHoe();
    }

    public static void register() {
        GameRegistry.register(obsidianIngot);
        GameRegistry.register(obsidianPickaxe);
        GameRegistry.register(copperIngot);
        GameRegistry.register(copperPickaxe);
        GameRegistry.register(copperAxe);
        GameRegistry.register(copperSpade);
        GameRegistry.register(copperSword);
        GameRegistry.register(copperHoe);
    }

    public static void registerRenders() {
        registerRenders(obsidianIngot);
        registerRenders(obsidianPickaxe);
        registerRenders(copperIngot);
        registerRenders(copperPickaxe);
        registerRenders(copperAxe);
        registerRenders(copperSpade);
        registerRenders(copperSword);
        registerRenders(copperHoe);
    }

    private static void registerRenders(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(),"inventory"));
    }
}
