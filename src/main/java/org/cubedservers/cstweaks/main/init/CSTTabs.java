/**
* Created by wasliebob, on 10 aug. 2014, at 09:02:23
*/
package org.cubedservers.cstweaks.main.init;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class CSTTabs {
	/** Place holder */
    public static CreativeTabs tabMain = new CreativeTabs("tabMain"){
		@Override
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem(){
			return Items.nether_star;
		}
	};
}