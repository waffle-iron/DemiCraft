package com.millermods.templatemod;

import com.millermods.templatemod.util.Reference;
import com.millermods.templatemod.util.handlers.RegistryHandler;
import com.millermods.templatemod.proxy.CommonProxy;
import com.millermods.templatemod.util.Reference;
import com.millermods.templatemod.util.handlers.RegistryHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class Main 
{
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.COMMON)
	public static CommonProxy proxy;
	
	public static final CreativeTabs TUTORIAL = new TutorialTab("tutorialtab");
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) {
        RegistryHandler.preInitRegistries();}
	@EventHandler
	public static void init(FMLInitializationEvent event) {}
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) {RegistryHandler.postInitRegistries();}
}
