/**
* Created by wasliebob, on 9 aug. 2014, at 22:07:49
*/
package org.cubedservers.cstweaks.main.init;

import org.cubedservers.cstweaks.api.registries.BlockProfessionRegistry;
import org.cubedservers.cstweaks.api.registries.ExperienceRegistry;
import org.cubedservers.cstweaks.api.registries.LevelBlockRegistry;
import org.cubedservers.cstweaks.api.registries.ToolProfessionRegistry;
import org.cubedservers.cstweaks.interfaces.IInitalization;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class CSTMisc implements IInitalization{

	@Override
    public void preInit(FMLPreInitializationEvent event){
		
	}

	@Override
    public void init(FMLInitializationEvent event){
    	BlockProfessionRegistry.register();
    	ExperienceRegistry.register();
    	LevelBlockRegistry.register();
    	ToolProfessionRegistry.register();
	}

	@Override
    public void postInit(FMLPostInitializationEvent event){
		
	}
}