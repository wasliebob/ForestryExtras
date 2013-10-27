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
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeHooks;
import forestry.api.core.IToolScoop;
import forestry.api.core.Tabs;

public class ReinforcedScoop extends Item implements IToolScoop{

	 public ReinforcedScoop(int id)
	    {
	        super(id);
	        maxStackSize = 1;
	        efficiencyOnProperMaterial = 4F;
	        setMaxDamage(300);
	        setCreativeTab(Main.tabTools);
	        
	        name = "Reinforced";
	        type = "Scoop";
	        texture = MainHelper.modName.toLowerCase() + ":" + name.toLowerCase() + type.toLowerCase(); 
	       
	        setUnlocalizedName(name + type);
	        GameRegistry.registerItem(this, name + type);
	        LanguageRegistry.addName(this, name + " " + type);
	    }
	 	String name;
	 	String type;
	 	String texture;
	 	
	 	
	    public float getStrVsBlock(ItemStack itemstack, Block block)
	    {
	        return 1.0F;
	    }

	    public float getStrVsBlock(ItemStack itemstack, Block block, int md)
	    {
	        if(ForgeHooks.isToolEffective(itemstack, block, md))
	            return efficiencyOnProperMaterial;
	        else
	            return getStrVsBlock(itemstack, block);
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
		
	    private float efficiencyOnProperMaterial;
	}