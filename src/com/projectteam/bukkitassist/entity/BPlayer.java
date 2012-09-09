/*
 * This file is part of BukkitAssist.
 *
 * BukkitAssist is licensed under the ProjectTeam License Version 1.
 *
 * BukkitAssist is free API: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * In addition, 180 days after any changes are published, you can use the
 * software, incorporating those changes, under the terms of the MIT license,
 * as described in the ProjectTeam License Version 1.
 *
 * BukkitAssist is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License,
 * the MIT license and the ProjectTeam License Version 1 along with this program.
 * If not, see <http://www.gnu.org/licenses/> for the GNU Lesser General Public
 * License.
 */
package com.projectteam.bukkitassist.entity;

import org.bukkit.craftbukkit.entity.CraftPlayer;

import net.minecraft.server.Packet100OpenWindow;
import net.minecraft.server.Packet18ArmAnimation;






public class BPlayer{
	

	/**
	 * Opens Furnace window using Packet100OpenWindow
	 * @param craftplayer
	 */
	public static void openFurnace(CraftPlayer craftplayer){
		Packet100OpenWindow packet100 = new Packet100OpenWindow(0, 2, "BukkitAssist", 0);
		packet100.c = "BukkitAsssit";
		craftplayer.getHandle().netServerHandler.sendPacket(packet100);
	}
	
	/**
	 * Opens Workbench window using Packet100OpenWindow
	 * @param craftplayer
	 */
	public static void openWorkbench(CraftPlayer craftplayer){
		Packet100OpenWindow packet100 = new Packet100OpenWindow(0, 1, "BukkitAssist", 0);
		packet100.c = "BukkitAsssit";
		craftplayer.getHandle().netServerHandler.sendPacket(packet100);
	}
	
	/**
	 * Opens Chest window using Packet100OpenWindow
	 * @param craftplayer
	 */
	public static void openChest(CraftPlayer craftplayer){
		Packet100OpenWindow packet100 = new Packet100OpenWindow(0, 0, "BukkitAssist", 0);
		packet100.c = "BukkitAsssit";
		craftplayer.getHandle().netServerHandler.sendPacket(packet100);
	}
	
	/**
	 * Opens Dispenser window using Packet100OpenWindow
	 * @param craftplayer
	 */
	public static void openDispenser(CraftPlayer craftplayer){
		Packet100OpenWindow packet100 = new Packet100OpenWindow(0, 3, "BukkitAssist", 0);
		packet100.c = "BukkitAsssit";
		craftplayer.getHandle().netServerHandler.sendPacket(packet100);
	}
	
	/**
	 * Opens Enchantment Table window using Packet100OpenWindow
	 * @param craftplayer
	 */
	public static void openEnchantmentTable(CraftPlayer craftplayer){
		Packet100OpenWindow packet100 = new Packet100OpenWindow(0, 4, "BukkitAssist", 0);
		packet100.c = "BukkitAsssit";
		craftplayer.getHandle().netServerHandler.sendPacket(packet100);
	}
	
	/**
	 * Opens Custom Inventory with Custom Title using Packet100OpenWindow
	 * @param craftplayer
	 * @param customTitle
	 */
	public static void openCustomInventory(CraftPlayer craftplayer, String customTitle){
		Packet100OpenWindow packet100 = new Packet100OpenWindow();
		packet100.c = customTitle;
		craftplayer.getHandle().netServerHandler.sendPacket(packet100);
	}
	
	/**
	 * Swings Players arm using Packet18ArmAnimation
	 * @param player
	 */
	public static void swingArm(CraftPlayer craftplayer){
		Packet18ArmAnimation packet18 = new Packet18ArmAnimation();
		packet18.a = craftplayer.getEntityId();
		packet18.b = 1;
		craftplayer.getHandle().netServerHandler.sendPacket(packet18);
		
	}
	

	

	
	
	
	
	

}