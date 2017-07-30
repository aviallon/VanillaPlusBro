package com.aviallon.vanillaplusbros.jei;



import mezz.jei.api.ingredients.IIngredients;
import mezz.jei.api.recipe.BlankRecipeWrapper;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.fluids.FluidStack;

import javax.annotation.Nonnull;
import java.util.ArrayList;
import java.util.List;

public class RecipeWrapper extends BlankRecipeWrapper {

    private final IRecipe recipe;

    public RecipeWrapper(IRecipe recipe) {
        this.recipe = recipe;
    }

    @Override
    public void getIngredients(IIngredients ingredients) {

    }

    /*@Override
    public void getIngredients(@Nonnull IIngredients ingredients) {
        /*List<List<ItemStack>> inputStacks = recipe.getInputStackAlternatives();
        if (inputStacks != null) {
            ingredients.setInputLists(ItemStack.class, inputStacks);
        }

        List<ItemStack> outputs = new ArrayList<ItemStack>();
        for(RecipeOutput out : recipe.getOutputs()) {
            if(out.getOutput() != null) {
                outputs.add(out.getOutput());
            }
        }
        ingredients.setOutputs(ItemStack.class, outputs);

        List<FluidStack> inputFluidStacks = recipe.getInputFluidStacks();
        if (inputFluidStacks != null) {
            ingredients.setInputs(FluidStack.class, inputFluidStacks);
        }

        List<FluidStack> fluidOutputs = new ArrayList<FluidStack>();
        for(RecipeOutput out : recipe.getOutputs()) {
            if(out.getFluidOutput() != null) {
                fluidOutputs.add(out.getFluidOutput());
            }
        }
        ingredients.setOutputs(FluidStack.class, fluidOutputs);
        */
    //}
    /*

    public boolean isValid() {
        return true;
    }


    public IRecipe getRecipe() {
        return true;
    }*/


}