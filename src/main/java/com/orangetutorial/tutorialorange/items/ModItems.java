package com.orangetutorial.tutorialorange.items;

import net.minecraft.item.Item;

public final class ModItems {

    public static Item orangeItem;
    public static Item orangeFood;

    public static void init(){

        orangeItem = new ItemOrange();
        orangeFood = new ItemOrangeFood(10, .8f, true);


    }
}
