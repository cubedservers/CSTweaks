/**
* Created by wasliebob, on 10 aug. 2014, at 08:04:25
*/
package org.cubedservers.cstweaks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

import org.cubedservers.cstweaks.libs.LibMod;
import org.cubedservers.cstweaks.main.init.CSTTabs;

import cpw.mods.fml.common.registry.GameRegistry;

public class CSTBlock extends Block{
	public CSTBlock(String blockName, String textureName, float hardness, Material material) {
		super(material);
		setHardness(hardness);
		setCreativeTab(CSTTabs.tabMain);
		
		setBlockName(blockName.toLowerCase());
		
		this.textureName = textureName;
		
		GameRegistry.registerBlock(this, this.getUnlocalizedName());
	}
	public String textureName;
	
	@Override
    public void registerBlockIcons(IIconRegister ir) {
        blockIcon = ir.registerIcon(LibMod.modName.toLowerCase() + ":" + textureName);
	}
	
}