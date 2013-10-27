package mods.ForestryExtras.register;

import mods.ForestryExtras.frames.AluminiumFrame;
import mods.ForestryExtras.frames.AlumiteFrame;
import mods.ForestryExtras.frames.ArditeFrame;
import mods.ForestryExtras.frames.BronzeFrame;
import mods.ForestryExtras.frames.CoalFrame;
import mods.ForestryExtras.frames.CobaltFrame;
import mods.ForestryExtras.frames.CopperFrame;
import mods.ForestryExtras.frames.DiamondFrame;
import mods.ForestryExtras.frames.DraconicFrame;
import mods.ForestryExtras.frames.EmeraldFrame;
import mods.ForestryExtras.frames.GoldFrame;
import mods.ForestryExtras.frames.IronFrame;
import mods.ForestryExtras.frames.LeadFrame;
import mods.ForestryExtras.frames.ManyullynFrame;
import mods.ForestryExtras.frames.MutationFrame;
import mods.ForestryExtras.frames.NatureFrame;
import mods.ForestryExtras.frames.ObsidianFrame;
import mods.ForestryExtras.frames.ReinforcedFrame;
import mods.ForestryExtras.frames.SilverFrame;
import mods.ForestryExtras.frames.SteelFrame;
import mods.ForestryExtras.frames.TinFrame;
import mods.ForestryExtras.frames.UberFrame;
import mods.ForestryExtras.main.Config;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import forestry.api.recipes.RecipeManagers;

public class FrameRegister {

	public static void register()
	{
		System.out.print("Added Frames, ");
		uberFrame = new UberFrame(Config.uberFrameId);
        ironFrame = new IronFrame(Config.ironFrameId);
        goldFrame = new GoldFrame(Config.goldFrameId);
        diamondFrame = new DiamondFrame(Config.diamondFrameId);
        reinforcedFrame = new ReinforcedFrame(Config.reinforcedFrameId);
        draconicFrame = new DraconicFrame(Config.draconicFrameId);
        coalFrame = new CoalFrame(Config.coalFrameId);
        natureFrame = new NatureFrame(Config.natureFrameId);
        emeraldFrame = new EmeraldFrame(Config.emeraldFrameId);
        obsidianFrame = new ObsidianFrame(Config.obsidianFrameId);
        mutationFrame = new MutationFrame(Config.mutationFrameId);
        
        //General Ore Dictionary
        if(OreDictionary.getOres("ingotCopper").size() > 0)
        copperFrame = new CopperFrame(Config.copperFrameId);
        if(OreDictionary.getOres("ingotTin").size() > 0)
        tinFrame = new TinFrame(Config.tinFrameId);
        if(OreDictionary.getOres("ingotSilver").size() > 0)
        silverFrame = new SilverFrame(Config.silverFrameId);
        if(OreDictionary.getOres("ingotBronze").size() > 0)
        bronzeFrame = new BronzeFrame(Config.bronzeFrameId);
        if(OreDictionary.getOres("ingotSteel").size() > 0)
        steelFrame = new SteelFrame(Config.steelFrameId);
        if(OreDictionary.getOres("ingotLead").size() > 0)
        leadFrame = new LeadFrame(Config.leadFrameId);
        
        //Tinkers Construct
        if(OreDictionary.getOres("ingotManyullyn").size() > 0)
        manyullynFrame = new ManyullynFrame(Config.manyullynFrameId);
        if(OreDictionary.getOres("ingotArdite").size() > 0)
        arditeFrame = new ArditeFrame(Config.arditeFrameId);
        if(OreDictionary.getOres("ingotCobalt").size() > 0)
        cobaltFrame = new CobaltFrame(Config.cobaltFrameId);
        if(OreDictionary.getOres("ingotNaturalAluminum").size() > 0)
        aluminiumFrame = new AluminiumFrame(Config.aluminiumFrameId);
        if(OreDictionary.getOres("ingotAlumite").size() > 0)
        alumiteFrame = new AlumiteFrame(Config.alumiteFrameId);

	}
	
