package mods.ForestryExtras.register;

import mods.ForestryExtras.items.AluminiumStick;
import mods.ForestryExtras.items.AlumiteStick;
import mods.ForestryExtras.items.ArditeStick;
import mods.ForestryExtras.items.BronzeStick;
import mods.ForestryExtras.items.CobaltStick;
import mods.ForestryExtras.items.CopperStick;
import mods.ForestryExtras.items.DiamondStick;
import mods.ForestryExtras.items.DraconicIngot;
import mods.ForestryExtras.items.DraconicStick;
import mods.ForestryExtras.items.EmeraldStick;
import mods.ForestryExtras.items.GoldStick;
import mods.ForestryExtras.items.IronStick;
import mods.ForestryExtras.items.LeadStick;
import mods.ForestryExtras.items.ManyullynStick;
import mods.ForestryExtras.items.ReinforcedIngot;
import mods.ForestryExtras.items.ReinforcedStick;
import mods.ForestryExtras.items.SilverStick;
import mods.ForestryExtras.items.SteelStick;
import mods.ForestryExtras.items.TinStick;
import mods.ForestryExtras.main.Config;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import cpw.mods.fml.common.registry.GameRegistry;
import forestry.api.recipes.RecipeManagers;

public class ItemRegister {

	public static void register()
	{
		System.out.print("Added Materials, ");

        ingotReinforced = new ReinforcedIngot(Config.reinforcedIngotId);
        ingotDraconic = new DraconicIngot(Config.draconicIngotId);

        ironStick = new IronStick(Config.ironStickId);
        goldStick = new GoldStick(Config.goldStickId);
        diamondStick = new DiamondStick(Config.diamondStickId);
        reinforcedStick = new ReinforcedStick(Config.reinforcedStickId);
        draconicStick = new DraconicStick(Config.draconicStickId);
        emeraldStick = new EmeraldStick(Config.emeraldStickId);
        
        if(OreDictionary.getOres("ingotCopper").size() > 0)
        copperStick = new CopperStick(Config.copperStickId);
        if(OreDictionary.getOres("ingotTin").size() > 0)
        tinStick = new TinStick(Config.tinStickId);
        if(OreDictionary.getOres("ingotSilver").size() > 0)
        silverStick = new SilverStick(Config.silverStickId);
        if(OreDictionary.getOres("ingotBronze").size() > 0)
        bronzeStick = new BronzeStick(Config.bronzeStickId);
        if(OreDictionary.getOres("ingotSteel").size() > 0)
        steelStick = new SteelStick(Config.steelStickId);
        if(OreDictionary.getOres("ingotLead").size() > 0)
        leadStick = new LeadStick(Config.leadStickId);
        
        if(OreDictionary.getOres("ingotManyullyn").size() > 0)
        manyullynStick = new ManyullynStick(Config.manyullynStickId);
        if(OreDictionary.getOres("ingotArdite").size() > 0)
        arditeStick = new ArditeStick(Config.arditeStickId);
        if(OreDictionary.getOres("ingotCobalt").size() > 0)
        cobaltStick = new CobaltStick(Config.cobaltStickId);
        if(OreDictionary.getOres("ingotNaturalAluminum").size() > 0)
        aluminiumStick = new AluminiumStick(Config.aluminiumStickId);
        if(OreDictionary.getOres("ingotAlumite").size() > 0)
        alumiteStick = new AlumiteStick(Config.alumiteStickId);
	}
	
