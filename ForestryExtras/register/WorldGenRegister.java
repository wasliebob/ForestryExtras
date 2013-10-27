package mods.ForestryExtras.register;

import cpw.mods.fml.common.registry.GameRegistry;
import mods.ForestryExtras.gadgets.DraconicScoop;
import mods.ForestryExtras.gadgets.LegendaryScoop;
import mods.ForestryExtras.gadgets.ReinforcedScoop;
import mods.ForestryExtras.gadgets.UberScoop;
import mods.ForestryExtras.main.Config;
import mods.ForestryExtras.worldGen.DraconicOre;
import mods.ForestryExtras.worldGen.WorldGenOres;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.oredict.OreDictionary;
import forestry.api.recipes.RecipeManagers;

public class WorldGenRegister {

	public static void register()
	{
		System.out.print("Added World Gen, ");
		
		if(Config.genDraconicOre == true){
		draconicOre = new DraconicOre(Config.draconicOreId);
		GameRegistry.registerWorldGenerator(new WorldGenOres());}
		}
	
	
	public static void oreDictionary()
	{
		if(Config.genDraconicOre == true){
        OreDictionary.registerOre("oreDraconic", new ItemStack(draconicOre));}
	}

	public static Block draconicOre;
}
