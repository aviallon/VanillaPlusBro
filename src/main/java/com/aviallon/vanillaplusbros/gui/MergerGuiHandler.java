package com.aviallon.vanillaplusbros.gui;

import com.aviallon.vanillaplusbros.blocks.ContainerMerger;
import com.aviallon.vanillaplusbros.tileentities.TileMergerFurnace;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

/**
 * Created by Antoine Viallon on 03/07/2017.
 */
    public class MergerGuiHandler implements IGuiHandler {

        public static final int DUAL_FURNACE_GUI = 0;

        @Override
        public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
            if(ID == DUAL_FURNACE_GUI)
                return new ContainerMerger(player.inventory, ((TileMergerFurnace)world.getTileEntity(new BlockPos(x, y, z))));
            return null;
        }

        @Override
        public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
            if(ID == DUAL_FURNACE_GUI)
                return new GuiMerger(player.inventory, ((TileMergerFurnace)world.getTileEntity(new BlockPos(x, y, z))));
            return null;
        }
    }