	public static void recipes()
	{
		RecipeManagers.carpenterManager.addRecipe(100, null, new ItemStack(ironFrame), new Object[]{ 
    		"XXX",
    		"XIX",
    		"XXX",
    		'X', ItemRegister.ironStick,
    		'I', Item.silk});
    
    RecipeManagers.carpenterManager.addRecipe(100, null, new ItemStack(goldFrame), new Object[]{ 
		"XXX",
		"XIX",
		"XXX",
		'X', ItemRegister.goldStick,
		'I', Item.silk});
    
    RecipeManagers.carpenterManager.addRecipe(100, null, new ItemStack(diamondFrame), new Object[]{ 
		"XXX",
		"XIX",
		"XXX",
		'X', ItemRegister.diamondStick,
		'I', Item.silk});
    
    RecipeManagers.carpenterManager.addRecipe(100, null, new ItemStack(reinforcedFrame), new Object[]{ 
		"XXX",
		"XIX",
		"XXX",
		'X', ItemRegister.reinforcedStick,
		'I', Item.silk});
    
    RecipeManagers.carpenterManager.addRecipe(1000, null, new ItemStack(draconicFrame), new Object[]{ 
		"XXX",
		"XIX",
		"XXX",
		'X', ItemRegister.draconicStick,
		'I', Item.netherStar});
    
    RecipeManagers.carpenterManager.addRecipe(10, null, new ItemStack(coalFrame), new Object[]{
        "XXX",
        "XIX",
        "XXX",
        'X', Item.coal,
        'I', Item.silk});
        
        RecipeManagers.carpenterManager.addRecipe(10, null, new ItemStack(coalFrame), new Object[]{
        "XXX",
        "XIX",
        "XXX",
        'X', new ItemStack(Item.coal, 1, 1),
        'I', Item.silk});

        
        RecipeManagers.carpenterManager.addRecipe(10, null, new ItemStack(emeraldFrame), new Object[]{
        "XXX",
        "XIX",
        "XXX",
        'X', ItemRegister.emeraldStick,
        'I', Item.silk});
        
        RecipeManagers.carpenterManager.addRecipe(10, null, new ItemStack(natureFrame), new Object[]{
        "XYX",
        "YIY",
        "XYX",
        'X', Block.grass,
        'Y', Block.sapling,
        'I', Item.silk});
        
        RecipeManagers.carpenterManager.addRecipe(10, null, new ItemStack(obsidianFrame), new Object[]{
        "XXX",
        "XIX",
        "XXX",
        'X', Block.obsidian,
        'I', Item.silk});
        
        RecipeManagers.carpenterManager.addRecipe(10, null, new ItemStack(mutationFrame), new Object[]{
            "XXX",
            "XIX",
            "XXX",
            'X', ItemRegister.draconicStick,
            'I', draconicFrame});
        
        if(OreDictionary.getOres("ingotCopper").size() > 0)
            RecipeManagers.carpenterManager.addRecipe(10, null, new ItemStack(copperFrame), new Object[]{
            "XXX",
            "XIX",
            "XXX",
            'X', ItemRegister.copperStick,
            'I', Item.silk});
            
            if(OreDictionary.getOres("ingotTin").size() > 0)
            RecipeManagers.carpenterManager.addRecipe(10, null, new ItemStack(tinFrame), new Object[]{
            "XXX",
            "XIX",
            "XXX",
            'X', ItemRegister.tinStick,
            'I', Item.silk});
            
            if(OreDictionary.getOres("ingotSilver").size() > 0)
            RecipeManagers.carpenterManager.addRecipe(10, null, new ItemStack(silverFrame), new Object[]{
            "XXX",
            "XIX",
            "XXX",
            'X', ItemRegister.silverStick,
            'I', Item.silk});
            
            if(OreDictionary.getOres("ingotBronze").size() > 0)
            RecipeManagers.carpenterManager.addRecipe(10, null, new ItemStack(bronzeFrame), new Object[]{
            "XXX",
            "XIX",
            "XXX",
            'X', ItemRegister.bronzeStick,
            'I', Item.silk});
            
            if(OreDictionary.getOres("ingotSteel").size() > 0)
            RecipeManagers.carpenterManager.addRecipe(10, null, new ItemStack(steelFrame), new Object[]{
            "XXX",
            "XIX",
            "XXX",
            'X', ItemRegister.steelStick,
            'I', Item.silk});
            
            if(OreDictionary.getOres("ingotLead").size() > 0)
            RecipeManagers.carpenterManager.addRecipe(10, null, new ItemStack(leadFrame), new Object[]{
            "XXX",
            "XIX",
            "XXX",
            'X', ItemRegister.leadStick,
            'I', Item.silk});
            
            if(OreDictionary.getOres("ingotManyullyn").size() > 0)
            RecipeManagers.carpenterManager.addRecipe(10, null, new ItemStack(manyullynFrame), new Object[]{
            "XXX",
            "XIX",
            "XXX",
            'X', ItemRegister.manyullynStick,
            'I', Item.silk});
            
            if(OreDictionary.getOres("ingotArdite").size() > 0)
            RecipeManagers.carpenterManager.addRecipe(10, null, new ItemStack(arditeFrame), new Object[]{
            "XXX",
            "XIX",
            "XXX",
            'X', ItemRegister.arditeStick,
            'I', Item.silk});
            
            if(OreDictionary.getOres("ingotCobalt").size() > 0)
            RecipeManagers.carpenterManager.addRecipe(10, null, new ItemStack(cobaltFrame), new Object[]{
            "XXX",
            "XIX",
            "XXX",
            'X', ItemRegister.cobaltStick,
            'I', Item.silk});
            
            if(OreDictionary.getOres("ingotNaturalAluminum").size() > 0)
            RecipeManagers.carpenterManager.addRecipe(10, null, new ItemStack(aluminiumFrame), new Object[]{
            "XXX",
            "XIX",
            "XXX",
            'X', ItemRegister.aluminiumStick,
            'I', Item.silk});
          
            if(OreDictionary.getOres("ingotAlumite").size() > 0)
            RecipeManagers.carpenterManager.addRecipe(10, null, new ItemStack(alumiteFrame), new Object[]{
            "XXX",
            "XIX",
            "XXX",
            'X', ItemRegister.alumiteStick,
            'I', Item.silk});
	}
	
