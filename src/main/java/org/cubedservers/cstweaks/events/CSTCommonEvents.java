package org.cubedservers.cstweaks.events;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;
import net.minecraftforge.event.world.BlockEvent;

import org.cubedservers.cstweaks.api.enums.EnumProfessions;
import org.cubedservers.cstweaks.api.main.ProfessionData;
import org.cubedservers.cstweaks.api.registries.BlockProfessionRegistry;
import org.cubedservers.cstweaks.api.registries.ExperienceRegistry;
import org.cubedservers.cstweaks.api.registries.ToolProfessionRegistry;
import org.cubedservers.cstweaks.helpers.ItemHelper;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class CSTCommonEvents {
	
	@SubscribeEvent
	public void onBlockMined(BlockEvent.HarvestDropsEvent e){
		Minecraft mc = Minecraft.getMinecraft();
		EntityPlayer player = e.harvester;
		World world = e.world;
		int x = e.x;
		int y = e.y;
		int z = e.z;
		
		if(player != null){
			ItemStack heldStack = player.getHeldItem();
			if(heldStack != null){
				Item heldItem = heldStack.getItem();
				String name = ItemHelper.getItemName(heldItem);
				if(name != null && ToolProfessionRegistry.toolProfessions.containsKey(name)){
					EnumProfessions blockProfession = BlockProfessionRegistry.blocksProfessions.get(e.block);
					EnumProfessions toolProfession = ToolProfessionRegistry.toolProfessions.get(name);
					if(toolProfession != null && blockProfession != null && toolProfession == blockProfession){
						if(ExperienceRegistry.professionXP.containsKey(e.block)){
							int xpValue = ExperienceRegistry.professionXP.get(e.block);
							ProfessionData.increaseProfessionsExperience(player, toolProfession, xpValue);
							
							/** Debug Message */
							player.addChatComponentMessage(new ChatComponentText(ProfessionData.getProfessionExperience(player, toolProfession) + " XP"));
						}else{
							ProfessionData.increaseProfessionsExperience(player, toolProfession, 1);
							
							/** Debug Message */
							player.addChatComponentMessage(new ChatComponentText(ProfessionData.getProfessionExperience(player, toolProfession) + " XP"));
						}
					}
				}
			}
		}
	}
}