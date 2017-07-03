package com.aviallon.vanillaplusbros.tileentities;

/**
 * Created by Antoine Viallon on 03/07/2017.
 */
public enum UpgradeLevel {
    IRON("iron"),
    GOLD("gold");

    private String name;

    UpgradeLevel(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
