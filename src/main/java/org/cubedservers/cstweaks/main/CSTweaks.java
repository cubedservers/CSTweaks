package org.cubedservers.cstweaks.main;

import org.cubedservers.cstweaks.inventorysync.DatabaseHelper;
import org.cubedservers.cstweaks.libs.LibMod;
import org.cubedservers.cstweaks.main.init.CSTBlocks;
import org.cubedservers.cstweaks.main.init.CSTItems;
import org.cubedservers.cstweaks.main.init.CSTMisc;

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
    public static CSTItems items = new CSTItems();
    public static CSTBlocks blocks = new CSTBlocks();
    public static CSTMisc misc = new CSTMisc();
    
    @Instance
    public static CSTweaks instance;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
    	items.preInit();
    	blocks.preInit();
        misc.preInit();
    }

    @EventHandler
    public void init(FMLInitializationEvent event){
    	items.init();
    	blocks.init();
    	misc.init();
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event){
    	items.postInit();
    	blocks.postInit();
    	misc.postInit();
    }

    @EventHandler
    public void serverStarting(FMLServerStartingEvent event){
//        databaseHelper.connect();
    }
}