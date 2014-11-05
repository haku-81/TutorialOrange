package com.orangetutorial.tutorialorange.tileentities;

import com.orangetutorial.tutorialorange.GuiSmasher;
import com.orangetutorial.tutorialorange.TutorialOrange;
import com.orangetutorial.tutorialorange.blocks.Smasher;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class TileEntitySmasher extends TileEntity {

    public static String name = "tileEntitySmasher";

    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int meta, float hitX, float hitY, float hitZ) {
        if (world.isRemote) {
            if (world.getTileEntity(x, y, z) != null)
                player.openGui(TutorialOrange.instance, GUIs.SMASHER.ordinal(), world, x, y, z);
            return true;
        }
        return true;
    }


}