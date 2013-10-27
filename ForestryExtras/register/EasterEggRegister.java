package mods.ForestryExtras.register;

import mods.ForestryExtras.easterEggs.EasterEggBook;
import mods.ForestryExtras.easterEggs.EasterEggDraconicFrame;
import mods.ForestryExtras.easterEggs.EasterEggDraconicIngot;
import mods.ForestryExtras.main.Config;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;
import net.minecraftforge.oredict.OreDictionary;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import forestry.api.recipes.RecipeManagers;

public class EasterEggRegister {

	public static void register()
	{
	System.out.print("Added Easter Eggs, ");

	tome = new EasterEggBook(Config.easterEgg1Id);
	GameRegistry.registerItem(tome, "TomeOfMysteriousAges");
	LanguageRegistry.addName(tome, "Tome of MysteriousAges");
	
	ryu = new EasterEggDraconicIngot(Config.easterEgg2Id);
	GameRegistry.registerItem(ryu, "RyuIngot");
	LanguageRegistry.addName(ryu, "RyuDragonRyder's Ingot");
	
	wasliebob = new EasterEggDraconicFrame(Config.easterEgg3Id);
	GameRegistry.registerItem(wasliebob, "WasliebobFrame");
	LanguageRegistry.addName(wasliebob, "Wasliebob's Frame");
	}
	
	public static void spawnItem()
	{
	ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(new WeightedRandomChestContent(new ItemStack(tome),0,1, 30));	
	ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(wasliebob),0,1, 30));	
	ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(ryu),0,1, 20));	
	}
	
	public static void oreDictionary()
	{
        OreDictionary.registerOre("tomeMysteriousAges", new ItemStack(tome));
        OreDictionary.registerOre("ingotRyuDragonRyder", new ItemStack(ryu));
        OreDictionary.registerOre("frameWasliebob", new ItemStack(wasliebob));
	}
	
    public static Item tome;
    public static Item ryu;
    public static Item wasliebob;
    
}
