package com.darkbrave.hubplugin;

import com.darkbrave.hubplugin.listeners.*;
import org.bukkit.plugin.java.JavaPlugin;

public final class HubPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new PlayerJoinListener(), this);
        getServer().getPluginManager().registerEvents(new BlockPlaceListener(), this);
        getServer().getPluginManager().registerEvents(new BlockBreakListener(), this);
        System.out.println("HubPlugin enabled and running!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("HubPlugin disabled and stopped!");
    }
}
