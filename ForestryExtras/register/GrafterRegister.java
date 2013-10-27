package mods.ForestryExtras.register;

import forestry.api.recipes.RecipeManagers;
import mods.ForestryExtras.gadgets.DraconicGrafter;
import mods.ForestryExtras.gadgets.LegandaryGrafter;
import mods.ForestryExtras.gadgets.ReinforcedGrafter;
import mods.ForestryExtras.gadgets.UberGrafter;
import mods.ForestryExtras.main.Config;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class GrafterRegister {

	public static void register()
	{
		System.out.print("Added Grafters, ");

        reinforcedGrafter = new ReinforcedGrafter(Config.reinforcedGrafterId);
        draconicGrafter = new DraconicGrafter(Config.draconicGrafterId);
        legendaryGrafter = new LegandaryGrafter(Config.legendaryGrafterId);
        uberGrafter = new UberGrafter(Config.uberGrafterId);
	}
	
	
	public static void recipes()
	{
		RecipeManagers.carpenterManager.addRecipe(100, null, new ItemStack(reinforcedGrafter), new Object[]{
            "  X",
            " I ",
            "I  ",
            'X', ItemRegister.ingotReinforced,
            'I', ItemRegister.reinforcedStick});
            
            RecipeManagers.carpenterManager.addRecipe(100, null, new ItemStack(draconicGrafter), new Object[]{
            "  X",
            " I ",
            "I  ",
            'X', ItemRegister.ingotDraconic,
            'I', ItemRegister.draconicStick});
           
            RecipeManagers.carpenterManager.addRecipe(100, null, new ItemStack(draconicGrafter), new Object[]{
            "  X",
            " I ",
            "I  ",
            'X', EasterEggRegister.ryu,
            'I', ItemRegister.draconicStick});
            
            RecipeManagers.carpenterManager.addRecipe(100, null, new ItemStack(legendaryGrafter), new Object[]{
            "  X",
            " I ",
            "I  ",
            'X', Block.dragonEgg,
            'I', ItemRegister.draconicStick});	
	}
	
	public static void oreDictionary()
	{
        OreDictionary.registerOre("grafterReinforced", new ItemStack(reinforcedGrafter));
        OreDictionary.registerOre("grafterDraconic", new ItemStack(draconicGrafter));
        OreDictionary.registerOre("grafterLegendary", new ItemStack(legendaryGrafter));
        OreDictionary.registerOre("grafterUber", new ItemStack(uberGrafter));
	}
	
    public static Item reinforcedGrafter;
    public static Item draconicGrafter;
    public static Item legendaryGrafter;
    public static Item uberGrafter;
    
    
}
