package mods.ForestryExtras.items;

import java.util.Random;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

import forestry.api.core.Tabs;

import mods.ForestryExtras.helpers.MainHelper;
import mods.ForestryExtras.main.Main;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.event.Event;

public class EmeraldStick extends Item {

        public EmeraldStick(int id) {
                super(id);
                
                setMaxStackSize(64);
                setCreativeTab(Main.tabMaterials);
                
                name = "Emerald";
                type = "Stick";
                texture = MainHelper.modName.toLowerCase() + ":" + name.toLowerCase() + type.toLowerCase(); 
                
                setUnlocalizedName(name + type);
                GameRegistry.registerItem(this, name + type);
                LanguageRegistry.addName(this, name + " " + type);
        }
        String name;
        String type;
        String texture;
        
        public void registerIcons(IconRegister par1IconRegister) {
            this.itemIcon = par1IconRegister.registerIcon(texture);
        }
        
        public void updateIcons(IconRegister par1IconRegister) {
            this.itemIcon = par1IconRegister.registerIcon(texture);
        }
}