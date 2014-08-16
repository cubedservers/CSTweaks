/**
* Created by Wesley, on 16 aug. 2014, at 13:15:31
*/
package org.cubedservers.cstweaks.api.registries;

import java.util.HashMap;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;

import org.cubedservers.cstweaks.api.enums.EnumProfessions;

public class BlockProfessionRegistry {
	public static HashMap<Block, EnumProfessions> blocksProfessions = new HashMap<Block, EnumProfessions>();	
	
	public static void register(){
		registerMining();
		registerDigging();
		registerWoodcutting();
	}
	
	public static void registerMining(){
		blocksProfessions.put(Blocks.cobblestone, EnumProfessions.MINING);
		blocksProfessions.put(Blocks.stone, EnumProfessions.MINING);
		blocksProfessions.put(Blocks.mossy_cobblestone, EnumProfessions.MINING);
		blocksProfessions.put(Blocks.stained_hardened_clay, EnumProfessions.MINING);
		blocksProfessions.put(Blocks.iron_ore, EnumProfessions.MINING);
		blocksProfessions.put(Blocks.gold_ore, EnumProfessions.MINING);
		blocksProfessions.put(Blocks.diamond_ore, EnumProfessions.MINING);
		blocksProfessions.put(Blocks.redstone_ore, EnumProfessions.MINING);
		blocksProfessions.put(Blocks.emerald_ore, EnumProfessions.MINING);
		blocksProfessions.put(Blocks.lapis_ore, EnumProfessions.MINING);
		blocksProfessions.put(Blocks.quartz_ore, EnumProfessions.MINING);
		blocksProfessions.put(Blocks.nether_brick, EnumProfessions.MINING);
		blocksProfessions.put(Blocks.netherrack, EnumProfessions.MINING);
		blocksProfessions.put(Blocks.end_stone, EnumProfessions.MINING);
		blocksProfessions.put(Blocks.sandstone, EnumProfessions.MINING);
	}
	
	public static void registerDigging(){
		blocksProfessions.put(Blocks.dirt, EnumProfessions.DIGGING);
		blocksProfessions.put(Blocks.grass, EnumProfessions.DIGGING);
		blocksProfessions.put(Blocks.sand, EnumProfessions.DIGGING);
		blocksProfessions.put(Blocks.gravel, EnumProfessions.DIGGING);
		blocksProfessions.put(Blocks.clay, EnumProfessions.DIGGING);
		blocksProfessions.put(Blocks.snow, EnumProfessions.DIGGING);
		blocksProfessions.put(Blocks.soul_sand, EnumProfessions.DIGGING);
	}
	
	public static void registerWoodcutting(){
		blocksProfessions.put(Blocks.log, EnumProfessions.WOODCUTTING);
		blocksProfessions.put(Blocks.log2, EnumProfessions.WOODCUTTING);
		blocksProfessions.put(Blocks.planks, EnumProfessions.WOODCUTTING);
	}
}
