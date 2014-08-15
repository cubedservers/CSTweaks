/**
* Created by Wesley, on 15 aug. 2014, at 21:44:13
*/
package org.cubedservers.cstweaks.api.registries;

import java.util.HashMap;

import net.minecraft.item.Item;

import org.cubedservers.cstweaks.api.enums.EnumProfessions;

public class ToolRegistry {
	public static void registerToolProfesion(String toolname, EnumProfessions profession){
		toolProfessions.put(toolname, profession);
	}
	public static HashMap<String, EnumProfessions> toolProfessions = new HashMap<String, EnumProfessions>();

	public static void register(){
		for(Object obj : Item.itemRegistry.getKeys()){
			if(obj != null){
			String name = (String)obj;
				if(name != null){
					if(name.contains("Pickaxe")){
						toolProfessions.put(name, EnumProfessions.MINING);
					}else if(name.contains("Axe")){
						toolProfessions.put(name, EnumProfessions.WOODCUTTING);
					}else if(name.contains("Sword")){
						toolProfessions.put(name, EnumProfessions.COMBAT);
					}
				}
			}
		}

	}
}