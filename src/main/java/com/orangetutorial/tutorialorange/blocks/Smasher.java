package com.orangetutorial.tutorialorange.blocks;

import com.orangetutorial.tutorialorange.TutorialOrange;
import com.orangetutorial.tutorialorange.tileentities.GUIs;
import com.orangetutorial.tutorialorange.tileentities.TileEntitySmasher;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class Smasher extends Block implements ITileEntityProvider {

    public static String name = "smasher";
    private String privateName = "smasher";

    public Smasher() {
        super(Material.rock);
        setBlockName(privateName);
        setCreativeTab(CreativeTabs.tabBlock);
        GameRegistry.registerBlock(this, privateName);
    }
    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int meta, float hitX, float hitY, float hitZ) {
        if (world.isRemote) {
            if (world.getTileEntity(x, y, z) != null)
                player.openGui(TutorialOrange.instance, GUIs.SMASHER.ordinal(), world, x, y, z);
            return true;
        }
        return true;
    }




    @Override
    public TileEntity createNewTileEntity(World world, int meta) {
        return new TileEntitySmasher();
    }

    @Override
    public boolean hasTileEntity(int metadata) {
        return true;
    }
}
