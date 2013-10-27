package mods.ForestryExtras.easterEggs;

import mods.ForestryExtras.helpers.MainHelper;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;


public class EasterEggBook extends Item {

        public EasterEggBook(int id) {
                super(id);
                setMaxStackSize(1);
                
                glow = true;
                name = "Book";
                texture = MainHelper.modName.toLowerCase() + ":" + name.toLowerCase() + "easter"; 
                
                setUnlocalizedName(name + "easter");
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