	public static void recipes()
	{
	       
		 RecipeManagers.carpenterManager.addRecipe(10, FluidRegistry.getFluidStack("lava", 100), null, new ItemStack(ingotReinforced), new Object[]{
	        	"   ",
	        	"XY ",
	        	"BA ",
	        	'X', Item.diamond,
	        	'Y', Item.ingotIron,
	        	'B', Item.ingotGold, 
	        	'A', Block.obsidian});
		 
	        if(OreDictionary.getOres("ingotCopper").size() > 0)
	        GameRegistry.addRecipe(new ShapedOreRecipe(copperStick, true, new Object[]{
	                "X", 
	                "X",
	                'X', "ingotCopper"}));
	        
	        if(OreDictionary.getOres("ingotTin").size() > 0)
	        GameRegistry.addRecipe(new ShapedOreRecipe(tinStick, true, new Object[]{
	                "X", 
	                "X",
	                'X', "ingotTin"}));
	        
	        if(OreDictionary.getOres("ingotSilver").size() > 0)
	        GameRegistry.addRecipe(new ShapedOreRecipe(silverStick, true, new Object[]{
	                "X", 
	                "X",
	                'X', "ingotSilver"}));
	        
	        if(OreDictionary.getOres("ingotSteel").size() > 0)
	        GameRegistry.addRecipe(new ShapedOreRecipe(steelStick, true, new Object[]{
	                "X", 
	                "X",
	                'X', "ingotSteel"}));
	        
	        if(OreDictionary.getOres("ingotBronze").size() > 0)
	        GameRegistry.addRecipe(new ShapedOreRecipe(bronzeStick, true, new Object[]{
	                "X", 
	                "X",
	                'X', "ingotBronze"}));
	        
	        if(OreDictionary.getOres("ingotLead").size() > 0)
		        GameRegistry.addRecipe(new ShapedOreRecipe(leadStick, true, new Object[]{
		                "X", 
		                "X",
		                'X', "ingotLead"}));
	        
	        if(OreDictionary.getOres("ingotManyullyn").size() > 0)
	            GameRegistry.addRecipe(new ShapedOreRecipe(manyullynStick, true, new Object[]{
	                    "X", 
	                    "X",
	                    'X', "ingotManyullyn"}));

	        if(OreDictionary.getOres("ingotArdite").size() > 0)
	            GameRegistry.addRecipe(new ShapedOreRecipe(arditeStick, true, new Object[]{
	                    "X", 
	                    "X",
	                    'X', "ingotArdite"}));
	        
	        if(OreDictionary.getOres("ingotCobalt").size() > 0)
	            GameRegistry.addRecipe(new ShapedOreRecipe(cobaltStick, true, new Object[]{
	                    "X", 
	                    "X",
	                    'X', "ingotCobalt"}));
	        
	        if(OreDictionary.getOres("ingotNaturalAluminum").size() > 0)
	            GameRegistry.addRecipe(new ShapedOreRecipe(aluminiumStick, true, new Object[]{
	                    "X", 
	                    "X",
	                    'X', "ingotNaturalAluminum"}));
	        
	        if(OreDictionary.getOres("ingotAlumite").size() > 0)
	            GameRegistry.addRecipe(new ShapedOreRecipe(alumiteStick, true, new Object[]{
	                    "X", 
	                    "X",
	                    'X', "ingotAlumite"}));
	        
	        RecipeManagers.carpenterManager.addRecipe(10, FluidRegistry.getFluidStack("lava", 100), null, new ItemStack(ironStick), new Object[]{
	        	"   ",
	        	" X ",
	        	" X ",
	        	'X', Item.ingotIron});
	        
	        RecipeManagers.carpenterManager.addRecipe(10, FluidRegistry.getFluidStack("lava", 100), null, new ItemStack(goldStick), new Object[]{
	        	"   ",
	        	" X ",
	        	" X ",
	        	'X', Item.ingotGold});
	        
	        RecipeManagers.carpenterManager.addRecipe(10, FluidRegistry.getFluidStack("lava", 100), null, new ItemStack(diamondStick), new Object[]{
	        	"   ",
	        	" X ",
	        	" X ",
	        	'X', Item.diamond});
	        
	        RecipeManagers.carpenterManager.addRecipe(10, FluidRegistry.getFluidStack("lava", 500), null, new ItemStack(reinforcedStick), new Object[]{
	        	"   ",
	        	" X ",
	        	" X ",
	        	'X', ingotReinforced});
	        
	        RecipeManagers.carpenterManager.addRecipe(10, FluidRegistry.getFluidStack("lava", 1000), null, new ItemStack(draconicStick), new Object[]{
	        	"   ",
	        	" X ",
	        	" X ",
	        	'X', ingotDraconic});
	        
	        	if(Config.dragonEggRecipe == true){
	        	RecipeManagers.carpenterManager.addRecipe(500, null, new ItemStack(Block.dragonEgg), new Object[] {
	        	"XXX",
	        	"YYY",
	        	"XXX",
	        	'X', Item.netherStar,
	        	'Y', Item.enderPearl});}
	        	
	        	RecipeManagers.carpenterManager.addRecipe(10, FluidRegistry.getFluidStack("lava", 100), null, new ItemStack(emeraldStick), new Object[]{
	            "   ",
	            " X ",
	            " X ",
	            'X', Item.emerald});
	}
	
