/**
* Created by Wesley, on 16 aug. 2014, at 11:21:29
*/
package org.cubedservers.cstweaks.helpers;

import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class ItemHelper {
	public static Item getItemFromName(String name){
		return (Item)Item.itemRegistry.getObject(name);
	}
	
	public static String getItemName(Item item){
		return Item.itemRegistry.getNameForObject(item);
	}
}
