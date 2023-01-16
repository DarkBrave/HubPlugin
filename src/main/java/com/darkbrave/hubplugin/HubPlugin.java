package com.darkbrave.hubplugin;

import com.darkbrave.hubplugin.commands.*;
import com.darkbrave.hubplugin.listeners.*;
import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class HubPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        PluginManager pm = getServer().getPluginManager();
        pm.registerEvents(new PlayerJoinListener(), this);
        pm.registerEvents(new BlockPlaceListener(), this);
        pm.registerEvents(new BlockBreakListener(), this);
        Objects.requireNonNull(getCommand("leave")).setExecutor((CommandExecutor)new LeaveCommand());
        System.out.println("HubPlugin enabled and running!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("HubPlugin disabled and stopped!");
    }
}
