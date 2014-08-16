/**
* Created by Wesley, on 16 aug. 2014, at 13:16:22
*/
package org.cubedservers.cstweaks.api.registries;

import java.util.HashMap;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;

import org.cubedservers.cstweaks.api.enums.EnumProfessions;
import org.cubedservers.cstweaks.api.helpers.ProfessionHelper;

public class LevelBlockRegistry {
	public static HashMap<Block, Integer> levelBlocks = new HashMap<Block, Integer>();
	
	public static void register(){
		/** Mining */
		levelBlocks.put(Blocks.sandstone, 2);
		levelBlocks.put(Blocks.mossy_cobblestone, 5);
		levelBlocks.put(Blocks.coal_ore, 8);

		levelBlocks.put(Blocks.iron_ore, 10);
		levelBlocks.put(Blocks.redstone_ore, 12);
		levelBlocks.put(Blocks.lapis_ore, 14);

		levelBlocks.put(Blocks.netherrack, 16);
		levelBlocks.put(Blocks.nether_brick, 18);

		levelBlocks.put(Blocks.gold_ore, 20);
		levelBlocks.put(Blocks.diamond_ore, 25);
		levelBlocks.put(Blocks.obsidian, 35);
		levelBlocks.put(Blocks.emerald_ore, 50);
		levelBlocks.put(Blocks.end_stone, 75);

		/** Digging */
		levelBlocks.put(Blocks.sand, 2);
		levelBlocks.put(Blocks.gravel, 4);
		levelBlocks.put(Blocks.clay, 8);
		levelBlocks.put(Blocks.soul_sand, 15);

		/** Woodcutting */
		
	}
}