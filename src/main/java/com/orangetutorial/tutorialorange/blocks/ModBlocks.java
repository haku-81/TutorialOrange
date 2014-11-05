package com.orangetutorial.tutorialorange.blocks;

import net.minecraft.block.Block;

public final class ModBlocks {


    public static Block orangeBlock;
    public static Block multiBlock;
    public static Block smasher;
    public static void init(){

        orangeBlock = new OrangeBlock();
        multiBlock = new MultiBlock();
        smasher = new Smasher();


    }

}
