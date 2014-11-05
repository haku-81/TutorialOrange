package com.orangetutorial.tutorialorange.blocks;


import com.orangetutorial.tutorialorange.items.itemBlockMultiBlock;
import com.orangetutorial.tutorialorange.lib.Constants;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import java.util.List;

public class MultiBlock extends Block {
    private final String name = "multiBlock";
    private final int maxMeta = 3;
    private IIcon[] icons;
    public MultiBlock(){

        super(Material.rock);
        setBlockName(Constants.MODID + "_" + name);
        setCreativeTab(CreativeTabs.tabDecorations);
        icons = new IIcon[maxMeta];
        GameRegistry.registerBlock(this, itemBlockMultiBlock.class, name);

    }

    @Override
    public void registerBlockIcons(IIconRegister iconRegister) {

        for(int i = 0; i < icons.length; i++){
           icons[i] = iconRegister.registerIcon(Constants.MODID + ":" + name + i);
        }

    }

    @Override
    public IIcon getIcon(int side, int meta) {

        switch(meta){
            case 0: return icons[0];
            case 1: switch(side){
                case 0: return icons[1];
                case 1: return icons[2];
                default:return icons[0];
            }
            default: return icons[1];
        }

    }

    @Override
    public int damageDropped(int meta) {
        return meta;

    }

    @Override
    public void getSubBlocks(Item item, CreativeTabs creativeTabs, List list) {

        for(int i = 0; i < maxMeta; i++){
            list.add(new ItemStack(item, 1, i));
        }

    }
}