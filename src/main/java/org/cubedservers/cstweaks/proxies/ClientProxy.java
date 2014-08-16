/**
* Created by wasliebob, on 10 aug. 2014, at 09:17:53
*/
package org.cubedservers.cstweaks.proxies;

import net.minecraft.client.Minecraft;

public class ClientProxy extends CommonProxy{
	@Override
	public void renders(){
		
	}
	
	@Override
	public boolean renderView(){
		return Minecraft.getMinecraft().renderViewEntity != null;
	}
}