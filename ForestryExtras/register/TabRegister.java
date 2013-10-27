package mods.ForestryExtras.register;

import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class TabRegister {

	public static void load()
	{
        LanguageRegistry.instance().addStringLocalization("itemGroup.tabFrames", "en_US", "Forestry Extras Frames");
        LanguageRegistry.instance().addStringLocalization("itemGroup.tabMaterials", "en_US", "Forestry Extras Materials");
        LanguageRegistry.instance().addStringLocalization("itemGroup.tabTools", "en_US", "Forestry Extras Tools");
        LanguageRegistry.instance().addStringLocalization("itemGroup.tabBlocks", "en_US", "Forestry Extras Blocks");
	}
}
