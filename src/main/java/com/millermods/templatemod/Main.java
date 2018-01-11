package com.millermods.templatemod;

import com.millermods.templatemod.proxy.CommonProxy;
import com.millermods.templatemod.util.reference;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = reference.MODID, name = reference.NAME, version = reference.VERSION)
public class Main {

    @Instance
    public static Main instance;

    @SidedProxy(clientSide = reference.CLIENT, serverSide = reference.COMMON)
    public static CommonProxy proxy;

    @EventHandler
    public static void preInit(FMLPreInitializationEvent event) {

    }

    @EventHandler
    public static void init(FMLInitializationEvent event) {

    }

    @EventHandler
    public static void postInit(FMLPostInitializationEvent event) {

    }

}
