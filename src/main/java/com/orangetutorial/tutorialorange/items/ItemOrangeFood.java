package com.orangetutorial.tutorialorange.items;

import com.orangetutorial.tutorialorange.lib.Constants;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.potion.Potion;

public class ItemOrangeFood extends ItemFood {

    public String name = "orangefood";
    public ItemOrangeFood(int heal, float saturation, boolean wolfMeat){
        super(heal, saturation, wolfMeat);
        setUnlocalizedName(Constants.MODID + "_" + name);
        setCreativeTab(CreativeTabs.tabFood);
        GameRegistry.registerItem(this, name);
        setTextureName(Constants.MODID + ":" + name);
        setPotionEffect(Potion.regeneration.id, 90, 5, 1.0f);

    }

}
