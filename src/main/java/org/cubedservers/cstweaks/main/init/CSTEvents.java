/**
* Created by Wesley, on 16 aug. 2014, at 11:41:20
*/
package org.cubedservers.cstweaks.main.init;

import net.minecraftforge.common.MinecraftForge;

import org.cubedservers.cstweaks.events.CSTCommonEvents;
import org.cubedservers.cstweaks.interfaces.IInitalization;

public class CSTEvents implements IInitalization{

	@Override
	public void preInit(){}

	@Override
	public void init() {
		MinecraftForge.EVENT_BUS.register(new CSTCommonEvents());
	}

	@Override
	public void postInit(){}
}