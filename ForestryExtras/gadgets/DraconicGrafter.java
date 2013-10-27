package mods.ForestryExtras.gadgets;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import mods.ForestryExtras.helpers.MainHelper;
import mods.ForestryExtras.main.Main;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeHooks;
import forestry.api.arboriculture.IToolGrafter;
import forestry.api.core.Tabs;

public class DraconicGrafter extends Item implements IToolGrafter{

	 public DraconicGrafter(int id)
	    {
	        super(id);
	        maxStackSize = 1;
	        setMaxDamage(600);
	        setCreativeTab(Main.tabTools);
	        
	        name = "Draconic";
	        type = "Grafter";
	        texture = MainHelper.modName.toLowerCase() + ":" + name.toLowerCase() + type.toLowerCase(); 
	       
	        glow = true;
	        saplingModifier = 100F;
	        
	        setUnlocalizedName(name + type);
	        GameRegistry.registerItem(this, name + type);
	        LanguageRegistry.addName(this, name + " " + type);
	    }
	 	String name;
	 	String type;
	 	String texture;
	 	
	 	boolean glow;
	 	float saplingModifier;
	 	
	    public float getStrVsBlock(ItemStack itemstack, Block block)
	    {
	        return 1.0F;
	    }


	    public boolean onBlockDestroyed(ItemStack itemstack, World world, int i, int j, int k, int l, EntityLivingBase entityliving)
	    {
	        itemstack.damageItem(1, entityliving);
	        return true;
	    }

	    public float getDamageVsEntity(Entity entity, ItemStack itemstack)
	    {
	        return 1.0F;
	    }

	    public boolean isFull3D()
	    {
	        return true;
	    }

		public void updateIcons(IconRegister iconRegister)
		{
		this.itemIcon = iconRegister.registerIcon(texture);
		}

		public void registerIcons(IconRegister par1IconRegister)
		{
		this.itemIcon = par1IconRegister.registerIcon(texture);
		}
		


		@Override
		public float getSaplingModifier(ItemStack stack, World world,
				EntityPlayer player, int x, int y, int z) {
			return saplingModifier;
		}
		
        public boolean hasEffect(ItemStack itemstack)
        {
            return glow;
        }
	}