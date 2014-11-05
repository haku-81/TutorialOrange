package com.orangetutorial.tutorialorange.proxy;

import com.orangetutorial.tutorialorange.blocks.Smasher;
import com.orangetutorial.tutorialorange.tileentities.TileEntitySmasher;
import cpw.mods.fml.common.registry.GameRegistry;

public class CommonProxy {
    public void registerTileEntities(){
        GameRegistry.registerTileEntity(TileEntitySmasher.class, TileEntitySmasher.name);
    }
}
