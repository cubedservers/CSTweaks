/**
* Created by Wesley, on 16 aug. 2014, at 11:41:20
*/
package org.cubedservers.cstweaks.main.init;

import net.minecraftforge.common.MinecraftForge;

import org.cubedservers.cstweaks.events.CSTCommonEvents;
import org.cubedservers.cstweaks.events.CTSTClientEvents;
import org.cubedservers.cstweaks.interfaces.IInitalization;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.relauncher.Side;

public class CSTEvents implements IInitalization{

	@Override
    public void preInit(FMLPreInitializationEvent event){}

	@Override
    public void init(FMLInitializationEvent event){
		MinecraftForge.EVENT_BUS.register(new CSTCommonEvents());
		
		if(event.getSide() == Side.CLIENT)
			MinecraftForge.EVENT_BUS.register(new CTSTClientEvents());

	}

	@Override
    public void postInit(FMLPostInitializationEvent event){}
}