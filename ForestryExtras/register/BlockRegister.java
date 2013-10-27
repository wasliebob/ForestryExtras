package mods.ForestryExtras.register;

import mods.ForestryExtras.blocks.DraconicBlock;
import mods.ForestryExtras.blocks.ReinforcedBlock;
import mods.ForestryExtras.main.Config;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import cpw.mods.fml.common.registry.GameRegistry;

public class BlockRegister {

	public static void load()
	{
		System.out.print("Added Blocks, ");
		draconicBlock = new DraconicBlock(Config.draconicBlockId);
		reinforcedBlock = new ReinforcedBlock(Config.reinforcedBlockId);
		
	}
	
	public static void recipe()
	{
		GameRegistry.addShapedRecipe(new ItemStack(draconicBlock),
				"XXX",
				"XXX",
				"XXX",
				'X', ItemRegister.ingotDraconic);
		
		GameRegistry.addShapedRecipe(new ItemStack(reinforcedBlock),
				"XXX",
				"XXX",
				"XXX",
				'X', ItemRegister.ingotReinforced);
	}
	
	public static void oreDictionary()
	{
        OreDictionary.registerOre("blockDraconic", new ItemStack(draconicBlock));
        OreDictionary.registerOre("blockReinforced", new ItemStack(reinforcedBlock));
	}
	
	public static Block tickBlock;
	public static Block draconicBlock;
	public static Block reinforcedBlock;
}
