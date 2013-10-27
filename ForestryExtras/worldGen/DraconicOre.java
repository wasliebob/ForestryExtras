package mods.ForestryExtras.worldGen;

import java.util.Random;

import mods.ForestryExtras.helpers.MainHelper;
import mods.ForestryExtras.main.Config;
import mods.ForestryExtras.main.Main;
import mods.ForestryExtras.register.ItemRegister;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class DraconicOre extends Block {

        public DraconicOre(int id) {
                super(id, Material.iron);
                setCreativeTab(Main.tabBlocks);
                
                name = "Draconic";
                type = "Ore";
                texture = MainHelper.modName.toLowerCase() + ":" + name.toLowerCase() + type.toLowerCase(); 
                hardness = 1.0F;
                
                setHardness(hardness);
                setUnlocalizedName(name + type);
                GameRegistry.registerBlock(this, name + type);
                LanguageRegistry.addName(this, name + " " + type);
        }
        String name;
        String type;
        String texture;
        float hardness;
        
        public void registerIcons(IconRegister par1IconRegister) {
            this.blockIcon = par1IconRegister.registerIcon(texture);
        }
        
        public void updateIcons(IconRegister par1IconRegister) {
                this.blockIcon = par1IconRegister.registerIcon(texture);   
        }
        
        public int idDropped(int par1, Random random, int par3)
        {
            return ItemRegister.ingotDraconic.itemID;
        }
}