package mods.ForestryExtras.easterEggs;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import mods.ForestryExtras.helpers.MainHelper;
import mods.ForestryExtras.main.Main;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import forestry.api.apiculture.IBee;
import forestry.api.apiculture.IBeeGenome;
import forestry.api.apiculture.IBeeHousing;
import forestry.api.apiculture.IBeeModifier;
import forestry.api.apiculture.IHiveFrame;
import forestry.api.core.Tabs;

public final class EasterEggDraconicFrame extends Item implements IHiveFrame {

    public EasterEggDraconicFrame(int id)
    {
        super(id);
        setMaxStackSize(1);
        setMaxDamage(3000);
        
        helish = false;
        simulated = false;
        selflighted = false;
        sealed = false;
        decay = 1.0F;
        flowering = 1.0F;
        productionmodifier = 4.0F;
        lifespanmodifier = 4.0F;
        mutationmodifier = 5.0F;
        territorymodifier = 1.0F;      
        glow = true;
        
        
        name = "Draconic";
        type = "Frame";
        texture = MainHelper.modName.toLowerCase() + ":" + name.toLowerCase() + type.toLowerCase() + "easter"; 
        
        setUnlocalizedName(name + type + "easter");
    }

    boolean helish;
    boolean simulated;
    boolean selflighted;
    boolean sealed;
    float decay;
    float flowering;
    float productionmodifier;
    float lifespanmodifier;
    float mutationmodifier;
    float territorymodifier;
    boolean glow;
    
    String name;
    String type;
    String texture;
    
	@Override
	public float getTerritoryModifier(IBeeGenome genome, float currentModifier) {
		return territorymodifier;
	}

	@Override
	public float getMutationModifier(IBeeGenome genome, IBeeGenome mate,
			float currentModifier) {
		return mutationmodifier;
	}

	@Override
	public float getLifespanModifier(IBeeGenome genome, IBeeGenome mate,
			float currentModifier) {
		return lifespanmodifier;
	}

	@Override
	public float getProductionModifier(IBeeGenome genome, float currentModifier) {
		return productionmodifier;
	}

	@Override
	public float getFloweringModifier(IBeeGenome genome, float currentModifier) {
		return flowering;
	}

	@Override
	public float getGeneticDecay(IBeeGenome genome, float currentModifier) {
		return decay;
	}

	@Override
	public boolean isSealed() {
		return sealed;
	}

	@Override
	public boolean isSelfLighted() {
		return selflighted;
	}

	@Override
	public boolean isSunlightSimulated() {
		return simulated;
	}

	@Override
	public boolean isHellish() {
		return helish;
	}

	@Override
	public ItemStack frameUsed(IBeeHousing housing, ItemStack frame,
			IBee queen, int wear) {
		 frame.setItemDamage(frame.getItemDamage() + wear);
	        if(frame.getItemDamage() >= frame.getMaxDamage())
	            return null;
	        else
	            return frame;
	}
	
	public void updateIcons(IconRegister iconRegister)
	{
	this.itemIcon = iconRegister.registerIcon(texture);
	}

	public void registerIcons(IconRegister par1IconRegister)
	{
	this.itemIcon = par1IconRegister.registerIcon(texture);
	}
	
    public boolean hasEffect(ItemStack itemstack)
    {
        return glow;
    }
}