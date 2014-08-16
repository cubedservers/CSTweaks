/**
* Created by Wesley, on 16 aug. 2014, at 13:16:22
*/
package org.cubedservers.cstweaks.api.registries;

import java.util.HashMap;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;

import org.cubedservers.cstweaks.api.enums.EnumProfessions;
import org.cubedservers.cstweaks.api.main.ProfessionData;

public class LevelBlockRegistry {
	/** TODO Make it so you can only harvest these blocks when reached a level */
	public static HashMap<Block, Integer> levelBlocks = new HashMap<Block, Integer>();
	
	public static boolean canMineBlock(EntityPlayer player, EnumProfessions profession, Block block){
		if(levelBlocks.containsKey(block)){
			return ProfessionData.getProfessionLevel(player, profession) >= levelBlocks.get(block);
		}else{
			return true;
		}		
	}
	
	public static void register(){
	}
}