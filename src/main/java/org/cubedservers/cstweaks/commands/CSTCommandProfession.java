/**
 * Created by wasliebob, on 15 aug. 2014, at 21:16:00
 */
package org.cubedservers.cstweaks.commands;

import java.util.ArrayList;

import org.cubedservers.cstweaks.api.enums.EnumProfessions;
import org.cubedservers.cstweaks.api.main.ProfessionData;

import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;

public class CSTCommandProfession extends CommandBase{

	@Override
	public String getCommandName() {
		return "profession";
	}

	@Override
	public String getCommandUsage(ICommandSender icommandsender) {
		return "/profession";
	}

	@Override
	public void processCommand(ICommandSender sender, String[] array) {
		if(sender instanceof EntityPlayer){
			EntityPlayer player = (EntityPlayer)sender;
			sendMessage(player, "Combat: " + ProfessionData.getProfessionExperience(player, EnumProfessions.COMBAT));
			sendMessage(player, "Woodcutting: " + ProfessionData.getProfessionExperience(player, EnumProfessions.WOODCUTTING));
			sendMessage(player, "Mining: " + ProfessionData.getProfessionExperience(player, EnumProfessions.MINING));

		}
	}
	
	@Override
	public int compareTo(Object arg0) {
		return 0;
	}
	
	public static void sendMessage(EntityPlayer player, String text){
		player.addChatComponentMessage(new ChatComponentText(text));
	}
}