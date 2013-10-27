package mods.ForestryExtras.helpers;

import mods.ForestryExtras.register.BlockRegister;
import mods.ForestryExtras.register.EasterEggRegister;
import mods.ForestryExtras.register.FrameRegister;
import mods.ForestryExtras.register.GrafterRegister;
import mods.ForestryExtras.register.ItemRegister;
import mods.ForestryExtras.register.ScoopRegister;
import mods.ForestryExtras.register.TabRegister;
import mods.ForestryExtras.register.WorldGenRegister;

public class LoadHelper {

	public static void load()
	{
    	ItemRegister.register();
    	ItemRegister.oreDictionary();
    	ItemRegister.recipes();
    	FrameRegister.register();
    	FrameRegister.recipes();
    	FrameRegister.oreDictionary();
    	GrafterRegister.register();
    	GrafterRegister.recipes();
    	GrafterRegister.oreDictionary();
    	ScoopRegister.register();
    	ScoopRegister.recipe();
    	ScoopRegister.oreDictionary();
    	EasterEggRegister.register();
    	EasterEggRegister.spawnItem();
    	EasterEggRegister.oreDictionary();
    	BlockRegister.load();
    	BlockRegister.recipe();
    	BlockRegister.oreDictionary();
    	WorldGenRegister.register();
    	WorldGenRegister.oreDictionary();
        ArsMagica2Helper.preload();
		Thaumcraft4Helper.preload();
    	TabRegister.load();
	}
}
