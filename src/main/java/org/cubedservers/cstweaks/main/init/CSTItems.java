/**
* Created by wasliebob, on 10 aug. 2014, at 08:04:55
*/
package org.cubedservers.cstweaks.main.init;

import org.cubedservers.cstweaks.interfaces.IInitalization;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class CSTItems implements IInitalization{
	@Override
    public void preInit(FMLPreInitializationEvent event){
		setupItems();
	}
	
	public void setupItems(){
		
	}
	
	@Override
    public void init(FMLInitializationEvent event){
		
	}

	@Override
    public void postInit(FMLPostInitializationEvent event){
		
	}
}