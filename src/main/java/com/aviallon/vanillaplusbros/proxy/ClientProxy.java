package com.aviallon.vanillaplusbros.proxy;

import com.aviallon.vanillaplusbros.init.ModBlocks;
import com.aviallon.vanillaplusbros.init.ModItems;

public class ClientProxy implements CommonProxy {

    @Override
    public void init(){
        ModItems.registerRenders();
        ModBlocks.registerRenders();
    }
}
