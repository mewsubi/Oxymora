package io.mewsub.oxymora.commands;

import io.mewsub.oxymora.Oxymora;

import org.bukkit.entity.Player;

import org.bukkit.plugin.PluginManager;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class OxymoraCommands implements CommandExecutor {

	@Override
	public boolean onCommand( CommandSender sender, Command command, String label, String[] args ) {
		PluginManager manager = Oxymora.server.getPluginManager();
		if( args.length > 0 ) {
			String cmd = args[ 0 ];
			if( cmd.equalsIgnoreCase( "list" ) ) {
				if( sender instanceof Player ) {
					Player p = ( Player ) sender;
					p.sendMessage( "No pack exists yet!" );
				}
			}
		}
		return true;
	}
	
}