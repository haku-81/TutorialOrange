package com.orangetutorial.tutorialorange.blocks;


import com.orangetutorial.tutorialorange.lib.Constants;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.IIcon;

public class OrangeBlock extends Block {

    public String name = "orangeBlock";

    private IIcon[] icons = new IIcon[6];

    public OrangeBlock(){
        super(Material.rock);
        setBlockName(Constants.MODID + "_" + name);
        setCreativeTab(CreativeTabs.tabBlock);
        GameRegistry.registerBlock(this, name);
        setBlockTextureName(Constants.MODID + ":" + name);

    }

    @Override
    public void registerBlockIcons(IIconRegister iconRegister) {

        for (int i = 0; i < icons.length; i++){

            icons[i] = iconRegister.registerIcon(Constants.MODID + ":" + name + i);
        }

    }

    @Override
    public IIcon getIcon(int side, int meta) {
        return icons[side];

    }
}