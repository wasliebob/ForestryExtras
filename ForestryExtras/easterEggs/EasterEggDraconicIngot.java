package mods.ForestryExtras.easterEggs;

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

public class EasterEggDraconicIngot extends Item {

        public EasterEggDraconicIngot(int id) {
                super(id);
                
                setMaxStackSize(64);
                
                glow = true;
                name = "Draconic";
                type = "Ingot";
                texture = MainHelper.modName.toLowerCase() + ":" + name.toLowerCase() + type.toLowerCase() + "easter"; 
               
                setUnlocalizedName(name + type + "easter");
               
        }
        String name;
        String type;
        String texture;
        boolean glow;
        public void registerIcons(IconRegister par1IconRegister) {
            this.itemIcon = par1IconRegister.registerIcon(texture);
        }
        
        public void updateIcons(IconRegister par1IconRegister) {
            this.itemIcon = par1IconRegister.registerIcon(texture);
        }
        
        public boolean hasEffect(ItemStack itemstack)
        {
            return glow;
        }
}