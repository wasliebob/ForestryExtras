package mods.ForestryExtras.helpers;

import mods.ForestryExtras.main.Config;
import mods.ForestryExtras.register.ItemRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import cpw.mods.fml.common.Loader;
import forestry.api.recipes.RecipeManagers;

public class Thaumcraft4Helper {
	
	public static boolean isThaumcraft4Loaded()
	{
		return isThaumcraft4Loaded;
	}
	
	public static void preload()
	{
		if(Loader.isModLoaded("Thaumcraft"))
		{
			isThaumcraft4Loaded = true;
			load();
		}
		else
		{
			load();
		}
	}
	
	public static void load()
	{
		if(isThaumcraft4Loaded == true)
		{
			addAspects();
			addForestryExtrasRecipes();
			System.out.print(modLoaded + " " + "is loaded, ");
		}
		else
		{
			addForestryExtrasRecipes();
			System.out.print(modLoaded + " " + "is not loaded, ");
		}
	}
	
	public static void addAspects()
	{
		ThaumcraftApi.registerObjectTag(Config.draconicIngotId, -1, (new AspectList()).add(Aspect.ELDRITCH, 2).add(Aspect.FIRE, 3).add(Aspect.MAGIC, 5));
		ThaumcraftApi.registerObjectTag(Config.reinforcedIngotId, -1, (new AspectList()).add(Aspect.CRYSTAL, 3).add(Aspect.METAL, 3));
		ThaumcraftApi.registerObjectTag(Config.draconicStickId, -1, (new AspectList()).add(Aspect.ELDRITCH, 2*2).add(Aspect.FIRE, 3*2).add(Aspect.MAGIC, 5*2));
		ThaumcraftApi.registerObjectTag(Config.reinforcedStickId, -1, (new AspectList()).add(Aspect.CRYSTAL, 3*2).add(Aspect.METAL, 3*2));

		ThaumcraftApi.registerObjectTag(Config.draconicBlockId, -1, (new AspectList()).add(Aspect.ELDRITCH, 2*9).add(Aspect.FIRE, 3*9).add(Aspect.MAGIC, 5*9));
		ThaumcraftApi.registerObjectTag(Config.reinforcedBlockId, -1, (new AspectList()).add(Aspect.CRYSTAL, 3*9).add(Aspect.METAL, 3*9));

		ThaumcraftApi.registerObjectTag(Config.ironStickId, -1, (new AspectList()).add(Aspect.METAL, 2));
		ThaumcraftApi.registerObjectTag(Config.goldStickId, -1, (new AspectList()).add(Aspect.GREED, 2));
		ThaumcraftApi.registerObjectTag(Config.diamondStickId, -1, (new AspectList()).add(Aspect.CRYSTAL, 2));
		ThaumcraftApi.registerObjectTag(Config.emeraldStickId, -1, (new AspectList()).add(Aspect.CRYSTAL, 2).add(Aspect.EXCHANGE, 2));
		
		if(OreDictionary.getOres("ingotCopper").size() > 0)
			ThaumcraftApi.registerObjectTag(Config.copperStickId, -1, (new AspectList()).add(Aspect.METAL, 4));
		if(OreDictionary.getOres("ingotTin").size() > 0)
			ThaumcraftApi.registerObjectTag(Config.tinStickId, -1, (new AspectList()).add(Aspect.METAL, 4));
		if(OreDictionary.getOres("ingotBronze").size() > 0)
			ThaumcraftApi.registerObjectTag(Config.bronzeStickId, -1, (new AspectList()).add(Aspect.METAL, 8));
		if(OreDictionary.getOres("ingotLead").size() > 0)
			ThaumcraftApi.registerObjectTag(Config.leadStickId, -1, (new AspectList()).add(Aspect.METAL, 4));
		if(OreDictionary.getOres("ingotSilver").size() > 0)
			ThaumcraftApi.registerObjectTag(Config.silverStickId, -1, (new AspectList()).add(Aspect.METAL, 4));
		if(OreDictionary.getOres("ingotSteel").size() > 0)
			ThaumcraftApi.registerObjectTag(Config.steelStickId, -1, (new AspectList()).add(Aspect.METAL, 3));
		
		
		if(OreDictionary.getOres("ingotAluminium").size() > 0)
			ThaumcraftApi.registerObjectTag(Config.aluminiumStickId, -1, (new AspectList()).add(Aspect.METAL, 4));
		if(OreDictionary.getOres("ingotAlumite").size() > 0)
			ThaumcraftApi.registerObjectTag(Config.alumiteStickId, -1, (new AspectList()).add(Aspect.METAL, 6));
		if(OreDictionary.getOres("ingotArdite").size() > 0)
			ThaumcraftApi.registerObjectTag(Config.arditeStickId, -1, (new AspectList()).add(Aspect.METAL, 4).add(Aspect.FIRE, 2));
		if(OreDictionary.getOres("ingotCobalt").size() > 0)
			ThaumcraftApi.registerObjectTag(Config.cobaltStickId, -1, (new AspectList()).add(Aspect.METAL, 4).add(Aspect.FIRE, 2));
		if(OreDictionary.getOres("ingotManyullyn").size() > 0)
			ThaumcraftApi.registerObjectTag(Config.manyullynStickId, -1, (new AspectList()).add(Aspect.METAL, 8).add(Aspect.FIRE, 4));
	}
	
	public static void addForestryExtrasRecipes()
	{
        RecipeManagers.carpenterManager.addRecipe(50, null, new ItemStack(ItemRegister.ingotDraconic), new Object[]{
        "XXX",
        "XEX",
        "XXX",
        'X', ItemRegister.ingotReinforced,
        'E', Item.enderPearl});
	}
	
	private static String modLoaded = "Thaumcraft 4";
	private static boolean isThaumcraft4Loaded = false;
}
