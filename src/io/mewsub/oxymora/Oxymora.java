package io.mewsub.oxymora;

import io.mewsub.oxymora.commands.OxymoraCommands;

import io.mewsub.oxymora.listeners.PlayerInteractEntity;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.Server;

public class Oxymora extends JavaPlugin {

    public static Plugin plugin;
    public static Server server;

    @Override
    public void onEnable() {
        Oxymora.plugin = ( Plugin ) this;
        Oxymora.server = this.getServer();
        Oxymora.server.getPluginManager().registerEvents( new PlayerInteractEntity(), this );

        this.getCommand( "oxymora" ).setExecutor( new OxymoraCommands() );
    }

    @Override
    public void onDisable() {

    }

}
