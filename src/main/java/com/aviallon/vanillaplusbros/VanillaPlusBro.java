package com.aviallon.vanillaplusbros;

import com.aviallon.vanillaplusbros.gui.MergerGuiHandler;
import com.aviallon.vanillaplusbros.init.ModBlocks;
import com.aviallon.vanillaplusbros.init.ModCrafting;
import com.aviallon.vanillaplusbros.init.ModItems;
import com.aviallon.vanillaplusbros.proxy.CommonProxy;
import com.aviallon.vanillaplusbros.tileentities.TileMergerFurnace;
import com.aviallon.vanillaplusbros.world.WorldGenOres;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.*;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;
import org.apache.logging.log4j.Level;


@Mod(modid = Reference.MOD_ID, name = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_VERSION)
public class VanillaPlusBro {

    @Instance
    public static VanillaPlusBro instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event){

        ModItems.init();
        ModItems.register();

        ModBlocks.init();
        ModBlocks.register();
    }

    @EventHandler
    public void Init(FMLInitializationEvent event){

        proxy.init();
        GameRegistry.registerWorldGenerator(new WorldGenOres(), 0);
        NetworkRegistry.INSTANCE.registerGuiHandler(Reference.MOD_ID, new MergerGuiHandler());
        GameRegistry.registerTileEntity(TileMergerFurnace.class, Reference.VanillaPlusBroBlocks.MERGER.getUnlocalizedName());
        ModCrafting.register();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event){
        LogHelper.log(Level.INFO, "Mod initialisé !");
    }

    @EventHandler
    public void serverLoad(FMLServerStartingEvent event){

    }

}
