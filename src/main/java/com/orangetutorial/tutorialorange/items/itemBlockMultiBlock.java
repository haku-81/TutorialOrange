package com.orangetutorial.tutorialorange.items;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class itemBlockMultiBlock extends ItemBlock {

    public itemBlockMultiBlock(Block block){

        super(block);
        setHasSubtypes(true);

    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack) {

        String name;
        switch(itemStack.getItemDamage()) {
            case 0:
                name = "firstMeta";
                break;
            case 1:
                name = "secondMeta";
                break;
            case 2:
                name = "thirdMeta";
                break;
            default:
                name = "YOLO";
        }
        return getUnlocalizedName() + "." + name;

    }

    @Override
    public int getMetadata(int meta) {
        return meta;

    }
}
