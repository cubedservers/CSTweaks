/**
* Created by Wesley, on 15 aug. 2014, at 21:44:13
*/
package org.cubedservers.cstweaks.api.registries;

import java.util.HashMap;

import net.minecraft.init.Items;
import net.minecraft.item.Item;

import org.cubedservers.cstweaks.api.enums.EnumProfessions;
import org.cubedservers.cstweaks.helpers.ItemHelper;

public class ToolProfessionRegistry {
	public static HashMap<String, EnumProfessions> toolProfessions = new HashMap<String, EnumProfessions>();

	public static void register(){
		for(Object obj : Item.itemRegistry.getKeys()){
			if(obj != null){
			String name = (String)obj;
				if(name != null){
					if(name.contains("pickaxe")){
						toolProfessions.put(name, EnumProfessions.MINING);
					}else if(name.contains("axe")){
						toolProfessions.put(name, EnumProfessions.WOODCUTTING);
					}else if(name.contains("spade") || name.contains("shovel")){
						toolProfessions.put(name, EnumProfessions.DIGGING);
					}
				}
			}
		}

	}
}