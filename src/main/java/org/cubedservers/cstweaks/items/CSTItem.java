/**
* Created by wasliebob, on 10 aug. 2014, at 08:06:32
*/
package org.cubedservers.cstweaks.items;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

import org.cubedservers.cstweaks.libs.LibMod;
import org.cubedservers.cstweaks.main.init.CSTTabs;

import cpw.mods.fml.common.registry.GameRegistry;

public class CSTItem extends Item{
	public CSTItem(String blockName, String textureName, int stackSize){
		setMaxStackSize(stackSize);
		setCreativeTab(CSTTabs.tabMain);
		setUnlocalizedName(blockName.toLowerCase());
		
		this.textureName = textureName;
		
		GameRegistry.registerItem(this, this.getUnlocalizedName());
	}
	public String textureName;
	
	@Override
    public void registerIcons(IIconRegister ir){
        itemIcon = ir.registerIcon(LibMod.modName.toLowerCase() + ":" + textureName);
	}
}