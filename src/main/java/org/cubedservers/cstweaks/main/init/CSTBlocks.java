/**
* Created by wasliebob, on 10 aug. 2014, at 08:05:58
*/
package org.cubedservers.cstweaks.main.init;

import org.cubedservers.cstweaks.interfaces.IInitalization;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class CSTBlocks implements IInitalization{

	@Override
    public void preInit(FMLPreInitializationEvent event){
		setupBlocks();
	}

	public void setupBlocks(){
	}
	
	@Override
    public void init(FMLInitializationEvent event){
		
	}

	@Override
    public void postInit(FMLPostInitializationEvent event){
		
	}

}
