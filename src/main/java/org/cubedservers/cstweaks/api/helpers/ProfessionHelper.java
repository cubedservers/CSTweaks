/**
* Created by Wesley, on 16 aug. 2014, at 14:28:12
*/
package org.cubedservers.cstweaks.api.helpers;

import net.minecraft.entity.player.EntityPlayer;

import org.cubedservers.cstweaks.api.enums.EnumProfessions;

public class ProfessionHelper {
	public static int getProfessionLevel(EntityPlayer player, EnumProfessions profession){
		int experienceToLevel = 100;
		
		return player.getEntityData().getInteger(profession.name) / experienceToLevel;
	}
	
	public static int convertExperienceToLevel(int xp){
		int experienceToLevel = ProfessionHelper.getLevelModifier();

		return xp / experienceToLevel;
	}
	
	public static int getMaxLevel(){
		return 80;
	}
	
	public static int getLevelModifier(){
		return 100;
	}
}