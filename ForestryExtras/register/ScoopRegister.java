package mods.ForestryExtras.register;

import mods.ForestryExtras.gadgets.DraconicScoop;
import mods.ForestryExtras.gadgets.LegendaryScoop;
import mods.ForestryExtras.gadgets.ReinforcedScoop;
import mods.ForestryExtras.gadgets.UberScoop;
import mods.ForestryExtras.main.Config;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.oredict.OreDictionary;
import forestry.api.recipes.RecipeManagers;

public class ScoopRegister {

	public static void register()
	{
		System.out.print("Added Scoops, ");
		
        reinforcedScoop = new ReinforcedScoop(Config.reinforcedScoopId);
        MinecraftForge.setToolClass(reinforcedScoop, "scoop", 5);
        
        draconicScoop = new DraconicScoop(Config.draconicScoopId);
        MinecraftForge.setToolClass(draconicScoop, "scoop", 5);
        
        legendaryScoop = new LegendaryScoop(Config.legendaryScoopId);
        MinecraftForge.setToolClass(legendaryScoop, "scoop", 7);
        
        uberScoop = new UberScoop(Config.uberScoopId);
        MinecraftForge.setToolClass(uberScoop, "scoop", 7);
	}
	
	public static void recipe()
	{
		 RecipeManagers.carpenterManager.addRecipe(100, null, new ItemStack(reinforcedScoop), new Object[]{ 
     		"IXI",
     		"III",
     		" I ",
     		'X', ItemRegister.ingotReinforced,
     		'I', ItemRegister.reinforcedStick});
         
         RecipeManagers.carpenterManager.addRecipe(500, null, new ItemStack(draconicScoop), new Object[]{ 
     		"IXI",
     		"III",
     		" I ",
     		'X', ItemRegister.ingotDraconic,
     		'I', ItemRegister.draconicStick});
         
         RecipeManagers.carpenterManager.addRecipe(500, null, new ItemStack(draconicScoop), new Object[]{ 
     		"IXI",
     		"III",
     		" I ",
     		'X', Item.netherStar,
     		'I', ItemRegister.draconicStick});
	}
	
	public static void oreDictionary()
	{
        OreDictionary.registerOre("scoopReinforced", new ItemStack(reinforcedScoop));
        OreDictionary.registerOre("scoopDraconic", new ItemStack(draconicScoop));
        OreDictionary.registerOre("scoopLegendary", new ItemStack(legendaryScoop));
        OreDictionary.registerOre("scoopUber", new ItemStack(uberScoop));
	}
	
    public static Item reinforcedScoop;
    public static Item draconicScoop;
    public static Item legendaryScoop;
    public static Item uberScoop;
}
