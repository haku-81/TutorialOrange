package com.orangetutorial.tutorialorange;

import com.orangetutorial.tutorialorange.blocks.ModBlocks;
import com.orangetutorial.tutorialorange.items.ModItems;
import com.orangetutorial.tutorialorange.lib.Constants;
import com.orangetutorial.tutorialorange.proxy.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;

@Mod(modid = Constants.MODID, name = Constants.MODNAME, version = Constants.VERSION )
public class TutorialOrange {


    @Mod.Instance(Constants.MODID)
    public static TutorialOrange instance;


    @SidedProxy(clientSide = Constants.CLIENT_PROXY, serverSide = Constants.COMMON_PROXY)
    public static CommonProxy proxy;





    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){

        ModItems.init();

        ModBlocks.init();


    }
    @Mod.EventHandler
    public void init(FMLInitializationEvent event){

        proxy.registerTileEntities();
        NetworkRegistry.INSTANCE.registerGuiHandler(instance, new GuiHandler());


    }
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){


    }


}