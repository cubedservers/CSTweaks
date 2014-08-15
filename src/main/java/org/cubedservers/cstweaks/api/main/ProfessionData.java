/**
 * Created by wasliebob, on 15 aug. 2014, at 21:16:00
 */

package org.cubedservers.cstweaks.api.main;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;

import org.cubedservers.cstweaks.api.enums.EnumProfessions;

public class ProfessionData {
	public static void writeProfessionLevel(EntityPlayer player, EnumProfessions profession, int level){
		player.getEntityData().setInteger(profession.name, level);
	}
	
	public static void increaseProfessionsLevel(EntityPlayer player, EnumProfessions profession, int level){
		player.getEntityData().setInteger(profession.name, player.getEntityData().getInteger(profession.name) + level);
	}
	
	public static void decreaseProfessionsLevel(EntityPlayer player, EnumProfessions profession, int level){
		player.getEntityData().setInteger(profession.name, player.getEntityData().getInteger(profession.name) - level);
	}
	
	public static int getProfessionLevel(EntityPlayer player, EnumProfessions profession){
		return player.getEntityData().getInteger(profession.name);
	}
}