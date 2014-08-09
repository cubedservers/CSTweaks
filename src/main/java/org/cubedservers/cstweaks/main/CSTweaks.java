package org.cubedservers.cstweaks.main;

import org.cubedservers.cstweaks.libs.LibMod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;

@Mod(name=LibMod.modName, modid=LibMod.modId, version=LibMod.version)
public class CSTweaks {

    @Instance
    public static CSTweaks instance;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
        
    }

    @EventHandler
    public void init(FMLInitializationEvent event){

    }

    @EventHandler
    public void serverStarting(FMLServerStartingEvent event){
        
    }
}