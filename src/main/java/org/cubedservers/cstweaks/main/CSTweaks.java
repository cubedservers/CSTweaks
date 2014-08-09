package org.cubedservers.cstweaks.main;

import org.cubedservers.cstweaks.inventorysync.DatabaseHelper;
import org.cubedservers.cstweaks.libs.LibMod;
import org.cubedservers.cstweaks.main.init.InitMisc;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;

@Mod(name=LibMod.modName, modid=LibMod.modId, version=LibMod.version)
public class CSTweaks {
    DatabaseHelper databaseHelper = new DatabaseHelper();
    public static InitMisc misc = new InitMisc();
    
    @Instance
    public static CSTweaks instance;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
        misc.preInit();
    }

    @EventHandler
    public void init(FMLInitializationEvent event){
    	misc.init();
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event){
    	misc.postInit();
    }

    @EventHandler
    public void serverStarting(FMLServerStartingEvent event){
        databaseHelper.connect();
    }
}