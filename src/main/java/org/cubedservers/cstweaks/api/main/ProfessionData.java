/**
 * Created by wasliebob, on 15 aug. 2014, at 21:16:00
 */

package org.cubedservers.cstweaks.api.main;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;

import org.cubedservers.cstweaks.api.enums.EnumProfessions;

public class ProfessionData {
	public static void writeProfessionExperience(EntityPlayer player, EnumProfessions profession, int level){
		player.getEntityData().setInteger(profession.name, level);
	}
	
	public static void increaseProfessionsExperience(EntityPlayer player, EnumProfessions profession, int level){
		player.getEntityData().setInteger(profession.name, player.getEntityData().getInteger(profession.name) + level);
	}
	
	public static void decreaseProfessionsExperience(EntityPlayer player, EnumProfessions profession, int level){
		player.getEntityData().setInteger(profession.name, player.getEntityData().getInteger(profession.name) - level);
	}
	
	public static int getProfessionExperience(EntityPlayer player, EnumProfessions profession){
		return player.getEntityData().getInteger(profession.name);
	}
	
	public static int getProfessionLevel(EntityPlayer player, EnumProfessions profession){
		int experienceToLevel = 100 * (ProfessionData.getProfessionLevel(player, profession) + 1);
		return player.getEntityData().getInteger(profession.name) / experienceToLevel;
	}
}