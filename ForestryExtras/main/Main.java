package mods.ForestryExtras.main;

import mods.ForestryExtras.helpers.ArsMagica2Helper;
import mods.ForestryExtras.helpers.LoadHelper;
import mods.ForestryExtras.helpers.Thaumcraft4Helper;
import mods.ForestryExtras.register.BlockRegister;
import mods.ForestryExtras.register.EasterEggRegister;
import mods.ForestryExtras.register.FrameRegister;
import mods.ForestryExtras.register.GrafterRegister;
import mods.ForestryExtras.register.ItemRegister;
import mods.ForestryExtras.register.ScoopRegister;
import mods.ForestryExtras.register.TabRegister;
import mods.ForestryExtras.register.WorldGenRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = "ForestryExtras", name = "ForestryExtras", version = "0.6.1" ,dependencies = "required-after:Forestry")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class Main {

    
    
    @SidedProxy(clientSide = "mods.ForestryExtras.client.ClientProxy", serverSide = "mods.ForestryExtras.main.CommonProxy")
    public static CommonProxy proxy;
 
    @Instance("ForestryExtras")
    public static Main instance;

    
    @PreInit
    public void preInit(FMLPreInitializationEvent event)
    {
		Config config = new Config();
		Config.loadConfig(event);
    }

    public static CreativeTabs tabFrames = new CreativeTabs("tabFrames") {
        public ItemStack getIconItemStack() {
                return new ItemStack(FrameRegister.draconicFrame, 1, 0);}};

    public static CreativeTabs tabMaterials = new CreativeTabs("tabMaterials") {
         public ItemStack getIconItemStack() {
                return new ItemStack(ItemRegister.draconicStick, 1, 0);}};  
         
    public static CreativeTabs tabTools = new CreativeTabs("tabTools") {
         public ItemStack getIconItemStack() {
                return new ItemStack(ScoopRegister.draconicScoop, 1, 0);}};  
              
    public static CreativeTabs tabBlocks = new CreativeTabs("tabBlocks") {
        public ItemStack getIconItemStack() {
               return new ItemStack(BlockRegister.reinforcedBlock, 1, 0);}};  
               
    @Init
    public void load(FMLInitializationEvent evt)
    {
    	proxy.registerParticles();
        proxy.registerRenderInformation();
        LoadHelper.load();
        MinecraftForge.EVENT_BUS.register(this);            
    }

    @PostInit
    public void modsLoaded(FMLPostInitializationEvent evt)
    {
    }
}