package com.aviallon.vanillaplusbros.jei;

import com.aviallon.vanillaplusbros.Reference;
import com.aviallon.vanillaplusbros.blocks.BlockMerger;
import com.aviallon.vanillaplusbros.gui.GuiMerger;
import com.aviallon.vanillaplusbros.init.ModBlocks;
import com.aviallon.vanillaplusbros.init.ModItems;
import com.aviallon.vanillaplusbros.recipe.MergerRecipes;
import mezz.jei.api.IGuiHelper;
import mezz.jei.api.IModRegistry;
import mezz.jei.api.gui.IDrawable;
import mezz.jei.api.gui.IDrawableAnimated;
import mezz.jei.api.gui.IDrawableStatic;
import mezz.jei.api.gui.IRecipeLayout;
import mezz.jei.api.ingredients.IIngredients;
import mezz.jei.api.recipe.BlankRecipeCategory;
import mezz.jei.api.recipe.VanillaRecipeCategoryUid;
import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nonnull;

/**
 * Created by Antoine Viallon on 06/07/2017.
 */
public class MergerRecipeCategory extends BlankRecipeCategory<MergerRecipeCategory.MergerRecipe> {
    public static final @Nonnull String UID = "Merger";

    private int xOff = 45;
    private int yOff = 3;

    @Nonnull
    private final IDrawable background;

    @Nonnull
    protected final IDrawableAnimated flame;

    private MergerRecipe currentRecipe;

    public MergerRecipeCategory(IGuiHelper guiHelper) {
        ResourceLocation backgroundLocation = GuiMerger.getMergerTextures();
        background = guiHelper.createDrawable(backgroundLocation, xOff, yOff, 82, 78);

        IDrawableStatic flameDrawable = guiHelper.createDrawable(backgroundLocation, 176, 0, 13, 13);
        flame = guiHelper.createAnimatedDrawable(flameDrawable, 200, IDrawableAnimated.StartDirection.BOTTOM, false);
    }

    @Override
    public String getUid() {
        return UID;
    }

    @Override
    public String getTitle() {
        String localizedName = ModBlocks.merger.getLocalizedName();
        return localizedName != null ? localizedName : "ERROR";
    }

    @Override
    public String getModName() {
        return Reference.NAME;
    }

    @Override
    public IDrawable getBackground() {
        return background;
    }

    @Override
    public void setRecipe(IRecipeLayout recipeLayout, MergerRecipe recipeWrapper, IIngredients ingredients) {

    }

    public static class MergerRecipe extends RecipeWrapper {
        public MergerRecipe(IRecipe recipe){
            super(recipe);
        }
    }

    public void drawAnimations(@Nonnull Minecraft minecraft) {
        flame.draw(minecraft, 56 - xOff, 36 - yOff);
        flame.draw(minecraft, 103 - xOff, 36 - yOff);
    }

    public static void register(IModRegistry registry, IGuiHelper guiHelper) {

        registry.addRecipeCategories(new MergerRecipeCategory(guiHelper));
        //registry.addRecipeHandlers(new RecipeHandler<MergerRecipe>(MergerRecipe.class, MergerRecipeCategory.UID));
        registry.addRecipeClickArea(GuiMerger.class, 155, 42, 16, 16, MergerRecipeCategory.UID);
        registry.addRecipeCategoryCraftingItem(new ItemStack(ModBlocks.merger), MergerRecipeCategory.UID, VanillaRecipeCategoryUid.SMELTING);

        /*List<AlloyRecipe> result = new ArrayList<AlloyRecipe>();
        for (IRecipe rec : MergerRecipes.instance().getDualSmeltingList()) {
            result.add(new AlloyRecipe(rec));
        }
        for (IRecipe rec : AlloyRecipeManager.getInstance().getVanillaRecipe().getAllRecipes()) {
            result.add(new AlloyRecipe(rec));
        }
        registry.addRecipes(result);

        registry.getRecipeTransferRegistry().addRecipeTransferHandler(ContainerAlloySmelter.class, AlloyRecipeCategory.UID, FIRST_RECIPE_SLOT, NUM_RECIPE_SLOT,
                FIRST_INVENTORY_SLOT, NUM_INVENTORY_SLOT);
        registry.getRecipeTransferRegistry().addRecipeTransferHandler(ContainerAlloySmelter.class, VanillaRecipeCategoryUid.SMELTING,
                FIRST_RECIPE_SLOT, NUM_RECIPE_SLOT, FIRST_INVENTORY_SLOT, NUM_INVENTORY_SLOT);
                */
    }
}
