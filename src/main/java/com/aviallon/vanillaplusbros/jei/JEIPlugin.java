package com.aviallon.vanillaplusbros.jei;

import com.aviallon.vanillaplusbros.gui.GuiMerger;
import mezz.jei.api.IJeiRuntime;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.IModRegistry;
import mezz.jei.api.ISubtypeRegistry;
import mezz.jei.api.gui.IAdvancedGuiHandler;
import mezz.jei.api.ingredients.IModIngredientRegistration;
import mezz.jei.api.recipe.IRecipeCategoryRegistration;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.awt.*;
import java.lang.annotation.Annotation;
import java.util.*;
import java.util.List;

/**
 * Created by Antoine Viallon on 06/07/2017.
 */
@mezz.jei.api.JEIPlugin
public class JEIPlugin implements IModPlugin {

    @Override
    public void registerItemSubtypes(ISubtypeRegistry subtypeRegistry) {

    }

    @Override
    public void registerIngredients(IModIngredientRegistration registry) {

    }

    @Override
    public void registerCategories(IRecipeCategoryRegistration registry) {

    }

    @Override
    public void register(IModRegistry registry) {
        registry.addAdvancedGuiHandlers(new IAdvancedGuiHandler<GuiMerger>() {

            @Override
            public Class<GuiMerger> getGuiContainerClass() {
                return GuiMerger.class;
            }

            @Nullable
            @Override
            public List<Rectangle> getGuiExtraAreas(GuiMerger guiContainer) {
                return null;
            }

            @Nullable
            @Override
            public Object getIngredientUnderMouse(GuiMerger guiContainer, int mouseX, int mouseY) {
                return null;
            }
        });
    }


    @Override
    public void onRuntimeAvailable(IJeiRuntime jeiRuntime) {

    }
}
