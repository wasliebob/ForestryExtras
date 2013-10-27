package mods.ForestryExtras.client;

import mods.ForestryExtras.main.CommonProxy;
import net.minecraft.client.particle.EntitySmokeFX;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy {

		public void Render()
        {
        }
		
	@Override
    public World getClientWorld()
    {
        return FMLClientHandler.instance().getClient().theWorld;
    }
}