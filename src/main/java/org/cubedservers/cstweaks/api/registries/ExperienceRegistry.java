/**
* Created by Wesley, on 16 aug. 2014, at 12:31:20
*/
package org.cubedservers.cstweaks.api.registries;

import java.util.HashMap;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;

public class ExperienceRegistry {
	public static HashMap<Block, Integer> professionXP = new HashMap<Block, Integer>(); 
	
	public static void register(){
		/** Mining */
		professionXP.put(Blocks.emerald_ore, 50);
		professionXP.put(Blocks.diamond_ore, 30);
		professionXP.put(Blocks.gold_ore, 20);
		professionXP.put(Blocks.iron_ore, 5);
		
		professionXP.put(Blocks.coal_ore, 2);
		professionXP.put(Blocks.redstone_ore, 2);
		professionXP.put(Blocks.lapis_ore, 2);
		professionXP.put(Blocks.quartz_ore, 2);
		
		/** Diging */
		professionXP.put(Blocks.clay, 2);
		professionXP.put(Blocks.soul_sand, 2);
	}
}