	public static void oreDictionary()
	{   
        OreDictionary.registerOre("frameIron", new ItemStack(ironFrame));
        OreDictionary.registerOre("frameGold", new ItemStack(goldFrame));
        OreDictionary.registerOre("frameDiamond", new ItemStack(diamondFrame));
        OreDictionary.registerOre("frameReinforced", new ItemStack(reinforcedFrame));
        OreDictionary.registerOre("frameDraconic", new ItemStack(draconicFrame));
        OreDictionary.registerOre("frameEmerald", new ItemStack(emeraldFrame));
        OreDictionary.registerOre("frameCoal", new ItemStack(coalFrame));
        OreDictionary.registerOre("frameObsidian", new ItemStack(obsidianFrame));
        OreDictionary.registerOre("frameNature", new ItemStack(natureFrame));
        OreDictionary.registerOre("frameMutation", new ItemStack(mutationFrame));
        OreDictionary.registerOre("frameUber", new ItemStack(uberFrame));

        	if(OreDictionary.getOres("ingotCopper").size() > 0)
            OreDictionary.registerOre("frameCopper", new ItemStack(copperFrame));
            if(OreDictionary.getOres("ingotTin").size() > 0)
            OreDictionary.registerOre("frameTin", new ItemStack(tinFrame));
            if(OreDictionary.getOres("ingotSilver").size() > 0)
            OreDictionary.registerOre("frameSilver", new ItemStack(silverFrame));
            if(OreDictionary.getOres("ingotBronze").size() > 0)
            OreDictionary.registerOre("frameBronze", new ItemStack(bronzeFrame));
            if(OreDictionary.getOres("ingotSteel").size() > 0)
            OreDictionary.registerOre("frameSteel", new ItemStack(steelFrame));
            if(OreDictionary.getOres("ingotLead").size() > 0)
            OreDictionary.registerOre("frameLead", new ItemStack(leadFrame));
            
            if(OreDictionary.getOres("ingotManyullyn").size() > 0)
            OreDictionary.registerOre("frameManyullyn", new ItemStack(manyullynFrame));
            if(OreDictionary.getOres("ingotArdite").size() > 0)
            OreDictionary.registerOre("frameArdite", new ItemStack(arditeFrame));
            if(OreDictionary.getOres("ingotCobalt").size() > 0)
            OreDictionary.registerOre("frameCobalt", new ItemStack(cobaltFrame));
            if(OreDictionary.getOres("ingotNaturalAluminum").size() > 0)
            OreDictionary.registerOre("frameAluminium", new ItemStack(aluminiumFrame));
            if(OreDictionary.getOres("ingotAlumite").size() > 0)
            OreDictionary.registerOre("frameAlumite", new ItemStack(alumiteFrame));
	}
	
    public static Item uberFrame;
    public static Item ironFrame;
    public static Item goldFrame;
    public static Item diamondFrame;
    public static Item reinforcedFrame;
    public static Item draconicFrame;
    public static Item coalFrame;
    public static Item natureFrame;
    public static Item emeraldFrame;
    public static Item obsidianFrame;
    public static Item mutationFrame;
    
    public static Item copperFrame;
    public static Item tinFrame;
    public static Item silverFrame;
    public static Item bronzeFrame;
    public static Item steelFrame;
    public static Item leadFrame;
    
    public static Item manyullynFrame;
    public static Item alumiteFrame;
    public static Item arditeFrame;
    public static Item cobaltFrame;
    public static Item aluminiumFrame;
    
}
