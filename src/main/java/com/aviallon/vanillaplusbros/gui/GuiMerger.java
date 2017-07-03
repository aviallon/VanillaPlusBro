package com.aviallon.vanillaplusbros.gui;

import com.aviallon.vanillaplusbros.Reference;
import com.aviallon.vanillaplusbros.blocks.ContainerMerger;
import com.aviallon.vanillaplusbros.init.ModBlocks;
import com.aviallon.vanillaplusbros.tileentities.TileMergerFurnace;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

/**
 * Created by Antoine Viallon on 03/07/2017.
 */
public class GuiMerger extends GuiContainer {

    private static final ResourceLocation DUAL_FURNACE_TEXTURES = new ResourceLocation(Reference.MOD_ID + ":" + "textures/gui/container/dual_furnace.png");
    private final InventoryPlayer player;
    private final TileMergerFurnace tileentity;

    public GuiMerger(InventoryPlayer player, TileMergerFurnace tileentity) {
        super(new ContainerMerger(player, tileentity));
        this.player = player;
        this.tileentity = tileentity;
    }

    @Override
    protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
        //String s = this.tileentity.getDisplayName().getUnformattedText();
        String s = new ItemStack(ModBlocks.merger).getDisplayName();
        this.fontRendererObj.drawString(s, this.xSize / 2 - this.fontRendererObj.getStringWidth(s) / 2, 6, 4210752);
        this.fontRendererObj.drawString(this.player.getDisplayName().getUnformattedText(), 8, this.ySize - 96 + 2, 4210752);
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
        GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
        this.mc.getTextureManager().bindTexture(DUAL_FURNACE_TEXTURES);
        this.drawTexturedModalRect(this.guiLeft, this.guiTop, 0, 0, this.xSize, this.ySize);

        if(TileMergerFurnace.isBurning(this.tileentity)) {
            int k = this.getBurnLeftScaled(13);
            this.drawTexturedModalRect(this.guiLeft + 80, this.guiTop + 42 + 12 - k, 176, 12 - k, 14, k + 1);
        }

        int l = this.getCookProgressScaled(24);
        this.drawTexturedModalRect(this.guiLeft + 43, this.guiTop + 18, 176, 14, l + 1, 16);
        int r = this.getCookProgressScaled(24);
        this.drawTexturedModalRect(this.guiLeft + 109, this.guiTop + 18, 176, 31, 23 - r, 16);
    }

    private int getBurnLeftScaled(int pixels) {
        int i = this.tileentity.getField(1);

        if(i == 0)
            i = 200;
        return this.tileentity.getField(0) * pixels / i;
    }

    private int getCookProgressScaled(int pixels) {
        int i = this.tileentity.getField(2);
        int j = this.tileentity.getField(3);
        return j != 0 && i != 0 ? i * pixels / j : 0;
    }
}
