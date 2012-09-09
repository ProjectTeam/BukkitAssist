package com.projectteam.bukkitassist.entity;

import org.bukkit.craftbukkit.entity.CraftPlayer;

import net.minecraft.server.NetServerHandler;
import net.minecraft.server.Packet;

public class BPacket {
	
	
	/**
	 * Return ServerHandler for Packets.
	 * @param craftplayer
	 * @return
	 */
	public static NetServerHandler serverHandler(CraftPlayer craftplayer){
		
		return craftplayer.getHandle().netServerHandler;
	}
	
	/**
	 * Ability to send a CraftPlayer a packet.
	 * @param craftplayer
	 * @param packet
	 */
	public static void addPacket(CraftPlayer craftplayer, Packet packet){
		serverHandler(craftplayer).sendPacket(packet);
	}

}
