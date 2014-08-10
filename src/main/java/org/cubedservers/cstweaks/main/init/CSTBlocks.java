/**
* Created by wasliebob, on 10 aug. 2014, at 08:05:58
*/
package org.cubedservers.cstweaks.main.init;

import net.minecraft.block.material.Material;

import org.cubedservers.cstweaks.blocks.CSTBlock;
import org.cubedservers.cstweaks.interfaces.IInitalization;

public class CSTBlocks implements IInitalization{

	@Override
	public void preInit() {
		setupBlocks();
	}

	public void setupBlocks(){
		grass_infested = new CSTBlock("infested grass", "grass_infested", 1.0F, Material.grass);
	}
	public static CSTBlock grass_infested;
	
	@Override
	public void init() {
		
	}

	@Override
	public void postInit() {
		
	}

}
