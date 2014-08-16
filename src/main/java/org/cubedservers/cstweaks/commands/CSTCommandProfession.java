/**
 * Created by wasliebob, on 15 aug. 2014, at 21:16:00
 */
package org.cubedservers.cstweaks.commands;

import java.util.ArrayList;

import org.cubedservers.cstweaks.api.enums.EnumProfessions;
import org.cubedservers.cstweaks.api.helpers.ProfessionHelper;
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
	public String getCommandUsage(ICommandSender sender) {
		return "/profession";
	}

	@Override
	public void processCommand(ICommandSender sender, String[] array) {
		if(sender instanceof EntityPlayer){
			EntityPlayer player = (EntityPlayer)sender;
			if(array.length > 0){
				if(array[0] != null){
					if(array[0].equals("level"))
						level(player);
					else if(array[0].equals("reset"))
						reset(player, array);
					else if(array[0].equals("help"))
						help(player);
				}else{
					sendMessage(player, EnumChatFormatting.RED + "/profession help");
				}
			}else{
				sendMessage(player, EnumChatFormatting.RED + "/profession help");
			}
		}
	}
	
	public void help(EntityPlayer player){
		sendMessage(player, EnumChatFormatting.RED + "/profession level");
		sendMessage(player, EnumChatFormatting.RED + "/profession reset [<Profession>]");
	}
	
	public void level(EntityPlayer player){
		sendMessage(player, "Woodcutting: " + ProfessionHelper.getProfessionLevel(player, EnumProfessions.WOODCUTTING));
		sendMessage(player, "Mining: " + ProfessionHelper.getProfessionLevel(player, EnumProfessions.MINING));
		sendMessage(player, "Digging: " + ProfessionHelper.getProfessionLevel(player, EnumProfessions.DIGGING));
	}
	
	public void reset(EntityPlayer player, String[] array){
		if(array.length > 1){
			if(array[1] != null){
				if(array[1].equals(EnumProfessions.DIGGING.name))
					player.getEntityData().setInteger(EnumProfessions.DIGGING.name, 0);
				else if(array[1].equals(EnumProfessions.MINING.name))
					player.getEntityData().setInteger(EnumProfessions.MINING.name, 0);
				else if(array[1].equals(EnumProfessions.WOODCUTTING.name))
					player.getEntityData().setInteger(EnumProfessions.WOODCUTTING.name, 0);
			}else{
				player.getEntityData().setInteger(EnumProfessions.DIGGING.name, 0);
				player.getEntityData().setInteger(EnumProfessions.MINING.name, 0);
				player.getEntityData().setInteger(EnumProfessions.WOODCUTTING.name, 0);
			}
		}else{
			player.getEntityData().setInteger(EnumProfessions.DIGGING.name, 0);
			player.getEntityData().setInteger(EnumProfessions.MINING.name, 0);
			player.getEntityData().setInteger(EnumProfessions.WOODCUTTING.name, 0);
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