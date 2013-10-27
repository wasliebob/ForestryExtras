package mods.ForestryExtras.helpers;

import mods.ForestryExtras.items.AluminiumStick;
import mods.ForestryExtras.items.AlumiteStick;
import mods.ForestryExtras.items.ArditeStick;
import mods.ForestryExtras.items.CobaltStick;
import mods.ForestryExtras.items.ManyullynStick;
import mods.ForestryExtras.main.Config;
import net.minecraftforge.oredict.OreDictionary;
import cpw.mods.fml.common.Loader;

public class ArsMagica2Helper {

	public static boolean isArsMagica2Enabled()
	{
		return isArsMagica2Loaded;
	}
	
	public static void preload()
	{
		if(Loader.isModLoaded("arsmagica2"))
		{
			isArsMagica2Loaded = true;
			load();
		}
		else
		{
			load();
		}
	}
	
	public static void load()
	{
		if(isArsMagica2Loaded == true)
		{
			System.out.print(modLoaded + " " + "is loaded, ");
			System.out.print(modLoaded + " " + "intergration coming soon");
		}
		else
		{
			System.out.print(modLoaded + " " + "is not loaded, ");
		}
	}

	
	private static String modLoaded = "Ars Magica2";
	public static boolean isArsMagica2Loaded = false;
}