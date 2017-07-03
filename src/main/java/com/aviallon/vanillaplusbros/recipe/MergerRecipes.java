package com.aviallon.vanillaplusbros.recipe;

import com.aviallon.vanillaplusbros.LogHelper;
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Maps;
import com.google.common.collect.Table;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import org.apache.logging.log4j.Level;

import java.util.Map;

/**
 * Created by Antoine Viallon on 03/07/2017.
 */
public class MergerRecipes {

    private static final MergerRecipes SMELTING = new MergerRecipes();
    private final Table<ItemStack, ItemStack, ItemStack> dualSmeltingList = HashBasedTable.<ItemStack, ItemStack, ItemStack>create();
    private final Map<ItemStack, Float> experienceList = Maps.<ItemStack, Float>newHashMap();

    public static MergerRecipes instance() {
        return SMELTING;
    }

    private MergerRecipes(){
        //this.addDualSmeltingRecipe(new ItemStack(Blocks.DIAMOND_ORE), new ItemStack(Blocks.GOLD_ORE), new ItemStack(Items.EMERALD), 100.0F);
    }

    public void addDualSmeltingRecipeForBlock(Block input1, Block input2, ItemStack result, float experience) {
        this.addDualSmelting(Item.getItemFromBlock(input1), Item.getItemFromBlock(input2), result, experience);
    }

    public void addDualSmeltingRecipeForBlock(Item input1, Block input2, ItemStack result, float experience) {
        this.addDualSmelting(input1, Item.getItemFromBlock(input2), result, experience);
    }

    public void addDualSmeltingRecipeForBlock(Block input1, Item input2, ItemStack result, float experience) {
        this.addDualSmelting(Item.getItemFromBlock(input1), input2, result, experience);
    }

    public void addDualSmelting(Item input1, Item input2, ItemStack result, float experience) {
        this.addDualSmeltingRecipe(new ItemStack(input1, 1, 32767), new ItemStack(input2, 1, 32767), result, experience);
    }

    public void addDualSmelting(ItemStack input1, Item input2, ItemStack result, float experience) {
        this.addDualSmeltingRecipe(input1, new ItemStack(input2, 1, 32767), result, experience);
    }

    public void addDualSmelting(Item input1, ItemStack input2, ItemStack result, float experience) {
        this.addDualSmeltingRecipe(new ItemStack(input1, 1, 32767), input2, result, experience);
    }

    public void addDualSmeltingRecipe(ItemStack input1, ItemStack input2, ItemStack result, float experience){
        if(getDualSmeltingResult(input1, input2) != ItemStack.EMPTY){
            LogHelper.log(Level.INFO, "Ignored dual smelting recipe : " + input1 + input2);
            return;
        }
        this.dualSmeltingList.put(input1, input2, result);
        this.experienceList.put(result, Float.valueOf(experience));
    }

    public ItemStack getDualSmeltingResult(ItemStack input1, ItemStack input2){
        for(Map.Entry<ItemStack, Map<ItemStack, ItemStack>> entry : this.dualSmeltingList.columnMap().entrySet())
            if(this.compareItemStacks(input1, (ItemStack)entry.getKey()))
                for(Map.Entry<ItemStack, ItemStack> ent : entry.getValue().entrySet())
                    if(this.compareItemStacks(input2, (ItemStack)ent.getKey()))
                        return (ItemStack)ent.getValue();
        return ItemStack.EMPTY;
    }

    private boolean compareItemStacks(ItemStack stack1, ItemStack stack2){
        return stack2.getItem() == stack1.getItem() && (stack2.getMetadata() == 32767 || stack2.getMetadata() == stack1.getMetadata());
    }

    public Table<ItemStack, ItemStack, ItemStack> getDualSmeltingList(){
        return this.dualSmeltingList;
    }

    public float getDualSmeltingExperience(ItemStack stack){
        for(Map.Entry<ItemStack, Float> entry : this.experienceList.entrySet())
            if(this.compareItemStacks(stack, (ItemStack)entry.getKey()))
                return ((Float)entry.getValue().floatValue());
        return 0.0F;
    }
}
