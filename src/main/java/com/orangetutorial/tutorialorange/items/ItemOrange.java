package com.orangetutorial.tutorialorange.items;

import com.orangetutorial.tutorialorange.lib.Constants;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.potion.Potion;

public class ItemOrange extends Item {

    public String name = "itemorange";
    public ItemOrange(){

        setUnlocalizedName(Constants.MODID + "_" + name);
        setCreativeTab(CreativeTabs.tabMaterials);
        GameRegistry.registerItem(this, name);
        setTextureName(Constants.MODID + ":" + name);

    }
}
