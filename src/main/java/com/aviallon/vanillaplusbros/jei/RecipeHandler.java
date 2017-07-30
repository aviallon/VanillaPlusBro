package com.aviallon.vanillaplusbros.jei;

import mezz.jei.api.recipe.IRecipeHandler;

import javax.annotation.Nonnull;

/**
 * Created by Antoine Viallon on 06/07/2017.
 */
public class RecipeHandler<T extends RecipeWrapper> {

    public RecipeHandler(@Nonnull Class<T> clazz, @Nonnull String uid) {

    }
    
    public boolean isRecipeValid(@Nonnull T recipe) {
        return true;
    }

}
