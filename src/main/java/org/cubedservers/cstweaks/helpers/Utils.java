/** Helper Class */
package org.cubedservers.cstweaks.helpers;

import java.awt.Desktop;
import java.net.URL;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;

public class Utils {
	/**
	 * Copied from CoFHLib BlockHelper.class (https://github.com/CoFH/CoFHLib/blob/master/src/main/java/cofh/util/BlockHelper.java), with KingLemmings permission!
	 * @author King Lemming
	 */
	public static MovingObjectPosition getMovingObjectPosition(EntityPlayer player){
		Vec3 posVec = Vec3.createVectorHelper(player.posX, player.posY, player.posZ);
		Vec3 lookVec = player.getLook(1);
		posVec.yCoord += player.getEyeHeight();
		lookVec = posVec.addVector(lookVec.xCoord * 4.5F, lookVec.yCoord * 4.5F, lookVec.zCoord * 4.5F);
		return player.worldObj.rayTraceBlocks(posVec, lookVec);
	}
	
	/** @author wasliebob */
	public static Block getTargetBlock(EntityPlayer player){
		MovingObjectPosition mop = getMovingObjectPosition(player);
		if(mop != null){
			int x = mop.blockX;
			int y = mop.blockY;
			int z = mop.blockZ;
			Block b = player.worldObj.getBlock(x, y, z);
			if(b != null){
				return b;
			}
		}
		return null;
	}
	
	/** @author wasliebob */
	public static TileEntity getTargetTile(EntityPlayer player){
		MovingObjectPosition mop = getMovingObjectPosition(player);
		if(mop != null){
			int x = mop.blockX;
			int y = mop.blockY;
			int z = mop.blockZ;
			TileEntity t = player.worldObj.getTileEntity(x, y, z);
			if(t != null){
				return t;
			}
		}
		return null;
	}
	
	/** @author wasliebob */
	public static int getTargetBlockMeta(EntityPlayer player){
		MovingObjectPosition mop = getMovingObjectPosition(player);
		if(mop != null){
			int x = mop.blockX;
			int y = mop.blockY;
			int z = mop.blockZ;
			Block b = player.worldObj.getBlock(x, y, z);
			int meta = player.worldObj.getBlockMetadata(x, y, z);
			if(b != null){
				return meta;
			}
		}
		return 0;
	}
	
	/** @author wasliebob */
	public static int getTargetX(EntityPlayer player){
		MovingObjectPosition mop = getMovingObjectPosition(player);
		if(mop != null)
			return mop.blockX;
		return 0;
	}

	/** @author wasliebob */
	public static int getTargetY(EntityPlayer player){
		MovingObjectPosition mop = getMovingObjectPosition(player);
		if(mop != null)
			return mop.blockY;
		return 0;
	}
	
	/** @author wasliebob */
	public static int getTargetZ(EntityPlayer player){
		MovingObjectPosition mop = getMovingObjectPosition(player);
		if(mop != null)
			return mop.blockZ;
		return 0;
	}
	
	/** @author wasliebob */
	public static int getTargetBlockSide(EntityPlayer player){
		MovingObjectPosition mop = getMovingObjectPosition(player);
		if(mop != null){
			return mop.sideHit;
		}
		return 0;
	}
	
	/** @author wasliebob */
	public static Minecraft getMinecraft(){
		return Minecraft.getMinecraft();
	}
	
	/** @author wasliebob */
	public static void openURL(String url){
		try{
			Desktop.getDesktop().browse(new URL(url).toURI());
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}