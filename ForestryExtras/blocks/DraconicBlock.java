package mods.ForestryExtras.blocks;

import mods.ForestryExtras.api.ILight;
import mods.ForestryExtras.helpers.MainHelper;
import mods.ForestryExtras.main.Config;
import mods.ForestryExtras.main.Main;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class DraconicBlock extends Block implements ILight{

        public DraconicBlock(int id) {
                super(id, Material.iron);
                setCreativeTab(Main.tabBlocks);
                
                name = "Draconic";
                type = "Block";
                texture = MainHelper.modName.toLowerCase() + ":" + name.toLowerCase() + type.toLowerCase(); 
                hardness = 1.0F;
                lightValue = 1.0F;
                emitsLight = true;
                
                setHardness(hardness);
                setUnlocalizedName(name + type);
                GameRegistry.registerBlock(this, name + type);
                LanguageRegistry.addName(this, name + " " + type);
                
                if(emitsLight == true)
                    setLightValue(lightValue);
                else if(emitsLight == false)
                    setLightValue(0);
        }
        String name;
        String type;
        String texture;
        float hardness;
        boolean emitsLight;
        float lightValue;
        
        public void registerIcons(IconRegister par1IconRegister) {
            this.blockIcon = par1IconRegister.registerIcon(texture);
        }
        
        public void updateIcons(IconRegister par1IconRegister) {
                this.blockIcon = par1IconRegister.registerIcon(texture);   
        }

		@Override
		public boolean EmitsLight() {
			return emitsLight;
		}
}