	public static void oreDictionary()
	{
        OreDictionary.registerOre("ingotReinforced", new ItemStack(ingotReinforced));
        OreDictionary.registerOre("ingotDraconic", new ItemStack(ingotDraconic));
        
        OreDictionary.registerOre("stickIron", new ItemStack(ironStick));
        OreDictionary.registerOre("stickGold", new ItemStack(goldStick));
        OreDictionary.registerOre("stickDiamond", new ItemStack(diamondStick));
        OreDictionary.registerOre("stickReinforced", new ItemStack(reinforcedStick));
        OreDictionary.registerOre("stickDraconic", new ItemStack(draconicStick));
        OreDictionary.registerOre("stickEmerald", new ItemStack(emeraldStick));
        
        	if(OreDictionary.getOres("ingotCopper").size() > 0)
            OreDictionary.registerOre("stickCopper", new ItemStack(copperStick));
            if(OreDictionary.getOres("ingotTin").size() > 0)
            OreDictionary.registerOre("stickTin", new ItemStack(tinStick));
            if(OreDictionary.getOres("ingotSilver").size() > 0)
            OreDictionary.registerOre("stickSilver", new ItemStack(silverStick));
            if(OreDictionary.getOres("ingotBronze").size() > 0)
            OreDictionary.registerOre("stickBronze", new ItemStack(bronzeStick));
            if(OreDictionary.getOres("ingotSteel").size() > 0)
            OreDictionary.registerOre("stickSteel", new ItemStack(steelStick));
            if(OreDictionary.getOres("ingotLead").size() > 0)
            OreDictionary.registerOre("stickLead", new ItemStack(leadStick));
            
            if(OreDictionary.getOres("ingotManyullyn").size() > 0)
            OreDictionary.registerOre("stickManyullyn", new ItemStack(manyullynStick));
            if(OreDictionary.getOres("ingotArdite").size() > 0)
            OreDictionary.registerOre("stickArdite", new ItemStack(arditeStick));
            if(OreDictionary.getOres("ingotCobalt").size() > 0)
            OreDictionary.registerOre("stickCobalt", new ItemStack(cobaltStick));
            if(OreDictionary.getOres("ingotNaturalAluminum").size() > 0)
            OreDictionary.registerOre("stickAluminium", new ItemStack(aluminiumStick));
            if(OreDictionary.getOres("ingotAlumite").size() > 0)
            OreDictionary.registerOre("stickAlumite", new ItemStack(alumiteStick));
	}
	
    public static Item ironStick;
    public static Item goldStick;
    public static Item diamondStick;
    public static Item reinforcedStick;
    public static Item draconicStick;
    public static Item emeraldStick;
    
    public static Item copperStick;
    public static Item tinStick;
    public static Item silverStick;
    public static Item bronzeStick;
    public static Item steelStick;
    public static Item leadStick;
    
    public static Item manyullynStick;
    public static Item alumiteStick;
    public static Item arditeStick;
    public static Item cobaltStick;
    public static Item aluminiumStick;

    public static Item ingotReinforced;
    public static Item ingotDraconic;
    
}
