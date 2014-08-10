/**
* Created by wasliebob, on 10 aug. 2014, at 09:28:50
*/
package org.cubedservers.cstweaks.helpers;

import net.minecraft.block.Block;

public class BlockHelper {
	public static Block getBlockFromID(int id){
		return Block.getBlockById(id);
	}
	
	public static int getBlockID(Block block){
		return Block.blockRegistry.getIDForObject(block);
	}
	
	public static Block getBlockFromName(String name){
		return Block.getBlockFromName(name);
	}
	
	public static String getBlockName(Block block){
		return Block.blockRegistry.getNameForObject(block);
	}
}