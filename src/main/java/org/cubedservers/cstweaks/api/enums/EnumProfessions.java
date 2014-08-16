/**
 * Created by wasliebob, on 15 aug. 2014, at 21:16:00
 */
package org.cubedservers.cstweaks.api.enums;

public enum EnumProfessions {
	WOODCUTTING("Woodcutting"), MINING("Mining"), DIGGING("Diggin"), COMBAT("Combat");
	
	public String name;
	
	private EnumProfessions(String name){
		this.name = name;
	}
}