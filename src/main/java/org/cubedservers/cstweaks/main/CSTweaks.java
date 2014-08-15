package org.cubedservers.cstweaks.main;

import net.minecraft.client.Minecraft;

import org.cubedservers.cstweaks.api.enums.EnumProfessions;
import org.cubedservers.cstweaks.api.main.ProfessionData;
import org.cubedservers.cstweaks.api.registries.ToolRegistry;
import org.cubedservers.cstweaks.commands.CSTCommandProfession;
import org.cubedservers.cstweaks.inventorysync.DatabaseHelper;
import org.cubedservers.cstweaks.libs.LibMod;
import org.cubedservers.cstweaks.main.init.CSTBlocks;
import org.cubedservers.cstweaks.main.init.CSTItems;
import org.cubedservers.cstweaks.main.init.CSTMisc;
import org.cubedservers.cstweaks.proxies.CommonProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;

@Mod(name=LibMod.modName, modid=LibMod.modId, version=LibMod.version)
public class CSTweaks {
    @SidedProxy(clientSide = "org.cubedservers.cstweaks.proxies.ClientProxy", serverSide = "org.cubedservers.cstweaks.proxies.CommonProxy")
    public static CommonProxy proxy;
    
    @Instance
    public static CSTweaks instance;
    
    DatabaseHelper databaseHelper = new DatabaseHelper();
    public static CSTItems items = new CSTItems();
    public static CSTBlocks blocks = new CSTBlocks();
    public static CSTMisc misc = new CSTMisc();

    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
    	proxy.load();
    	items.preInit();
    	blocks.preInit();
        misc.preInit();
    }

    @EventHandler
    public void init(FMLInitializationEvent event){
    	items.init();
    	blocks.init();
    	misc.init();
    	ToolRegistry.register();
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event){
    	items.postInit();
    	blocks.postInit();
    	misc.postInit();
    }

    @EventHandler
    public void serverStarting(FMLServerStartingEvent event){
    	event.registerServerCommand(new CSTCommandProfession());
        
    	/** Disabled until pixlepix fixes it */
    	//databaseHelper.connect();
    }
}