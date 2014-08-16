/**
* Created by wasliebob, on 9 aug. 2014, at 22:07:49
*/
package org.cubedservers.cstweaks.main.init;

import org.cubedservers.cstweaks.api.registries.BlockProfessionRegistry;
import org.cubedservers.cstweaks.api.registries.ExperienceRegistry;
import org.cubedservers.cstweaks.api.registries.LevelBlockRegistry;
import org.cubedservers.cstweaks.api.registries.ToolProfessionRegistry;
import org.cubedservers.cstweaks.interfaces.IInitalization;

public class CSTMisc implements IInitalization{

	@Override
	public void preInit(){
		
	}

	@Override
	public void init(){
    	BlockProfessionRegistry.register();
    	ExperienceRegistry.register();
    	LevelBlockRegistry.register();
    	ToolProfessionRegistry.register();
	}

	@Override
	public void postInit(){
		
	}
}