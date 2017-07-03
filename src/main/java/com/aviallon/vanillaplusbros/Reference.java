package com.aviallon.vanillaplusbros;

import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;


public class Reference {

    public static final String MOD_ID = "aviallonvpb";
    public static final String NAME = "Vanilla Plus Bro";
    public static final String VERSION = "0.1";
    public static final String ACCEPTED_VERSION = "[1.11.2]";

    public static final String CLIENT_PROXY_CLASS = "com.aviallon.vanillaplusbros.proxy.ClientProxy";
    public static final String SERVER_PROXY_CLASS = "com.aviallon.vanillaplusbros.proxy.ServerProxy";

    public static enum VanillaPlusBroItems {
        OBSIDIANINGOT("obsidianIngot", "ItemObsidianIngot"),
        OBSIDIANPICKAXE("obsidianPickaxe", "ItemObsidianPickaxe"),
        COPPERINGOT("copperIngot", "ItemCopperIngot"),
        COPPERPICKAXE("copperPickaxe", "ItemCopperPickaxe"),
        COPPERAXE("copperAxe", "ItemCopperAxe"),
        COPPERSPADE("copperSpade", "ItemCopperSpade"),
        COPPERSWORD("copperSword", "ItemCopperSword"),
        COPPERHOE("copperHoe", "ItemCopperHoe");

        private String unlocalizedName;
        private String registryName;

        VanillaPlusBroItems(String unlocalizedName, String registryName) {
            this.unlocalizedName = unlocalizedName;
            this.registryName = registryName;
        }

        public String getUnlocalizedName(){
            return unlocalizedName;
        }

        public String getRegistryName(){
            return registryName;
        }
    }

    public static enum VanillaPlusBroBlocks {
        COPPERORE("copperOre", "BlockCopperOre"),
        COPPERBLOCK("copperBlock", "BlockCopperBlock"),
        MERGER("merger", "BlockMerger");

        private String unlocalizedName;
        private String registryName;

        VanillaPlusBroBlocks(String unlocalizedName, String registryName) {
            this.unlocalizedName = unlocalizedName;
            this.registryName = registryName;
        }

        public String getUnlocalizedName(){
            return unlocalizedName;
        }

        public String getRegistryName(){
            return registryName;
        }
    }

    public static enum VanillaPlusBroToolMaterials {
        COPPER("COPPER", 2, 300, 5.5F, 2.5F, 20),
        OBSIDIAN("OBSIDIAN", 4, 1000, 12F, 2F, 30);

        //public static Item.ToolMaterial TUTORIAL = EnumHelper.addToolMaterial("TUTORIAL", harvestLevel, durability, miningSpeed, damageVsEntities, enchantability);
        public int harvestLevel;
        public int durability;
        public float miningSpeed;
        public float damageVsEntities;
        public int enchantability;
        private String name;

        VanillaPlusBroToolMaterials(String name, int harvestLevel, int durability, float miningSpeed, float damageVsEntities, int enchantability) {
            this.harvestLevel = harvestLevel;
            this.durability = durability;
            this.miningSpeed = miningSpeed;
            this.damageVsEntities = damageVsEntities;
            this.enchantability = enchantability;
            this.name = name;
        }

        public Item.ToolMaterial getToolMaterial() {
            return EnumHelper.addToolMaterial(name, this.harvestLevel, this.durability, this.miningSpeed, this.damageVsEntities, this.enchantability);
        }
    }
}
